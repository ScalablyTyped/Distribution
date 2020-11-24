package typings.ddTrace.profileMod.perftools.profiles

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Sample. */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample")
@js.native
/**
  * Constructs a new Sample.
  * @param [properties] Properties to set
  */
class Sample () extends ISample {
  def this(properties: ISample) = this()
  
  /** Sample label. */
  @JSName("label")
  var label_Sample: js.Array[ILabel] = js.native
  
  /** Sample locationId. */
  @JSName("locationId")
  var locationId_Sample: js.Array[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
  ] = js.native
  
  /**
    * Converts this Sample to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Sample value. */
  @JSName("value")
  var value_Sample: js.Array[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
  ] = js.native
}
/* static members */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Sample")
@js.native
object Sample extends js.Object {
  
  /**
    * Creates a new Sample instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Sample instance
    */
  def create(): Sample = js.native
  def create(properties: ISample): Sample = js.native
  
  /**
    * Decodes a Sample message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Sample
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Sample = js.native
  def decode(reader: Reader, length: Double): Sample = js.native
  def decode(reader: Uint8Array): Sample = js.native
  def decode(reader: Uint8Array, length: Double): Sample = js.native
  
  /**
    * Decodes a Sample message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Sample
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Sample = js.native
  def decodeDelimited(reader: Uint8Array): Sample = js.native
  
  /**
    * Encodes the specified Sample message. Does not implicitly {@link perftools.profiles.Sample.verify|verify} messages.
    * @param message Sample message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISample): Writer = js.native
  def encode(message: ISample, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Sample message, length delimited. Does not implicitly {@link perftools.profiles.Sample.verify|verify} messages.
    * @param message Sample message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISample): Writer = js.native
  def encodeDelimited(message: ISample, writer: Writer): Writer = js.native
  
  /**
    * Creates a Sample message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Sample
    */
  def fromObject(`object`: StringDictionary[js.Any]): Sample = js.native
  
  /**
    * Creates a plain object from a Sample message. Also converts values to other types if specified.
    * @param message Sample
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Sample): StringDictionary[js.Any] = js.native
  def toObject(message: Sample, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Sample message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

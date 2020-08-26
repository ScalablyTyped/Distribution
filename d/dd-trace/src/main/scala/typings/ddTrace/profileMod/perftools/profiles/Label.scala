package typings.ddTrace.profileMod.perftools.profiles

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Label. */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label")
@js.native
/**
  * Constructs a new Label.
  * @param [properties] Properties to set
  */
class Label () extends ILabel {
  def this(properties: ILabel) = this()
  /** Label key. */
  @JSName("key")
  var key_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Label numUnit. */
  @JSName("numUnit")
  var numUnit_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Label num. */
  @JSName("num")
  var num_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Label str. */
  @JSName("str")
  var str_Label: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /**
    * Converts this Label to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Label")
@js.native
object Label extends js.Object {
  /**
    * Creates a new Label instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Label instance
    */
  def create(): Label = js.native
  def create(properties: ILabel): Label = js.native
  /**
    * Decodes a Label message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Label
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Label = js.native
  def decode(reader: Reader, length: Double): Label = js.native
  def decode(reader: Uint8Array): Label = js.native
  def decode(reader: Uint8Array, length: Double): Label = js.native
  /**
    * Decodes a Label message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Label
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Label = js.native
  def decodeDelimited(reader: Uint8Array): Label = js.native
  /**
    * Encodes the specified Label message. Does not implicitly {@link perftools.profiles.Label.verify|verify} messages.
    * @param message Label message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ILabel): Writer = js.native
  def encode(message: ILabel, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Label message, length delimited. Does not implicitly {@link perftools.profiles.Label.verify|verify} messages.
    * @param message Label message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ILabel): Writer = js.native
  def encodeDelimited(message: ILabel, writer: Writer): Writer = js.native
  /**
    * Creates a Label message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Label
    */
  def fromObject(`object`: StringDictionary[js.Any]): Label = js.native
  /**
    * Creates a plain object from a Label message. Also converts values to other types if specified.
    * @param message Label
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Label): StringDictionary[js.Any] = js.native
  def toObject(message: Label, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Label message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}


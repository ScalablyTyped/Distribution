package typings.ddTrace.profileMod.perftools.profiles

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ValueType. */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType")
@js.native
/**
  * Constructs a new ValueType.
  * @param [properties] Properties to set
  */
class ValueType () extends IValueType {
  def this(properties: IValueType) = this()
  
  /**
    * Converts this ValueType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ValueType type. */
  @JSName("type")
  var type_ValueType: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** ValueType unit. */
  @JSName("unit")
  var unit_ValueType: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
}
/* static members */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.ValueType")
@js.native
object ValueType extends js.Object {
  
  /**
    * Creates a new ValueType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ValueType instance
    */
  def create(): ValueType = js.native
  def create(properties: IValueType): ValueType = js.native
  
  /**
    * Decodes a ValueType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ValueType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ValueType = js.native
  def decode(reader: Reader, length: Double): ValueType = js.native
  def decode(reader: Uint8Array): ValueType = js.native
  def decode(reader: Uint8Array, length: Double): ValueType = js.native
  
  /**
    * Decodes a ValueType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ValueType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ValueType = js.native
  def decodeDelimited(reader: Uint8Array): ValueType = js.native
  
  /**
    * Encodes the specified ValueType message. Does not implicitly {@link perftools.profiles.ValueType.verify|verify} messages.
    * @param message ValueType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IValueType): Writer = js.native
  def encode(message: IValueType, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ValueType message, length delimited. Does not implicitly {@link perftools.profiles.ValueType.verify|verify} messages.
    * @param message ValueType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IValueType): Writer = js.native
  def encodeDelimited(message: IValueType, writer: Writer): Writer = js.native
  
  /**
    * Creates a ValueType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ValueType
    */
  def fromObject(`object`: StringDictionary[js.Any]): ValueType = js.native
  
  /**
    * Creates a plain object from a ValueType message. Also converts values to other types if specified.
    * @param message ValueType
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ValueType): StringDictionary[js.Any] = js.native
  def toObject(message: ValueType, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ValueType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

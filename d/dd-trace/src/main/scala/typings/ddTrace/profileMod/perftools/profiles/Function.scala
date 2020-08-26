package typings.ddTrace.profileMod.perftools.profiles

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Function. */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function")
@js.native
/**
  * Constructs a new Function.
  * @param [properties] Properties to set
  */
class Function () extends IFunction {
  def this(properties: IFunction) = this()
  /** Function filename. */
  @JSName("filename")
  var filename_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Function id. */
  @JSName("id")
  var id_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Function name. */
  @JSName("name")
  var name_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Function startLine. */
  @JSName("startLine")
  var startLine_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Function systemName. */
  @JSName("systemName")
  var systemName_Function: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /**
    * Converts this Function to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Function")
@js.native
object Function extends js.Object {
  /**
    * Creates a new Function instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Function instance
    */
  def create(): Function = js.native
  def create(properties: IFunction): Function = js.native
  /**
    * Decodes a Function message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Function
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Function = js.native
  def decode(reader: Reader, length: Double): Function = js.native
  def decode(reader: Uint8Array): Function = js.native
  def decode(reader: Uint8Array, length: Double): Function = js.native
  /**
    * Decodes a Function message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Function
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Function = js.native
  def decodeDelimited(reader: Uint8Array): Function = js.native
  /**
    * Encodes the specified Function message. Does not implicitly {@link perftools.profiles.Function.verify|verify} messages.
    * @param message Function message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFunction): Writer = js.native
  def encode(message: IFunction, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Function message, length delimited. Does not implicitly {@link perftools.profiles.Function.verify|verify} messages.
    * @param message Function message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFunction): Writer = js.native
  def encodeDelimited(message: IFunction, writer: Writer): Writer = js.native
  /**
    * Creates a Function message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Function
    */
  def fromObject(`object`: StringDictionary[js.Any]): Function = js.native
  /**
    * Creates a plain object from a Function message. Also converts values to other types if specified.
    * @param message Function
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Function): StringDictionary[js.Any] = js.native
  def toObject(message: Function, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Function message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}


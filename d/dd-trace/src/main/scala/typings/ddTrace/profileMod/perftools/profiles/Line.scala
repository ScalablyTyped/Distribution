package typings.ddTrace.profileMod.perftools.profiles

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Line. */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line")
@js.native
/**
  * Constructs a new Line.
  * @param [properties] Properties to set
  */
class Line () extends ILine {
  def this(properties: ILine) = this()
  /** Line functionId. */
  @JSName("functionId")
  var functionId_Line: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** Line line. */
  @JSName("line")
  var line_Line: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /**
    * Converts this Line to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dd-trace/protobuf/profile", "perftools.profiles.Line")
@js.native
object Line extends js.Object {
  /**
    * Creates a new Line instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Line instance
    */
  def create(): Line = js.native
  def create(properties: ILine): Line = js.native
  /**
    * Decodes a Line message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Line
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Line = js.native
  def decode(reader: Reader, length: Double): Line = js.native
  def decode(reader: Uint8Array): Line = js.native
  def decode(reader: Uint8Array, length: Double): Line = js.native
  /**
    * Decodes a Line message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Line
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Line = js.native
  def decodeDelimited(reader: Uint8Array): Line = js.native
  /**
    * Encodes the specified Line message. Does not implicitly {@link perftools.profiles.Line.verify|verify} messages.
    * @param message Line message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ILine): Writer = js.native
  def encode(message: ILine, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Line message, length delimited. Does not implicitly {@link perftools.profiles.Line.verify|verify} messages.
    * @param message Line message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ILine): Writer = js.native
  def encodeDelimited(message: ILine, writer: Writer): Writer = js.native
  /**
    * Creates a Line message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Line
    */
  def fromObject(`object`: StringDictionary[js.Any]): Line = js.native
  /**
    * Creates a plain object from a Line message. Also converts values to other types if specified.
    * @param message Line
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Line): StringDictionary[js.Any] = js.native
  def toObject(message: Line, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Line message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}


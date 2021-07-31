package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandInitializeTestCase. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandInitializeTestCase")
@js.native
/**
  * Constructs a new CommandInitializeTestCase.
  * @param [properties] Properties to set
  */
class CommandInitializeTestCase ()
  extends StObject
     with ICommandInitializeTestCase {
  def this(properties: ICommandInitializeTestCase) = this()
  
  /** CommandInitializeTestCase actionId. */
  @JSName("actionId")
  var actionId_CommandInitializeTestCase: String = js.native
  
  /**
    * Converts this CommandInitializeTestCase to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CommandInitializeTestCase {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandInitializeTestCase")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandInitializeTestCase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandInitializeTestCase instance
    */
  /* static member */
  @scala.inline
  def create(): CommandInitializeTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandInitializeTestCase]
  @scala.inline
  def create(properties: ICommandInitializeTestCase): CommandInitializeTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandInitializeTestCase]
  
  /**
    * Decodes a CommandInitializeTestCase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandInitializeTestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): CommandInitializeTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandInitializeTestCase]
  @scala.inline
  def decode(reader: Reader, length: Double): CommandInitializeTestCase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandInitializeTestCase]
  @scala.inline
  def decode(reader: Uint8Array): CommandInitializeTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandInitializeTestCase]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): CommandInitializeTestCase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandInitializeTestCase]
  
  /**
    * Decodes a CommandInitializeTestCase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandInitializeTestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): CommandInitializeTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandInitializeTestCase]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): CommandInitializeTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandInitializeTestCase]
  
  /**
    * Encodes the specified CommandInitializeTestCase message. Does not implicitly {@link io.cucumber.messages.CommandInitializeTestCase.verify|verify} messages.
    * @param message CommandInitializeTestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICommandInitializeTestCase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICommandInitializeTestCase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandInitializeTestCase message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandInitializeTestCase.verify|verify} messages.
    * @param message CommandInitializeTestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICommandInitializeTestCase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICommandInitializeTestCase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandInitializeTestCase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandInitializeTestCase
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): CommandInitializeTestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandInitializeTestCase]
  
  /**
    * Creates a plain object from a CommandInitializeTestCase message. Also converts values to other types if specified.
    * @param message CommandInitializeTestCase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: CommandInitializeTestCase): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: CommandInitializeTestCase, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CommandInitializeTestCase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

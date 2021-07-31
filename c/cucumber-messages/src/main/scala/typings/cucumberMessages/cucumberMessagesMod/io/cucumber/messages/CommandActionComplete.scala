package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesStrings.snippet
import typings.cucumberMessages.cucumberMessagesStrings.testResult
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandActionComplete. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandActionComplete")
@js.native
/**
  * Constructs a new CommandActionComplete.
  * @param [properties] Properties to set
  */
class CommandActionComplete ()
  extends StObject
     with ICommandActionComplete {
  def this(properties: ICommandActionComplete) = this()
  
  /** CommandActionComplete completedId. */
  @JSName("completedId")
  var completedId_CommandActionComplete: String = js.native
  
  /** CommandActionComplete result. */
  var result: js.UndefOr[testResult | snippet] = js.native
  
  /** CommandActionComplete snippet. */
  @JSName("snippet")
  var snippet_CommandActionComplete: String = js.native
  
  /**
    * Converts this CommandActionComplete to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CommandActionComplete {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandActionComplete")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandActionComplete instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandActionComplete instance
    */
  /* static member */
  @scala.inline
  def create(): CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandActionComplete]
  @scala.inline
  def create(properties: ICommandActionComplete): CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandActionComplete]
  
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandActionComplete]
  @scala.inline
  def decode(reader: Reader, length: Double): CommandActionComplete = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandActionComplete]
  @scala.inline
  def decode(reader: Uint8Array): CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandActionComplete]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): CommandActionComplete = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandActionComplete]
  
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandActionComplete]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandActionComplete]
  
  /**
    * Encodes the specified CommandActionComplete message. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICommandActionComplete): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICommandActionComplete, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandActionComplete message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICommandActionComplete): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICommandActionComplete, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandActionComplete message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandActionComplete
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandActionComplete]
  
  /**
    * Creates a plain object from a CommandActionComplete message. Also converts values to other types if specified.
    * @param message CommandActionComplete
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: CommandActionComplete): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: CommandActionComplete, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CommandActionComplete message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

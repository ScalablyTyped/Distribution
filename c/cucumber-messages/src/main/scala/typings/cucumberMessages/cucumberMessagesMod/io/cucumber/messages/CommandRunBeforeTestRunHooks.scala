package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestRunHooks. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestRunHooks")
@js.native
/**
  * Constructs a new CommandRunBeforeTestRunHooks.
  * @param [properties] Properties to set
  */
class CommandRunBeforeTestRunHooks ()
  extends StObject
     with ICommandRunBeforeTestRunHooks {
  def this(properties: ICommandRunBeforeTestRunHooks) = this()
  
  /** CommandRunBeforeTestRunHooks actionId. */
  @JSName("actionId")
  var actionId_CommandRunBeforeTestRunHooks: String = js.native
  
  /**
    * Converts this CommandRunBeforeTestRunHooks to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CommandRunBeforeTestRunHooks {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestRunHooks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandRunBeforeTestRunHooks instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestRunHooks instance
    */
  /* static member */
  inline def create(): CommandRunBeforeTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandRunBeforeTestRunHooks]
  inline def create(properties: ICommandRunBeforeTestRunHooks): CommandRunBeforeTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestRunHooks]
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommandRunBeforeTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestRunHooks]
  inline def decode(reader: Reader, length: Double): CommandRunBeforeTestRunHooks = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunBeforeTestRunHooks]
  inline def decode(reader: Uint8Array): CommandRunBeforeTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestRunHooks]
  inline def decode(reader: Uint8Array, length: Double): CommandRunBeforeTestRunHooks = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunBeforeTestRunHooks]
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommandRunBeforeTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestRunHooks]
  inline def decodeDelimited(reader: Uint8Array): CommandRunBeforeTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestRunHooks]
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommandRunBeforeTestRunHooks): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommandRunBeforeTestRunHooks): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandRunBeforeTestRunHooks message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestRunHooks
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): CommandRunBeforeTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestRunHooks]
  
  /**
    * Creates a plain object from a CommandRunBeforeTestRunHooks message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestRunHooks
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommandRunBeforeTestRunHooks): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: CommandRunBeforeTestRunHooks, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CommandRunBeforeTestRunHooks message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

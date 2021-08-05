package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunAfterTestRunHooks. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestRunHooks")
@js.native
/**
  * Constructs a new CommandRunAfterTestRunHooks.
  * @param [properties] Properties to set
  */
class CommandRunAfterTestRunHooks ()
  extends StObject
     with ICommandRunAfterTestRunHooks {
  def this(properties: ICommandRunAfterTestRunHooks) = this()
  
  /** CommandRunAfterTestRunHooks actionId. */
  @JSName("actionId")
  var actionId_CommandRunAfterTestRunHooks: String = js.native
  
  /**
    * Converts this CommandRunAfterTestRunHooks to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CommandRunAfterTestRunHooks {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestRunHooks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandRunAfterTestRunHooks instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunAfterTestRunHooks instance
    */
  /* static member */
  inline def create(): CommandRunAfterTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandRunAfterTestRunHooks]
  inline def create(properties: ICommandRunAfterTestRunHooks): CommandRunAfterTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestRunHooks]
  
  /**
    * Decodes a CommandRunAfterTestRunHooks message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunAfterTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommandRunAfterTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestRunHooks]
  inline def decode(reader: Reader, length: Double): CommandRunAfterTestRunHooks = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunAfterTestRunHooks]
  inline def decode(reader: Uint8Array): CommandRunAfterTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestRunHooks]
  inline def decode(reader: Uint8Array, length: Double): CommandRunAfterTestRunHooks = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunAfterTestRunHooks]
  
  /**
    * Decodes a CommandRunAfterTestRunHooks message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunAfterTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommandRunAfterTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestRunHooks]
  inline def decodeDelimited(reader: Uint8Array): CommandRunAfterTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestRunHooks]
  
  /**
    * Encodes the specified CommandRunAfterTestRunHooks message. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestRunHooks.verify|verify} messages.
    * @param message CommandRunAfterTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommandRunAfterTestRunHooks): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommandRunAfterTestRunHooks, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandRunAfterTestRunHooks message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestRunHooks.verify|verify} messages.
    * @param message CommandRunAfterTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommandRunAfterTestRunHooks): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommandRunAfterTestRunHooks, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandRunAfterTestRunHooks message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunAfterTestRunHooks
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): CommandRunAfterTestRunHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestRunHooks]
  
  /**
    * Creates a plain object from a CommandRunAfterTestRunHooks message. Also converts values to other types if specified.
    * @param message CommandRunAfterTestRunHooks
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommandRunAfterTestRunHooks): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: CommandRunAfterTestRunHooks, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CommandRunAfterTestRunHooks message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestCaseHook. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook")
@js.native
/**
  * Constructs a new CommandRunBeforeTestCaseHook.
  * @param [properties] Properties to set
  */
open class CommandRunBeforeTestCaseHook ()
  extends StObject
     with ICommandRunBeforeTestCaseHook {
  def this(properties: ICommandRunBeforeTestCaseHook) = this()
  
  /** CommandRunBeforeTestCaseHook actionId. */
  @JSName("actionId")
  var actionId_CommandRunBeforeTestCaseHook: String = js.native
  
  /** CommandRunBeforeTestCaseHook hookId. */
  @JSName("hookId")
  var hookId_CommandRunBeforeTestCaseHook: String = js.native
  
  /** CommandRunBeforeTestCaseHook testCaseId. */
  @JSName("testCaseId")
  var testCaseId_CommandRunBeforeTestCaseHook: String = js.native
  
  /**
    * Converts this CommandRunBeforeTestCaseHook to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CommandRunBeforeTestCaseHook {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandRunBeforeTestCaseHook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestCaseHook instance
    */
  /* static member */
  inline def create(): CommandRunBeforeTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandRunBeforeTestCaseHook]
  inline def create(properties: ICommandRunBeforeTestCaseHook): CommandRunBeforeTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestCaseHook]
  
  inline def decode(reader: js.typedarray.Uint8Array): CommandRunBeforeTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestCaseHook]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CommandRunBeforeTestCaseHook = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunBeforeTestCaseHook]
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommandRunBeforeTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestCaseHook]
  inline def decode(reader: Reader, length: Double): CommandRunBeforeTestCaseHook = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunBeforeTestCaseHook]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CommandRunBeforeTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestCaseHook]
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommandRunBeforeTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestCaseHook]
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommandRunBeforeTestCaseHook): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommandRunBeforeTestCaseHook): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandRunBeforeTestCaseHook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestCaseHook
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CommandRunBeforeTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandRunBeforeTestCaseHook]
  
  /**
    * Creates a plain object from a CommandRunBeforeTestCaseHook message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestCaseHook
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommandRunBeforeTestCaseHook): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CommandRunBeforeTestCaseHook, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CommandRunBeforeTestCaseHook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunAfterTestCaseHook. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook")
@js.native
/**
  * Constructs a new CommandRunAfterTestCaseHook.
  * @param [properties] Properties to set
  */
open class CommandRunAfterTestCaseHook ()
  extends StObject
     with ICommandRunAfterTestCaseHook {
  def this(properties: ICommandRunAfterTestCaseHook) = this()
  
  /** CommandRunAfterTestCaseHook actionId. */
  @JSName("actionId")
  var actionId_CommandRunAfterTestCaseHook: String = js.native
  
  /** CommandRunAfterTestCaseHook hookId. */
  @JSName("hookId")
  var hookId_CommandRunAfterTestCaseHook: String = js.native
  
  /** CommandRunAfterTestCaseHook testCaseId. */
  @JSName("testCaseId")
  var testCaseId_CommandRunAfterTestCaseHook: String = js.native
  
  /**
    * Converts this CommandRunAfterTestCaseHook to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CommandRunAfterTestCaseHook {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandRunAfterTestCaseHook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunAfterTestCaseHook instance
    */
  /* static member */
  inline def create(): CommandRunAfterTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommandRunAfterTestCaseHook]
  inline def create(properties: ICommandRunAfterTestCaseHook): CommandRunAfterTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestCaseHook]
  
  inline def decode(reader: js.typedarray.Uint8Array): CommandRunAfterTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestCaseHook]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CommandRunAfterTestCaseHook = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunAfterTestCaseHook]
  /**
    * Decodes a CommandRunAfterTestCaseHook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunAfterTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommandRunAfterTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestCaseHook]
  inline def decode(reader: Reader, length: Double): CommandRunAfterTestCaseHook = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommandRunAfterTestCaseHook]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CommandRunAfterTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestCaseHook]
  /**
    * Decodes a CommandRunAfterTestCaseHook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunAfterTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommandRunAfterTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestCaseHook]
  
  /**
    * Encodes the specified CommandRunAfterTestCaseHook message. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestCaseHook.verify|verify} messages.
    * @param message CommandRunAfterTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommandRunAfterTestCaseHook): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommandRunAfterTestCaseHook, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandRunAfterTestCaseHook message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestCaseHook.verify|verify} messages.
    * @param message CommandRunAfterTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommandRunAfterTestCaseHook): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommandRunAfterTestCaseHook, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandRunAfterTestCaseHook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunAfterTestCaseHook
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CommandRunAfterTestCaseHook = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommandRunAfterTestCaseHook]
  
  /**
    * Creates a plain object from a CommandRunAfterTestCaseHook message. Also converts values to other types if specified.
    * @param message CommandRunAfterTestCaseHook
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommandRunAfterTestCaseHook): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CommandRunAfterTestCaseHook, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CommandRunAfterTestCaseHook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

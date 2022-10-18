package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ICommandActionComplete
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandActionComplete. */
@JSImport("cucumber-messages", "messages.CommandActionComplete")
@js.native
/**
  * Constructs a new CommandActionComplete.
  * @param [properties] Properties to set
  */
open class CommandActionComplete ()
  extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete {
  def this(properties: ICommandActionComplete) = this()
}
object CommandActionComplete {
  
  @JSImport("cucumber-messages", "messages.CommandActionComplete")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandActionComplete instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandActionComplete instance
    */
  /* static member */
  inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  inline def create(properties: ICommandActionComplete): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  
  /**
    * Encodes the specified CommandActionComplete message. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommandActionComplete): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommandActionComplete, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandActionComplete message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommandActionComplete): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommandActionComplete, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandActionComplete message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandActionComplete
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete]
  
  /**
    * Creates a plain object from a CommandActionComplete message. Also converts values to other types if specified.
    * @param message CommandActionComplete
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(
    message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete
  ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.CommandActionComplete,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CommandActionComplete message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

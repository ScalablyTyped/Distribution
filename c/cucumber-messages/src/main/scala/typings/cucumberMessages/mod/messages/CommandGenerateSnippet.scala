package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandGenerateSnippet
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandGenerateSnippet. */
@JSImport("cucumber-messages", "messages.CommandGenerateSnippet")
@js.native
/**
  * Constructs a new CommandGenerateSnippet.
  * @param [properties] Properties to set
  */
class CommandGenerateSnippet ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet {
  def this(properties: ICommandGenerateSnippet) = this()
}
object CommandGenerateSnippet {
  
  @JSImport("cucumber-messages", "messages.CommandGenerateSnippet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommandGenerateSnippet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandGenerateSnippet instance
    */
  /* static member */
  @scala.inline
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  @scala.inline
  def create(properties: ICommandGenerateSnippet): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  
  /**
    * Decodes a CommandGenerateSnippet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandGenerateSnippet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  @scala.inline
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  
  /**
    * Decodes a CommandGenerateSnippet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandGenerateSnippet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  
  /**
    * Encodes the specified CommandGenerateSnippet message. Does not implicitly {@link io.cucumber.messages.CommandGenerateSnippet.verify|verify} messages.
    * @param message CommandGenerateSnippet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICommandGenerateSnippet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICommandGenerateSnippet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommandGenerateSnippet message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandGenerateSnippet.verify|verify} messages.
    * @param message CommandGenerateSnippet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICommandGenerateSnippet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICommandGenerateSnippet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommandGenerateSnippet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandGenerateSnippet
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet]
  
  /**
    * Creates a plain object from a CommandGenerateSnippet message. Also converts values to other types if specified.
    * @param message CommandGenerateSnippet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CommandGenerateSnippet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IUriToLinesMapping
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UriToLinesMapping. */
@JSImport("cucumber-messages", "messages.UriToLinesMapping")
@js.native
/**
  * Constructs a new UriToLinesMapping.
  * @param [properties] Properties to set
  */
class UriToLinesMapping ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping {
  def this(properties: IUriToLinesMapping) = this()
}
object UriToLinesMapping {
  
  @JSImport("cucumber-messages", "messages.UriToLinesMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UriToLinesMapping instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UriToLinesMapping instance
    */
  /* static member */
  @scala.inline
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  @scala.inline
  def create(properties: IUriToLinesMapping): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  @scala.inline
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  
  /**
    * Encodes the specified UriToLinesMapping message. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IUriToLinesMapping): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IUriToLinesMapping, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UriToLinesMapping message, length delimited. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IUriToLinesMapping): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IUriToLinesMapping, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UriToLinesMapping message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UriToLinesMapping
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping]
  
  /**
    * Creates a plain object from an UriToLinesMapping message. Also converts values to other types if specified.
    * @param message UriToLinesMapping
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UriToLinesMapping message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

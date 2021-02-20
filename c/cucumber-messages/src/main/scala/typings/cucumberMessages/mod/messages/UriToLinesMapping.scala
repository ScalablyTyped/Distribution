package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IUriToLinesMapping
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /**
    * Creates a new UriToLinesMapping instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UriToLinesMapping instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.create")
  @js.native
  def create(properties: IUriToLinesMapping): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Encodes the specified UriToLinesMapping message. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.encode")
  @js.native
  def encode(message: IUriToLinesMapping): Writer = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.encode")
  @js.native
  def encode(message: IUriToLinesMapping, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UriToLinesMapping message, length delimited. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUriToLinesMapping): Writer = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUriToLinesMapping, writer: Writer): Writer = js.native
  
  /**
    * Creates an UriToLinesMapping message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UriToLinesMapping
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Creates a plain object from an UriToLinesMapping message. Also converts values to other types if specified.
    * @param message UriToLinesMapping
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UriToLinesMapping message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.UriToLinesMapping.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

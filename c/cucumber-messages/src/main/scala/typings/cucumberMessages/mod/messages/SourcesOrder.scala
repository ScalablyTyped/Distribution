package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ISourcesOrder
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourcesOrder. */
@JSImport("cucumber-messages", "messages.SourcesOrder")
@js.native
/**
  * Constructs a new SourcesOrder.
  * @param [properties] Properties to set
  */
class SourcesOrder ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder {
  def this(properties: ISourcesOrder) = this()
}
object SourcesOrder {
  
  /**
    * Creates a new SourcesOrder instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesOrder instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.create")
  @js.native
  def create(properties: ISourcesOrder): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  
  /**
    * Decodes a SourcesOrder message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesOrder
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  
  /**
    * Decodes a SourcesOrder message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesOrder
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  
  /**
    * Encodes the specified SourcesOrder message. Does not implicitly {@link io.cucumber.messages.SourcesOrder.verify|verify} messages.
    * @param message SourcesOrder message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.encode")
  @js.native
  def encode(message: ISourcesOrder): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.encode")
  @js.native
  def encode(message: ISourcesOrder, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourcesOrder message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesOrder.verify|verify} messages.
    * @param message SourcesOrder message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesOrder): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesOrder, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourcesOrder message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesOrder
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder = js.native
  
  /**
    * Creates a plain object from a SourcesOrder message. Also converts values to other types if specified.
    * @param message SourcesOrder
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.SourcesOrder.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrder,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourcesOrder message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourcesOrder.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

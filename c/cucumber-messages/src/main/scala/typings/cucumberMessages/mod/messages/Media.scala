package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IMedia
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Meta information about encoded contents */
@JSImport("cucumber-messages", "messages.Media")
@js.native
/**
  * Constructs a new Media.
  * @param [properties] Properties to set
  */
class Media ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media {
  def this(properties: IMedia) = this()
}
object Media {
  
  /** Encoding enum. */
  @JSImport("cucumber-messages", "messages.Media.Encoding")
  @js.native
  object Encoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding with Double
      ] = js.native
    
    /* 0 */ val BASE64: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding.BASE64 with Double = js.native
    
    /* 1 */ val UTF8: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding.UTF8 with Double = js.native
  }
  
  /**
    * Creates a new Media instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Media instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  @JSImport("cucumber-messages", "messages.Media.create")
  @js.native
  def create(properties: IMedia): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Decodes a Media message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  @JSImport("cucumber-messages", "messages.Media.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  @JSImport("cucumber-messages", "messages.Media.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  @JSImport("cucumber-messages", "messages.Media.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Decodes a Media message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  @JSImport("cucumber-messages", "messages.Media.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Encodes the specified Media message. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.encode")
  @js.native
  def encode(message: IMedia): Writer = js.native
  @JSImport("cucumber-messages", "messages.Media.encode")
  @js.native
  def encode(message: IMedia, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Media message, length delimited. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMedia): Writer = js.native
  @JSImport("cucumber-messages", "messages.Media.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMedia, writer: Writer): Writer = js.native
  
  /**
    * Creates a Media message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Media
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Creates a plain object from a Media message. Also converts values to other types if specified.
    * @param message Media
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.Media.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Media message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Media.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

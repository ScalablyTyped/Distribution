package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Meta information about encoded contents */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media")
@js.native
/**
  * Constructs a new Media.
  * @param [properties] Properties to set
  */
class Media () extends IMedia {
  def this(properties: IMedia) = this()
  
  /**
    * The content type of the data. This can be any valid
    * [IANA Media Type](https://www.iana.org/assignments/media-types/media-types.xhtml)
    * as well as Cucumber-specific media types such as `text/x.cucumber.gherkin+plain`
    * and `text/x.cucumber.stacktrace+plain`
    */
  @JSName("contentType")
  var contentType_Media: String = js.native
  
  /** Media encoding. */
  @JSName("encoding")
  var encoding_Media: Encoding = js.native
  
  /**
    * Converts this Media to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Media {
  
  @js.native
  sealed trait Encoding extends StObject
  /** Encoding enum. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.Encoding")
  @js.native
  object Encoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Encoding with Double] = js.native
    
    @js.native
    sealed trait BASE64 extends Encoding
    /* 0 */ val BASE64: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding.BASE64 with Double = js.native
    
    @js.native
    sealed trait UTF8 extends Encoding
    /* 1 */ val UTF8: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding.UTF8 with Double = js.native
  }
  
  /**
    * Creates a new Media instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Media instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.create")
  @js.native
  def create(): Media = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.create")
  @js.native
  def create(properties: IMedia): Media = js.native
  
  /**
    * Decodes a Media message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.decode")
  @js.native
  def decode(reader: Reader): Media = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.decode")
  @js.native
  def decode(reader: Reader, length: Double): Media = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.decode")
  @js.native
  def decode(reader: Uint8Array): Media = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Media = js.native
  
  /**
    * Decodes a Media message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Media = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Media = js.native
  
  /**
    * Encodes the specified Media message. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.encode")
  @js.native
  def encode(message: IMedia): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.encode")
  @js.native
  def encode(message: IMedia, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Media message, length delimited. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMedia): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMedia, writer: Writer): Writer = js.native
  
  /**
    * Creates a Media message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Media
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Media = js.native
  
  /**
    * Creates a plain object from a Media message. Also converts values to other types if specified.
    * @param message Media
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.toObject")
  @js.native
  def toObject(message: Media): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.toObject")
  @js.native
  def toObject(message: Media, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Media message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

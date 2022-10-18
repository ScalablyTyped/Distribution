package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Media.Encoding
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Meta information about encoded contents */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media")
@js.native
/**
  * Constructs a new Media.
  * @param [properties] Properties to set
  */
open class Media ()
  extends StObject
     with IMedia {
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
  def toJSON(): StringDictionary[Any] = js.native
}
object Media {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Encoding extends StObject
  /** Encoding enum. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Media.Encoding")
  @js.native
  object Encoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Encoding & Double] = js.native
    
    @js.native
    sealed trait BASE64
      extends StObject
         with Encoding
    /* 0 */ val BASE64: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Media.Encoding.BASE64 & Double = js.native
    
    @js.native
    sealed trait UTF8
      extends StObject
         with Encoding
    /* 1 */ val UTF8: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Media.Encoding.UTF8 & Double = js.native
  }
  
  /**
    * Creates a new Media instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Media instance
    */
  /* static member */
  inline def create(): Media = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Media]
  inline def create(properties: IMedia): Media = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Media]
  
  inline def decode(reader: js.typedarray.Uint8Array): Media = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Media]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Media = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Media]
  /**
    * Decodes a Media message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Media = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Media]
  inline def decode(reader: Reader, length: Double): Media = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Media]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Media = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Media]
  /**
    * Decodes a Media message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Media = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Media]
  
  /**
    * Encodes the specified Media message. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IMedia): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IMedia, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Media message, length delimited. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IMedia): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IMedia, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Media message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Media
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Media = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Media]
  
  /**
    * Creates a plain object from a Media message. Also converts values to other types if specified.
    * @param message Media
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Media): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Media, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Media message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

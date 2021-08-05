package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourcesConfig. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig")
@js.native
/**
  * Constructs a new SourcesConfig.
  * @param [properties] Properties to set
  */
class SourcesConfig ()
  extends StObject
     with ISourcesConfig {
  def this(properties: ISourcesConfig) = this()
  
  /** SourcesConfig absolutePaths. */
  @JSName("absolutePaths")
  var absolutePaths_SourcesConfig: js.Array[String] = js.native
  
  /** SourcesConfig language. */
  @JSName("language")
  var language_SourcesConfig: String = js.native
  
  /**
    * Converts this SourcesConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SourcesConfig {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SourcesConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesConfig instance
    */
  /* static member */
  inline def create(): SourcesConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SourcesConfig]
  inline def create(properties: ISourcesConfig): SourcesConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SourcesConfig]
  
  /**
    * Decodes a SourcesConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SourcesConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesConfig]
  inline def decode(reader: Reader, length: Double): SourcesConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SourcesConfig]
  inline def decode(reader: Uint8Array): SourcesConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesConfig]
  inline def decode(reader: Uint8Array, length: Double): SourcesConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SourcesConfig]
  
  /**
    * Decodes a SourcesConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SourcesConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesConfig]
  inline def decodeDelimited(reader: Uint8Array): SourcesConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesConfig]
  
  /**
    * Encodes the specified SourcesConfig message. Does not implicitly {@link io.cucumber.messages.SourcesConfig.verify|verify} messages.
    * @param message SourcesConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISourcesConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISourcesConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SourcesConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesConfig.verify|verify} messages.
    * @param message SourcesConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISourcesConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISourcesConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SourcesConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): SourcesConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SourcesConfig]
  
  /**
    * Creates a plain object from a SourcesConfig message. Also converts values to other types if specified.
    * @param message SourcesConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SourcesConfig): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: SourcesConfig, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SourcesConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

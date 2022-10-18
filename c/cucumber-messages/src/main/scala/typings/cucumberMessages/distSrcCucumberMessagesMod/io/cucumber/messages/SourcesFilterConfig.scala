package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourcesFilterConfig. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig")
@js.native
/**
  * Constructs a new SourcesFilterConfig.
  * @param [properties] Properties to set
  */
open class SourcesFilterConfig ()
  extends StObject
     with ISourcesFilterConfig {
  def this(properties: ISourcesFilterConfig) = this()
  
  /** SourcesFilterConfig nameRegularExpressions. */
  @JSName("nameRegularExpressions")
  var nameRegularExpressions_SourcesFilterConfig: js.Array[String] = js.native
  
  /** SourcesFilterConfig tagExpression. */
  @JSName("tagExpression")
  var tagExpression_SourcesFilterConfig: String = js.native
  
  /**
    * Converts this SourcesFilterConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** SourcesFilterConfig uriToLinesMapping. */
  @JSName("uriToLinesMapping")
  var uriToLinesMapping_SourcesFilterConfig: js.Array[IUriToLinesMapping] = js.native
}
object SourcesFilterConfig {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SourcesFilterConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesFilterConfig instance
    */
  /* static member */
  inline def create(): SourcesFilterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SourcesFilterConfig]
  inline def create(properties: ISourcesFilterConfig): SourcesFilterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SourcesFilterConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): SourcesFilterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesFilterConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SourcesFilterConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SourcesFilterConfig]
  /**
    * Decodes a SourcesFilterConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesFilterConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SourcesFilterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesFilterConfig]
  inline def decode(reader: Reader, length: Double): SourcesFilterConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SourcesFilterConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SourcesFilterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesFilterConfig]
  /**
    * Decodes a SourcesFilterConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesFilterConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SourcesFilterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SourcesFilterConfig]
  
  /**
    * Encodes the specified SourcesFilterConfig message. Does not implicitly {@link io.cucumber.messages.SourcesFilterConfig.verify|verify} messages.
    * @param message SourcesFilterConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISourcesFilterConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISourcesFilterConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SourcesFilterConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesFilterConfig.verify|verify} messages.
    * @param message SourcesFilterConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISourcesFilterConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISourcesFilterConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SourcesFilterConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesFilterConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SourcesFilterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SourcesFilterConfig]
  
  /**
    * Creates a plain object from a SourcesFilterConfig message. Also converts values to other types if specified.
    * @param message SourcesFilterConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SourcesFilterConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SourcesFilterConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SourcesFilterConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

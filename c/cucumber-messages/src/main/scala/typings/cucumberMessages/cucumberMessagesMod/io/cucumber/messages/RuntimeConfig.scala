package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RuntimeConfig. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.RuntimeConfig")
@js.native
/**
  * Constructs a new RuntimeConfig.
  * @param [properties] Properties to set
  */
open class RuntimeConfig ()
  extends StObject
     with IRuntimeConfig {
  def this(properties: IRuntimeConfig) = this()
  
  /** RuntimeConfig isDryRun. */
  @JSName("isDryRun")
  var isDryRun_RuntimeConfig: Boolean = js.native
  
  /** RuntimeConfig isFailFast. */
  @JSName("isFailFast")
  var isFailFast_RuntimeConfig: Boolean = js.native
  
  /** RuntimeConfig isStrict. */
  @JSName("isStrict")
  var isStrict_RuntimeConfig: Boolean = js.native
  
  /** RuntimeConfig maxParallel. */
  @JSName("maxParallel")
  var maxParallel_RuntimeConfig: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
  
  /**
    * Converts this RuntimeConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object RuntimeConfig {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.RuntimeConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new RuntimeConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RuntimeConfig instance
    */
  /* static member */
  inline def create(): RuntimeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RuntimeConfig]
  inline def create(properties: IRuntimeConfig): RuntimeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RuntimeConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): RuntimeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RuntimeConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): RuntimeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RuntimeConfig]
  /**
    * Decodes a RuntimeConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RuntimeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): RuntimeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RuntimeConfig]
  inline def decode(reader: Reader, length: Double): RuntimeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RuntimeConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): RuntimeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RuntimeConfig]
  /**
    * Decodes a RuntimeConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RuntimeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): RuntimeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RuntimeConfig]
  
  /**
    * Encodes the specified RuntimeConfig message. Does not implicitly {@link io.cucumber.messages.RuntimeConfig.verify|verify} messages.
    * @param message RuntimeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IRuntimeConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRuntimeConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RuntimeConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.RuntimeConfig.verify|verify} messages.
    * @param message RuntimeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IRuntimeConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRuntimeConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RuntimeConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RuntimeConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RuntimeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RuntimeConfig]
  
  /**
    * Creates a plain object from a RuntimeConfig message. Also converts values to other types if specified.
    * @param message RuntimeConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RuntimeConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RuntimeConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a RuntimeConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

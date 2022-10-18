package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IParameterType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ParameterType. */
@JSImport("cucumber-messages", "messages.ParameterType")
@js.native
/**
  * Constructs a new ParameterType.
  * @param [properties] Properties to set
  */
open class ParameterType ()
  extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType {
  def this(properties: IParameterType) = this()
}
object ParameterType {
  
  @JSImport("cucumber-messages", "messages.ParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ParameterType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ParameterType instance
    */
  /* static member */
  inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  inline def create(properties: IParameterType): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  /**
    * Decodes a ParameterType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  /**
    * Decodes a ParameterType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  
  /**
    * Encodes the specified ParameterType message. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IParameterType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IParameterType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ParameterType message, length delimited. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IParameterType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IParameterType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ParameterType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ParameterType
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType]
  
  /**
    * Creates a plain object from a ParameterType message. Also converts values to other types if specified.
    * @param message ParameterType
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ParameterType,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ParameterType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

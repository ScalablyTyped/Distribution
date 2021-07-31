package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedExpression. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GeneratedExpression")
@js.native
/**
  * Constructs a new GeneratedExpression.
  * @param [properties] Properties to set
  */
class GeneratedExpression ()
  extends StObject
     with IGeneratedExpression {
  def this(properties: IGeneratedExpression) = this()
  
  /** GeneratedExpression parameterTypeNames. */
  @JSName("parameterTypeNames")
  var parameterTypeNames_GeneratedExpression: js.Array[String] = js.native
  
  /** GeneratedExpression text. */
  @JSName("text")
  var text_GeneratedExpression: String = js.native
  
  /**
    * Converts this GeneratedExpression to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GeneratedExpression {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GeneratedExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GeneratedExpression instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedExpression instance
    */
  /* static member */
  @scala.inline
  def create(): GeneratedExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GeneratedExpression]
  @scala.inline
  def create(properties: IGeneratedExpression): GeneratedExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GeneratedExpression]
  
  /**
    * Decodes a GeneratedExpression message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedExpression
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): GeneratedExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedExpression]
  @scala.inline
  def decode(reader: Reader, length: Double): GeneratedExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GeneratedExpression]
  @scala.inline
  def decode(reader: Uint8Array): GeneratedExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedExpression]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): GeneratedExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GeneratedExpression]
  
  /**
    * Decodes a GeneratedExpression message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedExpression
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): GeneratedExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedExpression]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): GeneratedExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedExpression]
  
  /**
    * Encodes the specified GeneratedExpression message. Does not implicitly {@link io.cucumber.messages.GeneratedExpression.verify|verify} messages.
    * @param message GeneratedExpression message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IGeneratedExpression): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IGeneratedExpression, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GeneratedExpression message, length delimited. Does not implicitly {@link io.cucumber.messages.GeneratedExpression.verify|verify} messages.
    * @param message GeneratedExpression message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IGeneratedExpression): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IGeneratedExpression, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GeneratedExpression message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedExpression
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): GeneratedExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GeneratedExpression]
  
  /**
    * Creates a plain object from a GeneratedExpression message. Also converts values to other types if specified.
    * @param message GeneratedExpression
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: GeneratedExpression): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: GeneratedExpression, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GeneratedExpression message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

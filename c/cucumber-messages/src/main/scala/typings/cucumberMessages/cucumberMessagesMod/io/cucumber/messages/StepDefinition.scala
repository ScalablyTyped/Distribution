package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StepDefinition. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition")
@js.native
/**
  * Constructs a new StepDefinition.
  * @param [properties] Properties to set
  */
class StepDefinition ()
  extends StObject
     with IStepDefinition {
  def this(properties: IStepDefinition) = this()
  
  /** StepDefinition id. */
  @JSName("id")
  var id_StepDefinition: String = js.native
  
  /**
    * Converts this StepDefinition to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object StepDefinition {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StepDefinition instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepDefinition instance
    */
  /* static member */
  @scala.inline
  def create(): StepDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StepDefinition]
  @scala.inline
  def create(properties: IStepDefinition): StepDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StepDefinition]
  
  /**
    * Decodes a StepDefinition message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepDefinition
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): StepDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinition]
  @scala.inline
  def decode(reader: Reader, length: Double): StepDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StepDefinition]
  @scala.inline
  def decode(reader: Uint8Array): StepDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinition]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): StepDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StepDefinition]
  
  /**
    * Decodes a StepDefinition message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepDefinition
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): StepDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinition]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): StepDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinition]
  
  /**
    * Encodes the specified StepDefinition message. Does not implicitly {@link io.cucumber.messages.StepDefinition.verify|verify} messages.
    * @param message StepDefinition message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IStepDefinition): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IStepDefinition, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StepDefinition message, length delimited. Does not implicitly {@link io.cucumber.messages.StepDefinition.verify|verify} messages.
    * @param message StepDefinition message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IStepDefinition): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IStepDefinition, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StepDefinition message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepDefinition
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): StepDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StepDefinition]
  
  /**
    * Creates a plain object from a StepDefinition message. Also converts values to other types if specified.
    * @param message StepDefinition
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: StepDefinition): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: StepDefinition, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a StepDefinition message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

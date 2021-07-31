package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StepDefinitionPattern. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinitionPattern")
@js.native
/**
  * Constructs a new StepDefinitionPattern.
  * @param [properties] Properties to set
  */
class StepDefinitionPattern ()
  extends StObject
     with IStepDefinitionPattern {
  def this(properties: IStepDefinitionPattern) = this()
  
  /** StepDefinitionPattern source. */
  @JSName("source")
  var source_StepDefinitionPattern: String = js.native
  
  /**
    * Converts this StepDefinitionPattern to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** StepDefinitionPattern type. */
  @JSName("type")
  var type_StepDefinitionPattern: StepDefinitionPatternType = js.native
}
object StepDefinitionPattern {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinitionPattern")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StepDefinitionPattern instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepDefinitionPattern instance
    */
  /* static member */
  @scala.inline
  def create(): StepDefinitionPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StepDefinitionPattern]
  @scala.inline
  def create(properties: IStepDefinitionPattern): StepDefinitionPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StepDefinitionPattern]
  
  /**
    * Decodes a StepDefinitionPattern message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepDefinitionPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): StepDefinitionPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinitionPattern]
  @scala.inline
  def decode(reader: Reader, length: Double): StepDefinitionPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StepDefinitionPattern]
  @scala.inline
  def decode(reader: Uint8Array): StepDefinitionPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinitionPattern]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): StepDefinitionPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StepDefinitionPattern]
  
  /**
    * Decodes a StepDefinitionPattern message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepDefinitionPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): StepDefinitionPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinitionPattern]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): StepDefinitionPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StepDefinitionPattern]
  
  /**
    * Encodes the specified StepDefinitionPattern message. Does not implicitly {@link io.cucumber.messages.StepDefinitionPattern.verify|verify} messages.
    * @param message StepDefinitionPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IStepDefinitionPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IStepDefinitionPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StepDefinitionPattern message, length delimited. Does not implicitly {@link io.cucumber.messages.StepDefinitionPattern.verify|verify} messages.
    * @param message StepDefinitionPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IStepDefinitionPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IStepDefinitionPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StepDefinitionPattern message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepDefinitionPattern
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): StepDefinitionPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StepDefinitionPattern]
  
  /**
    * Creates a plain object from a StepDefinitionPattern message. Also converts values to other types if specified.
    * @param message StepDefinitionPattern
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: StepDefinitionPattern): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: StepDefinitionPattern, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a StepDefinitionPattern message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

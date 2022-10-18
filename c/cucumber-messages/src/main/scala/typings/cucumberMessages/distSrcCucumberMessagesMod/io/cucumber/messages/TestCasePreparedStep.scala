package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCasePreparedStep. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep")
@js.native
/**
  * Constructs a new TestCasePreparedStep.
  * @param [properties] Properties to set
  */
open class TestCasePreparedStep ()
  extends StObject
     with ITestCasePreparedStep {
  def this(properties: ITestCasePreparedStep) = this()
  
  /**
    * Converts this TestCasePreparedStep to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object TestCasePreparedStep {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestCasePreparedStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCasePreparedStep instance
    */
  /* static member */
  inline def create(): TestCasePreparedStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestCasePreparedStep]
  inline def create(properties: ITestCasePreparedStep): TestCasePreparedStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestCasePreparedStep]
  
  inline def decode(reader: js.typedarray.Uint8Array): TestCasePreparedStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCasePreparedStep]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TestCasePreparedStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestCasePreparedStep]
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): TestCasePreparedStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCasePreparedStep]
  inline def decode(reader: Reader, length: Double): TestCasePreparedStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestCasePreparedStep]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TestCasePreparedStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCasePreparedStep]
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): TestCasePreparedStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCasePreparedStep]
  
  /**
    * Encodes the specified TestCasePreparedStep message. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITestCasePreparedStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITestCasePreparedStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestCasePreparedStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITestCasePreparedStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITestCasePreparedStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestCasePreparedStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCasePreparedStep
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): TestCasePreparedStep = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestCasePreparedStep]
  
  /**
    * Creates a plain object from a TestCasePreparedStep message. Also converts values to other types if specified.
    * @param message TestCasePreparedStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TestCasePreparedStep): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TestCasePreparedStep, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TestCasePreparedStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

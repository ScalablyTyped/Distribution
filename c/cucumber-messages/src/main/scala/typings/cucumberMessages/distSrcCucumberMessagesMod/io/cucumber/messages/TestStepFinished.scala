package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestStepFinished. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished")
@js.native
/**
  * Constructs a new TestStepFinished.
  * @param [properties] Properties to set
  */
open class TestStepFinished ()
  extends StObject
     with ITestStepFinished {
  def this(properties: ITestStepFinished) = this()
  
  /** TestStepFinished testCaseStartedId. */
  @JSName("testCaseStartedId")
  var testCaseStartedId_TestStepFinished: String = js.native
  
  /** TestStepFinished testStepId. */
  @JSName("testStepId")
  var testStepId_TestStepFinished: String = js.native
  
  /**
    * Converts this TestStepFinished to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object TestStepFinished {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestStepFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestStepFinished instance
    */
  /* static member */
  inline def create(): TestStepFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestStepFinished]
  inline def create(properties: ITestStepFinished): TestStepFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestStepFinished]
  
  inline def decode(reader: js.typedarray.Uint8Array): TestStepFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStepFinished]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TestStepFinished = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestStepFinished]
  /**
    * Decodes a TestStepFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestStepFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): TestStepFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStepFinished]
  inline def decode(reader: Reader, length: Double): TestStepFinished = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestStepFinished]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TestStepFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStepFinished]
  /**
    * Decodes a TestStepFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestStepFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): TestStepFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStepFinished]
  
  /**
    * Encodes the specified TestStepFinished message. Does not implicitly {@link io.cucumber.messages.TestStepFinished.verify|verify} messages.
    * @param message TestStepFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITestStepFinished): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITestStepFinished, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestStepFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestStepFinished.verify|verify} messages.
    * @param message TestStepFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITestStepFinished): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITestStepFinished, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestStepFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestStepFinished
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): TestStepFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestStepFinished]
  
  /**
    * Creates a plain object from a TestStepFinished message. Also converts values to other types if specified.
    * @param message TestStepFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TestStepFinished): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TestStepFinished, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TestStepFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

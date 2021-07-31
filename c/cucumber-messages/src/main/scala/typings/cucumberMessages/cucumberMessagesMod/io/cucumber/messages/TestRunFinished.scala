package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestRunFinished. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished")
@js.native
/**
  * Constructs a new TestRunFinished.
  * @param [properties] Properties to set
  */
class TestRunFinished ()
  extends StObject
     with ITestRunFinished {
  def this(properties: ITestRunFinished) = this()
  
  /** TestRunFinished success. */
  @JSName("success")
  var success_TestRunFinished: Boolean = js.native
  
  /**
    * Converts this TestRunFinished to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestRunFinished {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestRunFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestRunFinished instance
    */
  /* static member */
  @scala.inline
  def create(): TestRunFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestRunFinished]
  @scala.inline
  def create(properties: ITestRunFinished): TestRunFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestRunFinished]
  
  /**
    * Decodes a TestRunFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestRunFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): TestRunFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunFinished]
  @scala.inline
  def decode(reader: Reader, length: Double): TestRunFinished = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestRunFinished]
  @scala.inline
  def decode(reader: Uint8Array): TestRunFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunFinished]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TestRunFinished = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestRunFinished]
  
  /**
    * Decodes a TestRunFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestRunFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): TestRunFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunFinished]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TestRunFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunFinished]
  
  /**
    * Encodes the specified TestRunFinished message. Does not implicitly {@link io.cucumber.messages.TestRunFinished.verify|verify} messages.
    * @param message TestRunFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ITestRunFinished): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITestRunFinished, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestRunFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestRunFinished.verify|verify} messages.
    * @param message TestRunFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ITestRunFinished): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITestRunFinished, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestRunFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestRunFinished
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TestRunFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestRunFinished]
  
  /**
    * Creates a plain object from a TestRunFinished message. Also converts values to other types if specified.
    * @param message TestRunFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: TestRunFinished): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TestRunFinished, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TestRunFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

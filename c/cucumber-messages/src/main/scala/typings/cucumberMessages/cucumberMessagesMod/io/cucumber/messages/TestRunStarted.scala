package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestRunStarted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted")
@js.native
/**
  * Constructs a new TestRunStarted.
  * @param [properties] Properties to set
  */
class TestRunStarted ()
  extends StObject
     with ITestRunStarted {
  def this(properties: ITestRunStarted) = this()
  
  /**
    * Converts this TestRunStarted to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestRunStarted {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestRunStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestRunStarted instance
    */
  /* static member */
  inline def create(): TestRunStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestRunStarted]
  inline def create(properties: ITestRunStarted): TestRunStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestRunStarted]
  
  /**
    * Decodes a TestRunStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestRunStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): TestRunStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunStarted]
  inline def decode(reader: Reader, length: Double): TestRunStarted = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestRunStarted]
  inline def decode(reader: Uint8Array): TestRunStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunStarted]
  inline def decode(reader: Uint8Array, length: Double): TestRunStarted = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestRunStarted]
  
  /**
    * Decodes a TestRunStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestRunStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): TestRunStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunStarted]
  inline def decodeDelimited(reader: Uint8Array): TestRunStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestRunStarted]
  
  /**
    * Encodes the specified TestRunStarted message. Does not implicitly {@link io.cucumber.messages.TestRunStarted.verify|verify} messages.
    * @param message TestRunStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITestRunStarted): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITestRunStarted, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestRunStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestRunStarted.verify|verify} messages.
    * @param message TestRunStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITestRunStarted): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITestRunStarted, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestRunStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestRunStarted
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): TestRunStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestRunStarted]
  
  /**
    * Creates a plain object from a TestRunStarted message. Also converts values to other types if specified.
    * @param message TestRunStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TestRunStarted): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: TestRunStarted, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TestRunStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

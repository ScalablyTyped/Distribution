package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestResult
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestResult. */
@JSImport("cucumber-messages", "messages.TestResult")
@js.native
/**
  * Constructs a new TestResult.
  * @param [properties] Properties to set
  */
open class TestResult ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult {
  def this(properties: ITestResult) = this()
}
object TestResult {
  
  @JSImport("cucumber-messages", "messages.TestResult")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Status of a step. Can also represent status of a Pickle (aggregated
    * from the status of its steps).
    *
    * The ordinal values of statuses are significant. The status of a Pickle
    * is determined by the union of statuses of its steps. The
    * status of the Pickle is the status with the highest ordinal
    * in the enum.
    *
    * For example, if a pickle has steps with statuses passed, undefined and skipped,
    * then the pickle's status is undefined.
    */
  @JSImport("cucumber-messages", "messages.TestResult.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status & Double
      ] = js.native
    
    /* 5 */ val AMBIGUOUS: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.AMBIGUOUS & Double = js.native
    
    /* 6 */ val FAILED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.FAILED & Double = js.native
    
    /* 1 */ val PASSED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.PASSED & Double = js.native
    
    /* 3 */ val PENDING: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.PENDING & Double = js.native
    
    /* 2 */ val SKIPPED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.SKIPPED & Double = js.native
    
    /* 4 */ val UNDEFINED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.UNDEFINED & Double = js.native
    
    /* 0 */ val UNKNOWN: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.UNKNOWN & Double = js.native
  }
  
  /**
    * Creates a new TestResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestResult instance
    */
  /* static member */
  inline def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  inline def create(properties: ITestResult): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  /**
    * Decodes a TestResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  inline def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  /**
    * Decodes a TestResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  
  /**
    * Encodes the specified TestResult message. Does not implicitly {@link io.cucumber.messages.TestResult.verify|verify} messages.
    * @param message TestResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITestResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITestResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestResult message, length delimited. Does not implicitly {@link io.cucumber.messages.TestResult.verify|verify} messages.
    * @param message TestResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITestResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITestResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestResult
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult]
  
  /**
    * Creates a plain object from a TestResult message. Also converts values to other types if specified.
    * @param message TestResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TestResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

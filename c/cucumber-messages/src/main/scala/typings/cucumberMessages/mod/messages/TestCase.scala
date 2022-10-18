package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ITestCase
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCase. */
@JSImport("cucumber-messages", "messages.TestCase")
@js.native
/**
  * Constructs a new TestCase.
  * @param [properties] Properties to set
  */
open class TestCase ()
  extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase {
  def this(properties: ITestCase) = this()
}
object TestCase {
  
  @JSImport("cucumber-messages", "messages.TestCase")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a TestStep. */
  @JSImport("cucumber-messages", "messages.TestCase.TestStep")
  @js.native
  /**
    * Constructs a new TestStep.
    * @param [properties] Properties to set
    */
  open class TestStep ()
    extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep {
    def this(properties: ITestStep) = this()
  }
  object TestStep {
    
    @JSImport("cucumber-messages", "messages.TestCase.TestStep")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new TestStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TestStep instance
      */
    /* static member */
    inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    inline def create(properties: ITestStep): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    /**
      * Decodes a TestStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    /**
      * Decodes a TestStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    
    /**
      * Encodes the specified TestStep message. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ITestStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ITestStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified TestStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ITestStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ITestStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a TestStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TestStep
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep]
    
    /**
      * Creates a plain object from a TestStep message. Also converts values to other types if specified.
      * @param message TestStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.TestStep,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a TestStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new TestCase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCase instance
    */
  /* static member */
  inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  inline def create(properties: ITestCase): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  /**
    * Decodes a TestCase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  /**
    * Decodes a TestCase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  
  /**
    * Encodes the specified TestCase message. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITestCase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITestCase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestCase message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITestCase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITestCase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestCase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCase
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase]
  
  /**
    * Creates a plain object from a TestCase message. Also converts values to other types if specified.
    * @param message TestCase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TestCase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

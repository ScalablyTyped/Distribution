package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCase. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase")
@js.native
/**
  * Constructs a new TestCase.
  * @param [properties] Properties to set
  */
class TestCase ()
  extends StObject
     with ITestCase {
  def this(properties: ITestCase) = this()
  
  /** TestCase id. */
  @JSName("id")
  var id_TestCase: String = js.native
  
  /** TestCase pickleId. */
  @JSName("pickleId")
  var pickleId_TestCase: String = js.native
  
  /** TestCase testSteps. */
  @JSName("testSteps")
  var testSteps_TestCase: js.Array[ITestStep] = js.native
  
  /**
    * Converts this TestCase to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestCase {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a TestStep. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep")
  @js.native
  /**
    * Constructs a new TestStep.
    * @param [properties] Properties to set
    */
  class TestStep ()
    extends StObject
       with ITestStep {
    def this(properties: ITestStep) = this()
    
    /** TestStep hookId. */
    @JSName("hookId")
    var hookId_TestStep: String = js.native
    
    /** TestStep id. */
    @JSName("id")
    var id_TestStep: String = js.native
    
    /** TestStep pickleStepId. */
    @JSName("pickleStepId")
    var pickleStepId_TestStep: String = js.native
    
    /** TestStep stepDefinitionIds. */
    @JSName("stepDefinitionIds")
    var stepDefinitionIds_TestStep: js.Array[String] = js.native
    
    /** TestStep stepMatchArguments. */
    @JSName("stepMatchArguments")
    var stepMatchArguments_TestStep: js.Array[IStepMatchArgument] = js.native
    
    /**
      * Converts this TestStep to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object TestStep {
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new TestStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TestStep instance
      */
    /* static member */
    @scala.inline
    def create(): TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestStep]
    @scala.inline
    def create(properties: ITestStep): TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestStep]
    
    /**
      * Decodes a TestStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStep]
    @scala.inline
    def decode(reader: Reader, length: Double): TestStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestStep]
    @scala.inline
    def decode(reader: Uint8Array): TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStep]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): TestStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestStep]
    
    /**
      * Decodes a TestStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStep]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestStep]
    
    /**
      * Encodes the specified TestStep message. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ITestStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ITestStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified TestStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ITestStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ITestStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a TestStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TestStep
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): TestStep = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestStep]
    
    /**
      * Creates a plain object from a TestStep message. Also converts values to other types if specified.
      * @param message TestStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: TestStep): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: TestStep, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a TestStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new TestCase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCase instance
    */
  /* static member */
  @scala.inline
  def create(): TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestCase]
  @scala.inline
  def create(properties: ITestCase): TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestCase]
  
  /**
    * Decodes a TestCase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCase]
  @scala.inline
  def decode(reader: Reader, length: Double): TestCase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestCase]
  @scala.inline
  def decode(reader: Uint8Array): TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCase]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TestCase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestCase]
  
  /**
    * Decodes a TestCase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCase]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCase]
  
  /**
    * Encodes the specified TestCase message. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ITestCase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITestCase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestCase message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ITestCase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITestCase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestCase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCase
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TestCase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestCase]
  
  /**
    * Creates a plain object from a TestCase message. Also converts values to other types if specified.
    * @param message TestCase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: TestCase): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TestCase, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TestCase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a TestStep. */
  trait ITestStep extends StObject {
    
    /** TestStep hookId */
    var hookId: js.UndefOr[String | Null] = js.undefined
    
    /** TestStep id */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /** TestStep pickleStepId */
    var pickleStepId: js.UndefOr[String | Null] = js.undefined
    
    /** TestStep stepDefinitionIds */
    var stepDefinitionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** TestStep stepMatchArguments */
    var stepMatchArguments: js.UndefOr[js.Array[IStepMatchArgument] | Null] = js.undefined
  }
  object ITestStep {
    
    @scala.inline
    def apply(): ITestStep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITestStep]
    }
    
    @scala.inline
    implicit class ITestStepMutableBuilder[Self <: ITestStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHookId(value: String): Self = StObject.set(x, "hookId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookIdNull: Self = StObject.set(x, "hookId", null)
      
      @scala.inline
      def setHookIdUndefined: Self = StObject.set(x, "hookId", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPickleStepId(value: String): Self = StObject.set(x, "pickleStepId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickleStepIdNull: Self = StObject.set(x, "pickleStepId", null)
      
      @scala.inline
      def setPickleStepIdUndefined: Self = StObject.set(x, "pickleStepId", js.undefined)
      
      @scala.inline
      def setStepDefinitionIds(value: js.Array[String]): Self = StObject.set(x, "stepDefinitionIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepDefinitionIdsNull: Self = StObject.set(x, "stepDefinitionIds", null)
      
      @scala.inline
      def setStepDefinitionIdsUndefined: Self = StObject.set(x, "stepDefinitionIds", js.undefined)
      
      @scala.inline
      def setStepDefinitionIdsVarargs(value: String*): Self = StObject.set(x, "stepDefinitionIds", js.Array(value :_*))
      
      @scala.inline
      def setStepMatchArguments(value: js.Array[IStepMatchArgument]): Self = StObject.set(x, "stepMatchArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepMatchArgumentsNull: Self = StObject.set(x, "stepMatchArguments", null)
      
      @scala.inline
      def setStepMatchArgumentsUndefined: Self = StObject.set(x, "stepMatchArguments", js.undefined)
      
      @scala.inline
      def setStepMatchArgumentsVarargs(value: IStepMatchArgument*): Self = StObject.set(x, "stepMatchArguments", js.Array(value :_*))
    }
  }
}

package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCase. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase")
@js.native
/**
  * Constructs a new TestCase.
  * @param [properties] Properties to set
  */
class TestCase () extends ITestCase {
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
  
  /** Represents a TestStep. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep")
  @js.native
  /**
    * Constructs a new TestStep.
    * @param [properties] Properties to set
    */
  class TestStep () extends ITestStep {
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
    
    /**
      * Creates a new TestStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TestStep instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.create")
    @js.native
    def create(): TestStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.create")
    @js.native
    def create(properties: ITestStep): TestStep = js.native
    
    /**
      * Decodes a TestStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Reader): TestStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Reader, length: Double): TestStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Uint8Array): TestStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): TestStep = js.native
    
    /**
      * Decodes a TestStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): TestStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): TestStep = js.native
    
    /**
      * Encodes the specified TestStep message. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.encode")
    @js.native
    def encode(message: ITestStep): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.encode")
    @js.native
    def encode(message: ITestStep, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified TestStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: ITestStep): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: ITestStep, writer: Writer): Writer = js.native
    
    /**
      * Creates a TestStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TestStep
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): TestStep = js.native
    
    /**
      * Creates a plain object from a TestStep message. Also converts values to other types if specified.
      * @param message TestStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.toObject")
    @js.native
    def toObject(message: TestStep): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.toObject")
    @js.native
    def toObject(message: TestStep, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a TestStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new TestCase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCase instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.create")
  @js.native
  def create(): TestCase = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.create")
  @js.native
  def create(properties: ITestCase): TestCase = js.native
  
  /**
    * Decodes a TestCase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.decode")
  @js.native
  def decode(reader: Reader): TestCase = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.decode")
  @js.native
  def decode(reader: Reader, length: Double): TestCase = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.decode")
  @js.native
  def decode(reader: Uint8Array): TestCase = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TestCase = js.native
  
  /**
    * Decodes a TestCase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TestCase = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TestCase = js.native
  
  /**
    * Encodes the specified TestCase message. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.encode")
  @js.native
  def encode(message: ITestCase): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.encode")
  @js.native
  def encode(message: ITestCase, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCase message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCase): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCase, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCase
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TestCase = js.native
  
  /**
    * Creates a plain object from a TestCase message. Also converts values to other types if specified.
    * @param message TestCase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.toObject")
  @js.native
  def toObject(message: TestCase): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.toObject")
  @js.native
  def toObject(message: TestCase, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a TestStep. */
  @js.native
  trait ITestStep extends StObject {
    
    /** TestStep hookId */
    var hookId: js.UndefOr[String | Null] = js.native
    
    /** TestStep id */
    var id: js.UndefOr[String | Null] = js.native
    
    /** TestStep pickleStepId */
    var pickleStepId: js.UndefOr[String | Null] = js.native
    
    /** TestStep stepDefinitionIds */
    var stepDefinitionIds: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** TestStep stepMatchArguments */
    var stepMatchArguments: js.UndefOr[js.Array[IStepMatchArgument] | Null] = js.native
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

package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCaseStarted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted")
@js.native
/**
  * Constructs a new TestCaseStarted.
  * @param [properties] Properties to set
  */
class TestCaseStarted () extends ITestCaseStarted {
  def this(properties: ITestCaseStarted) = this()
  
  /**
    * The first attempt should have value 0, and for each retry the value
    * should increase by 1.
    */
  @JSName("attempt")
  var attempt_TestCaseStarted: Double = js.native
  
  /**
    * Because a `TestCase` can be run multiple times (in case of a retry),
    * we use this field to group messages relating to the same attempt.
    */
  @JSName("id")
  var id_TestCaseStarted: String = js.native
  
  /** TestCaseStarted testCaseId. */
  @JSName("testCaseId")
  var testCaseId_TestCaseStarted: String = js.native
  
  /**
    * Converts this TestCaseStarted to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestCaseStarted {
  
  /** Represents a Platform. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform")
  @js.native
  /**
    * Constructs a new Platform.
    * @param [properties] Properties to set
    */
  class Platform () extends IPlatform {
    def this(properties: IPlatform) = this()
    
    /** Platform cpu. */
    @JSName("cpu")
    var cpu_Platform: String = js.native
    
    /** Platform implementation. */
    @JSName("implementation")
    var implementation_Platform: String = js.native
    
    /** Platform os. */
    @JSName("os")
    var os_Platform: String = js.native
    
    /**
      * Converts this Platform to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Platform version. */
    @JSName("version")
    var version_Platform: String = js.native
  }
  object Platform {
    
    /**
      * Creates a new Platform instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Platform instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.create")
    @js.native
    def create(): Platform = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.create")
    @js.native
    def create(properties: IPlatform): Platform = js.native
    
    /**
      * Decodes a Platform message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Platform
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.decode")
    @js.native
    def decode(reader: Reader): Platform = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.decode")
    @js.native
    def decode(reader: Reader, length: Double): Platform = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.decode")
    @js.native
    def decode(reader: Uint8Array): Platform = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Platform = js.native
    
    /**
      * Decodes a Platform message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Platform
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Platform = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Platform = js.native
    
    /**
      * Encodes the specified Platform message. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
      * @param message Platform message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.encode")
    @js.native
    def encode(message: IPlatform): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.encode")
    @js.native
    def encode(message: IPlatform, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Platform message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
      * @param message Platform message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPlatform): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPlatform, writer: Writer): Writer = js.native
    
    /**
      * Creates a Platform message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Platform
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Platform = js.native
    
    /**
      * Creates a plain object from a Platform message. Also converts values to other types if specified.
      * @param message Platform
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.toObject")
    @js.native
    def toObject(message: Platform): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.toObject")
    @js.native
    def toObject(message: Platform, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Platform message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new TestCaseStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCaseStarted instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.create")
  @js.native
  def create(): TestCaseStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.create")
  @js.native
  def create(properties: ITestCaseStarted): TestCaseStarted = js.native
  
  /**
    * Decodes a TestCaseStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCaseStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.decode")
  @js.native
  def decode(reader: Reader): TestCaseStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.decode")
  @js.native
  def decode(reader: Reader, length: Double): TestCaseStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.decode")
  @js.native
  def decode(reader: Uint8Array): TestCaseStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TestCaseStarted = js.native
  
  /**
    * Decodes a TestCaseStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCaseStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TestCaseStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TestCaseStarted = js.native
  
  /**
    * Encodes the specified TestCaseStarted message. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.verify|verify} messages.
    * @param message TestCaseStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.encode")
  @js.native
  def encode(message: ITestCaseStarted): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.encode")
  @js.native
  def encode(message: ITestCaseStarted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCaseStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.verify|verify} messages.
    * @param message TestCaseStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCaseStarted): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCaseStarted, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCaseStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCaseStarted
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TestCaseStarted = js.native
  
  /**
    * Creates a plain object from a TestCaseStarted message. Also converts values to other types if specified.
    * @param message TestCaseStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.toObject")
  @js.native
  def toObject(message: TestCaseStarted): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.toObject")
  @js.native
  def toObject(message: TestCaseStarted, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCaseStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a Platform. */
  @js.native
  trait IPlatform extends StObject {
    
    /** Platform cpu */
    var cpu: js.UndefOr[String | Null] = js.native
    
    /** Platform implementation */
    var implementation: js.UndefOr[String | Null] = js.native
    
    /** Platform os */
    var os: js.UndefOr[String | Null] = js.native
    
    /** Platform version */
    var version: js.UndefOr[String | Null] = js.native
  }
  object IPlatform {
    
    @scala.inline
    def apply(): IPlatform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlatform]
    }
    
    @scala.inline
    implicit class IPlatformMutableBuilder[Self <: IPlatform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuNull: Self = StObject.set(x, "cpu", null)
      
      @scala.inline
      def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      @scala.inline
      def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationNull: Self = StObject.set(x, "implementation", null)
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsNull: Self = StObject.set(x, "os", null)
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionNull: Self = StObject.set(x, "version", null)
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}

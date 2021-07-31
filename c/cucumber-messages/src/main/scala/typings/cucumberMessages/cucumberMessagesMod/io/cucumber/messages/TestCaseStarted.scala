package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCaseStarted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted")
@js.native
/**
  * Constructs a new TestCaseStarted.
  * @param [properties] Properties to set
  */
class TestCaseStarted ()
  extends StObject
     with ITestCaseStarted {
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
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Platform. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform")
  @js.native
  /**
    * Constructs a new Platform.
    * @param [properties] Properties to set
    */
  class Platform ()
    extends StObject
       with IPlatform {
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
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Platform instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Platform instance
      */
    /* static member */
    @scala.inline
    def create(): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Platform]
    @scala.inline
    def create(properties: IPlatform): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Platform]
    
    /**
      * Decodes a Platform message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Platform
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Platform]
    @scala.inline
    def decode(reader: Reader, length: Double): Platform = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Platform]
    @scala.inline
    def decode(reader: Uint8Array): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Platform]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Platform = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Platform]
    
    /**
      * Decodes a Platform message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Platform
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Platform]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Platform]
    
    /**
      * Encodes the specified Platform message. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
      * @param message Platform message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IPlatform): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IPlatform, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Platform message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
      * @param message Platform message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IPlatform): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IPlatform, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Platform message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Platform
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Platform]
    
    /**
      * Creates a plain object from a Platform message. Also converts values to other types if specified.
      * @param message Platform
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Platform): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Platform, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Platform message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new TestCaseStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCaseStarted instance
    */
  /* static member */
  @scala.inline
  def create(): TestCaseStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestCaseStarted]
  @scala.inline
  def create(properties: ITestCaseStarted): TestCaseStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestCaseStarted]
  
  /**
    * Decodes a TestCaseStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCaseStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): TestCaseStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCaseStarted]
  @scala.inline
  def decode(reader: Reader, length: Double): TestCaseStarted = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestCaseStarted]
  @scala.inline
  def decode(reader: Uint8Array): TestCaseStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCaseStarted]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TestCaseStarted = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestCaseStarted]
  
  /**
    * Decodes a TestCaseStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCaseStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): TestCaseStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCaseStarted]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TestCaseStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestCaseStarted]
  
  /**
    * Encodes the specified TestCaseStarted message. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.verify|verify} messages.
    * @param message TestCaseStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ITestCaseStarted): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITestCaseStarted, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestCaseStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.verify|verify} messages.
    * @param message TestCaseStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ITestCaseStarted): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITestCaseStarted, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestCaseStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCaseStarted
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TestCaseStarted = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestCaseStarted]
  
  /**
    * Creates a plain object from a TestCaseStarted message. Also converts values to other types if specified.
    * @param message TestCaseStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: TestCaseStarted): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TestCaseStarted, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TestCaseStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Platform. */
  trait IPlatform extends StObject {
    
    /** Platform cpu */
    var cpu: js.UndefOr[String | Null] = js.undefined
    
    /** Platform implementation */
    var implementation: js.UndefOr[String | Null] = js.undefined
    
    /** Platform os */
    var os: js.UndefOr[String | Null] = js.undefined
    
    /** Platform version */
    var version: js.UndefOr[String | Null] = js.undefined
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

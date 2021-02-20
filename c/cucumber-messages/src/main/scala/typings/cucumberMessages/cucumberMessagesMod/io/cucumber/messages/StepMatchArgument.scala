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

/**
  * Represents a single argument extracted from a step match and passed to a step definition.
  * This is used for the following purposes:
  * - Construct an argument to pass to a step definition (possibly through a parameter type transform)
  * - Highlight the matched parameter in rich formatters such as the HTML formatter
  *
  * This message closely matches the `Argument` class in the `cucumber-expressions` library.
  */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument")
@js.native
/**
  * Constructs a new StepMatchArgument.
  * @param [properties] Properties to set
  */
class StepMatchArgument () extends IStepMatchArgument {
  def this(properties: IStepMatchArgument) = this()
  
  /** StepMatchArgument parameterTypeName. */
  @JSName("parameterTypeName")
  var parameterTypeName_StepMatchArgument: String = js.native
  
  /**
    * Converts this StepMatchArgument to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object StepMatchArgument {
  
  /** Represents a Group. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group")
  @js.native
  /**
    * Constructs a new Group.
    * @param [properties] Properties to set
    */
  class Group () extends IGroup {
    def this(properties: IGroup) = this()
    
    /** Group children. */
    @JSName("children")
    var children_Group: js.Array[IGroup] = js.native
    
    /** Group start. */
    @JSName("start")
    var start_Group: Double = js.native
    
    /**
      * Converts this Group to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Group value. */
    @JSName("value")
    var value_Group: String = js.native
  }
  object Group {
    
    /**
      * Creates a new Group instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Group instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.create")
    @js.native
    def create(): Group = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.create")
    @js.native
    def create(properties: IGroup): Group = js.native
    
    /**
      * Decodes a Group message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Reader): Group = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Reader, length: Double): Group = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Uint8Array): Group = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Group = js.native
    
    /**
      * Decodes a Group message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Group = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Group = js.native
    
    /**
      * Encodes the specified Group message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.encode")
    @js.native
    def encode(message: IGroup): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.encode")
    @js.native
    def encode(message: IGroup, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Group message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.encodeDelimited")
    @js.native
    def encodeDelimited(message: IGroup): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.encodeDelimited")
    @js.native
    def encodeDelimited(message: IGroup, writer: Writer): Writer = js.native
    
    /**
      * Creates a Group message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Group
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Group = js.native
    
    /**
      * Creates a plain object from a Group message. Also converts values to other types if specified.
      * @param message Group
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.toObject")
    @js.native
    def toObject(message: Group): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.toObject")
    @js.native
    def toObject(message: Group, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Group message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new StepMatchArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepMatchArgument instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.create")
  @js.native
  def create(): StepMatchArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.create")
  @js.native
  def create(properties: IStepMatchArgument): StepMatchArgument = js.native
  
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Reader): StepMatchArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Reader, length: Double): StepMatchArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Uint8Array): StepMatchArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): StepMatchArgument = js.native
  
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): StepMatchArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): StepMatchArgument = js.native
  
  /**
    * Encodes the specified StepMatchArgument message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.encode")
  @js.native
  def encode(message: IStepMatchArgument): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.encode")
  @js.native
  def encode(message: IStepMatchArgument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StepMatchArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepMatchArgument): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepMatchArgument, writer: Writer): Writer = js.native
  
  /**
    * Creates a StepMatchArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepMatchArgument
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): StepMatchArgument = js.native
  
  /**
    * Creates a plain object from a StepMatchArgument message. Also converts values to other types if specified.
    * @param message StepMatchArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.toObject")
  @js.native
  def toObject(message: StepMatchArgument): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.toObject")
  @js.native
  def toObject(message: StepMatchArgument, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StepMatchArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a Group. */
  @js.native
  trait IGroup extends StObject {
    
    /** Group children */
    var children: js.UndefOr[js.Array[IGroup] | Null] = js.native
    
    /** Group start */
    var start: js.UndefOr[Double | Null] = js.native
    
    /** Group value */
    var value: js.UndefOr[String | Null] = js.native
  }
  object IGroup {
    
    @scala.inline
    def apply(): IGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroup]
    }
    
    @scala.inline
    implicit class IGroupMutableBuilder[Self <: IGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[IGroup]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: IGroup*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNull: Self = StObject.set(x, "start", null)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

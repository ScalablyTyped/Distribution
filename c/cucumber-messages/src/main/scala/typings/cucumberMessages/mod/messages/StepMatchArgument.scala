package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IStepMatchArgument
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.IGroup
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
@JSImport("cucumber-messages", "messages.StepMatchArgument")
@js.native
/**
  * Constructs a new StepMatchArgument.
  * @param [properties] Properties to set
  */
class StepMatchArgument ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument {
  def this(properties: IStepMatchArgument) = this()
}
object StepMatchArgument {
  
  /** Represents a Group. */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.Group")
  @js.native
  /**
    * Constructs a new Group.
    * @param [properties] Properties to set
    */
  class Group ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group {
    def this(properties: IGroup) = this()
  }
  object Group {
    
    /**
      * Creates a new Group instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Group instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.create")
    @js.native
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.create")
    @js.native
    def create(properties: IGroup): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Decodes a Group message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Decodes a Group message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Encodes the specified Group message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.encode")
    @js.native
    def encode(message: IGroup): Writer = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.encode")
    @js.native
    def encode(message: IGroup, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Group message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.encodeDelimited")
    @js.native
    def encodeDelimited(message: IGroup): Writer = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.encodeDelimited")
    @js.native
    def encodeDelimited(message: IGroup, writer: Writer): Writer = js.native
    
    /**
      * Creates a Group message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Group
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Creates a plain object from a Group message. Also converts values to other types if specified.
      * @param message Group
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.toObject")
    @js.native
    def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Group message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.StepMatchArgument.Group.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new StepMatchArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepMatchArgument instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.create")
  @js.native
  def create(properties: IStepMatchArgument): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Encodes the specified StepMatchArgument message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.encode")
  @js.native
  def encode(message: IStepMatchArgument): Writer = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.encode")
  @js.native
  def encode(message: IStepMatchArgument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StepMatchArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepMatchArgument): Writer = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepMatchArgument, writer: Writer): Writer = js.native
  
  /**
    * Creates a StepMatchArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepMatchArgument
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Creates a plain object from a StepMatchArgument message. Also converts values to other types if specified.
    * @param message StepMatchArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.StepMatchArgument.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StepMatchArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepMatchArgument.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

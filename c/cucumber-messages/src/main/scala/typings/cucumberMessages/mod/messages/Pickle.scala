package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickle
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleStep
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleTag
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Pickle` represents a test case Cucumber can *execute*. It is typically derived
  * from another format, such as [GherkinDocument](#io.cucumber.messages.GherkinDocument).
  * In the future a `Pickle` may be derived from other formats such as Markdown or
  * Excel files.
  *
  * By making `Pickle` the main data structure Cucumber uses for execution, the
  * implementation of Cucumber itself becomes simpler, as it doesn't have to deal
  * with the complex structure of a [GherkinDocument](#io.cucumber.messages.GherkinDocument).
  */
@JSImport("cucumber-messages", "messages.Pickle")
@js.native
/**
  * Constructs a new Pickle.
  * @param [properties] Properties to set
  */
class Pickle ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle {
  def this(properties: IPickle) = this()
}
object Pickle {
  
  /** An executable step */
  @JSImport("cucumber-messages", "messages.Pickle.PickleStep")
  @js.native
  /**
    * Constructs a new PickleStep.
    * @param [properties] Properties to set
    */
  class PickleStep ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep {
    def this(properties: IPickleStep) = this()
  }
  object PickleStep {
    
    /**
      * Creates a new PickleStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleStep instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.create")
    @js.native
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.create")
    @js.native
    def create(properties: IPickleStep): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Decodes a PickleStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Decodes a PickleStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Encodes the specified PickleStep message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.encode")
    @js.native
    def encode(message: IPickleStep): Writer = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.encode")
    @js.native
    def encode(message: IPickleStep, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleStep message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleStep): Writer = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleStep, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleStep
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Creates a plain object from a PickleStep message. Also converts values to other types if specified.
      * @param message PickleStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.toObject")
    @js.native
    def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleStep.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** A tag */
  @JSImport("cucumber-messages", "messages.Pickle.PickleTag")
  @js.native
  /**
    * Constructs a new PickleTag.
    * @param [properties] Properties to set
    */
  class PickleTag ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag {
    def this(properties: IPickleTag) = this()
  }
  object PickleTag {
    
    /**
      * Creates a new PickleTag instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTag instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.create")
    @js.native
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.create")
    @js.native
    def create(properties: IPickleTag): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Decodes a PickleTag message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Decodes a PickleTag message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Encodes the specified PickleTag message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.encode")
    @js.native
    def encode(message: IPickleTag): Writer = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.encode")
    @js.native
    def encode(message: IPickleTag, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleTag message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTag): Writer = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTag, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleTag message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleTag
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Creates a plain object from a PickleTag message. Also converts values to other types if specified.
      * @param message PickleTag
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.toObject")
    @js.native
    def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleTag message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.Pickle.PickleTag.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new Pickle instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Pickle instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  @JSImport("cucumber-messages", "messages.Pickle.create")
  @js.native
  def create(properties: IPickle): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Decodes a Pickle message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  @JSImport("cucumber-messages", "messages.Pickle.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  @JSImport("cucumber-messages", "messages.Pickle.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  @JSImport("cucumber-messages", "messages.Pickle.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Decodes a Pickle message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  @JSImport("cucumber-messages", "messages.Pickle.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Encodes the specified Pickle message. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.encode")
  @js.native
  def encode(message: IPickle): Writer = js.native
  @JSImport("cucumber-messages", "messages.Pickle.encode")
  @js.native
  def encode(message: IPickle, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Pickle message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickle): Writer = js.native
  @JSImport("cucumber-messages", "messages.Pickle.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickle, writer: Writer): Writer = js.native
  
  /**
    * Creates a Pickle message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Pickle
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Creates a plain object from a Pickle message. Also converts values to other types if specified.
    * @param message Pickle
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.Pickle.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Pickle message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Pickle.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

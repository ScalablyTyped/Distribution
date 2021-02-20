package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
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
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle")
@js.native
/**
  * Constructs a new Pickle.
  * @param [properties] Properties to set
  */
class Pickle () extends IPickle {
  def this(properties: IPickle) = this()
  
  /**
    * Points to the AST node locations of the pickle. The last one represents the unique
    * id of the pickle. A pickle constructed from `Examples` will have the first
    * id originating from the `Scenario` AST node, and the second from the `TableRow` AST node.
    */
  @JSName("astNodeIds")
  var astNodeIds_Pickle: js.Array[String] = js.native
  
  /**
    * A unique id for the pickle. This is a [SHA1](https://en.wikipedia.org/wiki/SHA-1) hash
    * from the source data and the `locations` of the pickle.
    * This ID will change if source the file is modified.
    */
  @JSName("id")
  var id_Pickle: String = js.native
  
  /** Pickle language. */
  @JSName("language")
  var language_Pickle: String = js.native
  
  /** Pickle name. */
  @JSName("name")
  var name_Pickle: String = js.native
  
  /** Pickle steps. */
  @JSName("steps")
  var steps_Pickle: js.Array[IPickleStep] = js.native
  
  /**
    * One or more tags. If this pickle is constructed from a Gherkin document,
    * It includes inherited tags from the `Feature` as well.
    */
  @JSName("tags")
  var tags_Pickle: js.Array[IPickleTag] = js.native
  
  /**
    * Converts this Pickle to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Pickle uri. */
  @JSName("uri")
  var uri_Pickle: String = js.native
}
object Pickle {
  
  /** An executable step */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep")
  @js.native
  /**
    * Constructs a new PickleStep.
    * @param [properties] Properties to set
    */
  class PickleStep () extends IPickleStep {
    def this(properties: IPickleStep) = this()
    
    /** PickleStep astNodeIds. */
    @JSName("astNodeIds")
    var astNodeIds_PickleStep: js.Array[String] = js.native
    
    /** PickleStep id. */
    @JSName("id")
    var id_PickleStep: String = js.native
    
    /** PickleStep text. */
    @JSName("text")
    var text_PickleStep: String = js.native
    
    /**
      * Converts this PickleStep to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object PickleStep {
    
    /**
      * Creates a new PickleStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleStep instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.create")
    @js.native
    def create(): PickleStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.create")
    @js.native
    def create(properties: IPickleStep): PickleStep = js.native
    
    /**
      * Decodes a PickleStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Reader): PickleStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Reader, length: Double): PickleStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Uint8Array): PickleStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): PickleStep = js.native
    
    /**
      * Decodes a PickleStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): PickleStep = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): PickleStep = js.native
    
    /**
      * Encodes the specified PickleStep message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.encode")
    @js.native
    def encode(message: IPickleStep): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.encode")
    @js.native
    def encode(message: IPickleStep, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleStep message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleStep): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleStep, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleStep
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): PickleStep = js.native
    
    /**
      * Creates a plain object from a PickleStep message. Also converts values to other types if specified.
      * @param message PickleStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.toObject")
    @js.native
    def toObject(message: PickleStep): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.toObject")
    @js.native
    def toObject(message: PickleStep, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** A tag */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag")
  @js.native
  /**
    * Constructs a new PickleTag.
    * @param [properties] Properties to set
    */
  class PickleTag () extends IPickleTag {
    def this(properties: IPickleTag) = this()
    
    /** PickleTag astNodeId. */
    @JSName("astNodeId")
    var astNodeId_PickleTag: String = js.native
    
    /** PickleTag name. */
    @JSName("name")
    var name_PickleTag: String = js.native
    
    /**
      * Converts this PickleTag to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object PickleTag {
    
    /**
      * Creates a new PickleTag instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTag instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.create")
    @js.native
    def create(): PickleTag = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.create")
    @js.native
    def create(properties: IPickleTag): PickleTag = js.native
    
    /**
      * Decodes a PickleTag message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Reader): PickleTag = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Reader, length: Double): PickleTag = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Uint8Array): PickleTag = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): PickleTag = js.native
    
    /**
      * Decodes a PickleTag message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): PickleTag = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): PickleTag = js.native
    
    /**
      * Encodes the specified PickleTag message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.encode")
    @js.native
    def encode(message: IPickleTag): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.encode")
    @js.native
    def encode(message: IPickleTag, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleTag message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTag): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTag, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleTag message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleTag
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): PickleTag = js.native
    
    /**
      * Creates a plain object from a PickleTag message. Also converts values to other types if specified.
      * @param message PickleTag
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.toObject")
    @js.native
    def toObject(message: PickleTag): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.toObject")
    @js.native
    def toObject(message: PickleTag, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleTag message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new Pickle instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Pickle instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.create")
  @js.native
  def create(): Pickle = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.create")
  @js.native
  def create(properties: IPickle): Pickle = js.native
  
  /**
    * Decodes a Pickle message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.decode")
  @js.native
  def decode(reader: Reader): Pickle = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.decode")
  @js.native
  def decode(reader: Reader, length: Double): Pickle = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.decode")
  @js.native
  def decode(reader: Uint8Array): Pickle = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Pickle = js.native
  
  /**
    * Decodes a Pickle message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Pickle = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Pickle = js.native
  
  /**
    * Encodes the specified Pickle message. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.encode")
  @js.native
  def encode(message: IPickle): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.encode")
  @js.native
  def encode(message: IPickle, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Pickle message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickle): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickle, writer: Writer): Writer = js.native
  
  /**
    * Creates a Pickle message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Pickle
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Pickle = js.native
  
  /**
    * Creates a plain object from a Pickle message. Also converts values to other types if specified.
    * @param message Pickle
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.toObject")
  @js.native
  def toObject(message: Pickle): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.toObject")
  @js.native
  def toObject(message: Pickle, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Pickle message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a PickleStep. */
  @js.native
  trait IPickleStep extends StObject {
    
    /** PickleStep argument */
    var argument: js.UndefOr[IPickleStepArgument | Null] = js.native
    
    /** PickleStep astNodeIds */
    var astNodeIds: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** PickleStep id */
    var id: js.UndefOr[String | Null] = js.native
    
    /** PickleStep text */
    var text: js.UndefOr[String | Null] = js.native
  }
  object IPickleStep {
    
    @scala.inline
    def apply(): IPickleStep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleStep]
    }
    
    @scala.inline
    implicit class IPickleStepMutableBuilder[Self <: IPickleStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgument(value: IPickleStepArgument): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentNull: Self = StObject.set(x, "argument", null)
      
      @scala.inline
      def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      @scala.inline
      def setAstNodeIds(value: js.Array[String]): Self = StObject.set(x, "astNodeIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstNodeIdsNull: Self = StObject.set(x, "astNodeIds", null)
      
      @scala.inline
      def setAstNodeIdsUndefined: Self = StObject.set(x, "astNodeIds", js.undefined)
      
      @scala.inline
      def setAstNodeIdsVarargs(value: String*): Self = StObject.set(x, "astNodeIds", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /** Properties of a PickleTag. */
  @js.native
  trait IPickleTag extends StObject {
    
    /** PickleTag astNodeId */
    var astNodeId: js.UndefOr[String | Null] = js.native
    
    /** PickleTag name */
    var name: js.UndefOr[String | Null] = js.native
  }
  object IPickleTag {
    
    @scala.inline
    def apply(): IPickleTag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleTag]
    }
    
    @scala.inline
    implicit class IPickleTagMutableBuilder[Self <: IPickleTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAstNodeId(value: String): Self = StObject.set(x, "astNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstNodeIdNull: Self = StObject.set(x, "astNodeId", null)
      
      @scala.inline
      def setAstNodeIdUndefined: Self = StObject.set(x, "astNodeId", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}

package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.IRule
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.IRuleChild
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IBackground
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IFeatureChild
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IScenario
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IStep
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITableRow
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.IExamples
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDataTable
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDocString
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.ITableCell
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IFeature
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IGherkinDocument
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The [AST](https://en.wikipedia.org/wiki/Abstract_syntax_tree) of a Gherkin document.
  * Cucumber implementations should *not* depend on `GherkinDocument` or any of its
  * children for execution - use [Pickle](#io.cucumber.messages.Pickle) instead.
  *
  * The only consumers of `GherkinDocument` should only be formatters that produce
  * "rich" output, resembling the original Gherkin document.
  */
@JSImport("cucumber-messages", "messages.GherkinDocument")
@js.native
/**
  * Constructs a new GherkinDocument.
  * @param [properties] Properties to set
  */
class GherkinDocument ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument {
  def this(properties: IGherkinDocument) = this()
}
object GherkinDocument {
  
  /** A comment in a Gherkin document */
  @JSImport("cucumber-messages", "messages.GherkinDocument.Comment")
  @js.native
  /**
    * Constructs a new Comment.
    * @param [properties] Properties to set
    */
  class Comment ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment {
    def this(properties: IComment) = this()
  }
  object Comment {
    
    /**
      * Creates a new Comment instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Comment instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.create")
    @js.native
    def create(): typings.std.Comment = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.create")
    @js.native
    def create(properties: IComment): typings.std.Comment = js.native
    
    /**
      * Decodes a Comment message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Comment
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.decode")
    @js.native
    def decode(reader: Reader): typings.std.Comment = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.std.Comment = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.decode")
    @js.native
    def decode(reader: Uint8Array): typings.std.Comment = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.std.Comment = js.native
    
    /**
      * Decodes a Comment message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Comment
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.std.Comment = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.std.Comment = js.native
    
    /**
      * Encodes the specified Comment message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
      * @param message Comment message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.encode")
    @js.native
    def encode(message: IComment): Writer = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.encode")
    @js.native
    def encode(message: IComment, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Comment message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
      * @param message Comment message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.encodeDelimited")
    @js.native
    def encodeDelimited(message: IComment): Writer = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.encodeDelimited")
    @js.native
    def encodeDelimited(message: IComment, writer: Writer): Writer = js.native
    
    /**
      * Creates a Comment message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Comment
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.std.Comment = js.native
    
    /**
      * Creates a plain object from a Comment message. Also converts values to other types if specified.
      * @param message Comment
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.toObject")
    @js.native
    def toObject(message: typings.std.Comment): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.toObject")
    @js.native
    def toObject(message: typings.std.Comment, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Comment message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** The top level node in the AST */
  @JSImport("cucumber-messages", "messages.GherkinDocument.Feature")
  @js.native
  /**
    * Constructs a new Feature.
    * @param [properties] Properties to set
    */
  class Feature ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature {
    def this(properties: IFeature) = this()
  }
  object Feature {
    
    /** Represents a Background. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background")
    @js.native
    /**
      * Constructs a new Background.
      * @param [properties] Properties to set
      */
    class Background ()
      extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background {
      def this(properties: IBackground) = this()
    }
    object Background {
      
      /**
        * Creates a new Background instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Background instance
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.create")
      @js.native
      def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.create")
      @js.native
      def create(properties: IBackground): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      
      /**
        * Decodes a Background message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      
      /**
        * Decodes a Background message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      
      /**
        * Encodes the specified Background message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
        * @param message Background message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.encode")
      @js.native
      def encode(message: IBackground): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.encode")
      @js.native
      def encode(message: IBackground, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Background message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
        * @param message Background message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBackground): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBackground, writer: Writer): Writer = js.native
      
      /**
        * Creates a Background message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Background
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = js.native
      
      /**
        * Creates a plain object from a Background message. Also converts values to other types if specified.
        * @param message Background
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background
      ): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Background message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** A child node of a `Feature` node */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild")
    @js.native
    /**
      * Constructs a new FeatureChild.
      * @param [properties] Properties to set
      */
    class FeatureChild ()
      extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild {
      def this(properties: IFeatureChild) = this()
    }
    object FeatureChild {
      
      /** A `Rule` node */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule")
      @js.native
      /**
        * Constructs a new Rule.
        * @param [properties] Properties to set
        */
      class Rule ()
        extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule {
        def this(properties: IRule) = this()
      }
      object Rule {
        
        /**
          * Creates a new Rule instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Rule instance
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.create")
        @js.native
        def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.create")
        @js.native
        def create(properties: IRule): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        
        /**
          * Decodes a Rule message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        
        /**
          * Decodes a Rule message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        
        /**
          * Encodes the specified Rule message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
          * @param message Rule message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.encode")
        @js.native
        def encode(message: IRule): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.encode")
        @js.native
        def encode(message: IRule, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified Rule message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
          * @param message Rule message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRule): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRule, writer: Writer): Writer = js.native
        
        /**
          * Creates a Rule message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Rule
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = js.native
        
        /**
          * Creates a plain object from a Rule message. Also converts values to other types if specified.
          * @param message Rule
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule
        ): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a Rule message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /** Represents a RuleChild. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild")
      @js.native
      /**
        * Constructs a new RuleChild.
        * @param [properties] Properties to set
        */
      class RuleChild ()
        extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild {
        def this(properties: IRuleChild) = this()
      }
      object RuleChild {
        
        /**
          * Creates a new RuleChild instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RuleChild instance
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.create")
        @js.native
        def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.create")
        @js.native
        def create(properties: IRuleChild): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        
        /**
          * Decodes a RuleChild message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        
        /**
          * Decodes a RuleChild message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        
        /**
          * Encodes the specified RuleChild message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
          * @param message RuleChild message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.encode")
        @js.native
        def encode(message: IRuleChild): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.encode")
        @js.native
        def encode(message: IRuleChild, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified RuleChild message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
          * @param message RuleChild message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRuleChild): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRuleChild, writer: Writer): Writer = js.native
        
        /**
          * Creates a RuleChild message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns RuleChild
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = js.native
        
        /**
          * Creates a plain object from a RuleChild message. Also converts values to other types if specified.
          * @param message RuleChild
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild
        ): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a RuleChild message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new FeatureChild instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FeatureChild instance
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.create")
      @js.native
      def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.create")
      @js.native
      def create(properties: IFeatureChild): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      
      /**
        * Decodes a FeatureChild message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      
      /**
        * Decodes a FeatureChild message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      
      /**
        * Encodes the specified FeatureChild message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.verify|verify} messages.
        * @param message FeatureChild message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.encode")
      @js.native
      def encode(message: IFeatureChild): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.encode")
      @js.native
      def encode(message: IFeatureChild, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified FeatureChild message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.verify|verify} messages.
        * @param message FeatureChild message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFeatureChild): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFeatureChild, writer: Writer): Writer = js.native
      
      /**
        * Creates a FeatureChild message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FeatureChild
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = js.native
      
      /**
        * Creates a plain object from a FeatureChild message. Also converts values to other types if specified.
        * @param message FeatureChild
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild
      ): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a FeatureChild message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a Scenario. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario")
    @js.native
    /**
      * Constructs a new Scenario.
      * @param [properties] Properties to set
      */
    class Scenario ()
      extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario {
      def this(properties: IScenario) = this()
    }
    object Scenario {
      
      /** Represents an Examples. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples")
      @js.native
      /**
        * Constructs a new Examples.
        * @param [properties] Properties to set
        */
      class Examples ()
        extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples {
        def this(properties: IExamples) = this()
      }
      object Examples {
        
        /**
          * Creates a new Examples instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Examples instance
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.create")
        @js.native
        def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.create")
        @js.native
        def create(properties: IExamples): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        
        /**
          * Decodes an Examples message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        
        /**
          * Decodes an Examples message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        
        /**
          * Encodes the specified Examples message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
          * @param message Examples message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.encode")
        @js.native
        def encode(message: IExamples): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.encode")
        @js.native
        def encode(message: IExamples, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified Examples message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
          * @param message Examples message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.encodeDelimited")
        @js.native
        def encodeDelimited(message: IExamples): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.encodeDelimited")
        @js.native
        def encodeDelimited(message: IExamples, writer: Writer): Writer = js.native
        
        /**
          * Creates an Examples message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Examples
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
        
        /**
          * Creates a plain object from an Examples message. Also converts values to other types if specified.
          * @param message Examples
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples
        ): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies an Examples message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new Scenario instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Scenario instance
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.create")
      @js.native
      def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.create")
      @js.native
      def create(properties: IScenario): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      
      /**
        * Decodes a Scenario message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      
      /**
        * Decodes a Scenario message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      
      /**
        * Encodes the specified Scenario message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
        * @param message Scenario message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.encode")
      @js.native
      def encode(message: IScenario): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.encode")
      @js.native
      def encode(message: IScenario, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Scenario message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
        * @param message Scenario message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.encodeDelimited")
      @js.native
      def encodeDelimited(message: IScenario): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.encodeDelimited")
      @js.native
      def encodeDelimited(message: IScenario, writer: Writer): Writer = js.native
      
      /**
        * Creates a Scenario message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Scenario
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
      
      /**
        * Creates a plain object from a Scenario message. Also converts values to other types if specified.
        * @param message Scenario
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario
      ): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Scenario message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a Step. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step")
    @js.native
    /**
      * Constructs a new Step.
      * @param [properties] Properties to set
      */
    class Step ()
      extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step {
      def this(properties: IStep) = this()
    }
    object Step {
      
      /** Represents a DataTable. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable")
      @js.native
      /**
        * Constructs a new DataTable.
        * @param [properties] Properties to set
        */
      class DataTable ()
        extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable {
        def this(properties: IDataTable) = this()
      }
      object DataTable {
        
        /**
          * Creates a new DataTable instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DataTable instance
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.create")
        @js.native
        def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.create")
        @js.native
        def create(properties: IDataTable): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        
        /**
          * Decodes a DataTable message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        
        /**
          * Decodes a DataTable message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        
        /**
          * Encodes the specified DataTable message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
          * @param message DataTable message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.encode")
        @js.native
        def encode(message: IDataTable): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.encode")
        @js.native
        def encode(message: IDataTable, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified DataTable message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
          * @param message DataTable message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDataTable): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDataTable, writer: Writer): Writer = js.native
        
        /**
          * Creates a DataTable message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DataTable
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
        
        /**
          * Creates a plain object from a DataTable message. Also converts values to other types if specified.
          * @param message DataTable
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable
        ): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a DataTable message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /** Represents a DocString. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString")
      @js.native
      /**
        * Constructs a new DocString.
        * @param [properties] Properties to set
        */
      class DocString ()
        extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString {
        def this(properties: IDocString) = this()
      }
      object DocString {
        
        /**
          * Creates a new DocString instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DocString instance
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.create")
        @js.native
        def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.create")
        @js.native
        def create(properties: IDocString): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        
        /**
          * Decodes a DocString message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        
        /**
          * Decodes a DocString message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        
        /**
          * Encodes the specified DocString message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
          * @param message DocString message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.encode")
        @js.native
        def encode(message: IDocString): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.encode")
        @js.native
        def encode(message: IDocString, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified DocString message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
          * @param message DocString message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDocString): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDocString, writer: Writer): Writer = js.native
        
        /**
          * Creates a DocString message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DocString
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
        
        /**
          * Creates a plain object from a DocString message. Also converts values to other types if specified.
          * @param message DocString
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString
        ): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a DocString message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new Step instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Step instance
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.create")
      @js.native
      def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.create")
      @js.native
      def create(properties: IStep): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      
      /**
        * Decodes a Step message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      
      /**
        * Decodes a Step message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      
      /**
        * Encodes the specified Step message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
        * @param message Step message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.encode")
      @js.native
      def encode(message: IStep): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.encode")
      @js.native
      def encode(message: IStep, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Step message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
        * @param message Step message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.encodeDelimited")
      @js.native
      def encodeDelimited(message: IStep): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.encodeDelimited")
      @js.native
      def encodeDelimited(message: IStep, writer: Writer): Writer = js.native
      
      /**
        * Creates a Step message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Step
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
      
      /**
        * Creates a plain object from a Step message. Also converts values to other types if specified.
        * @param message Step
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step
      ): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Step message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a TableRow. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow")
    @js.native
    /**
      * Constructs a new TableRow.
      * @param [properties] Properties to set
      */
    class TableRow ()
      extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow {
      def this(properties: ITableRow) = this()
    }
    object TableRow {
      
      /** Represents a TableCell. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell")
      @js.native
      /**
        * Constructs a new TableCell.
        * @param [properties] Properties to set
        */
      class TableCell ()
        extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell {
        def this(properties: ITableCell) = this()
      }
      object TableCell {
        
        /**
          * Creates a new TableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns TableCell instance
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.create")
        @js.native
        def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.create")
        @js.native
        def create(properties: ITableCell): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        
        /**
          * Decodes a TableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        
        /**
          * Decodes a TableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        
        /**
          * Encodes the specified TableCell message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
          * @param message TableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.encode")
        @js.native
        def encode(message: ITableCell): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.encode")
        @js.native
        def encode(message: ITableCell, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified TableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
          * @param message TableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: ITableCell): Writer = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: ITableCell, writer: Writer): Writer = js.native
        
        /**
          * Creates a TableCell message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns TableCell
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
        
        /**
          * Creates a plain object from a TableCell message. Also converts values to other types if specified.
          * @param message TableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell
        ): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a TableCell message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new TableRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableRow instance
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.create")
      @js.native
      def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.create")
      @js.native
      def create(properties: ITableRow): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      
      /**
        * Decodes a TableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      
      /**
        * Decodes a TableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      
      /**
        * Encodes the specified TableRow message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
        * @param message TableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.encode")
      @js.native
      def encode(message: ITableRow): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.encode")
      @js.native
      def encode(message: ITableRow, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified TableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
        * @param message TableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableRow): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableRow, writer: Writer): Writer = js.native
      
      /**
        * Creates a TableRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableRow
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
      
      /**
        * Creates a plain object from a TableRow message. Also converts values to other types if specified.
        * @param message TableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow
      ): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a TableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** A tag */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag")
    @js.native
    /**
      * Constructs a new Tag.
      * @param [properties] Properties to set
      */
    class Tag ()
      extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag {
      def this(properties: ITag) = this()
    }
    object Tag {
      
      /**
        * Creates a new Tag instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Tag instance
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.create")
      @js.native
      def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.create")
      @js.native
      def create(properties: ITag): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      
      /**
        * Decodes a Tag message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      
      /**
        * Decodes a Tag message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      
      /**
        * Encodes the specified Tag message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
        * @param message Tag message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.encode")
      @js.native
      def encode(message: ITag): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.encode")
      @js.native
      def encode(message: ITag, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Tag message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
        * @param message Tag message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITag): Writer = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITag, writer: Writer): Writer = js.native
      
      /**
        * Creates a Tag message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Tag
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
      
      /**
        * Creates a plain object from a Tag message. Also converts values to other types if specified.
        * @param message Tag
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag
      ): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Tag message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new Feature instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Feature instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.create")
    @js.native
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.create")
    @js.native
    def create(properties: IFeature): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    
    /**
      * Decodes a Feature message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    
    /**
      * Decodes a Feature message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    
    /**
      * Encodes the specified Feature message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.verify|verify} messages.
      * @param message Feature message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.encode")
    @js.native
    def encode(message: IFeature): Writer = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.encode")
    @js.native
    def encode(message: IFeature, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Feature message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.verify|verify} messages.
      * @param message Feature message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFeature): Writer = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFeature, writer: Writer): Writer = js.native
    
    /**
      * Creates a Feature message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Feature
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = js.native
    
    /**
      * Creates a plain object from a Feature message. Also converts values to other types if specified.
      * @param message Feature
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.toObject")
    @js.native
    def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Feature message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new GherkinDocument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GherkinDocument instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.create")
  @js.native
  def create(properties: IGherkinDocument): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  
  /**
    * Encodes the specified GherkinDocument message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.verify|verify} messages.
    * @param message GherkinDocument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.encode")
  @js.native
  def encode(message: IGherkinDocument): Writer = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.encode")
  @js.native
  def encode(message: IGherkinDocument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GherkinDocument message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.verify|verify} messages.
    * @param message GherkinDocument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGherkinDocument): Writer = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGherkinDocument, writer: Writer): Writer = js.native
  
  /**
    * Creates a GherkinDocument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GherkinDocument
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument = js.native
  
  /**
    * Creates a plain object from a GherkinDocument message. Also converts values to other types if specified.
    * @param message GherkinDocument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.GherkinDocument.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GherkinDocument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GherkinDocument.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.IRule
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IFeatureChild
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.IExamples
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDataTable
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDocString
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.ITableCell
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.cucumberMessages.cucumberMessagesStrings.background
import typings.cucumberMessages.cucumberMessagesStrings.dataTable
import typings.cucumberMessages.cucumberMessagesStrings.docString
import typings.cucumberMessages.cucumberMessagesStrings.rule
import typings.cucumberMessages.cucumberMessagesStrings.scenario
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
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument")
@js.native
/**
  * Constructs a new GherkinDocument.
  * @param [properties] Properties to set
  */
class GherkinDocument () extends IGherkinDocument {
  def this(properties: IGherkinDocument) = this()
  
  /** GherkinDocument comments. */
  @JSName("comments")
  var comments_GherkinDocument: js.Array[IComment] = js.native
  
  /**
    * Converts this GherkinDocument to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /**
    * The [URI](https://en.wikipedia.org/wiki/Uniform_Resource_Identifier)
    * of the source, typically a file path relative to the root directory
    */
  @JSName("uri")
  var uri_GherkinDocument: String = js.native
}
object GherkinDocument {
  
  /** A comment in a Gherkin document */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment")
  @js.native
  /**
    * Constructs a new Comment.
    * @param [properties] Properties to set
    */
  class Comment () extends IComment {
    def this(properties: IComment) = this()
    
    /** Comment text. */
    @JSName("text")
    var text_Comment: String = js.native
    
    /**
      * Converts this Comment to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Comment {
    
    /**
      * Creates a new Comment instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Comment instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.create")
    @js.native
    def create(): typings.std.Comment = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.create")
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
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.decode")
    @js.native
    def decode(reader: Reader): typings.std.Comment = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.std.Comment = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.decode")
    @js.native
    def decode(reader: Uint8Array): typings.std.Comment = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.decode")
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
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.std.Comment = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.std.Comment = js.native
    
    /**
      * Encodes the specified Comment message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
      * @param message Comment message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.encode")
    @js.native
    def encode(message: IComment): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.encode")
    @js.native
    def encode(message: IComment, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Comment message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
      * @param message Comment message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.encodeDelimited")
    @js.native
    def encodeDelimited(message: IComment): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.encodeDelimited")
    @js.native
    def encodeDelimited(message: IComment, writer: Writer): Writer = js.native
    
    /**
      * Creates a Comment message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Comment
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.std.Comment = js.native
    
    /**
      * Creates a plain object from a Comment message. Also converts values to other types if specified.
      * @param message Comment
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.toObject")
    @js.native
    def toObject(message: typings.std.Comment): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.toObject")
    @js.native
    def toObject(message: typings.std.Comment, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Comment message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** The top level node in the AST */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature")
  @js.native
  /**
    * Constructs a new Feature.
    * @param [properties] Properties to set
    */
  class Feature () extends IFeature {
    def this(properties: IFeature) = this()
    
    /** Feature children. */
    @JSName("children")
    var children_Feature: js.Array[IFeatureChild] = js.native
    
    /** Feature description. */
    @JSName("description")
    var description_Feature: String = js.native
    
    /** Feature keyword. */
    @JSName("keyword")
    var keyword_Feature: String = js.native
    
    /** Feature language. */
    @JSName("language")
    var language_Feature: String = js.native
    
    /** Feature name. */
    @JSName("name")
    var name_Feature: String = js.native
    
    /** Feature tags. */
    @JSName("tags")
    var tags_Feature: js.Array[ITag] = js.native
    
    /**
      * Converts this Feature to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Feature {
    
    /** Represents a Background. */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background")
    @js.native
    /**
      * Constructs a new Background.
      * @param [properties] Properties to set
      */
    class Background () extends IBackground {
      def this(properties: IBackground) = this()
      
      /** Background description. */
      @JSName("description")
      var description_Background: String = js.native
      
      /** Background keyword. */
      @JSName("keyword")
      var keyword_Background: String = js.native
      
      /** Background name. */
      @JSName("name")
      var name_Background: String = js.native
      
      /** Background steps. */
      @JSName("steps")
      var steps_Background: js.Array[IStep] = js.native
      
      /**
        * Converts this Background to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Background {
      
      /**
        * Creates a new Background instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Background instance
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.create")
      @js.native
      def create(): Background = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.create")
      @js.native
      def create(properties: IBackground): Background = js.native
      
      /**
        * Decodes a Background message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Reader): Background = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Reader, length: Double): Background = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Uint8Array): Background = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Background = js.native
      
      /**
        * Decodes a Background message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Background = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Background = js.native
      
      /**
        * Encodes the specified Background message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
        * @param message Background message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.encode")
      @js.native
      def encode(message: IBackground): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.encode")
      @js.native
      def encode(message: IBackground, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Background message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
        * @param message Background message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBackground): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBackground, writer: Writer): Writer = js.native
      
      /**
        * Creates a Background message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Background
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Background = js.native
      
      /**
        * Creates a plain object from a Background message. Also converts values to other types if specified.
        * @param message Background
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.toObject")
      @js.native
      def toObject(message: Background): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.toObject")
      @js.native
      def toObject(message: Background, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Background message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** A child node of a `Feature` node */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild")
    @js.native
    /**
      * Constructs a new FeatureChild.
      * @param [properties] Properties to set
      */
    class FeatureChild () extends IFeatureChild {
      def this(properties: IFeatureChild) = this()
      
      /**
        * Converts this FeatureChild to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
      
      /** FeatureChild value. */
      var value: js.UndefOr[rule | background | scenario] = js.native
    }
    object FeatureChild {
      
      /** A `Rule` node */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule")
      @js.native
      /**
        * Constructs a new Rule.
        * @param [properties] Properties to set
        */
      class Rule () extends IRule {
        def this(properties: IRule) = this()
        
        /** Rule children. */
        @JSName("children")
        var children_Rule: js.Array[IRuleChild] = js.native
        
        /** Rule description. */
        @JSName("description")
        var description_Rule: String = js.native
        
        /** Rule keyword. */
        @JSName("keyword")
        var keyword_Rule: String = js.native
        
        /** Rule name. */
        @JSName("name")
        var name_Rule: String = js.native
        
        /**
          * Converts this Rule to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object Rule {
        
        /**
          * Creates a new Rule instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Rule instance
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.create")
        @js.native
        def create(): Rule = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.create")
        @js.native
        def create(properties: IRule): Rule = js.native
        
        /**
          * Decodes a Rule message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Reader): Rule = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Reader, length: Double): Rule = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Uint8Array): Rule = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): Rule = js.native
        
        /**
          * Decodes a Rule message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): Rule = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): Rule = js.native
        
        /**
          * Encodes the specified Rule message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
          * @param message Rule message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.encode")
        @js.native
        def encode(message: IRule): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.encode")
        @js.native
        def encode(message: IRule, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified Rule message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
          * @param message Rule message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRule): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRule, writer: Writer): Writer = js.native
        
        /**
          * Creates a Rule message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Rule
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): Rule = js.native
        
        /**
          * Creates a plain object from a Rule message. Also converts values to other types if specified.
          * @param message Rule
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.toObject")
        @js.native
        def toObject(message: Rule): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.toObject")
        @js.native
        def toObject(message: Rule, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a Rule message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /** Represents a RuleChild. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild")
      @js.native
      /**
        * Constructs a new RuleChild.
        * @param [properties] Properties to set
        */
      class RuleChild () extends IRuleChild {
        def this(properties: IRuleChild) = this()
        
        /**
          * Converts this RuleChild to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
        
        /** RuleChild value. */
        var value: js.UndefOr[background | scenario] = js.native
      }
      object RuleChild {
        
        /**
          * Creates a new RuleChild instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RuleChild instance
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.create")
        @js.native
        def create(): RuleChild = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.create")
        @js.native
        def create(properties: IRuleChild): RuleChild = js.native
        
        /**
          * Decodes a RuleChild message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Reader): RuleChild = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Reader, length: Double): RuleChild = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Uint8Array): RuleChild = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): RuleChild = js.native
        
        /**
          * Decodes a RuleChild message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): RuleChild = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): RuleChild = js.native
        
        /**
          * Encodes the specified RuleChild message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
          * @param message RuleChild message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.encode")
        @js.native
        def encode(message: IRuleChild): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.encode")
        @js.native
        def encode(message: IRuleChild, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified RuleChild message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
          * @param message RuleChild message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRuleChild): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.encodeDelimited")
        @js.native
        def encodeDelimited(message: IRuleChild, writer: Writer): Writer = js.native
        
        /**
          * Creates a RuleChild message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns RuleChild
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): RuleChild = js.native
        
        /**
          * Creates a plain object from a RuleChild message. Also converts values to other types if specified.
          * @param message RuleChild
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.toObject")
        @js.native
        def toObject(message: RuleChild): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.toObject")
        @js.native
        def toObject(message: RuleChild, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a RuleChild message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new FeatureChild instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FeatureChild instance
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.create")
      @js.native
      def create(): FeatureChild = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.create")
      @js.native
      def create(properties: IFeatureChild): FeatureChild = js.native
      
      /**
        * Decodes a FeatureChild message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Reader): FeatureChild = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Reader, length: Double): FeatureChild = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Uint8Array): FeatureChild = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): FeatureChild = js.native
      
      /**
        * Decodes a FeatureChild message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): FeatureChild = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): FeatureChild = js.native
      
      /**
        * Encodes the specified FeatureChild message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.verify|verify} messages.
        * @param message FeatureChild message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.encode")
      @js.native
      def encode(message: IFeatureChild): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.encode")
      @js.native
      def encode(message: IFeatureChild, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified FeatureChild message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.verify|verify} messages.
        * @param message FeatureChild message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFeatureChild): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFeatureChild, writer: Writer): Writer = js.native
      
      /**
        * Creates a FeatureChild message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FeatureChild
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): FeatureChild = js.native
      
      /**
        * Creates a plain object from a FeatureChild message. Also converts values to other types if specified.
        * @param message FeatureChild
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.toObject")
      @js.native
      def toObject(message: FeatureChild): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.toObject")
      @js.native
      def toObject(message: FeatureChild, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a FeatureChild message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a Rule. */
      @js.native
      trait IRule extends StObject {
        
        /** Rule children */
        var children: js.UndefOr[js.Array[IRuleChild] | Null] = js.native
        
        /** Rule description */
        var description: js.UndefOr[String | Null] = js.native
        
        /** Rule keyword */
        var keyword: js.UndefOr[String | Null] = js.native
        
        /** Rule location */
        var location: js.UndefOr[ILocation | Null] = js.native
        
        /** Rule name */
        var name: js.UndefOr[String | Null] = js.native
      }
      object IRule {
        
        @scala.inline
        def apply(): IRule = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRule]
        }
        
        @scala.inline
        implicit class IRuleMutableBuilder[Self <: IRule] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setChildren(value: js.Array[IRuleChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChildrenNull: Self = StObject.set(x, "children", null)
          
          @scala.inline
          def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
          
          @scala.inline
          def setChildrenVarargs(value: IRuleChild*): Self = StObject.set(x, "children", js.Array(value :_*))
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeywordNull: Self = StObject.set(x, "keyword", null)
          
          @scala.inline
          def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
          
          @scala.inline
          def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocationNull: Self = StObject.set(x, "location", null)
          
          @scala.inline
          def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameNull: Self = StObject.set(x, "name", null)
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
      
      /** Properties of a RuleChild. */
      @js.native
      trait IRuleChild extends StObject {
        
        /** RuleChild background */
        var background: js.UndefOr[IBackground | Null] = js.native
        
        /** RuleChild scenario */
        var scenario: js.UndefOr[IScenario | Null] = js.native
      }
      object IRuleChild {
        
        @scala.inline
        def apply(): IRuleChild = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRuleChild]
        }
        
        @scala.inline
        implicit class IRuleChildMutableBuilder[Self <: IRuleChild] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBackground(value: IBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBackgroundNull: Self = StObject.set(x, "background", null)
          
          @scala.inline
          def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
          
          @scala.inline
          def setScenario(value: IScenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScenarioNull: Self = StObject.set(x, "scenario", null)
          
          @scala.inline
          def setScenarioUndefined: Self = StObject.set(x, "scenario", js.undefined)
        }
      }
    }
    
    /** Represents a Scenario. */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario")
    @js.native
    /**
      * Constructs a new Scenario.
      * @param [properties] Properties to set
      */
    class Scenario () extends IScenario {
      def this(properties: IScenario) = this()
      
      /** Scenario description. */
      @JSName("description")
      var description_Scenario: String = js.native
      
      /** Scenario examples. */
      @JSName("examples")
      var examples_Scenario: js.Array[IExamples] = js.native
      
      /** Scenario id. */
      @JSName("id")
      var id_Scenario: String = js.native
      
      /** Scenario keyword. */
      @JSName("keyword")
      var keyword_Scenario: String = js.native
      
      /** Scenario name. */
      @JSName("name")
      var name_Scenario: String = js.native
      
      /** Scenario steps. */
      @JSName("steps")
      var steps_Scenario: js.Array[IStep] = js.native
      
      /** Scenario tags. */
      @JSName("tags")
      var tags_Scenario: js.Array[ITag] = js.native
      
      /**
        * Converts this Scenario to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Scenario {
      
      /** Represents an Examples. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples")
      @js.native
      /**
        * Constructs a new Examples.
        * @param [properties] Properties to set
        */
      class Examples () extends IExamples {
        def this(properties: IExamples) = this()
        
        /** Examples description. */
        @JSName("description")
        var description_Examples: String = js.native
        
        /** Examples keyword. */
        @JSName("keyword")
        var keyword_Examples: String = js.native
        
        /** Examples name. */
        @JSName("name")
        var name_Examples: String = js.native
        
        /** Examples tableBody. */
        @JSName("tableBody")
        var tableBody_Examples: js.Array[ITableRow] = js.native
        
        /** Examples tags. */
        @JSName("tags")
        var tags_Examples: js.Array[ITag] = js.native
        
        /**
          * Converts this Examples to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object Examples {
        
        /**
          * Creates a new Examples instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Examples instance
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.create")
        @js.native
        def create(): Examples = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.create")
        @js.native
        def create(properties: IExamples): Examples = js.native
        
        /**
          * Decodes an Examples message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Reader): Examples = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Reader, length: Double): Examples = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Uint8Array): Examples = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): Examples = js.native
        
        /**
          * Decodes an Examples message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): Examples = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): Examples = js.native
        
        /**
          * Encodes the specified Examples message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
          * @param message Examples message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.encode")
        @js.native
        def encode(message: IExamples): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.encode")
        @js.native
        def encode(message: IExamples, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified Examples message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
          * @param message Examples message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.encodeDelimited")
        @js.native
        def encodeDelimited(message: IExamples): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.encodeDelimited")
        @js.native
        def encodeDelimited(message: IExamples, writer: Writer): Writer = js.native
        
        /**
          * Creates an Examples message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Examples
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): Examples = js.native
        
        /**
          * Creates a plain object from an Examples message. Also converts values to other types if specified.
          * @param message Examples
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.toObject")
        @js.native
        def toObject(message: Examples): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.toObject")
        @js.native
        def toObject(message: Examples, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies an Examples message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new Scenario instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Scenario instance
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.create")
      @js.native
      def create(): Scenario = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.create")
      @js.native
      def create(properties: IScenario): Scenario = js.native
      
      /**
        * Decodes a Scenario message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Reader): Scenario = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Reader, length: Double): Scenario = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Uint8Array): Scenario = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Scenario = js.native
      
      /**
        * Decodes a Scenario message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Scenario = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Scenario = js.native
      
      /**
        * Encodes the specified Scenario message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
        * @param message Scenario message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.encode")
      @js.native
      def encode(message: IScenario): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.encode")
      @js.native
      def encode(message: IScenario, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Scenario message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
        * @param message Scenario message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.encodeDelimited")
      @js.native
      def encodeDelimited(message: IScenario): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.encodeDelimited")
      @js.native
      def encodeDelimited(message: IScenario, writer: Writer): Writer = js.native
      
      /**
        * Creates a Scenario message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Scenario
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Scenario = js.native
      
      /**
        * Creates a plain object from a Scenario message. Also converts values to other types if specified.
        * @param message Scenario
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.toObject")
      @js.native
      def toObject(message: Scenario): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.toObject")
      @js.native
      def toObject(message: Scenario, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Scenario message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of an Examples. */
      @js.native
      trait IExamples extends StObject {
        
        /** Examples description */
        var description: js.UndefOr[String | Null] = js.native
        
        /** Examples keyword */
        var keyword: js.UndefOr[String | Null] = js.native
        
        /** Examples location */
        var location: js.UndefOr[ILocation | Null] = js.native
        
        /** Examples name */
        var name: js.UndefOr[String | Null] = js.native
        
        /** Examples tableBody */
        var tableBody: js.UndefOr[js.Array[ITableRow] | Null] = js.native
        
        /** Examples tableHeader */
        var tableHeader: js.UndefOr[ITableRow | Null] = js.native
        
        /** Examples tags */
        var tags: js.UndefOr[js.Array[ITag] | Null] = js.native
      }
      object IExamples {
        
        @scala.inline
        def apply(): IExamples = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IExamples]
        }
        
        @scala.inline
        implicit class IExamplesMutableBuilder[Self <: IExamples] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeywordNull: Self = StObject.set(x, "keyword", null)
          
          @scala.inline
          def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
          
          @scala.inline
          def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocationNull: Self = StObject.set(x, "location", null)
          
          @scala.inline
          def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameNull: Self = StObject.set(x, "name", null)
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setTableBody(value: js.Array[ITableRow]): Self = StObject.set(x, "tableBody", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTableBodyNull: Self = StObject.set(x, "tableBody", null)
          
          @scala.inline
          def setTableBodyUndefined: Self = StObject.set(x, "tableBody", js.undefined)
          
          @scala.inline
          def setTableBodyVarargs(value: ITableRow*): Self = StObject.set(x, "tableBody", js.Array(value :_*))
          
          @scala.inline
          def setTableHeader(value: ITableRow): Self = StObject.set(x, "tableHeader", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTableHeaderNull: Self = StObject.set(x, "tableHeader", null)
          
          @scala.inline
          def setTableHeaderUndefined: Self = StObject.set(x, "tableHeader", js.undefined)
          
          @scala.inline
          def setTags(value: js.Array[ITag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTagsNull: Self = StObject.set(x, "tags", null)
          
          @scala.inline
          def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
          
          @scala.inline
          def setTagsVarargs(value: ITag*): Self = StObject.set(x, "tags", js.Array(value :_*))
        }
      }
    }
    
    /** Represents a Step. */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step")
    @js.native
    /**
      * Constructs a new Step.
      * @param [properties] Properties to set
      */
    class Step () extends IStep {
      def this(properties: IStep) = this()
      
      /** Step argument. */
      var argument: js.UndefOr[docString | dataTable] = js.native
      
      /** Step id. */
      @JSName("id")
      var id_Step: String = js.native
      
      /** Step keyword. */
      @JSName("keyword")
      var keyword_Step: String = js.native
      
      /** Step text. */
      @JSName("text")
      var text_Step: String = js.native
      
      /**
        * Converts this Step to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Step {
      
      /** Represents a DataTable. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable")
      @js.native
      /**
        * Constructs a new DataTable.
        * @param [properties] Properties to set
        */
      class DataTable () extends IDataTable {
        def this(properties: IDataTable) = this()
        
        /** DataTable rows. */
        @JSName("rows")
        var rows_DataTable: js.Array[ITableRow] = js.native
        
        /**
          * Converts this DataTable to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object DataTable {
        
        /**
          * Creates a new DataTable instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DataTable instance
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.create")
        @js.native
        def create(): DataTable = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.create")
        @js.native
        def create(properties: IDataTable): DataTable = js.native
        
        /**
          * Decodes a DataTable message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Reader): DataTable = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Reader, length: Double): DataTable = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Uint8Array): DataTable = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): DataTable = js.native
        
        /**
          * Decodes a DataTable message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): DataTable = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): DataTable = js.native
        
        /**
          * Encodes the specified DataTable message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
          * @param message DataTable message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.encode")
        @js.native
        def encode(message: IDataTable): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.encode")
        @js.native
        def encode(message: IDataTable, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified DataTable message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
          * @param message DataTable message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDataTable): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDataTable, writer: Writer): Writer = js.native
        
        /**
          * Creates a DataTable message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DataTable
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): DataTable = js.native
        
        /**
          * Creates a plain object from a DataTable message. Also converts values to other types if specified.
          * @param message DataTable
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.toObject")
        @js.native
        def toObject(message: DataTable): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.toObject")
        @js.native
        def toObject(message: DataTable, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a DataTable message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /** Represents a DocString. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString")
      @js.native
      /**
        * Constructs a new DocString.
        * @param [properties] Properties to set
        */
      class DocString () extends IDocString {
        def this(properties: IDocString) = this()
        
        /** DocString contentType. */
        @JSName("contentType")
        var contentType_DocString: String = js.native
        
        /** DocString content. */
        @JSName("content")
        var content_DocString: String = js.native
        
        /** DocString delimiter. */
        @JSName("delimiter")
        var delimiter_DocString: String = js.native
        
        /**
          * Converts this DocString to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object DocString {
        
        /**
          * Creates a new DocString instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DocString instance
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.create")
        @js.native
        def create(): DocString = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.create")
        @js.native
        def create(properties: IDocString): DocString = js.native
        
        /**
          * Decodes a DocString message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Reader): DocString = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Reader, length: Double): DocString = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Uint8Array): DocString = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): DocString = js.native
        
        /**
          * Decodes a DocString message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): DocString = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): DocString = js.native
        
        /**
          * Encodes the specified DocString message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
          * @param message DocString message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.encode")
        @js.native
        def encode(message: IDocString): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.encode")
        @js.native
        def encode(message: IDocString, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified DocString message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
          * @param message DocString message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDocString): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.encodeDelimited")
        @js.native
        def encodeDelimited(message: IDocString, writer: Writer): Writer = js.native
        
        /**
          * Creates a DocString message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DocString
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): DocString = js.native
        
        /**
          * Creates a plain object from a DocString message. Also converts values to other types if specified.
          * @param message DocString
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.toObject")
        @js.native
        def toObject(message: DocString): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.toObject")
        @js.native
        def toObject(message: DocString, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a DocString message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new Step instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Step instance
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.create")
      @js.native
      def create(): Step = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.create")
      @js.native
      def create(properties: IStep): Step = js.native
      
      /**
        * Decodes a Step message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Reader): Step = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Reader, length: Double): Step = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Uint8Array): Step = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Step = js.native
      
      /**
        * Decodes a Step message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Step = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Step = js.native
      
      /**
        * Encodes the specified Step message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
        * @param message Step message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.encode")
      @js.native
      def encode(message: IStep): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.encode")
      @js.native
      def encode(message: IStep, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Step message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
        * @param message Step message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.encodeDelimited")
      @js.native
      def encodeDelimited(message: IStep): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.encodeDelimited")
      @js.native
      def encodeDelimited(message: IStep, writer: Writer): Writer = js.native
      
      /**
        * Creates a Step message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Step
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Step = js.native
      
      /**
        * Creates a plain object from a Step message. Also converts values to other types if specified.
        * @param message Step
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.toObject")
      @js.native
      def toObject(message: Step): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.toObject")
      @js.native
      def toObject(message: Step, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Step message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a DataTable. */
      @js.native
      trait IDataTable extends StObject {
        
        /** DataTable location */
        var location: js.UndefOr[ILocation | Null] = js.native
        
        /** DataTable rows */
        var rows: js.UndefOr[js.Array[ITableRow] | Null] = js.native
      }
      object IDataTable {
        
        @scala.inline
        def apply(): IDataTable = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IDataTable]
        }
        
        @scala.inline
        implicit class IDataTableMutableBuilder[Self <: IDataTable] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocationNull: Self = StObject.set(x, "location", null)
          
          @scala.inline
          def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          @scala.inline
          def setRows(value: js.Array[ITableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRowsNull: Self = StObject.set(x, "rows", null)
          
          @scala.inline
          def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
          
          @scala.inline
          def setRowsVarargs(value: ITableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
        }
      }
      
      /** Properties of a DocString. */
      @js.native
      trait IDocString extends StObject {
        
        /** DocString content */
        var content: js.UndefOr[String | Null] = js.native
        
        /** DocString contentType */
        var contentType: js.UndefOr[String | Null] = js.native
        
        /** DocString delimiter */
        var delimiter: js.UndefOr[String | Null] = js.native
        
        /** DocString location */
        var location: js.UndefOr[ILocation | Null] = js.native
      }
      object IDocString {
        
        @scala.inline
        def apply(): IDocString = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IDocString]
        }
        
        @scala.inline
        implicit class IDocStringMutableBuilder[Self <: IDocString] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContentNull: Self = StObject.set(x, "content", null)
          
          @scala.inline
          def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContentTypeNull: Self = StObject.set(x, "contentType", null)
          
          @scala.inline
          def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
          
          @scala.inline
          def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
          
          @scala.inline
          def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelimiterNull: Self = StObject.set(x, "delimiter", null)
          
          @scala.inline
          def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
          
          @scala.inline
          def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocationNull: Self = StObject.set(x, "location", null)
          
          @scala.inline
          def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        }
      }
    }
    
    /** Represents a TableRow. */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow")
    @js.native
    /**
      * Constructs a new TableRow.
      * @param [properties] Properties to set
      */
    class TableRow () extends ITableRow {
      def this(properties: ITableRow) = this()
      
      /** TableRow cells. */
      @JSName("cells")
      var cells_TableRow: js.Array[ITableCell] = js.native
      
      /** TableRow id. */
      @JSName("id")
      var id_TableRow: String = js.native
      
      /**
        * Converts this TableRow to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object TableRow {
      
      /** Represents a TableCell. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell")
      @js.native
      /**
        * Constructs a new TableCell.
        * @param [properties] Properties to set
        */
      class TableCell () extends ITableCell {
        def this(properties: ITableCell) = this()
        
        /**
          * Converts this TableCell to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
        
        /** TableCell value. */
        @JSName("value")
        var value_TableCell: String = js.native
      }
      object TableCell {
        
        /**
          * Creates a new TableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns TableCell instance
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.create")
        @js.native
        def create(): TableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.create")
        @js.native
        def create(properties: ITableCell): TableCell = js.native
        
        /**
          * Decodes a TableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Reader): TableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Reader, length: Double): TableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Uint8Array): TableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): TableCell = js.native
        
        /**
          * Decodes a TableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): TableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): TableCell = js.native
        
        /**
          * Encodes the specified TableCell message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
          * @param message TableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.encode")
        @js.native
        def encode(message: ITableCell): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.encode")
        @js.native
        def encode(message: ITableCell, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified TableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
          * @param message TableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: ITableCell): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: ITableCell, writer: Writer): Writer = js.native
        
        /**
          * Creates a TableCell message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns TableCell
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): TableCell = js.native
        
        /**
          * Creates a plain object from a TableCell message. Also converts values to other types if specified.
          * @param message TableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.toObject")
        @js.native
        def toObject(message: TableCell): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.toObject")
        @js.native
        def toObject(message: TableCell, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a TableCell message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new TableRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableRow instance
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.create")
      @js.native
      def create(): TableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.create")
      @js.native
      def create(properties: ITableRow): TableRow = js.native
      
      /**
        * Decodes a TableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Reader): TableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Reader, length: Double): TableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Uint8Array): TableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): TableRow = js.native
      
      /**
        * Decodes a TableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): TableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): TableRow = js.native
      
      /**
        * Encodes the specified TableRow message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
        * @param message TableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.encode")
      @js.native
      def encode(message: ITableRow): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.encode")
      @js.native
      def encode(message: ITableRow, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified TableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
        * @param message TableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableRow): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableRow, writer: Writer): Writer = js.native
      
      /**
        * Creates a TableRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableRow
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): TableRow = js.native
      
      /**
        * Creates a plain object from a TableRow message. Also converts values to other types if specified.
        * @param message TableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.toObject")
      @js.native
      def toObject(message: TableRow): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.toObject")
      @js.native
      def toObject(message: TableRow, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a TableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a TableCell. */
      @js.native
      trait ITableCell extends StObject {
        
        /** TableCell location */
        var location: js.UndefOr[ILocation | Null] = js.native
        
        /** TableCell value */
        var value: js.UndefOr[String | Null] = js.native
      }
      object ITableCell {
        
        @scala.inline
        def apply(): ITableCell = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ITableCell]
        }
        
        @scala.inline
        implicit class ITableCellMutableBuilder[Self <: ITableCell] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocationNull: Self = StObject.set(x, "location", null)
          
          @scala.inline
          def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          @scala.inline
          def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValueNull: Self = StObject.set(x, "value", null)
          
          @scala.inline
          def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
    }
    
    /** A tag */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag")
    @js.native
    /**
      * Constructs a new Tag.
      * @param [properties] Properties to set
      */
    class Tag () extends ITag {
      def this(properties: ITag) = this()
      
      /** Tag id. */
      @JSName("id")
      var id_Tag: String = js.native
      
      /** Tag name. */
      @JSName("name")
      var name_Tag: String = js.native
      
      /**
        * Converts this Tag to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Tag {
      
      /**
        * Creates a new Tag instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Tag instance
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.create")
      @js.native
      def create(): Tag = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.create")
      @js.native
      def create(properties: ITag): Tag = js.native
      
      /**
        * Decodes a Tag message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Reader): Tag = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Reader, length: Double): Tag = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Uint8Array): Tag = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Tag = js.native
      
      /**
        * Decodes a Tag message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Tag = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Tag = js.native
      
      /**
        * Encodes the specified Tag message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
        * @param message Tag message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.encode")
      @js.native
      def encode(message: ITag): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.encode")
      @js.native
      def encode(message: ITag, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Tag message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
        * @param message Tag message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITag): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITag, writer: Writer): Writer = js.native
      
      /**
        * Creates a Tag message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Tag
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Tag = js.native
      
      /**
        * Creates a plain object from a Tag message. Also converts values to other types if specified.
        * @param message Tag
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.toObject")
      @js.native
      def toObject(message: Tag): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.toObject")
      @js.native
      def toObject(message: Tag, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Tag message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new Feature instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Feature instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.create")
    @js.native
    def create(): Feature = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.create")
    @js.native
    def create(properties: IFeature): Feature = js.native
    
    /**
      * Decodes a Feature message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Reader): Feature = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Reader, length: Double): Feature = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Uint8Array): Feature = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Feature = js.native
    
    /**
      * Decodes a Feature message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Feature = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Feature = js.native
    
    /**
      * Encodes the specified Feature message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.verify|verify} messages.
      * @param message Feature message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.encode")
    @js.native
    def encode(message: IFeature): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.encode")
    @js.native
    def encode(message: IFeature, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Feature message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.verify|verify} messages.
      * @param message Feature message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFeature): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFeature, writer: Writer): Writer = js.native
    
    /**
      * Creates a Feature message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Feature
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Feature = js.native
    
    /**
      * Creates a plain object from a Feature message. Also converts values to other types if specified.
      * @param message Feature
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.toObject")
    @js.native
    def toObject(message: Feature): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.toObject")
    @js.native
    def toObject(message: Feature, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Feature message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
    
    /** Properties of a Background. */
    @js.native
    trait IBackground extends StObject {
      
      /** Background description */
      var description: js.UndefOr[String | Null] = js.native
      
      /** Background keyword */
      var keyword: js.UndefOr[String | Null] = js.native
      
      /** Background location */
      var location: js.UndefOr[ILocation | Null] = js.native
      
      /** Background name */
      var name: js.UndefOr[String | Null] = js.native
      
      /** Background steps */
      var steps: js.UndefOr[js.Array[IStep] | Null] = js.native
    }
    object IBackground {
      
      @scala.inline
      def apply(): IBackground = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IBackground]
      }
      
      @scala.inline
      implicit class IBackgroundMutableBuilder[Self <: IBackground] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionNull: Self = StObject.set(x, "description", null)
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordNull: Self = StObject.set(x, "keyword", null)
        
        @scala.inline
        def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        @scala.inline
        def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationNull: Self = StObject.set(x, "location", null)
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameNull: Self = StObject.set(x, "name", null)
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setSteps(value: js.Array[IStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepsNull: Self = StObject.set(x, "steps", null)
        
        @scala.inline
        def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
        
        @scala.inline
        def setStepsVarargs(value: IStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      }
    }
    
    /** Properties of a FeatureChild. */
    @js.native
    trait IFeatureChild extends StObject {
      
      /** FeatureChild background */
      var background: js.UndefOr[IBackground | Null] = js.native
      
      /** FeatureChild rule */
      var rule: js.UndefOr[IRule | Null] = js.native
      
      /** FeatureChild scenario */
      var scenario: js.UndefOr[IScenario | Null] = js.native
    }
    object IFeatureChild {
      
      @scala.inline
      def apply(): IFeatureChild = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFeatureChild]
      }
      
      @scala.inline
      implicit class IFeatureChildMutableBuilder[Self <: IFeatureChild] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackground(value: IBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundNull: Self = StObject.set(x, "background", null)
        
        @scala.inline
        def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
        
        @scala.inline
        def setRule(value: IRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleNull: Self = StObject.set(x, "rule", null)
        
        @scala.inline
        def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
        
        @scala.inline
        def setScenario(value: IScenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScenarioNull: Self = StObject.set(x, "scenario", null)
        
        @scala.inline
        def setScenarioUndefined: Self = StObject.set(x, "scenario", js.undefined)
      }
    }
    
    /** Properties of a Scenario. */
    @js.native
    trait IScenario extends StObject {
      
      /** Scenario description */
      var description: js.UndefOr[String | Null] = js.native
      
      /** Scenario examples */
      var examples: js.UndefOr[js.Array[IExamples] | Null] = js.native
      
      /** Scenario id */
      var id: js.UndefOr[String | Null] = js.native
      
      /** Scenario keyword */
      var keyword: js.UndefOr[String | Null] = js.native
      
      /** Scenario location */
      var location: js.UndefOr[ILocation | Null] = js.native
      
      /** Scenario name */
      var name: js.UndefOr[String | Null] = js.native
      
      /** Scenario steps */
      var steps: js.UndefOr[js.Array[IStep] | Null] = js.native
      
      /** Scenario tags */
      var tags: js.UndefOr[js.Array[ITag] | Null] = js.native
    }
    object IScenario {
      
      @scala.inline
      def apply(): IScenario = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IScenario]
      }
      
      @scala.inline
      implicit class IScenarioMutableBuilder[Self <: IScenario] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionNull: Self = StObject.set(x, "description", null)
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setExamples(value: js.Array[IExamples]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExamplesNull: Self = StObject.set(x, "examples", null)
        
        @scala.inline
        def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
        
        @scala.inline
        def setExamplesVarargs(value: IExamples*): Self = StObject.set(x, "examples", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdNull: Self = StObject.set(x, "id", null)
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordNull: Self = StObject.set(x, "keyword", null)
        
        @scala.inline
        def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        @scala.inline
        def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationNull: Self = StObject.set(x, "location", null)
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameNull: Self = StObject.set(x, "name", null)
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setSteps(value: js.Array[IStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepsNull: Self = StObject.set(x, "steps", null)
        
        @scala.inline
        def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
        
        @scala.inline
        def setStepsVarargs(value: IStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
        
        @scala.inline
        def setTags(value: js.Array[ITag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsNull: Self = StObject.set(x, "tags", null)
        
        @scala.inline
        def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        @scala.inline
        def setTagsVarargs(value: ITag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      }
    }
    
    /** Properties of a Step. */
    @js.native
    trait IStep extends StObject {
      
      /** Step dataTable */
      var dataTable: js.UndefOr[IDataTable | Null] = js.native
      
      /** Step docString */
      var docString: js.UndefOr[IDocString | Null] = js.native
      
      /** Step id */
      var id: js.UndefOr[String | Null] = js.native
      
      /** Step keyword */
      var keyword: js.UndefOr[String | Null] = js.native
      
      /** Step location */
      var location: js.UndefOr[ILocation | Null] = js.native
      
      /** Step text */
      var text: js.UndefOr[String | Null] = js.native
    }
    object IStep {
      
      @scala.inline
      def apply(): IStep = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IStep]
      }
      
      @scala.inline
      implicit class IStepMutableBuilder[Self <: IStep] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataTable(value: IDataTable): Self = StObject.set(x, "dataTable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataTableNull: Self = StObject.set(x, "dataTable", null)
        
        @scala.inline
        def setDataTableUndefined: Self = StObject.set(x, "dataTable", js.undefined)
        
        @scala.inline
        def setDocString(value: IDocString): Self = StObject.set(x, "docString", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocStringNull: Self = StObject.set(x, "docString", null)
        
        @scala.inline
        def setDocStringUndefined: Self = StObject.set(x, "docString", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdNull: Self = StObject.set(x, "id", null)
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordNull: Self = StObject.set(x, "keyword", null)
        
        @scala.inline
        def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        @scala.inline
        def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationNull: Self = StObject.set(x, "location", null)
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /** Properties of a TableRow. */
    @js.native
    trait ITableRow extends StObject {
      
      /** TableRow cells */
      var cells: js.UndefOr[js.Array[ITableCell] | Null] = js.native
      
      /** TableRow id */
      var id: js.UndefOr[String | Null] = js.native
      
      /** TableRow location */
      var location: js.UndefOr[ILocation | Null] = js.native
    }
    object ITableRow {
      
      @scala.inline
      def apply(): ITableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableRow]
      }
      
      @scala.inline
      implicit class ITableRowMutableBuilder[Self <: ITableRow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCells(value: js.Array[ITableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellsNull: Self = StObject.set(x, "cells", null)
        
        @scala.inline
        def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
        
        @scala.inline
        def setCellsVarargs(value: ITableCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdNull: Self = StObject.set(x, "id", null)
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationNull: Self = StObject.set(x, "location", null)
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      }
    }
    
    /** Properties of a Tag. */
    @js.native
    trait ITag extends StObject {
      
      /** Tag id */
      var id: js.UndefOr[String | Null] = js.native
      
      /** Tag location */
      var location: js.UndefOr[ILocation | Null] = js.native
      
      /** Tag name */
      var name: js.UndefOr[String | Null] = js.native
    }
    object ITag {
      
      @scala.inline
      def apply(): ITag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITag]
      }
      
      @scala.inline
      implicit class ITagMutableBuilder[Self <: ITag] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdNull: Self = StObject.set(x, "id", null)
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationNull: Self = StObject.set(x, "location", null)
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameNull: Self = StObject.set(x, "name", null)
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
  
  /**
    * Creates a new GherkinDocument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GherkinDocument instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.create")
  @js.native
  def create(): GherkinDocument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.create")
  @js.native
  def create(properties: IGherkinDocument): GherkinDocument = js.native
  
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Reader): GherkinDocument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Reader, length: Double): GherkinDocument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Uint8Array): GherkinDocument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GherkinDocument = js.native
  
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GherkinDocument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GherkinDocument = js.native
  
  /**
    * Encodes the specified GherkinDocument message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.verify|verify} messages.
    * @param message GherkinDocument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.encode")
  @js.native
  def encode(message: IGherkinDocument): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.encode")
  @js.native
  def encode(message: IGherkinDocument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GherkinDocument message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.verify|verify} messages.
    * @param message GherkinDocument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGherkinDocument): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGherkinDocument, writer: Writer): Writer = js.native
  
  /**
    * Creates a GherkinDocument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GherkinDocument
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GherkinDocument = js.native
  
  /**
    * Creates a plain object from a GherkinDocument message. Also converts values to other types if specified.
    * @param message GherkinDocument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.toObject")
  @js.native
  def toObject(message: GherkinDocument): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.toObject")
  @js.native
  def toObject(message: GherkinDocument, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GherkinDocument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a Comment. */
  @js.native
  trait IComment extends StObject {
    
    /** Comment location */
    var location: js.UndefOr[ILocation | Null] = js.native
    
    /** Comment text */
    var text: js.UndefOr[String | Null] = js.native
  }
  object IComment {
    
    @scala.inline
    def apply(): IComment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComment]
    }
    
    @scala.inline
    implicit class ICommentMutableBuilder[Self <: IComment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /** Properties of a Feature. */
  @js.native
  trait IFeature extends StObject {
    
    /** Feature children */
    var children: js.UndefOr[js.Array[IFeatureChild] | Null] = js.native
    
    /** Feature description */
    var description: js.UndefOr[String | Null] = js.native
    
    /** Feature keyword */
    var keyword: js.UndefOr[String | Null] = js.native
    
    /** Feature language */
    var language: js.UndefOr[String | Null] = js.native
    
    /** Feature location */
    var location: js.UndefOr[ILocation | Null] = js.native
    
    /** Feature name */
    var name: js.UndefOr[String | Null] = js.native
    
    /** Feature tags */
    var tags: js.UndefOr[js.Array[ITag] | Null] = js.native
  }
  object IFeature {
    
    @scala.inline
    def apply(): IFeature = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFeature]
    }
    
    @scala.inline
    implicit class IFeatureMutableBuilder[Self <: IFeature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[IFeatureChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: IFeatureChild*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordNull: Self = StObject.set(x, "keyword", null)
      
      @scala.inline
      def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageNull: Self = StObject.set(x, "language", null)
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[ITag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsNull: Self = StObject.set(x, "tags", null)
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: ITag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}

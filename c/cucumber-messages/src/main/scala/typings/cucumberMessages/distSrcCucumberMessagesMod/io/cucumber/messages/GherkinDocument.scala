package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesStrings.background
import typings.cucumberMessages.cucumberMessagesStrings.dataTable
import typings.cucumberMessages.cucumberMessagesStrings.docString
import typings.cucumberMessages.cucumberMessagesStrings.rule
import typings.cucumberMessages.cucumberMessagesStrings.scenario
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.IRule
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IFeatureChild
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.IExamples
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDataTable
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDocString
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.ITableCell
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
open class GherkinDocument ()
  extends StObject
     with IGherkinDocument {
  def this(properties: IGherkinDocument) = this()
  
  /** GherkinDocument comments. */
  @JSName("comments")
  var comments_GherkinDocument: js.Array[IComment] = js.native
  
  /**
    * Converts this GherkinDocument to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /**
    * The [URI](https://en.wikipedia.org/wiki/Uniform_Resource_Identifier)
    * of the source, typically a file path relative to the root directory
    */
  @JSName("uri")
  var uri_GherkinDocument: String = js.native
}
object GherkinDocument {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument")
  @js.native
  val ^ : js.Any = js.native
  
  /** A comment in a Gherkin document */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment")
  @js.native
  /**
    * Constructs a new Comment.
    * @param [properties] Properties to set
    */
  open class Comment ()
    extends StObject
       with IComment {
    def this(properties: IComment) = this()
    
    /** Comment text. */
    @JSName("text")
    var text_Comment: String = js.native
    
    /**
      * Converts this Comment to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Comment {
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Comment instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Comment instance
      */
    /* static member */
    inline def create(): typings.std.Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.std.Comment]
    inline def create(properties: IComment): typings.std.Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.std.Comment]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.std.Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Comment]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.std.Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Comment]
    /**
      * Decodes a Comment message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Comment
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.std.Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Comment]
    inline def decode(reader: Reader, length: Double): typings.std.Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Comment]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.std.Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Comment]
    /**
      * Decodes a Comment message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Comment
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.std.Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Comment]
    
    /**
      * Encodes the specified Comment message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
      * @param message Comment message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IComment): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IComment, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Comment message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
      * @param message Comment message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IComment): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IComment, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Comment message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Comment
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.std.Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.std.Comment]
    
    /**
      * Creates a plain object from a Comment message. Also converts values to other types if specified.
      * @param message Comment
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.std.Comment): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.std.Comment, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Comment message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** The top level node in the AST */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature")
  @js.native
  /**
    * Constructs a new Feature.
    * @param [properties] Properties to set
    */
  open class Feature ()
    extends StObject
       with IFeature {
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
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Feature {
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a Background. */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background")
    @js.native
    /**
      * Constructs a new Background.
      * @param [properties] Properties to set
      */
    open class Background ()
      extends StObject
         with IBackground {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Background {
      
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Background instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Background instance
        */
      /* static member */
      inline def create(): Background = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Background]
      inline def create(properties: IBackground): Background = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Background]
      
      inline def decode(reader: js.typedarray.Uint8Array): Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Background]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Background = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Background]
      /**
        * Decodes a Background message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Background]
      inline def decode(reader: Reader, length: Double): Background = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Background]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Background]
      /**
        * Decodes a Background message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Background]
      
      /**
        * Encodes the specified Background message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
        * @param message Background message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IBackground): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IBackground, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Background message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
        * @param message Background message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IBackground): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IBackground, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Background message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Background
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Background = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Background]
      
      /**
        * Creates a plain object from a Background message. Also converts values to other types if specified.
        * @param message Background
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Background): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Background, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Background message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** A child node of a `Feature` node */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild")
    @js.native
    /**
      * Constructs a new FeatureChild.
      * @param [properties] Properties to set
      */
    open class FeatureChild ()
      extends StObject
         with IFeatureChild {
      def this(properties: IFeatureChild) = this()
      
      /**
        * Converts this FeatureChild to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
      
      /** FeatureChild value. */
      var value: js.UndefOr[rule | background | scenario] = js.native
    }
    object FeatureChild {
      
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild")
      @js.native
      val ^ : js.Any = js.native
      
      /** A `Rule` node */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule")
      @js.native
      /**
        * Constructs a new Rule.
        * @param [properties] Properties to set
        */
      open class Rule ()
        extends StObject
           with IRule {
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object Rule {
        
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Rule instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Rule instance
          */
        /* static member */
        inline def create(): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Rule]
        inline def create(properties: IRule): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Rule]
        
        inline def decode(reader: js.typedarray.Uint8Array): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Rule]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Rule]
        /**
          * Decodes a Rule message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Rule]
        inline def decode(reader: Reader, length: Double): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Rule]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Rule]
        /**
          * Decodes a Rule message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Rule]
        
        /**
          * Encodes the specified Rule message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
          * @param message Rule message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Rule message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
          * @param message Rule message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a Rule message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Rule
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Rule]
        
        /**
          * Creates a plain object from a Rule message. Also converts values to other types if specified.
          * @param message Rule
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: Rule): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: Rule, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a Rule message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a RuleChild. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild")
      @js.native
      /**
        * Constructs a new RuleChild.
        * @param [properties] Properties to set
        */
      open class RuleChild ()
        extends StObject
           with IRuleChild {
        def this(properties: IRuleChild) = this()
        
        /**
          * Converts this RuleChild to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[Any] = js.native
        
        /** RuleChild value. */
        var value: js.UndefOr[background | scenario] = js.native
      }
      object RuleChild {
        
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new RuleChild instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RuleChild instance
          */
        /* static member */
        inline def create(): RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RuleChild]
        inline def create(properties: IRuleChild): RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RuleChild]
        
        inline def decode(reader: js.typedarray.Uint8Array): RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RuleChild]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): RuleChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RuleChild]
        /**
          * Decodes a RuleChild message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RuleChild]
        inline def decode(reader: Reader, length: Double): RuleChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RuleChild]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RuleChild]
        /**
          * Decodes a RuleChild message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RuleChild]
        
        /**
          * Encodes the specified RuleChild message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
          * @param message RuleChild message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IRuleChild): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IRuleChild, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified RuleChild message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
          * @param message RuleChild message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IRuleChild): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IRuleChild, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a RuleChild message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns RuleChild
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RuleChild]
        
        /**
          * Creates a plain object from a RuleChild message. Also converts values to other types if specified.
          * @param message RuleChild
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: RuleChild): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: RuleChild, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a RuleChild message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new FeatureChild instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FeatureChild instance
        */
      /* static member */
      inline def create(): FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FeatureChild]
      inline def create(properties: IFeatureChild): FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FeatureChild]
      
      inline def decode(reader: js.typedarray.Uint8Array): FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FeatureChild]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): FeatureChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FeatureChild]
      /**
        * Decodes a FeatureChild message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FeatureChild]
      inline def decode(reader: Reader, length: Double): FeatureChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FeatureChild]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FeatureChild]
      /**
        * Decodes a FeatureChild message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FeatureChild]
      
      /**
        * Encodes the specified FeatureChild message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.verify|verify} messages.
        * @param message FeatureChild message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IFeatureChild): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IFeatureChild, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified FeatureChild message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.verify|verify} messages.
        * @param message FeatureChild message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IFeatureChild): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IFeatureChild, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a FeatureChild message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FeatureChild
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FeatureChild]
      
      /**
        * Creates a plain object from a FeatureChild message. Also converts values to other types if specified.
        * @param message FeatureChild
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: FeatureChild): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: FeatureChild, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a FeatureChild message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a Rule. */
      trait IRule extends StObject {
        
        /** Rule children */
        var children: js.UndefOr[js.Array[IRuleChild] | Null] = js.undefined
        
        /** Rule description */
        var description: js.UndefOr[String | Null] = js.undefined
        
        /** Rule keyword */
        var keyword: js.UndefOr[String | Null] = js.undefined
        
        /** Rule location */
        var location: js.UndefOr[ILocation | Null] = js.undefined
        
        /** Rule name */
        var name: js.UndefOr[String | Null] = js.undefined
      }
      object IRule {
        
        inline def apply(): IRule = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRule]
        }
        
        extension [Self <: IRule](x: Self) {
          
          inline def setChildren(value: js.Array[IRuleChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
          
          inline def setChildrenNull: Self = StObject.set(x, "children", null)
          
          inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
          
          inline def setChildrenVarargs(value: IRuleChild*): Self = StObject.set(x, "children", js.Array(value*))
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
          
          inline def setKeywordNull: Self = StObject.set(x, "keyword", null)
          
          inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
          
          inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationNull: Self = StObject.set(x, "location", null)
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameNull: Self = StObject.set(x, "name", null)
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
      
      /** Properties of a RuleChild. */
      trait IRuleChild extends StObject {
        
        /** RuleChild background */
        var background: js.UndefOr[IBackground | Null] = js.undefined
        
        /** RuleChild scenario */
        var scenario: js.UndefOr[IScenario | Null] = js.undefined
      }
      object IRuleChild {
        
        inline def apply(): IRuleChild = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRuleChild]
        }
        
        extension [Self <: IRuleChild](x: Self) {
          
          inline def setBackground(value: IBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
          
          inline def setBackgroundNull: Self = StObject.set(x, "background", null)
          
          inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
          
          inline def setScenario(value: IScenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
          
          inline def setScenarioNull: Self = StObject.set(x, "scenario", null)
          
          inline def setScenarioUndefined: Self = StObject.set(x, "scenario", js.undefined)
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
    open class Scenario ()
      extends StObject
         with IScenario {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Scenario {
      
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents an Examples. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples")
      @js.native
      /**
        * Constructs a new Examples.
        * @param [properties] Properties to set
        */
      open class Examples ()
        extends StObject
           with IExamples {
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object Examples {
        
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Examples instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Examples instance
          */
        /* static member */
        inline def create(): Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Examples]
        inline def create(properties: IExamples): Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Examples]
        
        inline def decode(reader: js.typedarray.Uint8Array): Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Examples]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): Examples = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Examples]
        /**
          * Decodes an Examples message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Examples]
        inline def decode(reader: Reader, length: Double): Examples = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Examples]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Examples]
        /**
          * Decodes an Examples message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Examples]
        
        /**
          * Encodes the specified Examples message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
          * @param message Examples message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IExamples): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IExamples, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Examples message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
          * @param message Examples message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IExamples): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IExamples, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates an Examples message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Examples
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Examples]
        
        /**
          * Creates a plain object from an Examples message. Also converts values to other types if specified.
          * @param message Examples
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: Examples): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: Examples, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies an Examples message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new Scenario instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Scenario instance
        */
      /* static member */
      inline def create(): Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Scenario]
      inline def create(properties: IScenario): Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Scenario]
      
      inline def decode(reader: js.typedarray.Uint8Array): Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Scenario]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Scenario = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scenario]
      /**
        * Decodes a Scenario message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Scenario]
      inline def decode(reader: Reader, length: Double): Scenario = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scenario]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Scenario]
      /**
        * Decodes a Scenario message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Scenario]
      
      /**
        * Encodes the specified Scenario message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
        * @param message Scenario message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IScenario): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IScenario, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Scenario message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
        * @param message Scenario message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IScenario): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IScenario, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Scenario message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Scenario
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Scenario]
      
      /**
        * Creates a plain object from a Scenario message. Also converts values to other types if specified.
        * @param message Scenario
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Scenario): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Scenario, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Scenario message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of an Examples. */
      trait IExamples extends StObject {
        
        /** Examples description */
        var description: js.UndefOr[String | Null] = js.undefined
        
        /** Examples keyword */
        var keyword: js.UndefOr[String | Null] = js.undefined
        
        /** Examples location */
        var location: js.UndefOr[ILocation | Null] = js.undefined
        
        /** Examples name */
        var name: js.UndefOr[String | Null] = js.undefined
        
        /** Examples tableBody */
        var tableBody: js.UndefOr[js.Array[ITableRow] | Null] = js.undefined
        
        /** Examples tableHeader */
        var tableHeader: js.UndefOr[ITableRow | Null] = js.undefined
        
        /** Examples tags */
        var tags: js.UndefOr[js.Array[ITag] | Null] = js.undefined
      }
      object IExamples {
        
        inline def apply(): IExamples = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IExamples]
        }
        
        extension [Self <: IExamples](x: Self) {
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
          
          inline def setKeywordNull: Self = StObject.set(x, "keyword", null)
          
          inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
          
          inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationNull: Self = StObject.set(x, "location", null)
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameNull: Self = StObject.set(x, "name", null)
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setTableBody(value: js.Array[ITableRow]): Self = StObject.set(x, "tableBody", value.asInstanceOf[js.Any])
          
          inline def setTableBodyNull: Self = StObject.set(x, "tableBody", null)
          
          inline def setTableBodyUndefined: Self = StObject.set(x, "tableBody", js.undefined)
          
          inline def setTableBodyVarargs(value: ITableRow*): Self = StObject.set(x, "tableBody", js.Array(value*))
          
          inline def setTableHeader(value: ITableRow): Self = StObject.set(x, "tableHeader", value.asInstanceOf[js.Any])
          
          inline def setTableHeaderNull: Self = StObject.set(x, "tableHeader", null)
          
          inline def setTableHeaderUndefined: Self = StObject.set(x, "tableHeader", js.undefined)
          
          inline def setTags(value: js.Array[ITag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
          
          inline def setTagsNull: Self = StObject.set(x, "tags", null)
          
          inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
          
          inline def setTagsVarargs(value: ITag*): Self = StObject.set(x, "tags", js.Array(value*))
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
    open class Step ()
      extends StObject
         with IStep {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Step {
      
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a DataTable. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable")
      @js.native
      /**
        * Constructs a new DataTable.
        * @param [properties] Properties to set
        */
      open class DataTable ()
        extends StObject
           with IDataTable {
        def this(properties: IDataTable) = this()
        
        /** DataTable rows. */
        @JSName("rows")
        var rows_DataTable: js.Array[ITableRow] = js.native
        
        /**
          * Converts this DataTable to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[Any] = js.native
      }
      object DataTable {
        
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new DataTable instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DataTable instance
          */
        /* static member */
        inline def create(): DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DataTable]
        inline def create(properties: IDataTable): DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DataTable]
        
        inline def decode(reader: js.typedarray.Uint8Array): DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DataTable]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DataTable]
        /**
          * Decodes a DataTable message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DataTable]
        inline def decode(reader: Reader, length: Double): DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DataTable]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DataTable]
        /**
          * Decodes a DataTable message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DataTable]
        
        /**
          * Encodes the specified DataTable message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
          * @param message DataTable message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IDataTable): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IDataTable, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified DataTable message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
          * @param message DataTable message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IDataTable): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IDataTable, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a DataTable message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DataTable
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DataTable]
        
        /**
          * Creates a plain object from a DataTable message. Also converts values to other types if specified.
          * @param message DataTable
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: DataTable): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: DataTable, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a DataTable message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a DocString. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString")
      @js.native
      /**
        * Constructs a new DocString.
        * @param [properties] Properties to set
        */
      open class DocString ()
        extends StObject
           with IDocString {
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object DocString {
        
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new DocString instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DocString instance
          */
        /* static member */
        inline def create(): DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DocString]
        inline def create(properties: IDocString): DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DocString]
        
        inline def decode(reader: js.typedarray.Uint8Array): DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DocString]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): DocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DocString]
        /**
          * Decodes a DocString message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DocString]
        inline def decode(reader: Reader, length: Double): DocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DocString]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DocString]
        /**
          * Decodes a DocString message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DocString]
        
        /**
          * Encodes the specified DocString message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
          * @param message DocString message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IDocString): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IDocString, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified DocString message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
          * @param message DocString message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IDocString): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IDocString, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a DocString message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DocString
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DocString]
        
        /**
          * Creates a plain object from a DocString message. Also converts values to other types if specified.
          * @param message DocString
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: DocString): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: DocString, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a DocString message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new Step instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Step instance
        */
      /* static member */
      inline def create(): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Step]
      inline def create(properties: IStep): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Step]
      
      inline def decode(reader: js.typedarray.Uint8Array): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Step]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Step = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Step]
      /**
        * Decodes a Step message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Step]
      inline def decode(reader: Reader, length: Double): Step = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Step]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Step]
      /**
        * Decodes a Step message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Step]
      
      /**
        * Encodes the specified Step message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
        * @param message Step message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Step message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
        * @param message Step message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Step message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Step
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Step]
      
      /**
        * Creates a plain object from a Step message. Also converts values to other types if specified.
        * @param message Step
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Step): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Step, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Step message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a DataTable. */
      trait IDataTable extends StObject {
        
        /** DataTable location */
        var location: js.UndefOr[ILocation | Null] = js.undefined
        
        /** DataTable rows */
        var rows: js.UndefOr[js.Array[ITableRow] | Null] = js.undefined
      }
      object IDataTable {
        
        inline def apply(): IDataTable = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IDataTable]
        }
        
        extension [Self <: IDataTable](x: Self) {
          
          inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationNull: Self = StObject.set(x, "location", null)
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          inline def setRows(value: js.Array[ITableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
          
          inline def setRowsNull: Self = StObject.set(x, "rows", null)
          
          inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
          
          inline def setRowsVarargs(value: ITableRow*): Self = StObject.set(x, "rows", js.Array(value*))
        }
      }
      
      /** Properties of a DocString. */
      trait IDocString extends StObject {
        
        /** DocString content */
        var content: js.UndefOr[String | Null] = js.undefined
        
        /** DocString contentType */
        var contentType: js.UndefOr[String | Null] = js.undefined
        
        /** DocString delimiter */
        var delimiter: js.UndefOr[String | Null] = js.undefined
        
        /** DocString location */
        var location: js.UndefOr[ILocation | Null] = js.undefined
      }
      object IDocString {
        
        inline def apply(): IDocString = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IDocString]
        }
        
        extension [Self <: IDocString](x: Self) {
          
          inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          inline def setContentNull: Self = StObject.set(x, "content", null)
          
          inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
          
          inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
          
          inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
          
          inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
          
          inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
          
          inline def setDelimiterNull: Self = StObject.set(x, "delimiter", null)
          
          inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
          
          inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationNull: Self = StObject.set(x, "location", null)
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
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
    open class TableRow ()
      extends StObject
         with ITableRow {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object TableRow {
      
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a TableCell. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell")
      @js.native
      /**
        * Constructs a new TableCell.
        * @param [properties] Properties to set
        */
      open class TableCell ()
        extends StObject
           with ITableCell {
        def this(properties: ITableCell) = this()
        
        /**
          * Converts this TableCell to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[Any] = js.native
        
        /** TableCell value. */
        @JSName("value")
        var value_TableCell: String = js.native
      }
      object TableCell {
        
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new TableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns TableCell instance
          */
        /* static member */
        inline def create(): TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableCell]
        inline def create(properties: ITableCell): TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableCell]
        
        inline def decode(reader: js.typedarray.Uint8Array): TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCell]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): TableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCell]
        /**
          * Decodes a TableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCell]
        inline def decode(reader: Reader, length: Double): TableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCell]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCell]
        /**
          * Decodes a TableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCell]
        
        /**
          * Encodes the specified TableCell message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
          * @param message TableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: ITableCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: ITableCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified TableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
          * @param message TableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: ITableCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: ITableCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a TableCell message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns TableCell
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableCell]
        
        /**
          * Creates a plain object from a TableCell message. Also converts values to other types if specified.
          * @param message TableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: TableCell): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: TableCell, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a TableCell message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new TableRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableRow instance
        */
      /* static member */
      inline def create(): TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableRow]
      inline def create(properties: ITableRow): TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableRow]
      
      inline def decode(reader: js.typedarray.Uint8Array): TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableRow]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): TableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableRow]
      /**
        * Decodes a TableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableRow]
      inline def decode(reader: Reader, length: Double): TableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableRow]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableRow]
      /**
        * Decodes a TableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableRow]
      
      /**
        * Encodes the specified TableRow message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
        * @param message TableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITableRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITableRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
        * @param message TableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITableRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITableRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TableRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableRow
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableRow]
      
      /**
        * Creates a plain object from a TableRow message. Also converts values to other types if specified.
        * @param message TableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: TableRow): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: TableRow, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a TableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a TableCell. */
      trait ITableCell extends StObject {
        
        /** TableCell location */
        var location: js.UndefOr[ILocation | Null] = js.undefined
        
        /** TableCell value */
        var value: js.UndefOr[String | Null] = js.undefined
      }
      object ITableCell {
        
        inline def apply(): ITableCell = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ITableCell]
        }
        
        extension [Self <: ITableCell](x: Self) {
          
          inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationNull: Self = StObject.set(x, "location", null)
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueNull: Self = StObject.set(x, "value", null)
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
    open class Tag ()
      extends StObject
         with ITag {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Tag {
      
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Tag instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Tag instance
        */
      /* static member */
      inline def create(): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Tag]
      inline def create(properties: ITag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Tag]
      
      inline def decode(reader: js.typedarray.Uint8Array): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Tag]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Tag]
      /**
        * Decodes a Tag message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Tag]
      inline def decode(reader: Reader, length: Double): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Tag]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Tag]
      /**
        * Decodes a Tag message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Tag]
      
      /**
        * Encodes the specified Tag message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
        * @param message Tag message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITag): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITag, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Tag message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
        * @param message Tag message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITag): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITag, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Tag message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Tag
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Tag]
      
      /**
        * Creates a plain object from a Tag message. Also converts values to other types if specified.
        * @param message Tag
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Tag): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Tag, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Tag message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new Feature instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Feature instance
      */
    /* static member */
    inline def create(): Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Feature]
    inline def create(properties: IFeature): Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Feature]
    
    inline def decode(reader: js.typedarray.Uint8Array): Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Feature]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Feature = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Feature]
    /**
      * Decodes a Feature message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Feature]
    inline def decode(reader: Reader, length: Double): Feature = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Feature]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Feature]
    /**
      * Decodes a Feature message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Feature]
    
    /**
      * Encodes the specified Feature message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.verify|verify} messages.
      * @param message Feature message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IFeature): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IFeature, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Feature message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.verify|verify} messages.
      * @param message Feature message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IFeature): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IFeature, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Feature message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Feature
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Feature]
    
    /**
      * Creates a plain object from a Feature message. Also converts values to other types if specified.
      * @param message Feature
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Feature): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Feature, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Feature message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /** Properties of a Background. */
    trait IBackground extends StObject {
      
      /** Background description */
      var description: js.UndefOr[String | Null] = js.undefined
      
      /** Background keyword */
      var keyword: js.UndefOr[String | Null] = js.undefined
      
      /** Background location */
      var location: js.UndefOr[ILocation | Null] = js.undefined
      
      /** Background name */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /** Background steps */
      var steps: js.UndefOr[js.Array[IStep] | Null] = js.undefined
    }
    object IBackground {
      
      inline def apply(): IBackground = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IBackground]
      }
      
      extension [Self <: IBackground](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionNull: Self = StObject.set(x, "description", null)
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        inline def setKeywordNull: Self = StObject.set(x, "keyword", null)
        
        inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationNull: Self = StObject.set(x, "location", null)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSteps(value: js.Array[IStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
        
        inline def setStepsNull: Self = StObject.set(x, "steps", null)
        
        inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
        
        inline def setStepsVarargs(value: IStep*): Self = StObject.set(x, "steps", js.Array(value*))
      }
    }
    
    /** Properties of a FeatureChild. */
    trait IFeatureChild extends StObject {
      
      /** FeatureChild background */
      var background: js.UndefOr[IBackground | Null] = js.undefined
      
      /** FeatureChild rule */
      var rule: js.UndefOr[IRule | Null] = js.undefined
      
      /** FeatureChild scenario */
      var scenario: js.UndefOr[IScenario | Null] = js.undefined
    }
    object IFeatureChild {
      
      inline def apply(): IFeatureChild = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFeatureChild]
      }
      
      extension [Self <: IFeatureChild](x: Self) {
        
        inline def setBackground(value: IBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
        
        inline def setBackgroundNull: Self = StObject.set(x, "background", null)
        
        inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
        
        inline def setRule(value: IRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        inline def setRuleNull: Self = StObject.set(x, "rule", null)
        
        inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
        
        inline def setScenario(value: IScenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
        
        inline def setScenarioNull: Self = StObject.set(x, "scenario", null)
        
        inline def setScenarioUndefined: Self = StObject.set(x, "scenario", js.undefined)
      }
    }
    
    /** Properties of a Scenario. */
    trait IScenario extends StObject {
      
      /** Scenario description */
      var description: js.UndefOr[String | Null] = js.undefined
      
      /** Scenario examples */
      var examples: js.UndefOr[js.Array[IExamples] | Null] = js.undefined
      
      /** Scenario id */
      var id: js.UndefOr[String | Null] = js.undefined
      
      /** Scenario keyword */
      var keyword: js.UndefOr[String | Null] = js.undefined
      
      /** Scenario location */
      var location: js.UndefOr[ILocation | Null] = js.undefined
      
      /** Scenario name */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /** Scenario steps */
      var steps: js.UndefOr[js.Array[IStep] | Null] = js.undefined
      
      /** Scenario tags */
      var tags: js.UndefOr[js.Array[ITag] | Null] = js.undefined
    }
    object IScenario {
      
      inline def apply(): IScenario = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IScenario]
      }
      
      extension [Self <: IScenario](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionNull: Self = StObject.set(x, "description", null)
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setExamples(value: js.Array[IExamples]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
        
        inline def setExamplesNull: Self = StObject.set(x, "examples", null)
        
        inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
        
        inline def setExamplesVarargs(value: IExamples*): Self = StObject.set(x, "examples", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        inline def setKeywordNull: Self = StObject.set(x, "keyword", null)
        
        inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationNull: Self = StObject.set(x, "location", null)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSteps(value: js.Array[IStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
        
        inline def setStepsNull: Self = StObject.set(x, "steps", null)
        
        inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
        
        inline def setStepsVarargs(value: IStep*): Self = StObject.set(x, "steps", js.Array(value*))
        
        inline def setTags(value: js.Array[ITag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsNull: Self = StObject.set(x, "tags", null)
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: ITag*): Self = StObject.set(x, "tags", js.Array(value*))
      }
    }
    
    /** Properties of a Step. */
    trait IStep extends StObject {
      
      /** Step dataTable */
      var dataTable: js.UndefOr[IDataTable | Null] = js.undefined
      
      /** Step docString */
      var docString: js.UndefOr[IDocString | Null] = js.undefined
      
      /** Step id */
      var id: js.UndefOr[String | Null] = js.undefined
      
      /** Step keyword */
      var keyword: js.UndefOr[String | Null] = js.undefined
      
      /** Step location */
      var location: js.UndefOr[ILocation | Null] = js.undefined
      
      /** Step text */
      var text: js.UndefOr[String | Null] = js.undefined
    }
    object IStep {
      
      inline def apply(): IStep = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IStep]
      }
      
      extension [Self <: IStep](x: Self) {
        
        inline def setDataTable(value: IDataTable): Self = StObject.set(x, "dataTable", value.asInstanceOf[js.Any])
        
        inline def setDataTableNull: Self = StObject.set(x, "dataTable", null)
        
        inline def setDataTableUndefined: Self = StObject.set(x, "dataTable", js.undefined)
        
        inline def setDocString(value: IDocString): Self = StObject.set(x, "docString", value.asInstanceOf[js.Any])
        
        inline def setDocStringNull: Self = StObject.set(x, "docString", null)
        
        inline def setDocStringUndefined: Self = StObject.set(x, "docString", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        inline def setKeywordNull: Self = StObject.set(x, "keyword", null)
        
        inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationNull: Self = StObject.set(x, "location", null)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextNull: Self = StObject.set(x, "text", null)
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /** Properties of a TableRow. */
    trait ITableRow extends StObject {
      
      /** TableRow cells */
      var cells: js.UndefOr[js.Array[ITableCell] | Null] = js.undefined
      
      /** TableRow id */
      var id: js.UndefOr[String | Null] = js.undefined
      
      /** TableRow location */
      var location: js.UndefOr[ILocation | Null] = js.undefined
    }
    object ITableRow {
      
      inline def apply(): ITableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableRow]
      }
      
      extension [Self <: ITableRow](x: Self) {
        
        inline def setCells(value: js.Array[ITableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
        
        inline def setCellsNull: Self = StObject.set(x, "cells", null)
        
        inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
        
        inline def setCellsVarargs(value: ITableCell*): Self = StObject.set(x, "cells", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationNull: Self = StObject.set(x, "location", null)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      }
    }
    
    /** Properties of a Tag. */
    trait ITag extends StObject {
      
      /** Tag id */
      var id: js.UndefOr[String | Null] = js.undefined
      
      /** Tag location */
      var location: js.UndefOr[ILocation | Null] = js.undefined
      
      /** Tag name */
      var name: js.UndefOr[String | Null] = js.undefined
    }
    object ITag {
      
      inline def apply(): ITag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITag]
      }
      
      extension [Self <: ITag](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationNull: Self = StObject.set(x, "location", null)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
  
  /**
    * Creates a new GherkinDocument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GherkinDocument instance
    */
  /* static member */
  inline def create(): GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GherkinDocument]
  inline def create(properties: IGherkinDocument): GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GherkinDocument]
  
  inline def decode(reader: js.typedarray.Uint8Array): GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GherkinDocument]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GherkinDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GherkinDocument]
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GherkinDocument]
  inline def decode(reader: Reader, length: Double): GherkinDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GherkinDocument]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GherkinDocument]
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GherkinDocument]
  
  /**
    * Encodes the specified GherkinDocument message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.verify|verify} messages.
    * @param message GherkinDocument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGherkinDocument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGherkinDocument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GherkinDocument message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.verify|verify} messages.
    * @param message GherkinDocument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGherkinDocument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGherkinDocument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GherkinDocument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GherkinDocument
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GherkinDocument]
  
  /**
    * Creates a plain object from a GherkinDocument message. Also converts values to other types if specified.
    * @param message GherkinDocument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GherkinDocument): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GherkinDocument, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GherkinDocument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Comment. */
  trait IComment extends StObject {
    
    /** Comment location */
    var location: js.UndefOr[ILocation | Null] = js.undefined
    
    /** Comment text */
    var text: js.UndefOr[String | Null] = js.undefined
  }
  object IComment {
    
    inline def apply(): IComment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComment]
    }
    
    extension [Self <: IComment](x: Self) {
      
      inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /** Properties of a Feature. */
  trait IFeature extends StObject {
    
    /** Feature children */
    var children: js.UndefOr[js.Array[IFeatureChild] | Null] = js.undefined
    
    /** Feature description */
    var description: js.UndefOr[String | Null] = js.undefined
    
    /** Feature keyword */
    var keyword: js.UndefOr[String | Null] = js.undefined
    
    /** Feature language */
    var language: js.UndefOr[String | Null] = js.undefined
    
    /** Feature location */
    var location: js.UndefOr[ILocation | Null] = js.undefined
    
    /** Feature name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** Feature tags */
    var tags: js.UndefOr[js.Array[ITag] | Null] = js.undefined
  }
  object IFeature {
    
    inline def apply(): IFeature = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFeature]
    }
    
    extension [Self <: IFeature](x: Self) {
      
      inline def setChildren(value: js.Array[IFeatureChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: IFeatureChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordNull: Self = StObject.set(x, "keyword", null)
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageNull: Self = StObject.set(x, "language", null)
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: js.Array[ITag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsNull: Self = StObject.set(x, "tags", null)
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: ITag*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}

package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.IRule
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.IRuleChild
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IBackground
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IFeatureChild
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IScenario
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IStep
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITableRow
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.IExamples
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDataTable
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDocString
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.ITableCell
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.IFeature
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IGherkinDocument
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
@JSImport("cucumber-messages", "messages.GherkinDocument")
@js.native
/**
  * Constructs a new GherkinDocument.
  * @param [properties] Properties to set
  */
open class GherkinDocument ()
  extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument {
  def this(properties: IGherkinDocument) = this()
}
object GherkinDocument {
  
  @JSImport("cucumber-messages", "messages.GherkinDocument")
  @js.native
  val ^ : js.Any = js.native
  
  /** A comment in a Gherkin document */
  @JSImport("cucumber-messages", "messages.GherkinDocument.Comment")
  @js.native
  /**
    * Constructs a new Comment.
    * @param [properties] Properties to set
    */
  open class Comment ()
    extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment {
    def this(properties: IComment) = this()
  }
  object Comment {
    
    @JSImport("cucumber-messages", "messages.GherkinDocument.Comment")
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
  @JSImport("cucumber-messages", "messages.GherkinDocument.Feature")
  @js.native
  /**
    * Constructs a new Feature.
    * @param [properties] Properties to set
    */
  open class Feature ()
    extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature {
    def this(properties: IFeature) = this()
  }
  object Feature {
    
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a Background. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background")
    @js.native
    /**
      * Constructs a new Background.
      * @param [properties] Properties to set
      */
    open class Background ()
      extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background {
      def this(properties: IBackground) = this()
    }
    object Background {
      
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Background")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Background instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Background instance
        */
      /* static member */
      inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      inline def create(properties: IBackground): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      /**
        * Decodes a Background message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      /**
        * Decodes a Background message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Background
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background]
      
      /**
        * Creates a plain object from a Background message. Also converts values to other types if specified.
        * @param message Background
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Background,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Background message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** A child node of a `Feature` node */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild")
    @js.native
    /**
      * Constructs a new FeatureChild.
      * @param [properties] Properties to set
      */
    open class FeatureChild ()
      extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild {
      def this(properties: IFeatureChild) = this()
    }
    object FeatureChild {
      
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild")
      @js.native
      val ^ : js.Any = js.native
      
      /** A `Rule` node */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule")
      @js.native
      /**
        * Constructs a new Rule.
        * @param [properties] Properties to set
        */
      open class Rule ()
        extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule {
        def this(properties: IRule) = this()
      }
      object Rule {
        
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.Rule")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Rule instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Rule instance
          */
        /* static member */
        inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        inline def create(properties: IRule): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        
        inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        /**
          * Decodes a Rule message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        /**
          * Decodes a Rule message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Rule
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        
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
        inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule]
        
        /**
          * Creates a plain object from a Rule message. Also converts values to other types if specified.
          * @param message Rule
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule
        ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule,
          options: IConversionOptions
        ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a Rule message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a RuleChild. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild")
      @js.native
      /**
        * Constructs a new RuleChild.
        * @param [properties] Properties to set
        */
      open class RuleChild ()
        extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild {
        def this(properties: IRuleChild) = this()
      }
      object RuleChild {
        
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.FeatureChild.RuleChild")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new RuleChild instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RuleChild instance
          */
        /* static member */
        inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        inline def create(properties: IRuleChild): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        
        inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        /**
          * Decodes a RuleChild message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        /**
          * Decodes a RuleChild message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RuleChild
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        
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
        inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild]
        
        /**
          * Creates a plain object from a RuleChild message. Also converts values to other types if specified.
          * @param message RuleChild
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild
        ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild,
          options: IConversionOptions
        ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
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
      inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      inline def create(properties: IFeatureChild): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      /**
        * Decodes a FeatureChild message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      /**
        * Decodes a FeatureChild message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FeatureChild
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild]
      
      /**
        * Creates a plain object from a FeatureChild message. Also converts values to other types if specified.
        * @param message FeatureChild
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a FeatureChild message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Scenario. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario")
    @js.native
    /**
      * Constructs a new Scenario.
      * @param [properties] Properties to set
      */
    open class Scenario ()
      extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario {
      def this(properties: IScenario) = this()
    }
    object Scenario {
      
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents an Examples. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples")
      @js.native
      /**
        * Constructs a new Examples.
        * @param [properties] Properties to set
        */
      open class Examples ()
        extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples {
        def this(properties: IExamples) = this()
      }
      object Examples {
        
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario.Examples")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Examples instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Examples instance
          */
        /* static member */
        inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        inline def create(properties: IExamples): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        
        inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        /**
          * Decodes an Examples message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        /**
          * Decodes an Examples message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Examples
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        
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
        inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples]
        
        /**
          * Creates a plain object from an Examples message. Also converts values to other types if specified.
          * @param message Examples
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples
        ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples,
          options: IConversionOptions
        ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
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
      inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      inline def create(properties: IScenario): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      /**
        * Decodes a Scenario message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      /**
        * Decodes a Scenario message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Scenario
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario]
      
      /**
        * Creates a plain object from a Scenario message. Also converts values to other types if specified.
        * @param message Scenario
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Scenario message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Step. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step")
    @js.native
    /**
      * Constructs a new Step.
      * @param [properties] Properties to set
      */
    open class Step ()
      extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step {
      def this(properties: IStep) = this()
    }
    object Step {
      
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a DataTable. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable")
      @js.native
      /**
        * Constructs a new DataTable.
        * @param [properties] Properties to set
        */
      open class DataTable ()
        extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable {
        def this(properties: IDataTable) = this()
      }
      object DataTable {
        
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DataTable")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new DataTable instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DataTable instance
          */
        /* static member */
        inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        inline def create(properties: IDataTable): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        
        inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        /**
          * Decodes a DataTable message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        /**
          * Decodes a DataTable message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DataTable
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        
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
        inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable]
        
        /**
          * Creates a plain object from a DataTable message. Also converts values to other types if specified.
          * @param message DataTable
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable
        ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable,
          options: IConversionOptions
        ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a DataTable message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a DocString. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString")
      @js.native
      /**
        * Constructs a new DocString.
        * @param [properties] Properties to set
        */
      open class DocString ()
        extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString {
        def this(properties: IDocString) = this()
      }
      object DocString {
        
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step.DocString")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new DocString instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DocString instance
          */
        /* static member */
        inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        inline def create(properties: IDocString): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        
        inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        /**
          * Decodes a DocString message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        /**
          * Decodes a DocString message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DocString
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        
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
        inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString]
        
        /**
          * Creates a plain object from a DocString message. Also converts values to other types if specified.
          * @param message DocString
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString
        ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString,
          options: IConversionOptions
        ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
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
      inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      inline def create(properties: IStep): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      /**
        * Decodes a Step message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      /**
        * Decodes a Step message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Step
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step]
      
      /**
        * Creates a plain object from a Step message. Also converts values to other types if specified.
        * @param message Step
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Step message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TableRow. */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow")
    @js.native
    /**
      * Constructs a new TableRow.
      * @param [properties] Properties to set
      */
    open class TableRow ()
      extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow {
      def this(properties: ITableRow) = this()
    }
    object TableRow {
      
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a TableCell. */
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell")
      @js.native
      /**
        * Constructs a new TableCell.
        * @param [properties] Properties to set
        */
      open class TableCell ()
        extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell {
        def this(properties: ITableCell) = this()
      }
      object TableCell {
        
        @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow.TableCell")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new TableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns TableCell instance
          */
        /* static member */
        inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        inline def create(properties: ITableCell): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        
        inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        /**
          * Decodes a TableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        /**
          * Decodes a TableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns TableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        
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
        inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell]
        
        /**
          * Creates a plain object from a TableCell message. Also converts values to other types if specified.
          * @param message TableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell
        ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(
          message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell,
          options: IConversionOptions
        ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
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
      inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      inline def create(properties: ITableRow): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      /**
        * Decodes a TableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      /**
        * Decodes a TableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow]
      
      /**
        * Creates a plain object from a TableRow message. Also converts values to other types if specified.
        * @param message TableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a TableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** A tag */
    @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag")
    @js.native
    /**
      * Constructs a new Tag.
      * @param [properties] Properties to set
      */
    open class Tag ()
      extends typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag {
      def this(properties: ITag) = this()
    }
    object Tag {
      
      @JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Tag instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Tag instance
        */
      /* static member */
      inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      inline def create(properties: ITag): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      /**
        * Decodes a Tag message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      /**
        * Decodes a Tag message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Tag
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag]
      
      /**
        * Creates a plain object from a Tag message. Also converts values to other types if specified.
        * @param message Tag
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
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
    inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    inline def create(properties: IFeature): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    /**
      * Decodes a Feature message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    /**
      * Decodes a Feature message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Feature
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature]
    
    /**
      * Creates a plain object from a Feature message. Also converts values to other types if specified.
      * @param message Feature
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Feature message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new GherkinDocument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GherkinDocument instance
    */
  /* static member */
  inline def create(): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  inline def create(properties: IGherkinDocument): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  inline def decode(reader: Reader, length: Double): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  /**
    * Decodes a GherkinDocument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GherkinDocument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  
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
  inline def fromObject(`object`: StringDictionary[Any]): typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument]
  
  /**
    * Creates a plain object from a GherkinDocument message. Also converts values to other types if specified.
    * @param message GherkinDocument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GherkinDocument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

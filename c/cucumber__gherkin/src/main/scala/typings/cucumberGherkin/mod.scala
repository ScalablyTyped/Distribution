package typings.cucumberGherkin

import typings.cucumberGherkin.distSrcAstBuilderMod.default
import typings.cucumberGherkin.distSrcIastbuilderMod.IAstBuilder
import typings.cucumberGherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import typings.cucumberGherkin.distSrcItokenMod.IToken
import typings.cucumberGherkin.distSrcItokenmatcherMod.ITokenMatcher
import typings.cucumberGherkin.distSrcParserMod.RuleType
import typings.cucumberGherkin.distSrcParserMod.TokenType
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.cucumberMessages.distCjsSrcMessagesMod.SourceMediaType
import typings.cucumberMessages.mod.Envelope
import typings.cucumberMessages.mod.Location
import typings.cucumberMessages.mod.Pickle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/gherkin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cucumber/gherkin", "AstBuilder")
  @js.native
  open class AstBuilder protected () extends default {
    def this(newId: NewId) = this()
  }
  
  object Errors {
    
    @JSImport("@cucumber/gherkin", "Errors.AstBuilderException")
    @js.native
    open class AstBuilderException protected ()
      extends typings.cucumberGherkin.distSrcErrorsMod.AstBuilderException {
      def this(message: String) = this()
    }
    /* static members */
    object AstBuilderException {
      
      @JSImport("@cucumber/gherkin", "Errors.AstBuilderException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(message: String, location: Location): typings.cucumberGherkin.distSrcErrorsMod.GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.distSrcErrorsMod.GherkinException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.CompositeParserException")
    @js.native
    open class CompositeParserException protected ()
      extends typings.cucumberGherkin.distSrcErrorsMod.CompositeParserException {
      def this(message: String) = this()
    }
    /* static members */
    object CompositeParserException {
      
      @JSImport("@cucumber/gherkin", "Errors.CompositeParserException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(errors: js.Array[js.Error]): typings.cucumberGherkin.distSrcErrorsMod.CompositeParserException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(errors.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberGherkin.distSrcErrorsMod.CompositeParserException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.GherkinException")
    @js.native
    open class GherkinException protected ()
      extends typings.cucumberGherkin.distSrcErrorsMod.GherkinException {
      def this(message: String) = this()
    }
    /* static members */
    object GherkinException {
      
      @JSImport("@cucumber/gherkin", "Errors.GherkinException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def _create(message: String): typings.cucumberGherkin.distSrcErrorsMod.GherkinException = ^.asInstanceOf[js.Dynamic].applyDynamic("_create")(message.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberGherkin.distSrcErrorsMod.GherkinException]
      inline def _create(message: String, location: Location): typings.cucumberGherkin.distSrcErrorsMod.GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(message.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.distSrcErrorsMod.GherkinException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.NoSuchLanguageException")
    @js.native
    open class NoSuchLanguageException protected ()
      extends typings.cucumberGherkin.distSrcErrorsMod.NoSuchLanguageException {
      def this(message: String) = this()
    }
    /* static members */
    object NoSuchLanguageException {
      
      @JSImport("@cucumber/gherkin", "Errors.NoSuchLanguageException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(language: String): typings.cucumberGherkin.distSrcErrorsMod.GherkinException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(language.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberGherkin.distSrcErrorsMod.GherkinException]
      inline def create(language: String, location: Location): typings.cucumberGherkin.distSrcErrorsMod.GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(language.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.distSrcErrorsMod.GherkinException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.ParserException")
    @js.native
    open class ParserException protected ()
      extends typings.cucumberGherkin.distSrcErrorsMod.ParserException {
      def this(message: String) = this()
    }
    /* static members */
    object ParserException {
      
      @JSImport("@cucumber/gherkin", "Errors.ParserException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(message: String, line: Double, column: Double): typings.cucumberGherkin.distSrcErrorsMod.ParserException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], line.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.distSrcErrorsMod.ParserException]
    }
  }
  
  @JSImport("@cucumber/gherkin", "GherkinClassicTokenMatcher")
  @js.native
  open class GherkinClassicTokenMatcher ()
    extends typings.cucumberGherkin.distSrcGherkinClassicTokenMatcherMod.default {
    def this(defaultDialectName: String) = this()
  }
  
  @JSImport("@cucumber/gherkin", "GherkinInMarkdownTokenMatcher")
  @js.native
  open class GherkinInMarkdownTokenMatcher ()
    extends typings.cucumberGherkin.distSrcGherkinInMarkdownTokenMatcherMod.default {
    def this(defaultDialectName: String) = this()
  }
  
  @JSImport("@cucumber/gherkin", "Parser")
  @js.native
  open class Parser[AstNode] protected ()
    extends typings.cucumberGherkin.distSrcParserMod.default[AstNode] {
    def this(builder: IAstBuilder[AstNode, TokenType, RuleType], tokenMatcher: ITokenMatcher[TokenType]) = this()
  }
  
  @JSImport("@cucumber/gherkin", "TokenScanner")
  @js.native
  open class TokenScanner[TokenType] protected ()
    extends typings.cucumberGherkin.distSrcTokenScannerMod.default[TokenType] {
    def this(
      source: String,
      makeToken: js.Function2[/* line */ String, /* location */ Location, IToken[TokenType]]
    ) = this()
  }
  
  inline def compile(
    gherkinDocument: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGherkinDocument */ Any,
    uri: String,
    newId: NewId
  ): js.Array[Pickle] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(gherkinDocument.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], newId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Pickle]]
  
  inline def generateMessages(data: String, uri: String, mediaType: SourceMediaType, options: IGherkinOptions): js.Array[Envelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMessages")(data.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Envelope]]
  
  inline def makeSourceEnvelope(data: String, uri: String): Envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSourceEnvelope")(data.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Envelope]
}

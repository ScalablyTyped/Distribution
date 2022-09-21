package typings.cucumberGherkin

import typings.cucumberGherkin.astBuilderMod.default
import typings.cucumberGherkin.iastbuilderMod.IAstBuilder
import typings.cucumberGherkin.igherkinoptionsMod.IGherkinOptions
import typings.cucumberGherkin.itokenMod.IToken
import typings.cucumberGherkin.itokenmatcherMod.ITokenMatcher
import typings.cucumberGherkin.parserMod.RuleType
import typings.cucumberGherkin.parserMod.TokenType
import typings.cucumberMessages.idGeneratorMod.NewId
import typings.cucumberMessages.messagesMod.SourceMediaType
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
      extends typings.cucumberGherkin.errorsMod.AstBuilderException {
      def this(message: String) = this()
    }
    /* static members */
    object AstBuilderException {
      
      @JSImport("@cucumber/gherkin", "Errors.AstBuilderException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(message: String, location: Location): typings.cucumberGherkin.errorsMod.GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.errorsMod.GherkinException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.CompositeParserException")
    @js.native
    open class CompositeParserException protected ()
      extends typings.cucumberGherkin.errorsMod.CompositeParserException {
      def this(message: String) = this()
    }
    /* static members */
    object CompositeParserException {
      
      @JSImport("@cucumber/gherkin", "Errors.CompositeParserException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(errors: js.Array[js.Error]): typings.cucumberGherkin.errorsMod.CompositeParserException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(errors.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberGherkin.errorsMod.CompositeParserException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.GherkinException")
    @js.native
    open class GherkinException protected ()
      extends typings.cucumberGherkin.errorsMod.GherkinException {
      def this(message: String) = this()
    }
    /* static members */
    object GherkinException {
      
      @JSImport("@cucumber/gherkin", "Errors.GherkinException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def _create(message: String): typings.cucumberGherkin.errorsMod.GherkinException = ^.asInstanceOf[js.Dynamic].applyDynamic("_create")(message.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberGherkin.errorsMod.GherkinException]
      inline def _create(message: String, location: Location): typings.cucumberGherkin.errorsMod.GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(message.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.errorsMod.GherkinException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.NoSuchLanguageException")
    @js.native
    open class NoSuchLanguageException protected ()
      extends typings.cucumberGherkin.errorsMod.NoSuchLanguageException {
      def this(message: String) = this()
    }
    /* static members */
    object NoSuchLanguageException {
      
      @JSImport("@cucumber/gherkin", "Errors.NoSuchLanguageException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(language: String): typings.cucumberGherkin.errorsMod.GherkinException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(language.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberGherkin.errorsMod.GherkinException]
      inline def create(language: String, location: Location): typings.cucumberGherkin.errorsMod.GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(language.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.errorsMod.GherkinException]
    }
    
    @JSImport("@cucumber/gherkin", "Errors.ParserException")
    @js.native
    open class ParserException protected ()
      extends typings.cucumberGherkin.errorsMod.ParserException {
      def this(message: String) = this()
    }
    /* static members */
    object ParserException {
      
      @JSImport("@cucumber/gherkin", "Errors.ParserException")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(message: String, line: Double, column: Double): typings.cucumberGherkin.errorsMod.ParserException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], line.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberGherkin.errorsMod.ParserException]
    }
  }
  
  @JSImport("@cucumber/gherkin", "GherkinClassicTokenMatcher")
  @js.native
  open class GherkinClassicTokenMatcher ()
    extends typings.cucumberGherkin.gherkinClassicTokenMatcherMod.default {
    def this(defaultDialectName: String) = this()
  }
  
  @JSImport("@cucumber/gherkin", "GherkinInMarkdownTokenMatcher")
  @js.native
  open class GherkinInMarkdownTokenMatcher ()
    extends typings.cucumberGherkin.gherkinInMarkdownTokenMatcherMod.default {
    def this(defaultDialectName: String) = this()
  }
  
  @JSImport("@cucumber/gherkin", "Parser")
  @js.native
  open class Parser[AstNode] protected ()
    extends typings.cucumberGherkin.parserMod.default[AstNode] {
    def this(builder: IAstBuilder[AstNode, TokenType, RuleType], tokenMatcher: ITokenMatcher[TokenType]) = this()
  }
  
  @JSImport("@cucumber/gherkin", "TokenScanner")
  @js.native
  open class TokenScanner[TokenType] protected ()
    extends typings.cucumberGherkin.tokenScannerMod.default[TokenType] {
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

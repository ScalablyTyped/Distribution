package typings.cucumberGherkin

import typings.cucumberGherkin.cucumberGherkinStrings.Colon
import typings.cucumberGherkin.cucumberGherkinStrings._empty
import typings.cucumberGherkin.distSrcItokenmatcherMod.ITokenMatcher
import typings.cucumberGherkin.distSrcParserMod.Token
import typings.cucumberGherkin.distSrcParserMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGherkinInMarkdownTokenMatcherMod {
  
  @JSImport("@cucumber/gherkin/dist/src/GherkinInMarkdownTokenMatcher", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GherkinInMarkdownTokenMatcher {
    def this(defaultDialectName: String) = this()
  }
  
  @js.native
  sealed trait KeywordPrefix extends StObject
  @JSImport("@cucumber/gherkin/dist/src/GherkinInMarkdownTokenMatcher", "KeywordPrefix")
  @js.native
  object KeywordPrefix extends StObject {
    
    @js.native
    sealed trait BULLET
      extends StObject
         with KeywordPrefix
    
    @js.native
    sealed trait HEADER
      extends StObject
         with KeywordPrefix
  }
  
  @js.native
  trait GherkinInMarkdownTokenMatcher
    extends StObject
       with ITokenMatcher[TokenType] {
    
    /* private */ var activeDocStringSeparator: Any = js.native
    
    /* private */ val defaultDialectName: Any = js.native
    
    /* private */ var dialect: Any = js.native
    
    /* private */ var dialectName: Any = js.native
    
    /* private */ val headerRegexp: Any = js.native
    
    /* private */ var indentToRemove: Any = js.native
    
    def initializeKeywordTypes(): Unit = js.native
    
    /* private */ var isGfmTableSeparator: Any = js.native
    
    /* private */ var keywordTypesMap: Any = js.native
    
    def matchTitleLine(
      prefix: KeywordPrefix,
      keywords: js.Array[String],
      keywordSuffix: Colon | _empty,
      token: Token,
      matchedType: TokenType
    ): Boolean = js.native
    
    def match_BackgroundLine(token: Token): Boolean = js.native
    
    def match_Comment(token: Token): Boolean = js.native
    
    def match_DocStringSeparator(token: Token): Boolean = js.native
    
    def match_EOF(token: Token): Boolean = js.native
    
    def match_Empty(token: Token): Boolean = js.native
    
    def match_ExamplesLine(token: Token): Boolean = js.native
    
    def match_FeatureLine(token: Token): Boolean = js.native
    
    def match_Language(token: Token): Boolean = js.native
    
    def match_Other(token: Token): Boolean = js.native
    
    def match_RuleLine(token: Token): Boolean = js.native
    
    def match_ScenarioLine(token: Token): Boolean = js.native
    
    def match_StepLine(token: Token): Boolean = js.native
    
    def match_TableRow(token: Token): Boolean = js.native
    
    def match_TagLine(token: Token): Boolean = js.native
    
    /* private */ var matchedFeatureLine: Any = js.native
    
    /* private */ val nonStarStepKeywords: Any = js.native
    
    def setTokenMatched(token: Token, indent: Double, matched: Boolean): Boolean = js.native
    def setTokenMatched(token: Token, indent: Null, matched: Boolean): Boolean = js.native
    
    /* private */ val stepRegexp: Any = js.native
  }
}

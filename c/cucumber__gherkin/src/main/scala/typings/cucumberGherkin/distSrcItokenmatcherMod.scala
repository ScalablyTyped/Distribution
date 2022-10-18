package typings.cucumberGherkin

import typings.cucumberGherkin.distSrcItokenMod.IToken
import typings.cucumberMessages.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcItokenmatcherMod {
  
  @js.native
  trait ITokenMatcher[TokenType] extends StObject {
    
    def changeDialect(newDialectName: String): Unit = js.native
    def changeDialect(newDialectName: String, location: Location): Unit = js.native
    
    def match_BackgroundLine(token: IToken[TokenType]): Boolean = js.native
    
    def match_Comment(token: IToken[TokenType]): Boolean = js.native
    
    def match_DocStringSeparator(token: IToken[TokenType]): Boolean = js.native
    
    def match_EOF(token: IToken[TokenType]): Boolean = js.native
    
    def match_Empty(token: IToken[TokenType]): Boolean = js.native
    
    def match_ExamplesLine(token: IToken[TokenType]): Boolean = js.native
    
    def match_FeatureLine(token: IToken[TokenType]): Boolean = js.native
    
    def match_Language(token: IToken[TokenType]): Boolean = js.native
    
    def match_Other(token: IToken[TokenType]): Boolean = js.native
    
    def match_RuleLine(token: IToken[TokenType]): Boolean = js.native
    
    def match_ScenarioLine(token: IToken[TokenType]): Boolean = js.native
    
    def match_StepLine(token: IToken[TokenType]): Boolean = js.native
    
    def match_TableRow(token: IToken[TokenType]): Boolean = js.native
    
    def match_TagLine(token: IToken[TokenType]): Boolean = js.native
    
    def reset(): Unit = js.native
  }
}

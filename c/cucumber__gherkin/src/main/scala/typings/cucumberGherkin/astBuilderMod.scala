package typings.cucumberGherkin

import typings.cucumberGherkin.iastbuilderMod.IAstBuilder
import typings.cucumberGherkin.parserMod.RuleType
import typings.cucumberGherkin.parserMod.TokenType
import typings.cucumberMessages.idGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astBuilderMod {
  
  @JSImport("@cucumber/gherkin/dist/src/AstBuilder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AstBuilder {
    def this(newId: NewId) = this()
  }
  
  @js.native
  trait AstBuilder
    extends StObject
       with IAstBuilder[typings.cucumberGherkin.astNodeMod.default, TokenType, RuleType]
}

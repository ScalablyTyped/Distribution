package typings.cucumberGherkin

import typings.cucumberGherkin.distSrcIastbuilderMod.IAstBuilder
import typings.cucumberGherkin.distSrcParserMod.RuleType
import typings.cucumberGherkin.distSrcParserMod.TokenType
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAstBuilderMod {
  
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
       with IAstBuilder[typings.cucumberGherkin.distSrcAstNodeMod.default, TokenType, RuleType]
}

package typings.chevrotainGast

import typings.chevrotainGast.modelMod.Alternation
import typings.chevrotainGast.modelMod.Alternative
import typings.chevrotainGast.modelMod.NonTerminal
import typings.chevrotainGast.modelMod.Option
import typings.chevrotainGast.modelMod.Repetition
import typings.chevrotainGast.modelMod.RepetitionMandatory
import typings.chevrotainGast.modelMod.RepetitionMandatoryWithSeparator
import typings.chevrotainGast.modelMod.RepetitionWithSeparator
import typings.chevrotainGast.modelMod.Rule
import typings.chevrotainGast.modelMod.Terminal
import typings.chevrotainTypes.mod.IProduction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  @JSImport("@chevrotain/gast/lib/src/visitor", "GAstVisitor")
  @js.native
  abstract class GAstVisitor () extends StObject {
    
    def visit(node: IProduction): Any = js.native
    
    def visitAlternation(node: Alternation): Any = js.native
    
    def visitAlternative(node: Alternative): Any = js.native
    
    def visitNonTerminal(node: NonTerminal): Any = js.native
    
    def visitOption(node: Option): Any = js.native
    
    def visitRepetition(node: Repetition): Any = js.native
    
    def visitRepetitionMandatory(node: RepetitionMandatory): Any = js.native
    
    def visitRepetitionMandatoryWithSeparator(node: RepetitionMandatoryWithSeparator): Any = js.native
    
    def visitRepetitionWithSeparator(node: RepetitionWithSeparator): Any = js.native
    
    def visitRule(node: Rule): Any = js.native
    
    def visitTerminal(node: Terminal): Any = js.native
  }
}

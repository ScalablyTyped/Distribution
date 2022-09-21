package typings.chevrotainGast

import typings.chevrotainGast.anon.Definition
import typings.chevrotainGast.anon.HasPredicates
import typings.chevrotainGast.anon.Idx
import typings.chevrotainGast.anon.IgnoreAmbiguities
import typings.chevrotainGast.anon.Label
import typings.chevrotainGast.anon.MaxLookahead
import typings.chevrotainGast.anon.Separator
import typings.chevrotainTypes.mod.IProduction
import typings.chevrotainTypes.mod.IProductionWithOccurrence
import typings.chevrotainTypes.mod.ISerializedGast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chevrotain/gast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chevrotain/gast", "Alternation")
  @js.native
  open class Alternation protected ()
    extends typings.chevrotainGast.modelMod.Alternation {
    def this(options: HasPredicates) = this()
  }
  
  @JSImport("@chevrotain/gast", "Alternative")
  @js.native
  open class Alternative protected ()
    extends typings.chevrotainGast.modelMod.Alternative {
    def this(options: IgnoreAmbiguities) = this()
  }
  
  @JSImport("@chevrotain/gast", "GAstVisitor")
  @js.native
  abstract class GAstVisitor ()
    extends typings.chevrotainGast.visitorMod.GAstVisitor
  
  @JSImport("@chevrotain/gast", "NonTerminal")
  @js.native
  open class NonTerminal protected ()
    extends typings.chevrotainGast.modelMod.NonTerminal {
    def this(options: Label) = this()
  }
  
  @JSImport("@chevrotain/gast", "Option")
  @js.native
  open class Option protected ()
    extends typings.chevrotainGast.modelMod.Option {
    def this(options: MaxLookahead) = this()
  }
  
  @JSImport("@chevrotain/gast", "Repetition")
  @js.native
  open class Repetition protected ()
    extends typings.chevrotainGast.modelMod.Repetition {
    def this(options: MaxLookahead) = this()
  }
  
  @JSImport("@chevrotain/gast", "RepetitionMandatory")
  @js.native
  open class RepetitionMandatory protected ()
    extends typings.chevrotainGast.modelMod.RepetitionMandatory {
    def this(options: MaxLookahead) = this()
  }
  
  @JSImport("@chevrotain/gast", "RepetitionMandatoryWithSeparator")
  @js.native
  open class RepetitionMandatoryWithSeparator protected ()
    extends typings.chevrotainGast.modelMod.RepetitionMandatoryWithSeparator {
    def this(options: Separator) = this()
  }
  
  @JSImport("@chevrotain/gast", "RepetitionWithSeparator")
  @js.native
  open class RepetitionWithSeparator protected ()
    extends typings.chevrotainGast.modelMod.RepetitionWithSeparator {
    def this(options: Separator) = this()
  }
  
  @JSImport("@chevrotain/gast", "Rule")
  @js.native
  open class Rule protected ()
    extends typings.chevrotainGast.modelMod.Rule {
    def this(options: Definition) = this()
  }
  
  @JSImport("@chevrotain/gast", "Terminal")
  @js.native
  open class Terminal protected ()
    extends typings.chevrotainGast.modelMod.Terminal {
    def this(options: Idx) = this()
  }
  
  inline def getProductionDslName(prod: IProductionWithOccurrence): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductionDslName")(prod.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBranchingProd(prod: IProduction): /* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBranchingProd")(prod.asInstanceOf[js.Any]).asInstanceOf[/* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean]
  
  inline def isOptionalProd(prod: IProduction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalProd")(prod.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isOptionalProd(prod: IProduction, alreadyVisited: js.Array[typings.chevrotainGast.modelMod.NonTerminal]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalProd")(prod.asInstanceOf[js.Any], alreadyVisited.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSequenceProd(prod: IProduction): /* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceProd")(prod.asInstanceOf[js.Any]).asInstanceOf[/* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean]
  
  inline def serializeGrammar(topRules: js.Array[typings.chevrotainGast.modelMod.Rule]): js.Array[ISerializedGast] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeGrammar")(topRules.asInstanceOf[js.Any]).asInstanceOf[js.Array[ISerializedGast]]
  
  inline def serializeProduction(node: IProduction): ISerializedGast = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeProduction")(node.asInstanceOf[js.Any]).asInstanceOf[ISerializedGast]
}

package typings.chevrotainGast

import typings.chevrotainGast.libSrcModelMod.NonTerminal
import typings.chevrotainTypes.mod.IProduction
import typings.chevrotainTypes.mod.IProductionWithOccurrence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcHelpersMod {
  
  @JSImport("@chevrotain/gast/lib/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProductionDslName(prod: IProductionWithOccurrence): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductionDslName")(prod.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBranchingProd(prod: IProduction): /* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBranchingProd")(prod.asInstanceOf[js.Any]).asInstanceOf[/* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean]
  
  inline def isOptionalProd(prod: IProduction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalProd")(prod.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isOptionalProd(prod: IProduction, alreadyVisited: js.Array[NonTerminal]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalProd")(prod.asInstanceOf[js.Any], alreadyVisited.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSequenceProd(prod: IProduction): /* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceProd")(prod.asInstanceOf[js.Any]).asInstanceOf[/* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean]
}

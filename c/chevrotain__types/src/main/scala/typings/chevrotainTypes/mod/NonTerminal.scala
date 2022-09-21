package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.Idx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "NonTerminal")
@js.native
open class NonTerminal protected ()
  extends StObject
     with IProductionWithOccurrence {
  def this(options: Idx) = this()
  
  /* CompleteClass */
  override def accept(visitor: IGASTVisitor): Unit = js.native
  
  var definition: js.Array[IProduction] = js.native
  
  /* CompleteClass */
  var idx: Double = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var nonTerminalName: String = js.native
  
  var referencedRule: Rule = js.native
}

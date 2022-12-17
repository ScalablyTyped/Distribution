package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.DefinitionIdx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "Alternation")
@js.native
open class Alternation protected ()
  extends StObject
     with IProductionWithOccurrence {
  def this(options: DefinitionIdx) = this()
  
  /* CompleteClass */
  override def accept(visitor: IGASTVisitor): Unit = js.native
  
  var definition: js.Array[IProduction] = js.native
  
  /* CompleteClass */
  var idx: Double = js.native
}

package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.Separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "RepetitionMandatoryWithSeparator")
@js.native
open class RepetitionMandatoryWithSeparator protected ()
  extends StObject
     with IProductionWithOccurrence {
  def this(options: Separator) = this()
  
  /* CompleteClass */
  override def accept(visitor: IGASTVisitor): Unit = js.native
  
  var definition: js.Array[IProduction] = js.native
  
  /* CompleteClass */
  var idx: Double = js.native
  
  var separator: TokenType = js.native
}

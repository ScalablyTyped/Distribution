package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "Terminal")
@js.native
open class Terminal protected ()
  extends StObject
     with IProductionWithOccurrence {
  def this(options: Label) = this()
  
  /* CompleteClass */
  override def accept(visitor: IGASTVisitor): Unit = js.native
  
  /* CompleteClass */
  var idx: Double = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var terminalType: TokenType = js.native
}

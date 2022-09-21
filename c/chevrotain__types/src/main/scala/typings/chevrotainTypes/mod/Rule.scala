package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "Rule")
@js.native
open class Rule protected () extends StObject {
  def this(options: Definition) = this()
  
  def accept(visitor: IGASTVisitor): Unit = js.native
  
  var definition: js.Array[IProduction] = js.native
  
  var name: String = js.native
  
  var orgText: String = js.native
}

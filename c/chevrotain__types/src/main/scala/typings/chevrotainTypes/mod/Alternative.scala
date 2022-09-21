package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.IgnoreAmbiguities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "Alternative")
@js.native
open class Alternative protected () extends StObject {
  def this(options: IgnoreAmbiguities) = this()
  
  def accept(visitor: IGASTVisitor): Unit = js.native
  
  var definition: js.Array[IProduction] = js.native
  
  var ignoreAmbiguities: Boolean = js.native
}

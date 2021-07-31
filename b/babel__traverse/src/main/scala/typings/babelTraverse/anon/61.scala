package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExpressionStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var `type`: ExpressionStatement
}
object `61` {
  
  @scala.inline
  def apply(): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit class `61MutableBuilder`[Self <: `61`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

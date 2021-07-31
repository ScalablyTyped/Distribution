package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DirectiveLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  var `type`: DirectiveLiteral
}
object `140` {
  
  @scala.inline
  def apply(): `140` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit class `140MutableBuilder`[Self <: `140`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DirectiveLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

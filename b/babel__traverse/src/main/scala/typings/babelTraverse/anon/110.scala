package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AwaitExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var `type`: AwaitExpression
}
object `110` {
  
  @scala.inline
  def apply(): `110` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit class `110MutableBuilder`[Self <: `110`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

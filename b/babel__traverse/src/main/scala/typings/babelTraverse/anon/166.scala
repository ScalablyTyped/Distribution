package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.SequenceExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  var `type`: SequenceExpression
}
object `166` {
  
  @scala.inline
  def apply(): `166` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit class `166MutableBuilder`[Self <: `166`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BinaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  var `type`: BinaryExpression
}
object `87` {
  
  @scala.inline
  def apply(): `87` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit class `87MutableBuilder`[Self <: `87`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AssignmentExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  var `type`: AssignmentExpression
}
object `135` {
  
  inline def apply(): `135` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `135`] (val x: Self) extends AnyVal {
    
    inline def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

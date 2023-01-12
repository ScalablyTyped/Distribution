package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var `type`: UpdateExpression
}
object `100` {
  
  inline def apply(): `100` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `100`] (val x: Self) extends AnyVal {
    
    inline def setType(value: UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

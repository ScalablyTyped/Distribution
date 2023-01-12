package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AwaitExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var `type`: AwaitExpression
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `113`] (val x: Self) extends AnyVal {
    
    inline def setType(value: AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

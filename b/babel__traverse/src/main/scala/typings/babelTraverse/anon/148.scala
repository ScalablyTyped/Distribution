package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ModuleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var `type`: ModuleExpression
}
object `148` {
  
  inline def apply(): `148` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[`148`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `148`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ModuleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  var `type`: ClassMethod
}
object `189` {
  
  inline def apply(): `189` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[`189`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `189`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  var `type`: TSTypeParameter
}
object `94` {
  
  inline def apply(): `94` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `94`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

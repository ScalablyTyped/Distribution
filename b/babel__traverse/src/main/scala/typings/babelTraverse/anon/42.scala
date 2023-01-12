package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var `type`: TSFunctionType
}
object `42` {
  
  inline def apply(): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `42`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

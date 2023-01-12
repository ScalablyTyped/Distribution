package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInferType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  var `type`: TSInferType
}
object `104` {
  
  inline def apply(): `104` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `104`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSInferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

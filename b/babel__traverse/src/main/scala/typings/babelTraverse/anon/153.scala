package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  var `type`: Variance
}
object `153` {
  
  inline def apply(): `153` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `153`] (val x: Self) extends AnyVal {
    
    inline def setType(value: Variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

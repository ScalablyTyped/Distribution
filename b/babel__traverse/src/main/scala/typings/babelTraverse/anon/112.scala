package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  var `type`: ArrayPattern
}
object `112` {
  
  inline def apply(): `112` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[`112`]
  }
  
  extension [Self <: `112`](x: Self) {
    
    inline def setType(value: ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

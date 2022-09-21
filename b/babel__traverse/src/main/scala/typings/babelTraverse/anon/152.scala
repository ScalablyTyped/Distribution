package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var `type`: Variance
}
object `152` {
  
  inline def apply(): `152` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[`152`]
  }
  
  extension [Self <: `152`](x: Self) {
    
    inline def setType(value: Variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

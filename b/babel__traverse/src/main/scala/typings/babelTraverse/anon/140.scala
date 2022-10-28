package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  var `type`: ThrowStatement
}
object `140` {
  
  inline def apply(): `140` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[`140`]
  }
  
  extension [Self <: `140`](x: Self) {
    
    inline def setType(value: ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

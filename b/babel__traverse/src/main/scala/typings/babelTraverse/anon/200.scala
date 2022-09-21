package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSDeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  var `type`: TSDeclareFunction
}
object `200` {
  
  inline def apply(): `200` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[`200`]
  }
  
  extension [Self <: `200`](x: Self) {
    
    inline def setType(value: TSDeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114` extends StObject {
  
  var `type`: "ImportSpecifier"
}
object `114` {
  
  inline def apply(): `114` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[`114`]
  }
  
  extension [Self <: `114`](x: Self) {
    
    inline def setType(value: "ImportSpecifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

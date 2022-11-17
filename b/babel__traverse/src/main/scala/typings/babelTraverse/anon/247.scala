package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `247` extends StObject {
  
  var `type`: "TSTypeReference"
}
object `247` {
  
  inline def apply(): `247` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[`247`]
  }
  
  extension [Self <: `247`](x: Self) {
    
    inline def setType(value: "TSTypeReference"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

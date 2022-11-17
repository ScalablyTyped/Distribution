package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  var `type`: "TSTypeQuery"
}
object `120` {
  
  inline def apply(): `120` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setType(value: "TSTypeQuery"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

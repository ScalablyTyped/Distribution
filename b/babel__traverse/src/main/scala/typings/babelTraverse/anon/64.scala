package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  var `type`: "AssignmentPattern"
}
object `64` {
  
  inline def apply(): `64` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[`64`]
  }
  
  extension [Self <: `64`](x: Self) {
    
    inline def setType(value: "AssignmentPattern"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

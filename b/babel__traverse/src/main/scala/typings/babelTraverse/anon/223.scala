package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  var `type`: ObjectPattern
}
object `223` {
  
  inline def apply(): `223` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[`223`]
  }
  
  extension [Self <: `223`](x: Self) {
    
    inline def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

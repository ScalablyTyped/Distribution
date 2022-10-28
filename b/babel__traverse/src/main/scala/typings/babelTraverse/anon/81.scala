package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeSpreadProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var `type`: ObjectTypeSpreadProperty
}
object `81` {
  
  inline def apply(): `81` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[`81`]
  }
  
  extension [Self <: `81`](x: Self) {
    
    inline def setType(value: ObjectTypeSpreadProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  var `type`: ObjectMethod
}
object `123` {
  
  inline def apply(): `123` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[`123`]
  }
  
  extension [Self <: `123`](x: Self) {
    
    inline def setType(value: ObjectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeCallProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var `type`: ObjectTypeCallProperty
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setType(value: ObjectTypeCallProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

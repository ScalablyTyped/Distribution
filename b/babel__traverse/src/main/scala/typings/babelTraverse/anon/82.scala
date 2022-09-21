package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MetaProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var `type`: MetaProperty
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setType(value: MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

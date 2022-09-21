package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  var `type`: IndexedAccessType
}
object `68` {
  
  inline def apply(): `68` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[`68`]
  }
  
  extension [Self <: `68`](x: Self) {
    
    inline def setType(value: IndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

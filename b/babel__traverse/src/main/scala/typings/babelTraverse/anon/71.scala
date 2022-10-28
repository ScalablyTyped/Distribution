package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.OpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  var `type`: OpaqueType
}
object `71` {
  
  inline def apply(): `71` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[`71`]
  }
  
  extension [Self <: `71`](x: Self) {
    
    inline def setType(value: OpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

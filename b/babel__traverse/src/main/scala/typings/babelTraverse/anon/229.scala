package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareOpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `229` extends StObject {
  
  var `type`: DeclareOpaqueType
}
object `229` {
  
  inline def apply(): `229` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[`229`]
  }
  
  extension [Self <: `229`](x: Self) {
    
    inline def setType(value: DeclareOpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

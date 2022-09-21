package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  var `type`: TSExternalModuleReference
}
object `120` {
  
  inline def apply(): `120` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

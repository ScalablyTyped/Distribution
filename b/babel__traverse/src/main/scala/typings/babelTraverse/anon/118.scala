package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  var `type`: TSExternalModuleReference
}
object `118` {
  
  inline def apply(): `118` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[`118`]
  }
  
  extension [Self <: `118`](x: Self) {
    
    inline def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  var `type`: TSExternalModuleReference
}
object `121` {
  
  inline def apply(): `121` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

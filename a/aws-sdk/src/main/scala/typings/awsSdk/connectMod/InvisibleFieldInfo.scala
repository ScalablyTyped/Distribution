package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvisibleFieldInfo extends StObject {
  
  /**
    * Identifier of the invisible field.
    */
  var Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
}
object InvisibleFieldInfo {
  
  inline def apply(): InvisibleFieldInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvisibleFieldInfo]
  }
  
  extension [Self <: InvisibleFieldInfo](x: Self) {
    
    inline def setId(value: TaskTemplateFieldIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

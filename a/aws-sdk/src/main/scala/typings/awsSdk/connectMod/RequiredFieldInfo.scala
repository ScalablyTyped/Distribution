package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredFieldInfo extends StObject {
  
  /**
    * The unique identifier for the field.
    */
  var Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
}
object RequiredFieldInfo {
  
  inline def apply(): RequiredFieldInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredFieldInfo]
  }
  
  extension [Self <: RequiredFieldInfo](x: Self) {
    
    inline def setId(value: TaskTemplateFieldIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

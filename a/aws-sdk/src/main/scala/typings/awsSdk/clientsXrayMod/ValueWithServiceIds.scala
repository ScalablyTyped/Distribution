package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueWithServiceIds extends StObject {
  
  /**
    * Values of the annotation.
    */
  var AnnotationValue: js.UndefOr[typings.awsSdk.clientsXrayMod.AnnotationValue] = js.undefined
  
  /**
    * Services to which the annotation applies.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.clientsXrayMod.ServiceIds] = js.undefined
}
object ValueWithServiceIds {
  
  inline def apply(): ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueWithServiceIds]
  }
  
  extension [Self <: ValueWithServiceIds](x: Self) {
    
    inline def setAnnotationValue(value: AnnotationValue): Self = StObject.set(x, "AnnotationValue", value.asInstanceOf[js.Any])
    
    inline def setAnnotationValueUndefined: Self = StObject.set(x, "AnnotationValue", js.undefined)
    
    inline def setServiceIds(value: ServiceIds): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
    
    inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
    
    inline def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value*))
  }
}

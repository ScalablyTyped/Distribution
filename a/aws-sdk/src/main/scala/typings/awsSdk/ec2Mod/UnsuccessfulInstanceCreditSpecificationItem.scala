package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsuccessfulInstanceCreditSpecificationItem extends StObject {
  
  /**
    * The applicable error for the burstable performance instance whose credit option for CPU usage was not modified.
    */
  var Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object UnsuccessfulInstanceCreditSpecificationItem {
  
  inline def apply(): UnsuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsuccessfulInstanceCreditSpecificationItem]
  }
  
  extension [Self <: UnsuccessfulInstanceCreditSpecificationItem](x: Self) {
    
    inline def setError(value: UnsuccessfulInstanceCreditSpecificationItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}

package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsuccessfulInstanceCreditSpecificationItem extends StObject {
  
  /**
    * The applicable error for the burstable performance instance whose credit option for CPU usage was not modified.
    */
  var Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}
object UnsuccessfulInstanceCreditSpecificationItem {
  
  @scala.inline
  def apply(): UnsuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsuccessfulInstanceCreditSpecificationItem]
  }
  
  @scala.inline
  implicit class UnsuccessfulInstanceCreditSpecificationItemMutableBuilder[Self <: UnsuccessfulInstanceCreditSpecificationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: UnsuccessfulInstanceCreditSpecificationItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}

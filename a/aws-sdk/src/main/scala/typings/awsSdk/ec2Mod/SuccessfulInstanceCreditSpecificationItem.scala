package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessfulInstanceCreditSpecificationItem extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object SuccessfulInstanceCreditSpecificationItem {
  
  @scala.inline
  def apply(): SuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulInstanceCreditSpecificationItem]
  }
  
  @scala.inline
  implicit class SuccessfulInstanceCreditSpecificationItemMutableBuilder[Self <: SuccessfulInstanceCreditSpecificationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}

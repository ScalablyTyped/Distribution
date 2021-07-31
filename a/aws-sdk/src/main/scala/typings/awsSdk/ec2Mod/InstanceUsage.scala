package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceUsage extends StObject {
  
  /**
    * The ID of the AWS account that is making use of the Capacity Reservation.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of instances the AWS account currently has in the Capacity Reservation.
    */
  var UsedInstanceCount: js.UndefOr[Integer] = js.undefined
}
object InstanceUsage {
  
  @scala.inline
  def apply(): InstanceUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceUsage]
  }
  
  @scala.inline
  implicit class InstanceUsageMutableBuilder[Self <: InstanceUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setUsedInstanceCount(value: Integer): Self = StObject.set(x, "UsedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedInstanceCountUndefined: Self = StObject.set(x, "UsedInstanceCount", js.undefined)
  }
}

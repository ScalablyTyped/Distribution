package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoipAddressUsage extends StObject {
  
  /**
    * The allocation ID of the address.
    */
  var AllocationId: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.native
  
  /**
    * The customer-owned IP address.
    */
  var CoIp: js.UndefOr[String] = js.native
}
object CoipAddressUsage {
  
  @scala.inline
  def apply(): CoipAddressUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipAddressUsage]
  }
  
  @scala.inline
  implicit class CoipAddressUsageMutableBuilder[Self <: CoipAddressUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    @scala.inline
    def setAwsService(value: String): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    @scala.inline
    def setCoIp(value: String): Self = StObject.set(x, "CoIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoIpUndefined: Self = StObject.set(x, "CoIp", js.undefined)
  }
}

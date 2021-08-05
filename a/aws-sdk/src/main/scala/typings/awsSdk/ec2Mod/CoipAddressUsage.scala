package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoipAddressUsage extends StObject {
  
  /**
    * The allocation ID of the address.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-owned IP address.
    */
  var CoIp: js.UndefOr[String] = js.undefined
}
object CoipAddressUsage {
  
  inline def apply(): CoipAddressUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipAddressUsage]
  }
  
  extension [Self <: CoipAddressUsage](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setAwsService(value: String): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    inline def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    inline def setCoIp(value: String): Self = StObject.set(x, "CoIp", value.asInstanceOf[js.Any])
    
    inline def setCoIpUndefined: Self = StObject.set(x, "CoIp", js.undefined)
  }
}

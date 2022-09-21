package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpRestrictionResponse extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the IP rules.
    */
  var AwsAccountId: js.UndefOr[typings.awsSdk.quicksightMod.AwsAccountId] = js.undefined
  
  /**
    * A value that specifies whether IP rules are turned on.
    */
  var Enabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A map that describes the IP rules with CIDR range and description.
    */
  var IpRestrictionRuleMap: js.UndefOr[typings.awsSdk.quicksightMod.IpRestrictionRuleMap] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request. 
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeIpRestrictionResponse {
  
  inline def apply(): DescribeIpRestrictionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpRestrictionResponse]
  }
  
  extension [Self <: DescribeIpRestrictionResponse](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setEnabled(value: NullableBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIpRestrictionRuleMap(value: IpRestrictionRuleMap): Self = StObject.set(x, "IpRestrictionRuleMap", value.asInstanceOf[js.Any])
    
    inline def setIpRestrictionRuleMapUndefined: Self = StObject.set(x, "IpRestrictionRuleMap", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

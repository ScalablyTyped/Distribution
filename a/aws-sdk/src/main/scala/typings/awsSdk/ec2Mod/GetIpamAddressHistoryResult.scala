package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamAddressHistoryResult extends StObject {
  
  /**
    * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see an object in the response for the instance and one for the network interface.
    */
  var HistoryRecords: js.UndefOr[IpamAddressHistoryRecordSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object GetIpamAddressHistoryResult {
  
  inline def apply(): GetIpamAddressHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIpamAddressHistoryResult]
  }
  
  extension [Self <: GetIpamAddressHistoryResult](x: Self) {
    
    inline def setHistoryRecords(value: IpamAddressHistoryRecordSet): Self = StObject.set(x, "HistoryRecords", value.asInstanceOf[js.Any])
    
    inline def setHistoryRecordsUndefined: Self = StObject.set(x, "HistoryRecords", js.undefined)
    
    inline def setHistoryRecordsVarargs(value: IpamAddressHistoryRecord*): Self = StObject.set(x, "HistoryRecords", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

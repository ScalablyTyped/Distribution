package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpnConnectionDeviceTypesResult extends StObject {
  
  /**
    * The NextToken value to include in a future GetVpnConnectionDeviceTypes request. When the results of a GetVpnConnectionDeviceTypes request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * List of customer gateway devices that have a sample configuration file available for use.
    */
  var VpnConnectionDeviceTypes: js.UndefOr[VpnConnectionDeviceTypeList] = js.undefined
}
object GetVpnConnectionDeviceTypesResult {
  
  inline def apply(): GetVpnConnectionDeviceTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpnConnectionDeviceTypesResult]
  }
  
  extension [Self <: GetVpnConnectionDeviceTypesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpnConnectionDeviceTypes(value: VpnConnectionDeviceTypeList): Self = StObject.set(x, "VpnConnectionDeviceTypes", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionDeviceTypesUndefined: Self = StObject.set(x, "VpnConnectionDeviceTypes", js.undefined)
    
    inline def setVpnConnectionDeviceTypesVarargs(value: VpnConnectionDeviceType*): Self = StObject.set(x, "VpnConnectionDeviceTypes", js.Array(value*))
  }
}

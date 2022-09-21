package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVPCEConfigurationsResult extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of VPCEConfiguration objects that contain information about your VPC endpoint configuration.
    */
  var vpceConfigurations: js.UndefOr[VPCEConfigurations] = js.undefined
}
object ListVPCEConfigurationsResult {
  
  inline def apply(): ListVPCEConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVPCEConfigurationsResult]
  }
  
  extension [Self <: ListVPCEConfigurationsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVpceConfigurations(value: VPCEConfigurations): Self = StObject.set(x, "vpceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setVpceConfigurationsUndefined: Self = StObject.set(x, "vpceConfigurations", js.undefined)
    
    inline def setVpceConfigurationsVarargs(value: VPCEConfiguration*): Self = StObject.set(x, "vpceConfigurations", js.Array(value*))
  }
}

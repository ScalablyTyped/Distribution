package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByOriginRequestPolicyIdResult extends StObject {
  
  /**
    * A list of distribution IDs.
    */
  var DistributionIdList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionIdList] = js.undefined
}
object ListDistributionsByOriginRequestPolicyIdResult {
  
  inline def apply(): ListDistributionsByOriginRequestPolicyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByOriginRequestPolicyIdResult]
  }
  
  extension [Self <: ListDistributionsByOriginRequestPolicyIdResult](x: Self) {
    
    inline def setDistributionIdList(value: DistributionIdList): Self = StObject.set(x, "DistributionIdList", value.asInstanceOf[js.Any])
    
    inline def setDistributionIdListUndefined: Self = StObject.set(x, "DistributionIdList", js.undefined)
  }
}

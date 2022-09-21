package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByResponseHeadersPolicyIdResult extends StObject {
  
  var DistributionIdList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionIdList] = js.undefined
}
object ListDistributionsByResponseHeadersPolicyIdResult {
  
  inline def apply(): ListDistributionsByResponseHeadersPolicyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByResponseHeadersPolicyIdResult]
  }
  
  extension [Self <: ListDistributionsByResponseHeadersPolicyIdResult](x: Self) {
    
    inline def setDistributionIdList(value: DistributionIdList): Self = StObject.set(x, "DistributionIdList", value.asInstanceOf[js.Any])
    
    inline def setDistributionIdListUndefined: Self = StObject.set(x, "DistributionIdList", js.undefined)
  }
}

package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsByCachePolicyIdResult extends StObject {
  
  /**
    * A list of distribution IDs.
    */
  var DistributionIdList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionIdList] = js.native
}
object ListDistributionsByCachePolicyIdResult {
  
  @scala.inline
  def apply(): ListDistributionsByCachePolicyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByCachePolicyIdResult]
  }
  
  @scala.inline
  implicit class ListDistributionsByCachePolicyIdResultMutableBuilder[Self <: ListDistributionsByCachePolicyIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionIdList(value: DistributionIdList): Self = StObject.set(x, "DistributionIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionIdListUndefined: Self = StObject.set(x, "DistributionIdList", js.undefined)
  }
}

package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByKeyGroupResult extends StObject {
  
  var DistributionIdList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionIdList] = js.undefined
}
object ListDistributionsByKeyGroupResult {
  
  @scala.inline
  def apply(): ListDistributionsByKeyGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByKeyGroupResult]
  }
  
  @scala.inline
  implicit class ListDistributionsByKeyGroupResultMutableBuilder[Self <: ListDistributionsByKeyGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionIdList(value: DistributionIdList): Self = StObject.set(x, "DistributionIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionIdListUndefined: Self = StObject.set(x, "DistributionIdList", js.undefined)
  }
}

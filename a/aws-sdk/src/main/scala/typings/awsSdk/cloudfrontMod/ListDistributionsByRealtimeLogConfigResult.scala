package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsByRealtimeLogConfigResult extends StObject {
  
  var DistributionList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionList] = js.native
}
object ListDistributionsByRealtimeLogConfigResult {
  
  @scala.inline
  def apply(): ListDistributionsByRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByRealtimeLogConfigResult]
  }
  
  @scala.inline
  implicit class ListDistributionsByRealtimeLogConfigResultMutableBuilder[Self <: ListDistributionsByRealtimeLogConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionList(value: DistributionList): Self = StObject.set(x, "DistributionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionListUndefined: Self = StObject.set(x, "DistributionList", js.undefined)
  }
}

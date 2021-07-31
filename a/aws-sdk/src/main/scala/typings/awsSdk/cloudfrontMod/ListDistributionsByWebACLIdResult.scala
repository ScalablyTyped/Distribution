package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByWebACLIdResult extends StObject {
  
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionList] = js.undefined
}
object ListDistributionsByWebACLIdResult {
  
  @scala.inline
  def apply(): ListDistributionsByWebACLIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByWebACLIdResult]
  }
  
  @scala.inline
  implicit class ListDistributionsByWebACLIdResultMutableBuilder[Self <: ListDistributionsByWebACLIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionList(value: DistributionList): Self = StObject.set(x, "DistributionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionListUndefined: Self = StObject.set(x, "DistributionList", js.undefined)
  }
}

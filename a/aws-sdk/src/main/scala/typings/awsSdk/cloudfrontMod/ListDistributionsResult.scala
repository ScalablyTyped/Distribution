package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsResult extends StObject {
  
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionList] = js.undefined
}
object ListDistributionsResult {
  
  @scala.inline
  def apply(): ListDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsResult]
  }
  
  @scala.inline
  implicit class ListDistributionsResultMutableBuilder[Self <: ListDistributionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionList(value: DistributionList): Self = StObject.set(x, "DistributionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionListUndefined: Self = StObject.set(x, "DistributionList", js.undefined)
  }
}

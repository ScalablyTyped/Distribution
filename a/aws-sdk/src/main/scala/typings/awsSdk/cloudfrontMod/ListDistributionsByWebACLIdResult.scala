package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsByWebACLIdResult extends js.Object {
  
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typings.awsSdk.cloudfrontMod.DistributionList] = js.native
}
object ListDistributionsByWebACLIdResult {
  
  @scala.inline
  def apply(): ListDistributionsByWebACLIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByWebACLIdResult]
  }
  
  @scala.inline
  implicit class ListDistributionsByWebACLIdResultOps[Self <: ListDistributionsByWebACLIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistributionList(value: DistributionList): Self = this.set("DistributionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionList: Self = this.set("DistributionList", js.undefined)
  }
}

package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableSecurityHubRequest extends js.Object {
  
  /**
    * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not provide a value for EnableDefaultStandards, it is set to true. To not enable the automatically enabled standards, set EnableDefaultStandards to false.
    */
  var EnableDefaultStandards: js.UndefOr[Boolean] = js.native
  
  /**
    * The tags to add to the hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object EnableSecurityHubRequest {
  
  @scala.inline
  def apply(): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
  
  @scala.inline
  implicit class EnableSecurityHubRequestOps[Self <: EnableSecurityHubRequest] (val x: Self) extends AnyVal {
    
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
    def setEnableDefaultStandards(value: Boolean): Self = this.set("EnableDefaultStandards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDefaultStandards: Self = this.set("EnableDefaultStandards", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}

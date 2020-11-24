package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionOriginGroups extends js.Object {
  
  /**
    * The list of origin groups.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupsItemList] = js.native
}
object AwsCloudFrontDistributionOriginGroups {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroups]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginGroupsOps[Self <: AwsCloudFrontDistributionOriginGroups] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: AwsCloudFrontDistributionOriginGroup*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionOriginGroupsItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
}

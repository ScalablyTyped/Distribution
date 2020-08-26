package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagingConfigurationsRequest extends js.Object {
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackagevodMod.MaxResults] = js.native
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Returns MediaPackage VOD PackagingConfigurations associated with the specified PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
}

object ListPackagingConfigurationsRequest {
  @scala.inline
  def apply(): ListPackagingConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingConfigurationsRequest]
  }
  @scala.inline
  implicit class ListPackagingConfigurationsRequestOps[Self <: ListPackagingConfigurationsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPackagingGroupId(value: string): Self = this.set("PackagingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackagingGroupId: Self = this.set("PackagingGroupId", js.undefined)
  }
  
}


package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagingGroupsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * A list of MediaPackage VOD PackagingGroup resources.
    */
  var PackagingGroups: js.UndefOr[listOfPackagingGroup] = js.native
}

object ListPackagingGroupsResponse {
  @scala.inline
  def apply(): ListPackagingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingGroupsResponse]
  }
  @scala.inline
  implicit class ListPackagingGroupsResponseOps[Self <: ListPackagingGroupsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPackagingGroupsVarargs(value: PackagingGroup*): Self = this.set("PackagingGroups", js.Array(value :_*))
    @scala.inline
    def setPackagingGroups(value: listOfPackagingGroup): Self = this.set("PackagingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackagingGroups: Self = this.set("PackagingGroups", js.undefined)
  }
  
}


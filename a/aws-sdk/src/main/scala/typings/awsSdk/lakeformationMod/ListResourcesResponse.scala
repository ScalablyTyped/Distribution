package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesResponse extends js.Object {
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A summary of the data lake resources.
    */
  var ResourceInfoList: js.UndefOr[typings.awsSdk.lakeformationMod.ResourceInfoList] = js.native
}

object ListResourcesResponse {
  @scala.inline
  def apply(): ListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesResponse]
  }
  @scala.inline
  implicit class ListResourcesResponseOps[Self <: ListResourcesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceInfoListVarargs(value: ResourceInfo*): Self = this.set("ResourceInfoList", js.Array(value :_*))
    @scala.inline
    def setResourceInfoList(value: ResourceInfoList): Self = this.set("ResourceInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceInfoList: Self = this.set("ResourceInfoList", js.undefined)
  }
  
}


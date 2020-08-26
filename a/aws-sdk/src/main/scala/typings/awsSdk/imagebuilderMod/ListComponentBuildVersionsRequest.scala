package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentBuildVersionsRequest extends js.Object {
  /**
    * The component version Amazon Resource Name (ARN) whose versions you want to list. 
    */
  var componentVersionArn: ComponentVersionArn = js.native
  /**
    * The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListComponentBuildVersionsRequest {
  @scala.inline
  def apply(componentVersionArn: ComponentVersionArn): ListComponentBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(componentVersionArn = componentVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentBuildVersionsRequest]
  }
  @scala.inline
  implicit class ListComponentBuildVersionsRequestOps[Self <: ListComponentBuildVersionsRequest] (val x: Self) extends AnyVal {
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
    def setComponentVersionArn(value: ComponentVersionArn): Self = this.set("componentVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: RestrictedInteger): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


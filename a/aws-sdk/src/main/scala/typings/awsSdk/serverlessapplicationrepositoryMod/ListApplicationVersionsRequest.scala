package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationVersionsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * The total number of items to return.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.MaxItems] = js.native
  /**
    * A token to specify where to start paginating.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListApplicationVersionsRequest {
  @scala.inline
  def apply(ApplicationId: string): ListApplicationVersionsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationVersionsRequest]
  }
  @scala.inline
  implicit class ListApplicationVersionsRequestOps[Self <: ListApplicationVersionsRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItems(value: MaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


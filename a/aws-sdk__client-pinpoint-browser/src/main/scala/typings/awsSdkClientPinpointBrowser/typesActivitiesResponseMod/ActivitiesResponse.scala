package typings.awsSdkClientPinpointBrowser.typesActivitiesResponseMod

import typings.awsSdkClientPinpointBrowser.typesActivityResponseMod.ActivityResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResponse extends js.Object {
  /**
    * List of campaign activities
    */
  var Item: js.UndefOr[js.Array[ActivityResponse] | Iterable[ActivityResponse]] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ActivitiesResponse {
  @scala.inline
  def apply(): ActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivitiesResponse]
  }
  @scala.inline
  implicit class ActivitiesResponseOps[Self <: ActivitiesResponse] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: ActivityResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[ActivityResponse] | Iterable[ActivityResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


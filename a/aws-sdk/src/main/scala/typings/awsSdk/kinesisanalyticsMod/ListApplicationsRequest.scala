package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsRequest extends js.Object {
  /**
    * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to specify this parameter in the first request. However, in subsequent requests, you add the last application name from the previous response to get the next page of applications.
    */
  var ExclusiveStartApplicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Maximum number of applications to list.
    */
  var Limit: js.UndefOr[ListApplicationsInputLimit] = js.native
}

object ListApplicationsRequest {
  @scala.inline
  def apply(): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsRequest]
  }
  @scala.inline
  implicit class ListApplicationsRequestOps[Self <: ListApplicationsRequest] (val x: Self) extends AnyVal {
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
    def setExclusiveStartApplicationName(value: ApplicationName): Self = this.set("ExclusiveStartApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveStartApplicationName: Self = this.set("ExclusiveStartApplicationName", js.undefined)
    @scala.inline
    def setLimit(value: ListApplicationsInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
  
}


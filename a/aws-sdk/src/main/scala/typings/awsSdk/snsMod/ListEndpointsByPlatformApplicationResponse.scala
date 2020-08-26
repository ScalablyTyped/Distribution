package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsByPlatformApplicationResponse extends js.Object {
  /**
    * Endpoints returned for ListEndpointsByPlatformApplication action.
    */
  var Endpoints: js.UndefOr[ListOfEndpoints] = js.native
  /**
    * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEndpointsByPlatformApplicationResponse {
  @scala.inline
  def apply(): ListEndpointsByPlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationResponse]
  }
  @scala.inline
  implicit class ListEndpointsByPlatformApplicationResponseOps[Self <: ListEndpointsByPlatformApplicationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpointsVarargs(value: Endpoint_ *): Self = this.set("Endpoints", js.Array(value :_*))
    @scala.inline
    def setEndpoints(value: ListOfEndpoints): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


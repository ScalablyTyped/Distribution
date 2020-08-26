package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevEndpointsResponse extends js.Object {
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.native
  /**
    * A continuation token, if not all DevEndpoint definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetDevEndpointsResponse {
  @scala.inline
  def apply(): GetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevEndpointsResponse]
  }
  @scala.inline
  implicit class GetDevEndpointsResponseOps[Self <: GetDevEndpointsResponse] (val x: Self) extends AnyVal {
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
    def setDevEndpointsVarargs(value: DevEndpoint*): Self = this.set("DevEndpoints", js.Array(value :_*))
    @scala.inline
    def setDevEndpoints(value: DevEndpointList): Self = this.set("DevEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevEndpoints: Self = this.set("DevEndpoints", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


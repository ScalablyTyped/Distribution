package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevEndpointsResponse extends js.Object {
  /**
    * The names of all the DevEndpoints in the account, or the DevEndpoints with the specified tags.
    */
  var DevEndpointNames: js.UndefOr[DevEndpointNameList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListDevEndpointsResponse {
  @scala.inline
  def apply(): ListDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevEndpointsResponse]
  }
  @scala.inline
  implicit class ListDevEndpointsResponseOps[Self <: ListDevEndpointsResponse] (val x: Self) extends AnyVal {
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
    def setDevEndpointNamesVarargs(value: NameString*): Self = this.set("DevEndpointNames", js.Array(value :_*))
    @scala.inline
    def setDevEndpointNames(value: DevEndpointNameList): Self = this.set("DevEndpointNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevEndpointNames: Self = this.set("DevEndpointNames", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


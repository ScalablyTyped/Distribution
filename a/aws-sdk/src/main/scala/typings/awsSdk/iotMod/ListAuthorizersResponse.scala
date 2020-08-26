package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuthorizersResponse extends js.Object {
  /**
    * The authorizers.
    */
  var authorizers: js.UndefOr[Authorizers] = js.native
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}

object ListAuthorizersResponse {
  @scala.inline
  def apply(): ListAuthorizersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuthorizersResponse]
  }
  @scala.inline
  implicit class ListAuthorizersResponseOps[Self <: ListAuthorizersResponse] (val x: Self) extends AnyVal {
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
    def setAuthorizersVarargs(value: AuthorizerSummary*): Self = this.set("authorizers", js.Array(value :_*))
    @scala.inline
    def setAuthorizers(value: Authorizers): Self = this.set("authorizers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizers: Self = this.set("authorizers", js.undefined)
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
  }
  
}


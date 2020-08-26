package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddResourcePermissionsResponse extends js.Object {
  /**
    * The share results.
    */
  var ShareResults: js.UndefOr[ShareResultsList] = js.native
}

object AddResourcePermissionsResponse {
  @scala.inline
  def apply(): AddResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddResourcePermissionsResponse]
  }
  @scala.inline
  implicit class AddResourcePermissionsResponseOps[Self <: AddResourcePermissionsResponse] (val x: Self) extends AnyVal {
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
    def setShareResultsVarargs(value: ShareResult*): Self = this.set("ShareResults", js.Array(value :_*))
    @scala.inline
    def setShareResults(value: ShareResultsList): Self = this.set("ShareResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareResults: Self = this.set("ShareResults", js.undefined)
  }
  
}


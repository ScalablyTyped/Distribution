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
  def apply(ShareResults: ShareResultsList = null): AddResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (ShareResults != null) __obj.updateDynamic("ShareResults")(ShareResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResourcePermissionsResponse]
  }
}


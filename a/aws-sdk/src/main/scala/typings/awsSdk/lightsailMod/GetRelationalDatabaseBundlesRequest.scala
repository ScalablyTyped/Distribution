package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseBundlesRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database bundles request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabaseBundlesRequest {
  @scala.inline
  def apply(pageToken: String = null): GetRelationalDatabaseBundlesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseBundlesRequest]
  }
}


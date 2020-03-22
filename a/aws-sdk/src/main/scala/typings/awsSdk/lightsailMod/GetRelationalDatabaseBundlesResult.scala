package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseBundlesResult extends js.Object {
  /**
    * An object describing the result of your get relational database bundles request.
    */
  var bundles: js.UndefOr[RelationalDatabaseBundleList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseBundles request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabaseBundlesResult {
  @scala.inline
  def apply(bundles: RelationalDatabaseBundleList = null, nextPageToken: String = null): GetRelationalDatabaseBundlesResult = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseBundlesResult]
  }
}


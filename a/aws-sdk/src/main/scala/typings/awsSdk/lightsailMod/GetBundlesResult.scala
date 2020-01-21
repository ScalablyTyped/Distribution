package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundlesResult extends js.Object {
  /**
    * An array of key-value pairs that contains information about the available bundles.
    */
  var bundles: js.UndefOr[BundleList] = js.native
  /**
    * A token used for advancing to the next page of results from your get active names request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetBundlesResult {
  @scala.inline
  def apply(bundles: BundleList = null, nextPageToken: String = null): GetBundlesResult = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBundlesResult]
  }
}


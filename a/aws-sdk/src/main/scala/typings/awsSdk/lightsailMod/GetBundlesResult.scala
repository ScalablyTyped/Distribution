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
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetBundles request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetBundlesResult {
  @scala.inline
  def apply(): GetBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBundlesResult]
  }
  @scala.inline
  implicit class GetBundlesResultOps[Self <: GetBundlesResult] (val x: Self) extends AnyVal {
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
    def setBundlesVarargs(value: Bundle*): Self = this.set("bundles", js.Array(value :_*))
    @scala.inline
    def setBundles(value: BundleList): Self = this.set("bundles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundles: Self = this.set("bundles", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


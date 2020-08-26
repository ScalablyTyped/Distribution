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
  def apply(): GetRelationalDatabaseBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseBundlesResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseBundlesResultOps[Self <: GetRelationalDatabaseBundlesResult] (val x: Self) extends AnyVal {
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
    def setBundlesVarargs(value: RelationalDatabaseBundle*): Self = this.set("bundles", js.Array(value :_*))
    @scala.inline
    def setBundles(value: RelationalDatabaseBundleList): Self = this.set("bundles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundles: Self = this.set("bundles", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


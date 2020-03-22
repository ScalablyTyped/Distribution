package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationsForResourceRequest extends js.Object {
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetOperationsForResource request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the resource for which you are requesting information.
    */
  var resourceName: ResourceName = js.native
}

object GetOperationsForResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, pageToken: String = null): GetOperationsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationsForResourceRequest]
  }
}


package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceTypesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The shareable resource types supported by AWS RAM.
    */
  var resourceTypes: js.UndefOr[ServiceNameAndResourceTypeList] = js.native
}

object ListResourceTypesResponse {
  @scala.inline
  def apply(nextToken: String = null, resourceTypes: ServiceNameAndResourceTypeList = null): ListResourceTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceTypesResponse]
  }
}


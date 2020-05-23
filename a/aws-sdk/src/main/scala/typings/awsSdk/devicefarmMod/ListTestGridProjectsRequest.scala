package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridProjectsRequest extends js.Object {
  /**
    * Return no more than this number of results.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * From a response, used to continue a paginated listing. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTestGridProjectsRequest {
  @scala.inline
  def apply(maxResult: js.UndefOr[MaxPageSize] = js.undefined, nextToken: PaginationToken = null): ListTestGridProjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResult)) __obj.updateDynamic("maxResult")(maxResult.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridProjectsRequest]
  }
}


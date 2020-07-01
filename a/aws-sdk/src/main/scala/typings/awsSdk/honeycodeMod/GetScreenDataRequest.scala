package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScreenDataRequest extends js.Object {
  /**
    * The ID of the app that contains the screem.
    */
  var appId: ResourceId = js.native
  /**
    *  The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum value is 100.   This parameter is optional. If you don't specify this parameter, the default page size is 100. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  This parameter is optional. If a nextToken is not specified, the API returns the first page of data.   Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the screen.
    */
  var screenId: ResourceId = js.native
  /**
    *  Variables are optional and are needed only if the screen requires them to render correctly. Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is an object which currently has only one property, rawValue, which holds the value of the variable to be passed to the screen. 
    */
  var variables: js.UndefOr[VariableValueMap] = js.native
  /**
    * The ID of the workbook that contains the screen.
    */
  var workbookId: ResourceId = js.native
}

object GetScreenDataRequest {
  @scala.inline
  def apply(
    appId: ResourceId,
    screenId: ResourceId,
    workbookId: ResourceId,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null,
    variables: VariableValueMap = null
  ): GetScreenDataRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], screenId = screenId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenDataRequest]
  }
}


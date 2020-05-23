package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExternalModelsRequest extends js.Object {
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[ExternalModelsMaxResults] = js.native
  /**
    * The Amazon SageMaker model endpoint.
    */
  var modelEndpoint: js.UndefOr[String] = js.native
  /**
    * The next page token for the request.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetExternalModelsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[ExternalModelsMaxResults] = js.undefined,
    modelEndpoint: String = null,
    nextToken: String = null
  ): GetExternalModelsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (modelEndpoint != null) __obj.updateDynamic("modelEndpoint")(modelEndpoint.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExternalModelsRequest]
  }
}


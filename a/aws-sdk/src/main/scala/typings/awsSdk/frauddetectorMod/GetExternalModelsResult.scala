package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExternalModelsResult extends js.Object {
  /**
    * Gets the Amazon SageMaker models.
    */
  var externalModels: js.UndefOr[ExternalModelList] = js.native
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetExternalModelsResult {
  @scala.inline
  def apply(externalModels: ExternalModelList = null, nextToken: String = null): GetExternalModelsResult = {
    val __obj = js.Dynamic.literal()
    if (externalModels != null) __obj.updateDynamic("externalModels")(externalModels.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExternalModelsResult]
  }
}


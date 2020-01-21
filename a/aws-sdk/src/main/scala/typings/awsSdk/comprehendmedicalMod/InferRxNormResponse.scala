package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferRxNormResponse extends js.Object {
  /**
    * The medication entities detected in the text linked to RxNorm concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: RxNormEntityList = js.native
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  /**
    * If the result of the previous request to InferRxNorm was truncated, include the PaginationToken to fetch the next page of medication entities.
    */
  var PaginationToken: js.UndefOr[String] = js.native
}

object InferRxNormResponse {
  @scala.inline
  def apply(Entities: RxNormEntityList, ModelVersion: String = null, PaginationToken: String = null): InferRxNormResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    if (ModelVersion != null) __obj.updateDynamic("ModelVersion")(ModelVersion.asInstanceOf[js.Any])
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferRxNormResponse]
  }
}


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
  def apply(): GetExternalModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsRequest]
  }
  @scala.inline
  implicit class GetExternalModelsRequestOps[Self <: GetExternalModelsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: ExternalModelsMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setModelEndpoint(value: String): Self = this.set("modelEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelEndpoint: Self = this.set("modelEndpoint", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


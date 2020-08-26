package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorsRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[DetectorsMaxResults] = js.native
  /**
    * The next token for the subsequent request.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetDetectorsRequest {
  @scala.inline
  def apply(): GetDetectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorsRequest]
  }
  @scala.inline
  implicit class GetDetectorsRequestOps[Self <: GetDetectorsRequest] (val x: Self) extends AnyVal {
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
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    @scala.inline
    def setMaxResults(value: DetectorsMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


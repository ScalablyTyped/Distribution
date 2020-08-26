package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The maximum number of results to return for the request.
    */
  var maxResults: js.UndefOr[DetectorVersionMaxResults] = js.native
  /**
    * The next token from the previous response.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeDetectorRequest {
  @scala.inline
  def apply(detectorId: identifier): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
  @scala.inline
  implicit class DescribeDetectorRequestOps[Self <: DescribeDetectorRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: DetectorVersionMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


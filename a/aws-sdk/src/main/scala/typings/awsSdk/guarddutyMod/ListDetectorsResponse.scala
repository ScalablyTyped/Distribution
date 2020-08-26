package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDetectorsResponse extends js.Object {
  /**
    * A list of detector IDs.
    */
  var DetectorIds: typings.awsSdk.guarddutyMod.DetectorIds = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDetectorsResponse {
  @scala.inline
  def apply(DetectorIds: DetectorIds): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal(DetectorIds = DetectorIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorsResponse]
  }
  @scala.inline
  implicit class ListDetectorsResponseOps[Self <: ListDetectorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectorIdsVarargs(value: DetectorId*): Self = this.set("DetectorIds", js.Array(value :_*))
    @scala.inline
    def setDetectorIds(value: DetectorIds): Self = this.set("DetectorIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


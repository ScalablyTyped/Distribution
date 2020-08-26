package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorsResult extends js.Object {
  /**
    * The detectors.
    */
  var detectors: js.UndefOr[DetectorList] = js.native
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetDetectorsResult {
  @scala.inline
  def apply(): GetDetectorsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorsResult]
  }
  @scala.inline
  implicit class GetDetectorsResultOps[Self <: GetDetectorsResult] (val x: Self) extends AnyVal {
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
    def setDetectorsVarargs(value: Detector*): Self = this.set("detectors", js.Array(value :_*))
    @scala.inline
    def setDetectors(value: DetectorList): Self = this.set("detectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectors: Self = this.set("detectors", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPercentilesResponse extends js.Object {
  /**
    * The percentile values of the aggregated fields.
    */
  var percentiles: js.UndefOr[Percentiles] = js.native
}

object GetPercentilesResponse {
  @scala.inline
  def apply(): GetPercentilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPercentilesResponse]
  }
  @scala.inline
  implicit class GetPercentilesResponseOps[Self <: GetPercentilesResponse] (val x: Self) extends AnyVal {
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
    def setPercentilesVarargs(value: PercentPair*): Self = this.set("percentiles", js.Array(value :_*))
    @scala.inline
    def setPercentiles(value: Percentiles): Self = this.set("percentiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentiles: Self = this.set("percentiles", js.undefined)
  }
  
}


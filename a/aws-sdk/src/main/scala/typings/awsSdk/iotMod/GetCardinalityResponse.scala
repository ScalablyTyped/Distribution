package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCardinalityResponse extends js.Object {
  /**
    * The approximate count of unique values that match the query.
    */
  var cardinality: js.UndefOr[Count] = js.native
}

object GetCardinalityResponse {
  @scala.inline
  def apply(): GetCardinalityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCardinalityResponse]
  }
  @scala.inline
  implicit class GetCardinalityResponseOps[Self <: GetCardinalityResponse] (val x: Self) extends AnyVal {
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
    def setCardinality(value: Count): Self = this.set("cardinality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardinality: Self = this.set("cardinality", js.undefined)
  }
  
}


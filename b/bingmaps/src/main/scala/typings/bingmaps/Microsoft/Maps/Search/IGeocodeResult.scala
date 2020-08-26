package typings.bingmaps.Microsoft.Maps.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeResult extends js.Object {
  /** An array of geocode results. */
  var results: js.Array[IPlaceResult] = js.native
}

object IGeocodeResult {
  @scala.inline
  def apply(results: js.Array[IPlaceResult]): IGeocodeResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocodeResult]
  }
  @scala.inline
  implicit class IGeocodeResultOps[Self <: IGeocodeResult] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: IPlaceResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[IPlaceResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}


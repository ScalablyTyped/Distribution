package typings.c3.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartInternal
  extends /* key */ StringDictionary[js.Any] {
  /** Access the external Chart API. */
  var api: ChartAPI = js.native
}

object ChartInternal {
  @scala.inline
  def apply(api: ChartAPI): ChartInternal = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartInternal]
  }
  @scala.inline
  implicit class ChartInternalOps[Self <: ChartInternal] (val x: Self) extends AnyVal {
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
    def setApi(value: ChartAPI): Self = this.set("api", value.asInstanceOf[js.Any])
  }
  
}


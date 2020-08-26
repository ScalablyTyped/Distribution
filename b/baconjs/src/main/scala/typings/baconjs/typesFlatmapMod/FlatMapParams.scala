package typings.baconjs.typesFlatmapMod

import typings.baconjs.describeMod.Desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatMapParams extends js.Object {
  var desc: js.UndefOr[Desc] = js.native
  var firstOnly: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var mapError: js.UndefOr[Boolean] = js.native
}

object FlatMapParams {
  @scala.inline
  def apply(): FlatMapParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatMapParams]
  }
  @scala.inline
  implicit class FlatMapParamsOps[Self <: FlatMapParams] (val x: Self) extends AnyVal {
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
    def setDesc(value: Desc): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setFirstOnly(value: Boolean): Self = this.set("firstOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstOnly: Self = this.set("firstOnly", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMapError(value: Boolean): Self = this.set("mapError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapError: Self = this.set("mapError", js.undefined)
  }
  
}


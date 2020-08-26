package typings.baidumapWebSdk.anon

import typings.baidumapWebSdk.BMap.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleId extends MapStyleV2 {
  var styleId: String = js.native
}

object StyleId {
  @scala.inline
  def apply(styleId: String): StyleId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleId]
  }
  @scala.inline
  implicit class StyleIdOps[Self <: StyleId] (val x: Self) extends AnyVal {
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
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
  }
  
}


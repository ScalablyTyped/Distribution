package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnloadT extends js.Object {
  var onloadT: integer = js.native
  var pageT: integer = js.native
  var startE: integer = js.native
  var tran: integer = js.native
}

object OnloadT {
  @scala.inline
  def apply(onloadT: integer, pageT: integer, startE: integer, tran: integer): OnloadT = {
    val __obj = js.Dynamic.literal(onloadT = onloadT.asInstanceOf[js.Any], pageT = pageT.asInstanceOf[js.Any], startE = startE.asInstanceOf[js.Any], tran = tran.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnloadT]
  }
  @scala.inline
  implicit class OnloadTOps[Self <: OnloadT] (val x: Self) extends AnyVal {
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
    def setOnloadT(value: integer): Self = this.set("onloadT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageT(value: integer): Self = this.set("pageT", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartE(value: integer): Self = this.set("startE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTran(value: integer): Self = this.set("tran", value.asInstanceOf[js.Any])
  }
  
}


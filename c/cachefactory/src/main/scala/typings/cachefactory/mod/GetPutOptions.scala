package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPutOptions extends ItemInfo {
  var maxAge: js.UndefOr[Double] = js.native
  var onExpire: js.UndefOr[OnExpireCallback] = js.native
  var storeOnReject: js.UndefOr[Boolean] = js.native
  var storeOnResolve: js.UndefOr[Boolean] = js.native
}

object GetPutOptions {
  @scala.inline
  def apply(): GetPutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPutOptions]
  }
  @scala.inline
  implicit class GetPutOptionsOps[Self <: GetPutOptions] (val x: Self) extends AnyVal {
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = this.set("onExpire", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnExpire: Self = this.set("onExpire", js.undefined)
    @scala.inline
    def setStoreOnReject(value: Boolean): Self = this.set("storeOnReject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreOnReject: Self = this.set("storeOnReject", js.undefined)
    @scala.inline
    def setStoreOnResolve(value: Boolean): Self = this.set("storeOnResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreOnResolve: Self = this.set("storeOnResolve", js.undefined)
  }
  
}


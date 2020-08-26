package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[String] = js.native
  var chromeFlags: js.UndefOr[js.Array[String]] = js.native
  var chromePath: js.UndefOr[String] = js.native
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.native
  var waitTimeout: js.UndefOr[Double] = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Array[String]): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setChromeFlagsVarargs(value: String*): Self = this.set("chromeFlags", js.Array(value :_*))
    @scala.inline
    def setChromeFlags(value: js.Array[String]): Self = this.set("chromeFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromeFlags: Self = this.set("chromeFlags", js.undefined)
    @scala.inline
    def setChromePath(value: String): Self = this.set("chromePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromePath: Self = this.set("chromePath", js.undefined)
    @scala.inline
    def setIgnoreHTTPSErrors(value: Boolean): Self = this.set("ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreHTTPSErrors: Self = this.set("ignoreHTTPSErrors", js.undefined)
    @scala.inline
    def setWaitTimeout(value: Double): Self = this.set("waitTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitTimeout: Self = this.set("waitTimeout", js.undefined)
  }
  
}


package typings.cssGlobalVariables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autoprefix extends js.Object {
  var autoprefix: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
}

object Autoprefix {
  @scala.inline
  def apply(): Autoprefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autoprefix]
  }
  @scala.inline
  implicit class AutoprefixOps[Self <: Autoprefix] (val x: Self) extends AnyVal {
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
    def setAutoprefix(value: Boolean): Self = this.set("autoprefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoprefix: Self = this.set("autoprefix", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setNormalize(value: /* name */ String => String): Self = this.set("normalize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
  }
  
}


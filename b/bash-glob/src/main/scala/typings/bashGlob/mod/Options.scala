package typings.bashGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var dot: js.UndefOr[Boolean] = js.native
  var dotglob: js.UndefOr[Boolean] = js.native
  var extglob: js.UndefOr[Boolean] = js.native
  var failglob: js.UndefOr[Boolean] = js.native
  var globstar: js.UndefOr[Boolean] = js.native
  var nocase: js.UndefOr[Boolean] = js.native
  var nocaseglob: js.UndefOr[Boolean] = js.native
  var nullglob: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setDotglob(value: Boolean): Self = this.set("dotglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotglob: Self = this.set("dotglob", js.undefined)
    @scala.inline
    def setExtglob(value: Boolean): Self = this.set("extglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtglob: Self = this.set("extglob", js.undefined)
    @scala.inline
    def setFailglob(value: Boolean): Self = this.set("failglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailglob: Self = this.set("failglob", js.undefined)
    @scala.inline
    def setGlobstar(value: Boolean): Self = this.set("globstar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobstar: Self = this.set("globstar", js.undefined)
    @scala.inline
    def setNocase(value: Boolean): Self = this.set("nocase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNocase: Self = this.set("nocase", js.undefined)
    @scala.inline
    def setNocaseglob(value: Boolean): Self = this.set("nocaseglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNocaseglob: Self = this.set("nocaseglob", js.undefined)
    @scala.inline
    def setNullglob(value: Boolean): Self = this.set("nullglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullglob: Self = this.set("nullglob", js.undefined)
  }
  
}


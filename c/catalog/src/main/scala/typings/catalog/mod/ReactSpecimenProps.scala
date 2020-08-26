package typings.catalog.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSpecimenProps extends js.Object {
  var children: ReactNode | String = js.native
  var dark: js.UndefOr[Boolean] = js.native
  var frame: js.UndefOr[Boolean] = js.native
  var light: js.UndefOr[Boolean] = js.native
  var noSource: js.UndefOr[Boolean] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var responsive: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  var showSource: js.UndefOr[Boolean] = js.native
  var sourceText: js.UndefOr[String] = js.native
  var state: js.UndefOr[js.Any] = js.native
}

object ReactSpecimenProps {
  @scala.inline
  def apply(): ReactSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSpecimenProps]
  }
  @scala.inline
  implicit class ReactSpecimenPropsOps[Self <: ReactSpecimenProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode | String): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDark(value: Boolean): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setLight(value: Boolean): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    @scala.inline
    def setNoSource(value: Boolean): Self = this.set("noSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSource: Self = this.set("noSource", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setResponsiveVarargs(value: String*): Self = this.set("responsive", js.Array(value :_*))
    @scala.inline
    def setResponsive(value: Boolean | String | js.Array[String]): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setShowSource(value: Boolean): Self = this.set("showSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSource: Self = this.set("showSource", js.undefined)
    @scala.inline
    def setSourceText(value: String): Self = this.set("sourceText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceText: Self = this.set("sourceText", js.undefined)
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}


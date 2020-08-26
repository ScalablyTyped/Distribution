package typings.axeCore.mod

import typings.axeCore.anon.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec extends js.Object {
  var axeVersion: js.UndefOr[String] = js.native
  var branding: js.UndefOr[Application] = js.native
  var checks: js.UndefOr[js.Array[Check]] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var reporter: js.UndefOr[ReporterVersion] = js.native
  var rules: js.UndefOr[js.Array[Rule]] = js.native
}

object Spec {
  @scala.inline
  def apply(): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spec]
  }
  @scala.inline
  implicit class SpecOps[Self <: Spec] (val x: Self) extends AnyVal {
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
    def setAxeVersion(value: String): Self = this.set("axeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxeVersion: Self = this.set("axeVersion", js.undefined)
    @scala.inline
    def setBranding(value: Application): Self = this.set("branding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranding: Self = this.set("branding", js.undefined)
    @scala.inline
    def setChecksVarargs(value: Check*): Self = this.set("checks", js.Array(value :_*))
    @scala.inline
    def setChecks(value: js.Array[Check]): Self = this.set("checks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecks: Self = this.set("checks", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setReporter(value: ReporterVersion): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}


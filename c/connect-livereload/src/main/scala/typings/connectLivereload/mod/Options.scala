package typings.connectLivereload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var disableCompression: js.UndefOr[Boolean] = js.native
  var excludeList: js.UndefOr[js.Array[FileMatcher]] = js.native
  var hostname: js.UndefOr[String] = js.native
  var html: js.UndefOr[js.Function1[/* val */ String, Boolean]] = js.native
  var ignore: js.UndefOr[js.Array[FileMatcher]] = js.native
  var include: js.UndefOr[js.Array[FileMatcher]] = js.native
  var port: js.UndefOr[Double] = js.native
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  var src: js.UndefOr[String] = js.native
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
    def setDisableCompression(value: Boolean): Self = this.set("disableCompression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCompression: Self = this.set("disableCompression", js.undefined)
    @scala.inline
    def setExcludeListVarargs(value: FileMatcher*): Self = this.set("excludeList", js.Array(value :_*))
    @scala.inline
    def setExcludeList(value: js.Array[FileMatcher]): Self = this.set("excludeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeList: Self = this.set("excludeList", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setHtml(value: /* val */ String => Boolean): Self = this.set("html", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: FileMatcher*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[FileMatcher]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: FileMatcher*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[FileMatcher]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}


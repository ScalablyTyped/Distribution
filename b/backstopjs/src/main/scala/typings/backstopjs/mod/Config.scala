package typings.backstopjs.mod

import typings.backstopjs.anon.Args
import typings.backstopjs.anon.Bitmapsreference
import typings.backstopjs.anon.ErrorColor
import typings.backstopjs.anon.Format
import typings.backstopjs.backstopjsStrings.CI
import typings.backstopjs.backstopjsStrings.browser
import typings.backstopjs.backstopjsStrings.chromy
import typings.backstopjs.backstopjsStrings.json
import typings.backstopjs.backstopjsStrings.puppeteer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var asyncCaptureLimit: js.UndefOr[Double] = js.native
  var asyncCompareLimit: js.UndefOr[Double] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var ci: js.UndefOr[Format] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var debugWindow: js.UndefOr[Boolean] = js.native
  var dockerCommandTemplate: js.UndefOr[String] = js.native
  var engine: js.UndefOr[chromy | puppeteer] = js.native
  var engineOptions: js.UndefOr[Args] = js.native
  var id: String = js.native
  var onBeforeScript: js.UndefOr[String] = js.native
  var onReadyScript: js.UndefOr[String] = js.native
  var paths: js.UndefOr[Bitmapsreference] = js.native
  var report: js.UndefOr[js.Array[browser | CI | json]] = js.native
  var resembleOutputOptions: js.UndefOr[ErrorColor] = js.native
  var scenarios: js.Array[Scenario] = js.native
  var viewports: js.Array[Viewport] = js.native
}

object Config {
  @scala.inline
  def apply(id: String, scenarios: js.Array[Scenario], viewports: js.Array[Viewport]): Config = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], viewports = viewports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenariosVarargs(value: Scenario*): Self = this.set("scenarios", js.Array(value :_*))
    @scala.inline
    def setScenarios(value: js.Array[Scenario]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportsVarargs(value: Viewport*): Self = this.set("viewports", js.Array(value :_*))
    @scala.inline
    def setViewports(value: js.Array[Viewport]): Self = this.set("viewports", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncCaptureLimit(value: Double): Self = this.set("asyncCaptureLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncCaptureLimit: Self = this.set("asyncCaptureLimit", js.undefined)
    @scala.inline
    def setAsyncCompareLimit(value: Double): Self = this.set("asyncCompareLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncCompareLimit: Self = this.set("asyncCompareLimit", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setCi(value: Format): Self = this.set("ci", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCi: Self = this.set("ci", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDebugWindow(value: Boolean): Self = this.set("debugWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugWindow: Self = this.set("debugWindow", js.undefined)
    @scala.inline
    def setDockerCommandTemplate(value: String): Self = this.set("dockerCommandTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockerCommandTemplate: Self = this.set("dockerCommandTemplate", js.undefined)
    @scala.inline
    def setEngine(value: chromy | puppeteer): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineOptions(value: Args): Self = this.set("engineOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineOptions: Self = this.set("engineOptions", js.undefined)
    @scala.inline
    def setOnBeforeScript(value: String): Self = this.set("onBeforeScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBeforeScript: Self = this.set("onBeforeScript", js.undefined)
    @scala.inline
    def setOnReadyScript(value: String): Self = this.set("onReadyScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReadyScript: Self = this.set("onReadyScript", js.undefined)
    @scala.inline
    def setPaths(value: Bitmapsreference): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setReportVarargs(value: (browser | CI | json)*): Self = this.set("report", js.Array(value :_*))
    @scala.inline
    def setReport(value: js.Array[browser | CI | json]): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
    @scala.inline
    def setResembleOutputOptions(value: ErrorColor): Self = this.set("resembleOutputOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResembleOutputOptions: Self = this.set("resembleOutputOptions", js.undefined)
  }
  
}


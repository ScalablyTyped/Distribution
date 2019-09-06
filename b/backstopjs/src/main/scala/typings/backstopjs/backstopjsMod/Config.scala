package typings.backstopjs.backstopjsMod

import typings.backstopjs.Anon_Args
import typings.backstopjs.Anon_Bitmapsreference
import typings.backstopjs.Anon_ErrorColor
import typings.backstopjs.Anon_Format
import typings.backstopjs.backstopjsStrings.CI
import typings.backstopjs.backstopjsStrings.browser
import typings.backstopjs.backstopjsStrings.chromy
import typings.backstopjs.backstopjsStrings.json
import typings.backstopjs.backstopjsStrings.puppeteer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var asyncCaptureLimit: js.UndefOr[Double] = js.undefined
  var asyncCompareLimit: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var ci: js.UndefOr[Anon_Format] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var debugWindow: js.UndefOr[Boolean] = js.undefined
  var dockerCommandTemplate: js.UndefOr[String] = js.undefined
  var engine: js.UndefOr[chromy | puppeteer] = js.undefined
  var engineOptions: js.UndefOr[Anon_Args] = js.undefined
  var id: String
  var onBeforeScript: js.UndefOr[String] = js.undefined
  var onReadyScript: js.UndefOr[String] = js.undefined
  var paths: js.UndefOr[Anon_Bitmapsreference] = js.undefined
  var report: js.UndefOr[js.Array[browser | CI | json]] = js.undefined
  var resembleOutputOptions: js.UndefOr[Anon_ErrorColor] = js.undefined
  var scenarios: js.Array[Scenario]
  var viewports: js.Array[Viewport]
}

object Config {
  @scala.inline
  def apply(
    id: String,
    scenarios: js.Array[Scenario],
    viewports: js.Array[Viewport],
    asyncCaptureLimit: Int | Double = null,
    asyncCompareLimit: Int | Double = null,
    baseUrl: String = null,
    ci: Anon_Format = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    debugWindow: js.UndefOr[Boolean] = js.undefined,
    dockerCommandTemplate: String = null,
    engine: chromy | puppeteer = null,
    engineOptions: Anon_Args = null,
    onBeforeScript: String = null,
    onReadyScript: String = null,
    paths: Anon_Bitmapsreference = null,
    report: js.Array[browser | CI | json] = null,
    resembleOutputOptions: Anon_ErrorColor = null
  ): Config = {
    val __obj = js.Dynamic.literal(id = id, scenarios = scenarios, viewports = viewports)
    if (asyncCaptureLimit != null) __obj.updateDynamic("asyncCaptureLimit")(asyncCaptureLimit.asInstanceOf[js.Any])
    if (asyncCompareLimit != null) __obj.updateDynamic("asyncCompareLimit")(asyncCompareLimit.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (ci != null) __obj.updateDynamic("ci")(ci)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(debugWindow)) __obj.updateDynamic("debugWindow")(debugWindow)
    if (dockerCommandTemplate != null) __obj.updateDynamic("dockerCommandTemplate")(dockerCommandTemplate)
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineOptions != null) __obj.updateDynamic("engineOptions")(engineOptions)
    if (onBeforeScript != null) __obj.updateDynamic("onBeforeScript")(onBeforeScript)
    if (onReadyScript != null) __obj.updateDynamic("onReadyScript")(onReadyScript)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (report != null) __obj.updateDynamic("report")(report)
    if (resembleOutputOptions != null) __obj.updateDynamic("resembleOutputOptions")(resembleOutputOptions)
    __obj.asInstanceOf[Config]
  }
}


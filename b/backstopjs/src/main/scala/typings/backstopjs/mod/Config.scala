package typings.backstopjs.mod

import typings.backstopjs.AnonArgs
import typings.backstopjs.AnonBitmapsreference
import typings.backstopjs.AnonErrorColor
import typings.backstopjs.AnonFormat
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
  var ci: js.UndefOr[AnonFormat] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var debugWindow: js.UndefOr[Boolean] = js.undefined
  var dockerCommandTemplate: js.UndefOr[String] = js.undefined
  var engine: js.UndefOr[chromy | puppeteer] = js.undefined
  var engineOptions: js.UndefOr[AnonArgs] = js.undefined
  var id: String
  var onBeforeScript: js.UndefOr[String] = js.undefined
  var onReadyScript: js.UndefOr[String] = js.undefined
  var paths: js.UndefOr[AnonBitmapsreference] = js.undefined
  var report: js.UndefOr[js.Array[browser | CI | json]] = js.undefined
  var resembleOutputOptions: js.UndefOr[AnonErrorColor] = js.undefined
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
    ci: AnonFormat = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    debugWindow: js.UndefOr[Boolean] = js.undefined,
    dockerCommandTemplate: String = null,
    engine: chromy | puppeteer = null,
    engineOptions: AnonArgs = null,
    onBeforeScript: String = null,
    onReadyScript: String = null,
    paths: AnonBitmapsreference = null,
    report: js.Array[browser | CI | json] = null,
    resembleOutputOptions: AnonErrorColor = null
  ): Config = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], viewports = viewports.asInstanceOf[js.Any])
    if (asyncCaptureLimit != null) __obj.updateDynamic("asyncCaptureLimit")(asyncCaptureLimit.asInstanceOf[js.Any])
    if (asyncCompareLimit != null) __obj.updateDynamic("asyncCompareLimit")(asyncCompareLimit.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (ci != null) __obj.updateDynamic("ci")(ci.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWindow)) __obj.updateDynamic("debugWindow")(debugWindow.asInstanceOf[js.Any])
    if (dockerCommandTemplate != null) __obj.updateDynamic("dockerCommandTemplate")(dockerCommandTemplate.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineOptions != null) __obj.updateDynamic("engineOptions")(engineOptions.asInstanceOf[js.Any])
    if (onBeforeScript != null) __obj.updateDynamic("onBeforeScript")(onBeforeScript.asInstanceOf[js.Any])
    if (onReadyScript != null) __obj.updateDynamic("onReadyScript")(onReadyScript.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (report != null) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    if (resembleOutputOptions != null) __obj.updateDynamic("resembleOutputOptions")(resembleOutputOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}


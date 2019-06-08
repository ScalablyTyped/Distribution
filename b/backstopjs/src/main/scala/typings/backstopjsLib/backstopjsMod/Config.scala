package typings
package backstopjsLib.backstopjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var asyncCaptureLimit: js.UndefOr[scala.Double] = js.undefined
  var asyncCompareLimit: js.UndefOr[scala.Double] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var ci: js.UndefOr[backstopjsLib.Anon_Format] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var debugWindow: js.UndefOr[scala.Boolean] = js.undefined
  var engine: js.UndefOr[
    backstopjsLib.backstopjsLibStrings.chromy | backstopjsLib.backstopjsLibStrings.puppeteer
  ] = js.undefined
  var engineOptions: js.UndefOr[backstopjsLib.Anon_Args] = js.undefined
  var id: java.lang.String
  var onBeforeScript: js.UndefOr[java.lang.String] = js.undefined
  var onReadyScript: js.UndefOr[java.lang.String] = js.undefined
  var paths: js.UndefOr[backstopjsLib.Anon_Bitmapsreference] = js.undefined
  var report: js.UndefOr[
    js.Array[
      backstopjsLib.backstopjsLibStrings.browser | backstopjsLib.backstopjsLibStrings.CI | backstopjsLib.backstopjsLibStrings.json
    ]
  ] = js.undefined
  var resembleOutputOptions: js.UndefOr[backstopjsLib.Anon_ErrorColor] = js.undefined
  var scenarios: js.Array[Scenario]
  var viewports: js.Array[Viewport]
}

object Config {
  @scala.inline
  def apply(
    id: java.lang.String,
    scenarios: js.Array[Scenario],
    viewports: js.Array[Viewport],
    asyncCaptureLimit: scala.Int | scala.Double = null,
    asyncCompareLimit: scala.Int | scala.Double = null,
    baseUrl: java.lang.String = null,
    ci: backstopjsLib.Anon_Format = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    debugWindow: js.UndefOr[scala.Boolean] = js.undefined,
    engine: backstopjsLib.backstopjsLibStrings.chromy | backstopjsLib.backstopjsLibStrings.puppeteer = null,
    engineOptions: backstopjsLib.Anon_Args = null,
    onBeforeScript: java.lang.String = null,
    onReadyScript: java.lang.String = null,
    paths: backstopjsLib.Anon_Bitmapsreference = null,
    report: js.Array[
      backstopjsLib.backstopjsLibStrings.browser | backstopjsLib.backstopjsLibStrings.CI | backstopjsLib.backstopjsLibStrings.json
    ] = null,
    resembleOutputOptions: backstopjsLib.Anon_ErrorColor = null
  ): Config = {
    val __obj = js.Dynamic.literal(id = id, scenarios = scenarios, viewports = viewports)
    if (asyncCaptureLimit != null) __obj.updateDynamic("asyncCaptureLimit")(asyncCaptureLimit.asInstanceOf[js.Any])
    if (asyncCompareLimit != null) __obj.updateDynamic("asyncCompareLimit")(asyncCompareLimit.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (ci != null) __obj.updateDynamic("ci")(ci)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(debugWindow)) __obj.updateDynamic("debugWindow")(debugWindow)
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


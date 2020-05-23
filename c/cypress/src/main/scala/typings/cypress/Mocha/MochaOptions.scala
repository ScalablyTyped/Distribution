package typings.cypress.Mocha

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to Mocha.
  */
trait MochaOptions extends js.Object {
  var allowUncaught: js.UndefOr[Boolean] = js.undefined
  var asyncOnly: js.UndefOr[Boolean] = js.undefined
  /** bail on the first test failure. */
  var bail: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Boolean] = js.undefined
  var enableTimeouts: js.UndefOr[Boolean] = js.undefined
  var forbidOnly: js.UndefOr[Boolean] = js.undefined
  var forbidPending: js.UndefOr[Boolean] = js.undefined
  /** display the full stack trace on failure. */
  var fullStackTrace: js.UndefOr[Boolean] = js.undefined
  /** Array of accepted globals. */
  var globals: js.UndefOr[js.Array[String]] = js.undefined
  /** string or regexp to filter tests with. */
  var grep: js.UndefOr[String | RegExp] = js.undefined
  /** Enable growl support. */
  var growl: js.UndefOr[Boolean] = js.undefined
  /** Do not show diffs at all. */
  var hideDiff: js.UndefOr[Boolean] = js.undefined
  /** ignore global leaks. */
  var ignoreLeaks: js.UndefOr[Boolean] = js.undefined
  /** Use inline diffs rather than +/-. */
  var inlineDiffs: js.UndefOr[Boolean] = js.undefined
  var noHighlighting: js.UndefOr[Boolean] = js.undefined
  /**
    * Reporter constructor, built-in reporter name, or reporter module path. Defaults to
    * `"spec"`.
    */
  var reporter: js.UndefOr[String | ReporterConstructor] = js.undefined
  /** Options to pass to the reporter. */
  var reporterOptions: js.UndefOr[js.Any] = js.undefined
  /** number of times to retry failed tests. */
  var retries: js.UndefOr[Double] = js.undefined
  /** milliseconds to wait before considering a test slow. */
  var slow: js.UndefOr[Double] = js.undefined
  /** timeout in milliseconds. */
  var timeout: js.UndefOr[Double] = js.undefined
  /** Test interfaces ("bdd", "tdd", "exports", etc.). */
  var ui: js.UndefOr[Interface] = js.undefined
  /** Emit color output. */
  var useColors: js.UndefOr[Boolean] = js.undefined
}

object MochaOptions {
  @scala.inline
  def apply(
    allowUncaught: js.UndefOr[Boolean] = js.undefined,
    asyncOnly: js.UndefOr[Boolean] = js.undefined,
    bail: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Boolean] = js.undefined,
    enableTimeouts: js.UndefOr[Boolean] = js.undefined,
    forbidOnly: js.UndefOr[Boolean] = js.undefined,
    forbidPending: js.UndefOr[Boolean] = js.undefined,
    fullStackTrace: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    grep: String | RegExp = null,
    growl: js.UndefOr[Boolean] = js.undefined,
    hideDiff: js.UndefOr[Boolean] = js.undefined,
    ignoreLeaks: js.UndefOr[Boolean] = js.undefined,
    inlineDiffs: js.UndefOr[Boolean] = js.undefined,
    noHighlighting: js.UndefOr[Boolean] = js.undefined,
    reporter: String | ReporterConstructor = null,
    reporterOptions: js.Any = null,
    retries: js.UndefOr[Double] = js.undefined,
    slow: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    ui: Interface = null,
    useColors: js.UndefOr[Boolean] = js.undefined
  ): MochaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUncaught)) __obj.updateDynamic("allowUncaught")(allowUncaught.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnly)) __obj.updateDynamic("asyncOnly")(asyncOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTimeouts)) __obj.updateDynamic("enableTimeouts")(enableTimeouts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidOnly)) __obj.updateDynamic("forbidOnly")(forbidOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidPending)) __obj.updateDynamic("forbidPending")(forbidPending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullStackTrace)) __obj.updateDynamic("fullStackTrace")(fullStackTrace.get.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (!js.isUndefined(growl)) __obj.updateDynamic("growl")(growl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDiff)) __obj.updateDynamic("hideDiff")(hideDiff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLeaks)) __obj.updateDynamic("ignoreLeaks")(ignoreLeaks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineDiffs)) __obj.updateDynamic("inlineDiffs")(inlineDiffs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noHighlighting)) __obj.updateDynamic("noHighlighting")(noHighlighting.get.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporterOptions != null) __obj.updateDynamic("reporterOptions")(reporterOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slow)) __obj.updateDynamic("slow")(slow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (!js.isUndefined(useColors)) __obj.updateDynamic("useColors")(useColors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaOptions]
  }
}


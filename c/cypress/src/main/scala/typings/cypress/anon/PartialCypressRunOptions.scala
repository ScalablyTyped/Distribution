package typings.cypress.anon

import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.CypressRunOptions> */
trait PartialCypressRunOptions extends js.Object {
  var browser: js.UndefOr[String] = js.undefined
  var ciBuildId: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[PartialResolvedConfigOpti] = js.undefined
  var configFile: js.UndefOr[String | `false`] = js.undefined
  var env: js.UndefOr[js.Object] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var headed: js.UndefOr[Boolean] = js.undefined
  var headless: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var noExit: js.UndefOr[Boolean] = js.undefined
  var parallel: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var project: js.UndefOr[String] = js.undefined
  var record: js.UndefOr[Boolean] = js.undefined
  var reporter: js.UndefOr[String] = js.undefined
  var reporterOptions: js.UndefOr[js.Any] = js.undefined
  var spec: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
}

object PartialCypressRunOptions {
  @scala.inline
  def apply(
    browser: String = null,
    ciBuildId: String = null,
    config: PartialResolvedConfigOpti = null,
    configFile: String | `false` = null,
    env: js.Object = null,
    group: String = null,
    headed: js.UndefOr[Boolean] = js.undefined,
    headless: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    noExit: js.UndefOr[Boolean] = js.undefined,
    parallel: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    project: String = null,
    record: js.UndefOr[Boolean] = js.undefined,
    reporter: String = null,
    reporterOptions: js.Any = null,
    spec: String = null,
    tag: String = null
  ): PartialCypressRunOptions = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (ciBuildId != null) __obj.updateDynamic("ciBuildId")(ciBuildId.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(headed)) __obj.updateDynamic("headed")(headed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noExit)) __obj.updateDynamic("noExit")(noExit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(record)) __obj.updateDynamic("record")(record.get.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporterOptions != null) __obj.updateDynamic("reporterOptions")(reporterOptions.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCypressRunOptions]
  }
}


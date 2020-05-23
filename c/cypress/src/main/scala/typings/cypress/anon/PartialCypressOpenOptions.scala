package typings.cypress.anon

import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.CypressOpenOptions> */
trait PartialCypressOpenOptions extends js.Object {
  var browser: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[PartialResolvedConfigOpti] = js.undefined
  var configFile: js.UndefOr[String | `false`] = js.undefined
  var detached: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Object] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var project: js.UndefOr[String] = js.undefined
}

object PartialCypressOpenOptions {
  @scala.inline
  def apply(
    browser: String = null,
    config: PartialResolvedConfigOpti = null,
    configFile: String | `false` = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: js.Object = null,
    global: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    project: String = null
  ): PartialCypressOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.get.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCypressOpenOptions]
  }
}


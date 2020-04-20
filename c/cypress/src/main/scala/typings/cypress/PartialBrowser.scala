package typings.cypress

import typings.cypress.mod.Cypress.BrowserChannel
import typings.cypress.mod.Cypress.BrowserFamily
import typings.cypress.mod.Cypress.BrowserName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Browser> */
trait PartialBrowser extends js.Object {
  var channel: js.UndefOr[BrowserChannel] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[BrowserFamily] = js.undefined
  var isHeaded: js.UndefOr[Boolean] = js.undefined
  var isHeadless: js.UndefOr[Boolean] = js.undefined
  var majorVersion: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[BrowserName] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object PartialBrowser {
  @scala.inline
  def apply(
    channel: BrowserChannel = null,
    displayName: String = null,
    family: BrowserFamily = null,
    isHeaded: js.UndefOr[Boolean] = js.undefined,
    isHeadless: js.UndefOr[Boolean] = js.undefined,
    majorVersion: Int | Double = null,
    name: BrowserName = null,
    path: String = null,
    version: String = null
  ): PartialBrowser = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeaded)) __obj.updateDynamic("isHeaded")(isHeaded.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeadless)) __obj.updateDynamic("isHeadless")(isHeadless.asInstanceOf[js.Any])
    if (majorVersion != null) __obj.updateDynamic("majorVersion")(majorVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBrowser]
  }
}


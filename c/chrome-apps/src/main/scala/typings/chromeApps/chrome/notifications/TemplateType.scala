package typings.chromeApps.chrome.notifications

import typings.chromeApps.chromeAppsStrings.basic
import typings.chromeApps.chromeAppsStrings.image
import typings.chromeApps.chromeAppsStrings.list
import typings.chromeApps.chromeAppsStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @prop BASIC - icon, title, message, expandedMessage, up to two buttons.
  * @prop IMAGE - icon, title, message, expandedMessage, image, up to two buttons.
  * @prop LIST - icon, title, message, items, up to two buttons. Users on Mac OS X only see the first item.
  * @prop PROGRESS - icon, title, message, progress, up to two buttons.
  */
@JSGlobal("chrome.notifications.TemplateType")
@js.native
object TemplateType extends js.Object {
  var BASIC: basic = js.native
  var IMAGE: image = js.native
  var LIST: list = js.native
  var PROGRESS: progress = js.native
}


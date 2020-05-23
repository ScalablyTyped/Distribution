package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a browser Cypress can control
  */
trait Browser extends js.Object {
  /**
    * The release channel of the browser.
    */
  var channel: BrowserChannel
  /**
    * Human-readable browser name.
    */
  var displayName: String
  /**
    * The underlying engine for this browser.
    */
  var family: BrowserFamily
  var isHeaded: Boolean
  var isHeadless: Boolean
  var majorVersion: Double
  /**
    * Short browser name.
    */
  var name: BrowserName
  var path: String
  var version: String
}

object Browser {
  @scala.inline
  def apply(
    channel: BrowserChannel,
    displayName: String,
    family: BrowserFamily,
    isHeaded: Boolean,
    isHeadless: Boolean,
    majorVersion: Double,
    name: BrowserName,
    path: String,
    version: String
  ): Browser = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], isHeaded = isHeaded.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
}


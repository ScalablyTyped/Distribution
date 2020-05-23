package typings.browserReport

import typings.browserReport.anon.City
import typings.browserReport.anon.Colors
import typings.browserReport.anon.Layout
import typings.browserReport.anon.Name
import typings.browserReport.anon.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportResult extends js.Object {
  var browser: Name
  var cookies: Boolean
  var country: City
  var flash: Version
  var ip: String
  @JSName("java")
  var java_ : Version
  var lang: js.Array[String]
  var os: Name
  var screen: Colors
  var scripts: Boolean
  var timestamp: String
  var userAgent: String
  var viewport: Layout
  var websockets: Boolean
}

object ReportResult {
  @scala.inline
  def apply(
    browser: Name,
    cookies: Boolean,
    country: City,
    flash: Version,
    ip: String,
    java_ : Version,
    lang: js.Array[String],
    os: Name,
    screen: Colors,
    scripts: Boolean,
    timestamp: String,
    userAgent: String,
    viewport: Layout,
    websockets: Boolean
  ): ReportResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], websockets = websockets.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResult]
  }
}


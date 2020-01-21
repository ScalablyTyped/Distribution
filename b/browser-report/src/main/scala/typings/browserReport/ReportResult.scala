package typings.browserReport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportResult extends js.Object {
  var browser: AnonName
  var cookies: Boolean
  var country: AnonCity
  var flash: AnonVersion
  var ip: String
  @JSName("java")
  var java_ : AnonVersion
  var lang: js.Array[String]
  var os: AnonName
  var screen: AnonColors
  var scripts: Boolean
  var timestamp: String
  var userAgent: String
  var viewport: AnonHeightLayout
  var websockets: Boolean
}

object ReportResult {
  @scala.inline
  def apply(
    browser: AnonName,
    cookies: Boolean,
    country: AnonCity,
    flash: AnonVersion,
    ip: String,
    java_ : AnonVersion,
    lang: js.Array[String],
    os: AnonName,
    screen: AnonColors,
    scripts: Boolean,
    timestamp: String,
    userAgent: String,
    viewport: AnonHeightLayout,
    websockets: Boolean
  ): ReportResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], websockets = websockets.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResult]
  }
}


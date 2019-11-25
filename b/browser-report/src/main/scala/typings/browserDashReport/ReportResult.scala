package typings.browserDashReport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportResult extends js.Object {
  var browser: Anon_Name
  var cookies: Boolean
  var country: Anon_City
  var flash: Anon_Version
  var ip: String
  @JSName("java")
  var java_ : Anon_Version
  var lang: js.Array[String]
  var os: Anon_Name
  var screen: Anon_Colors
  var scripts: Boolean
  var timestamp: String
  var userAgent: String
  var viewport: Anon_HeightLayout
  var websockets: Boolean
}

object ReportResult {
  @scala.inline
  def apply(
    browser: Anon_Name,
    cookies: Boolean,
    country: Anon_City,
    flash: Anon_Version,
    ip: String,
    java_ : Anon_Version,
    lang: js.Array[String],
    os: Anon_Name,
    screen: Anon_Colors,
    scripts: Boolean,
    timestamp: String,
    userAgent: String,
    viewport: Anon_HeightLayout,
    websockets: Boolean
  ): ReportResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], websockets = websockets.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResult]
  }
}


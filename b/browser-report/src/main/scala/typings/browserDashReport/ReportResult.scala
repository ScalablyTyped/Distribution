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
    val __obj = js.Dynamic.literal(browser = browser, cookies = cookies, country = country, flash = flash, ip = ip, lang = lang, os = os, screen = screen, scripts = scripts, timestamp = timestamp, userAgent = userAgent, viewport = viewport, websockets = websockets)
    __obj.updateDynamic("java")(java_)
    __obj.asInstanceOf[ReportResult]
  }
}


package typings
package browserDashReportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportResult extends js.Object {
  var browser: Anon_Name
  var cookies: scala.Boolean
  var country: Anon_City
  var flash: Anon_Version
  var ip: java.lang.String
  @JSName("java")
  var `java_`: Anon_Version
  var lang: js.Array[java.lang.String]
  var os: Anon_Name
  var screen: Anon_Colors
  var scripts: scala.Boolean
  var timestamp: java.lang.String
  var userAgent: java.lang.String
  var viewport: Anon_HeightLayout
  var websockets: scala.Boolean
}

object ReportResult {
  @scala.inline
  def apply(
    browser: Anon_Name,
    cookies: scala.Boolean,
    country: Anon_City,
    flash: Anon_Version,
    ip: java.lang.String,
    `java_`: Anon_Version,
    lang: js.Array[java.lang.String],
    os: Anon_Name,
    screen: Anon_Colors,
    scripts: scala.Boolean,
    timestamp: java.lang.String,
    userAgent: java.lang.String,
    viewport: Anon_HeightLayout,
    websockets: scala.Boolean
  ): ReportResult = {
    val __obj = js.Dynamic.literal(`java_` = `java_`)
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("cookies")(cookies)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("flash")(flash)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("screen")(screen)
    __obj.updateDynamic("scripts")(scripts)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("userAgent")(userAgent)
    __obj.updateDynamic("viewport")(viewport)
    __obj.updateDynamic("websockets")(websockets)
    __obj.asInstanceOf[ReportResult]
  }
}


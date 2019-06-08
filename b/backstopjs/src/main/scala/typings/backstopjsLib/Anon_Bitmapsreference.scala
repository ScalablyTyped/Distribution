package typings
package backstopjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bitmapsreference extends js.Object {
  var bitmaps_reference: js.UndefOr[java.lang.String] = js.undefined
  var bitmaps_test: js.UndefOr[java.lang.String] = js.undefined
  var ci_report: js.UndefOr[java.lang.String] = js.undefined
  var engine_scripts: js.UndefOr[java.lang.String] = js.undefined
  var html_report: js.UndefOr[java.lang.String] = js.undefined
  var json_report: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bitmapsreference {
  @scala.inline
  def apply(
    bitmaps_reference: java.lang.String = null,
    bitmaps_test: java.lang.String = null,
    ci_report: java.lang.String = null,
    engine_scripts: java.lang.String = null,
    html_report: java.lang.String = null,
    json_report: java.lang.String = null
  ): Anon_Bitmapsreference = {
    val __obj = js.Dynamic.literal()
    if (bitmaps_reference != null) __obj.updateDynamic("bitmaps_reference")(bitmaps_reference)
    if (bitmaps_test != null) __obj.updateDynamic("bitmaps_test")(bitmaps_test)
    if (ci_report != null) __obj.updateDynamic("ci_report")(ci_report)
    if (engine_scripts != null) __obj.updateDynamic("engine_scripts")(engine_scripts)
    if (html_report != null) __obj.updateDynamic("html_report")(html_report)
    if (json_report != null) __obj.updateDynamic("json_report")(json_report)
    __obj.asInstanceOf[Anon_Bitmapsreference]
  }
}


package typings.backstopjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bitmapsreference extends js.Object {
  var bitmaps_reference: js.UndefOr[String] = js.undefined
  var bitmaps_test: js.UndefOr[String] = js.undefined
  var ci_report: js.UndefOr[String] = js.undefined
  var engine_scripts: js.UndefOr[String] = js.undefined
  var html_report: js.UndefOr[String] = js.undefined
  var json_report: js.UndefOr[String] = js.undefined
}

object Anon_Bitmapsreference {
  @scala.inline
  def apply(
    bitmaps_reference: String = null,
    bitmaps_test: String = null,
    ci_report: String = null,
    engine_scripts: String = null,
    html_report: String = null,
    json_report: String = null
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


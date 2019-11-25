package typings.backstopjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var testReportFileName: js.UndefOr[String] = js.undefined
  var testSuiteName: js.UndefOr[String] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: String = null, testReportFileName: String = null, testSuiteName: String = null): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (testReportFileName != null) __obj.updateDynamic("testReportFileName")(testReportFileName.asInstanceOf[js.Any])
    if (testSuiteName != null) __obj.updateDynamic("testSuiteName")(testSuiteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}


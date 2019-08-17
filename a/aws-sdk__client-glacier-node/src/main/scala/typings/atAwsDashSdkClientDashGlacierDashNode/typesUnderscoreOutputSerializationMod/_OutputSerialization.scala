package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreOutputSerializationMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreCSVOutputMod._CSVOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OutputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of CSV-encoded query results.</p>
    */
  var csv: js.UndefOr[_CSVOutput] = js.undefined
}

object _OutputSerialization {
  @scala.inline
  def apply(csv: _CSVOutput = null): _OutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv)
    __obj.asInstanceOf[_OutputSerialization]
  }
}


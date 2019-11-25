package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOutputSerializationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCSVOutputMod._CSVOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreJSONOutputMod._JSONOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OutputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of CSV-encoded Select results.</p>
    */
  var CSV: js.UndefOr[_CSVOutput] = js.undefined
  /**
    * <p>Specifies JSON as request's output serialization format.</p>
    */
  var JSON: js.UndefOr[_JSONOutput] = js.undefined
}

object _OutputSerialization {
  @scala.inline
  def apply(CSV: _CSVOutput = null, JSON: _JSONOutput = null): _OutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OutputSerialization]
  }
}


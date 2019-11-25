package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOutputSerializationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCSVOutputMod._UnmarshalledCSVOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreJSONOutputMod._UnmarshalledJSONOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledOutputSerialization extends _OutputSerialization {
  /**
    * <p>Describes the serialization of CSV-encoded Select results.</p>
    */
  @JSName("CSV")
  var CSV__UnmarshalledOutputSerialization: js.UndefOr[_UnmarshalledCSVOutput] = js.undefined
  /**
    * <p>Specifies JSON as request's output serialization format.</p>
    */
  @JSName("JSON")
  var JSON__UnmarshalledOutputSerialization: js.UndefOr[_UnmarshalledJSONOutput] = js.undefined
}

object _UnmarshalledOutputSerialization {
  @scala.inline
  def apply(CSV: _UnmarshalledCSVOutput = null, JSON: _UnmarshalledJSONOutput = null): _UnmarshalledOutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledOutputSerialization]
  }
}


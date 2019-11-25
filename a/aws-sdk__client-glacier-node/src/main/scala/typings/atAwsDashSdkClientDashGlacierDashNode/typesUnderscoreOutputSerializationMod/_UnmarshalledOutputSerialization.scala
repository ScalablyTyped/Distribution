package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreOutputSerializationMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreCSVOutputMod._UnmarshalledCSVOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledOutputSerialization extends _OutputSerialization {
  /**
    * <p>Describes the serialization of CSV-encoded query results.</p>
    */
  @JSName("csv")
  var csv__UnmarshalledOutputSerialization: js.UndefOr[_UnmarshalledCSVOutput] = js.undefined
}

object _UnmarshalledOutputSerialization {
  @scala.inline
  def apply(csv: _UnmarshalledCSVOutput = null): _UnmarshalledOutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledOutputSerialization]
  }
}


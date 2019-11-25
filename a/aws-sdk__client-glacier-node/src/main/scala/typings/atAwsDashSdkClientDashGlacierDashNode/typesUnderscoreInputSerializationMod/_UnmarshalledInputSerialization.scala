package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreInputSerializationMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreCSVInputMod._UnmarshalledCSVInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledInputSerialization extends _InputSerialization {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("csv")
  var csv__UnmarshalledInputSerialization: js.UndefOr[_UnmarshalledCSVInput] = js.undefined
}

object _UnmarshalledInputSerialization {
  @scala.inline
  def apply(csv: _UnmarshalledCSVInput = null): _UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledInputSerialization]
  }
}


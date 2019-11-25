package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreInputSerializationMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreCSVInputMod._CSVInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  var csv: js.UndefOr[_CSVInput] = js.undefined
}

object _InputSerialization {
  @scala.inline
  def apply(csv: _CSVInput = null): _InputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InputSerialization]
  }
}


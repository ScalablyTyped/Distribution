package typings.awsSdkClientGlacierNode.typesInputSerializationMod

import typings.awsSdkClientGlacierNode.typesCsvinputMod.UnmarshalledCSVInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledInputSerialization extends InputSerialization {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("csv")
  var csv_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.undefined
}

object UnmarshalledInputSerialization {
  @scala.inline
  def apply(csv: UnmarshalledCSVInput = null): UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInputSerialization]
  }
}


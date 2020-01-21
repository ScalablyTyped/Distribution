package typings.awsSdkClientGlacierNode.typesOutputSerializationMod

import typings.awsSdkClientGlacierNode.typesCsvoutputMod.UnmarshalledCSVOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledOutputSerialization extends OutputSerialization {
  /**
    * <p>Describes the serialization of CSV-encoded query results.</p>
    */
  @JSName("csv")
  var csv_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.undefined
}

object UnmarshalledOutputSerialization {
  @scala.inline
  def apply(csv: UnmarshalledCSVOutput = null): UnmarshalledOutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledOutputSerialization]
  }
}


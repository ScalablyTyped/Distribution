package typings.awsSdkClientGlacierNode.typesOutputSerializationMod

import typings.awsSdkClientGlacierNode.typesCsvoutputMod.CSVOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of CSV-encoded query results.</p>
    */
  var csv: js.UndefOr[CSVOutput] = js.undefined
}

object OutputSerialization {
  @scala.inline
  def apply(csv: CSVOutput = null): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSerialization]
  }
}


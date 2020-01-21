package typings.awsSdkClientGlacierNode.typesInputSerializationMod

import typings.awsSdkClientGlacierNode.typesCsvinputMod.CSVInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  var csv: js.UndefOr[CSVInput] = js.undefined
}

object InputSerialization {
  @scala.inline
  def apply(csv: CSVInput = null): InputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSerialization]
  }
}


package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSerialization extends js.Object {
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var csv: js.UndefOr[CSVInput] = js.native
}

object InputSerialization {
  @scala.inline
  def apply(csv: CSVInput = null): InputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSerialization]
  }
}


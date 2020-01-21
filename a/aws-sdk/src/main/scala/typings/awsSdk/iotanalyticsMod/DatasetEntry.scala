package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetEntry extends js.Object {
  /**
    * The pre-signed URI of the data set item.
    */
  var dataURI: js.UndefOr[PresignedURI] = js.native
  /**
    * The name of the data set item.
    */
  var entryName: js.UndefOr[EntryName] = js.native
}

object DatasetEntry {
  @scala.inline
  def apply(dataURI: PresignedURI = null, entryName: EntryName = null): DatasetEntry = {
    val __obj = js.Dynamic.literal()
    if (dataURI != null) __obj.updateDynamic("dataURI")(dataURI.asInstanceOf[js.Any])
    if (entryName != null) __obj.updateDynamic("entryName")(entryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetEntry]
  }
}


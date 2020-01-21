package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimedMetadataInsertion extends js.Object {
  /**
    * Id3Insertions contains the array of Id3Insertion instances.
    */
  var Id3Insertions: js.UndefOr[listOfId3Insertion] = js.native
}

object TimedMetadataInsertion {
  @scala.inline
  def apply(Id3Insertions: listOfId3Insertion = null): TimedMetadataInsertion = {
    val __obj = js.Dynamic.literal()
    if (Id3Insertions != null) __obj.updateDynamic("Id3Insertions")(Id3Insertions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataInsertion]
  }
}


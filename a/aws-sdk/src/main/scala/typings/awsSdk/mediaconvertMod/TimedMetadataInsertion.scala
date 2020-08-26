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
  def apply(): TimedMetadataInsertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimedMetadataInsertion]
  }
  @scala.inline
  implicit class TimedMetadataInsertionOps[Self <: TimedMetadataInsertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId3InsertionsVarargs(value: Id3Insertion*): Self = this.set("Id3Insertions", js.Array(value :_*))
    @scala.inline
    def setId3Insertions(value: listOfId3Insertion): Self = this.set("Id3Insertions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId3Insertions: Self = this.set("Id3Insertions", js.undefined)
  }
  
}


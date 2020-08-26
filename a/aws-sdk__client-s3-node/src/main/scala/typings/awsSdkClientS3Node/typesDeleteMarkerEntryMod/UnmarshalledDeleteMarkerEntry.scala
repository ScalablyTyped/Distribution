package typings.awsSdkClientS3Node.typesDeleteMarkerEntryMod

import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledDeleteMarkerEntry extends DeleteMarkerEntry {
  /**
    * <p>Date and time the object was last modified.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledDeleteMarkerEntry: js.UndefOr[Date] = js.native
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledDeleteMarkerEntry: js.UndefOr[UnmarshalledOwner] = js.native
}

object UnmarshalledDeleteMarkerEntry {
  @scala.inline
  def apply(): UnmarshalledDeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledDeleteMarkerEntry]
  }
  @scala.inline
  implicit class UnmarshalledDeleteMarkerEntryOps[Self <: UnmarshalledDeleteMarkerEntry] (val x: Self) extends AnyVal {
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
    def setLastModified(value: Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setOwner(value: UnmarshalledOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
  }
  
}


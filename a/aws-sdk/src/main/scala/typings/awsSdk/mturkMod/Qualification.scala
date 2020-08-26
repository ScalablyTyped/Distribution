package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Qualification extends js.Object {
  /**
    *  The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the AcceptQualificationRequest operation.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The value (score) of the Qualification, if the Qualification has an integer value.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  var LocaleValue: js.UndefOr[Locale] = js.native
  /**
    *  The ID of the Qualification type for the Qualification.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  The status of the Qualification. Valid values are Granted | Revoked.
    */
  var Status: js.UndefOr[QualificationStatus] = js.native
  /**
    *  The ID of the Worker who possesses the Qualification. 
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object Qualification {
  @scala.inline
  def apply(): Qualification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Qualification]
  }
  @scala.inline
  implicit class QualificationOps[Self <: Qualification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGrantTime(value: Timestamp): Self = this.set("GrantTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantTime: Self = this.set("GrantTime", js.undefined)
    @scala.inline
    def setIntegerValue(value: Integer): Self = this.set("IntegerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerValue: Self = this.set("IntegerValue", js.undefined)
    @scala.inline
    def setLocaleValue(value: Locale): Self = this.set("LocaleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleValue: Self = this.set("LocaleValue", js.undefined)
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualificationTypeId: Self = this.set("QualificationTypeId", js.undefined)
    @scala.inline
    def setStatus(value: QualificationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setWorkerId(value: CustomerId): Self = this.set("WorkerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("WorkerId", js.undefined)
  }
  
}


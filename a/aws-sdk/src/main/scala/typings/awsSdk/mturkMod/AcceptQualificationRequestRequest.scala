package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptQualificationRequestRequest extends js.Object {
  /**
    *  The value of the Qualification. You can omit this value if you are using the presence or absence of the Qualification as the basis for a HIT requirement. 
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Qualification request, as returned by the GetQualificationRequests operation.
    */
  var QualificationRequestId: String = js.native
}

object AcceptQualificationRequestRequest {
  @scala.inline
  def apply(QualificationRequestId: String): AcceptQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptQualificationRequestRequest]
  }
  @scala.inline
  implicit class AcceptQualificationRequestRequestOps[Self <: AcceptQualificationRequestRequest] (val x: Self) extends AnyVal {
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
    def setQualificationRequestId(value: String): Self = this.set("QualificationRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegerValue(value: Integer): Self = this.set("IntegerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerValue: Self = this.set("IntegerValue", js.undefined)
  }
  
}


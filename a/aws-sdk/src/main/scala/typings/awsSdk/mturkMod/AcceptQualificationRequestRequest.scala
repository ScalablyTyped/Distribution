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
  def apply(QualificationRequestId: String, IntegerValue: js.UndefOr[Integer] = js.undefined): AcceptQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(IntegerValue)) __obj.updateDynamic("IntegerValue")(IntegerValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptQualificationRequestRequest]
  }
}


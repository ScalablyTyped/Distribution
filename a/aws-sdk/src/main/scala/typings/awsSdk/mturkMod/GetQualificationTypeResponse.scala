package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQualificationTypeResponse extends js.Object {
  /**
    *  The returned Qualification Type
    */
  var QualificationType: js.UndefOr[typings.awsSdk.mturkMod.QualificationType] = js.native
}

object GetQualificationTypeResponse {
  @scala.inline
  def apply(QualificationType: QualificationType = null): GetQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (QualificationType != null) __obj.updateDynamic("QualificationType")(QualificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQualificationTypeResponse]
  }
}


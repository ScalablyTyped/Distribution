package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQualificationTypeResponse extends js.Object {
  /**
    *  Contains a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typings.awsSdk.mturkMod.QualificationType] = js.native
}

object UpdateQualificationTypeResponse {
  @scala.inline
  def apply(QualificationType: QualificationType = null): UpdateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (QualificationType != null) __obj.updateDynamic("QualificationType")(QualificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQualificationTypeResponse]
  }
}


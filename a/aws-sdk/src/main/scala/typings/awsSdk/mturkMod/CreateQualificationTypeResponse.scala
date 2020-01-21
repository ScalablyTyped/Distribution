package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQualificationTypeResponse extends js.Object {
  /**
    * The created Qualification type, returned as a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typings.awsSdk.mturkMod.QualificationType] = js.native
}

object CreateQualificationTypeResponse {
  @scala.inline
  def apply(QualificationType: QualificationType = null): CreateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (QualificationType != null) __obj.updateDynamic("QualificationType")(QualificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQualificationTypeResponse]
  }
}


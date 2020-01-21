package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQualificationScoreResponse extends js.Object {
  /**
    *  The Qualification data structure of the Qualification assigned to a user, including the Qualification type and the value (score). 
    */
  var Qualification: js.UndefOr[typings.awsSdk.mturkMod.Qualification] = js.native
}

object GetQualificationScoreResponse {
  @scala.inline
  def apply(Qualification: Qualification = null): GetQualificationScoreResponse = {
    val __obj = js.Dynamic.literal()
    if (Qualification != null) __obj.updateDynamic("Qualification")(Qualification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQualificationScoreResponse]
  }
}


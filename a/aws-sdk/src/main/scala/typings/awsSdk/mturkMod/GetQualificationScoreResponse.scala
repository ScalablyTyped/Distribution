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
  def apply(): GetQualificationScoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQualificationScoreResponse]
  }
  @scala.inline
  implicit class GetQualificationScoreResponseOps[Self <: GetQualificationScoreResponse] (val x: Self) extends AnyVal {
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
    def setQualification(value: Qualification): Self = this.set("Qualification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualification: Self = this.set("Qualification", js.undefined)
  }
  
}


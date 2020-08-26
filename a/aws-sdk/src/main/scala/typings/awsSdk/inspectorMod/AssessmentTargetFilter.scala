package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTargetFilter extends js.Object {
  /**
    * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTargetName property of the AssessmentTarget data type.
    */
  var assessmentTargetNamePattern: js.UndefOr[NamePattern] = js.native
}

object AssessmentTargetFilter {
  @scala.inline
  def apply(): AssessmentTargetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentTargetFilter]
  }
  @scala.inline
  implicit class AssessmentTargetFilterOps[Self <: AssessmentTargetFilter] (val x: Self) extends AnyVal {
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
    def setAssessmentTargetNamePattern(value: NamePattern): Self = this.set("assessmentTargetNamePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssessmentTargetNamePattern: Self = this.set("assessmentTargetNamePattern", js.undefined)
  }
  
}


package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingCriteria extends js.Object {
  
  /**
    * Represents a map of finding properties that match specified conditions and values when querying findings.
    */
  var Criterion: js.UndefOr[typings.awsSdk.guarddutyMod.Criterion] = js.native
}
object FindingCriteria {
  
  @scala.inline
  def apply(): FindingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingCriteria]
  }
  
  @scala.inline
  implicit class FindingCriteriaOps[Self <: FindingCriteria] (val x: Self) extends AnyVal {
    
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
    def setCriterion(value: Criterion): Self = this.set("Criterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriterion: Self = this.set("Criterion", js.undefined)
  }
}

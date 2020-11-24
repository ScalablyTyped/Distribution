package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingCriteria extends js.Object {
  
  /**
    * A condition that specifies the property, operator, and value to use to filter the results.
    */
  var criterion: js.UndefOr[Criterion] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCriterion(value: Criterion): Self = this.set("criterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriterion: Self = this.set("criterion", js.undefined)
  }
}

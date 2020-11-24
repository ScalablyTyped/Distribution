package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends js.Object {
  
  /**
    * A list of the conditions that determine when the trigger will fire.
    */
  var Conditions: js.UndefOr[ConditionList] = js.native
  
  /**
    * An optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
    */
  var Logical: js.UndefOr[typings.awsSdk.glueMod.Logical] = js.native
}
object Predicate {
  
  @scala.inline
  def apply(): Predicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predicate]
  }
  
  @scala.inline
  implicit class PredicateOps[Self <: Predicate] (val x: Self) extends AnyVal {
    
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
    def setConditionsVarargs(value: Condition*): Self = this.set("Conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: ConditionList): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("Conditions", js.undefined)
    
    @scala.inline
    def setLogical(value: Logical): Self = this.set("Logical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogical: Self = this.set("Logical", js.undefined)
  }
}

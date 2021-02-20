package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends StObject {
  
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
  implicit class PredicateMutableBuilder[Self <: Predicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: ConditionList): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "Conditions", js.Array(value :_*))
    
    @scala.inline
    def setLogical(value: Logical): Self = StObject.set(x, "Logical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalUndefined: Self = StObject.set(x, "Logical", js.undefined)
  }
}

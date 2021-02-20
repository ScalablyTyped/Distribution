package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingRule extends StObject {
  
  /**
    * The conditions that trigger an automatic scaling activity.
    */
  var Action: ScalingAction = js.native
  
  /**
    * A friendly, more verbose description of the automatic scaling rule.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
    */
  var Name: String = js.native
  
  /**
    * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
    */
  var Trigger: ScalingTrigger = js.native
}
object ScalingRule {
  
  @scala.inline
  def apply(Action: ScalingAction, Name: String, Trigger: ScalingTrigger): ScalingRule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Trigger = Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingRule]
  }
  
  @scala.inline
  implicit class ScalingRuleMutableBuilder[Self <: ScalingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ScalingAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: ScalingTrigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
  }
}

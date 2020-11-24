package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingRule extends js.Object {
  
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
  implicit class ScalingRuleOps[Self <: ScalingRule] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ScalingAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: ScalingTrigger): Self = this.set("Trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}

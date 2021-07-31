package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingGroup extends StObject {
  
  /**
    * An Auto Scaling lifecycle event hook name.
    */
  var hook: js.UndefOr[AutoScalingGroupHook] = js.undefined
  
  /**
    * The Auto Scaling group name.
    */
  var name: js.UndefOr[AutoScalingGroupName] = js.undefined
}
object AutoScalingGroup {
  
  @scala.inline
  def apply(): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroup]
  }
  
  @scala.inline
  implicit class AutoScalingGroupMutableBuilder[Self <: AutoScalingGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHook(value: AutoScalingGroupHook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    @scala.inline
    def setName(value: AutoScalingGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

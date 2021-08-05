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
  
  inline def apply(): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroup]
  }
  
  extension [Self <: AutoScalingGroup](x: Self) {
    
    inline def setHook(value: AutoScalingGroupHook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    inline def setName(value: AutoScalingGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

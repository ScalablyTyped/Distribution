package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingGroup extends StObject {
  
  /**
    * The name of the Auto Scaling group associated with an Amazon EKS managed node group.
    */
  var name: js.UndefOr[String] = js.undefined
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

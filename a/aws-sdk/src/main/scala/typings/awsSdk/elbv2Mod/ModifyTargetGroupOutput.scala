package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTargetGroupOutput extends StObject {
  
  /**
    * Information about the modified target group.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroups] = js.undefined
}
object ModifyTargetGroupOutput {
  
  @scala.inline
  def apply(): ModifyTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTargetGroupOutput]
  }
  
  @scala.inline
  implicit class ModifyTargetGroupOutputMutableBuilder[Self <: ModifyTargetGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroups(value: TargetGroups): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroup*): Self = StObject.set(x, "TargetGroups", js.Array(value :_*))
  }
}

package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTargetGroupOutput extends StObject {
  
  /**
    * Information about the target group.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroups] = js.native
}
object CreateTargetGroupOutput {
  
  @scala.inline
  def apply(): CreateTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTargetGroupOutput]
  }
  
  @scala.inline
  implicit class CreateTargetGroupOutputMutableBuilder[Self <: CreateTargetGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroups(value: TargetGroups): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroup*): Self = StObject.set(x, "TargetGroups", js.Array(value :_*))
  }
}

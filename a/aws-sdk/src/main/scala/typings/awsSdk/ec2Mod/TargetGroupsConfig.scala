package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupsConfig extends StObject {
  
  /**
    * One or more target groups.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.ec2Mod.TargetGroups] = js.native
}
object TargetGroupsConfig {
  
  @scala.inline
  def apply(): TargetGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupsConfig]
  }
  
  @scala.inline
  implicit class TargetGroupsConfigMutableBuilder[Self <: TargetGroupsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroups(value: TargetGroups): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroup*): Self = StObject.set(x, "TargetGroups", js.Array(value :_*))
  }
}

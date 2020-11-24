package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupsConfig extends js.Object {
  
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
  implicit class TargetGroupsConfigOps[Self <: TargetGroupsConfig] (val x: Self) extends AnyVal {
    
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
    def setTargetGroupsVarargs(value: TargetGroup*): Self = this.set("TargetGroups", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroups(value: TargetGroups): Self = this.set("TargetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroups: Self = this.set("TargetGroups", js.undefined)
  }
}

package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBProxyTargetGroupResponse extends js.Object {
  
  /**
    * The settings of the modified DBProxyTarget.
    */
  var DBProxyTargetGroup: js.UndefOr[typings.awsSdk.rdsMod.DBProxyTargetGroup] = js.native
}
object ModifyDBProxyTargetGroupResponse {
  
  @scala.inline
  def apply(): ModifyDBProxyTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyTargetGroupResponse]
  }
  
  @scala.inline
  implicit class ModifyDBProxyTargetGroupResponseOps[Self <: ModifyDBProxyTargetGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setDBProxyTargetGroup(value: DBProxyTargetGroup): Self = this.set("DBProxyTargetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBProxyTargetGroup: Self = this.set("DBProxyTargetGroup", js.undefined)
  }
}

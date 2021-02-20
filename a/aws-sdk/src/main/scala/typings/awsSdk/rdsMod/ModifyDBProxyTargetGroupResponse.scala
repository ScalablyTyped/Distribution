package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBProxyTargetGroupResponse extends StObject {
  
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
  implicit class ModifyDBProxyTargetGroupResponseMutableBuilder[Self <: ModifyDBProxyTargetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBProxyTargetGroup(value: DBProxyTargetGroup): Self = StObject.set(x, "DBProxyTargetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxyTargetGroupUndefined: Self = StObject.set(x, "DBProxyTargetGroup", js.undefined)
  }
}

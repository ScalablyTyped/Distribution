package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceGroupsInput extends StObject {
  
  /**
    * The ID of the cluster to which the instance group belongs.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.emrMod.ClusterId] = js.native
  
  /**
    * Instance groups to change.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.native
}
object ModifyInstanceGroupsInput {
  
  @scala.inline
  def apply(): ModifyInstanceGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceGroupsInput]
  }
  
  @scala.inline
  implicit class ModifyInstanceGroupsInputMutableBuilder[Self <: ModifyInstanceGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setInstanceGroups(value: InstanceGroupModifyConfigList): Self = StObject.set(x, "InstanceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupsUndefined: Self = StObject.set(x, "InstanceGroups", js.undefined)
    
    @scala.inline
    def setInstanceGroupsVarargs(value: InstanceGroupModifyConfig*): Self = StObject.set(x, "InstanceGroups", js.Array(value :_*))
  }
}

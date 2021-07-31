package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddInstanceGroupsInput extends StObject {
  
  /**
    * Instance groups to add.
    */
  var InstanceGroups: InstanceGroupConfigList
  
  /**
    * Job flow in which to add the instance groups.
    */
  var JobFlowId: XmlStringMaxLen256
}
object AddInstanceGroupsInput {
  
  @scala.inline
  def apply(InstanceGroups: InstanceGroupConfigList, JobFlowId: XmlStringMaxLen256): AddInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(InstanceGroups = InstanceGroups.asInstanceOf[js.Any], JobFlowId = JobFlowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInstanceGroupsInput]
  }
  
  @scala.inline
  implicit class AddInstanceGroupsInputMutableBuilder[Self <: AddInstanceGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceGroups(value: InstanceGroupConfigList): Self = StObject.set(x, "InstanceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupsVarargs(value: InstanceGroupConfig*): Self = StObject.set(x, "InstanceGroups", js.Array(value :_*))
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
  }
}

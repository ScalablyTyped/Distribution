package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupModifyConfig extends StObject {
  
  /**
    * A list of new or modified configurations to apply for an instance group.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its original requested size.
    */
  var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.undefined
  
  /**
    * Target size for the instance group.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Unique ID of the instance group to expand or shrink.
    */
  var InstanceGroupId: XmlStringMaxLen256
  
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.emrMod.ShrinkPolicy] = js.undefined
}
object InstanceGroupModifyConfig {
  
  @scala.inline
  def apply(InstanceGroupId: XmlStringMaxLen256): InstanceGroupModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupModifyConfig]
  }
  
  @scala.inline
  implicit class InstanceGroupModifyConfigMutableBuilder[Self <: InstanceGroupModifyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
    @scala.inline
    def setEC2InstanceIdsToTerminate(value: EC2InstanceIdsToTerminateList): Self = StObject.set(x, "EC2InstanceIdsToTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2InstanceIdsToTerminateUndefined: Self = StObject.set(x, "EC2InstanceIdsToTerminate", js.undefined)
    
    @scala.inline
    def setEC2InstanceIdsToTerminateVarargs(value: InstanceId*): Self = StObject.set(x, "EC2InstanceIdsToTerminate", js.Array(value :_*))
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkPolicy(value: ShrinkPolicy): Self = StObject.set(x, "ShrinkPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkPolicyUndefined: Self = StObject.set(x, "ShrinkPolicy", js.undefined)
  }
}

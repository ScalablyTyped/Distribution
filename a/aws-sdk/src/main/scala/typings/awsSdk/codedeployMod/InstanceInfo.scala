package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInfo extends StObject {
  
  /**
    * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
    */
  var deregisterTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ARN of the IAM session associated with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined
  
  /**
    * The IAM user ARN associated with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.undefined
  
  /**
    * The ARN of the on-premises instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.undefined
  
  /**
    * The name of the on-premises instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.undefined
  
  /**
    * The time at which the on-premises instance was registered.
    */
  var registerTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The tags currently associated with the on-premises instance.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object InstanceInfo {
  
  @scala.inline
  def apply(): InstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInfo]
  }
  
  @scala.inline
  implicit class InstanceInfoMutableBuilder[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeregisterTime(value: Timestamp): Self = StObject.set(x, "deregisterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeregisterTimeUndefined: Self = StObject.set(x, "deregisterTime", js.undefined)
    
    @scala.inline
    def setIamSessionArn(value: IamSessionArn): Self = StObject.set(x, "iamSessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamSessionArnUndefined: Self = StObject.set(x, "iamSessionArn", js.undefined)
    
    @scala.inline
    def setIamUserArn(value: IamUserArn): Self = StObject.set(x, "iamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserArnUndefined: Self = StObject.set(x, "iamUserArn", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArnUndefined: Self = StObject.set(x, "instanceArn", js.undefined)
    
    @scala.inline
    def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    @scala.inline
    def setRegisterTime(value: Timestamp): Self = StObject.set(x, "registerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterTimeUndefined: Self = StObject.set(x, "registerTime", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}

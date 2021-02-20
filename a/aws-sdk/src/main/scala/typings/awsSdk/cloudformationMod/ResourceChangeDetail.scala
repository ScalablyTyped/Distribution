package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceChangeDetail extends StObject {
  
  /**
    * The identity of the entity that triggered this change. This entity is a member of the group that is specified by the ChangeSource field. For example, if you modified the value of the KeyPairName parameter, the CausingEntity is the name of the parameter (KeyPairName). If the ChangeSource value is DirectModification, no value is given for CausingEntity.
    */
  var CausingEntity: js.UndefOr[typings.awsSdk.cloudformationMod.CausingEntity] = js.native
  
  /**
    * The group to which the CausingEntity value belongs. There are five entity groups:    ResourceReference entities are Ref intrinsic functions that refer to resources in the template, such as { "Ref" : "MyEC2InstanceResource" }.    ParameterReference entities are Ref intrinsic functions that get template parameter values, such as { "Ref" : "MyPasswordParameter" }.    ResourceAttribute entities are Fn::GetAtt intrinsic functions that get resource attribute values, such as { "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }.    DirectModification entities are changes that are made directly to the template.    Automatic entities are AWS::CloudFormation::Stack resource types, which are also known as nested stacks. If you made no changes to the AWS::CloudFormation::Stack resource, AWS CloudFormation sets the ChangeSource to Automatic because the nested stack's template might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an update on the parent stack.  
    */
  var ChangeSource: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSource] = js.native
  
  /**
    * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change before you execute a change set. For Static evaluations, AWS CloudFormation can determine that the target value will change, and its value. For example, if you directly modify the InstanceType property of an EC2 instance, AWS CloudFormation knows that this property value will change, and its value, so this is a Static evaluation. For Dynamic evaluations, cannot determine the target value because it depends on the result of an intrinsic function, such as a Ref or Fn::GetAtt intrinsic function, when the stack is updated. For example, if your template includes a reference to a resource that is conditionally recreated, the value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated. If the resource is recreated, it will have a new physical ID, so all references to that resource will also be updated.
    */
  var Evaluation: js.UndefOr[EvaluationType] = js.native
  
  /**
    * A ResourceTargetDefinition structure that describes the field that AWS CloudFormation will change and whether the resource will be recreated.
    */
  var Target: js.UndefOr[ResourceTargetDefinition] = js.native
}
object ResourceChangeDetail {
  
  @scala.inline
  def apply(): ResourceChangeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChangeDetail]
  }
  
  @scala.inline
  implicit class ResourceChangeDetailMutableBuilder[Self <: ResourceChangeDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCausingEntity(value: CausingEntity): Self = StObject.set(x, "CausingEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCausingEntityUndefined: Self = StObject.set(x, "CausingEntity", js.undefined)
    
    @scala.inline
    def setChangeSource(value: ChangeSource): Self = StObject.set(x, "ChangeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSourceUndefined: Self = StObject.set(x, "ChangeSource", js.undefined)
    
    @scala.inline
    def setEvaluation(value: EvaluationType): Self = StObject.set(x, "Evaluation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationUndefined: Self = StObject.set(x, "Evaluation", js.undefined)
    
    @scala.inline
    def setTarget(value: ResourceTargetDefinition): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}

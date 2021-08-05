package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSummary extends StObject {
  
  /**
    * The time the stack was created.
    */
  var CreationTime: typings.awsSdk.cloudformationMod.CreationTime
  
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[typings.awsSdk.cloudformationMod.DeletionTime] = js.undefined
  
  /**
    * Summarizes information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformationSummary] = js.undefined
  
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsSdk.cloudformationMod.LastUpdatedTime] = js.undefined
  
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.undefined
  
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.undefined
  
  /**
    * Unique stack identifier.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.undefined
  
  /**
    * The name associated with the stack.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName
  
  /**
    * The current status of the stack.
    */
  var StackStatus: typings.awsSdk.cloudformationMod.StackStatus
  
  /**
    * Success/Failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typings.awsSdk.cloudformationMod.StackStatusReason] = js.undefined
  
  /**
    * The template description of the template used to create the stack.
    */
  var TemplateDescription: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateDescription] = js.undefined
}
object StackSummary {
  
  inline def apply(CreationTime: CreationTime, StackName: StackName, StackStatus: StackStatus): StackSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSummary]
  }
  
  extension [Self <: StackSummary](x: Self) {
    
    inline def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTime(value: DeletionTime): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    inline def setDriftInformation(value: StackDriftInformationSummary): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    inline def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    inline def setLastUpdatedTime(value: LastUpdatedTime): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setParentId(value: StackId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    inline def setRootId(value: StackId): Self = StObject.set(x, "RootId", value.asInstanceOf[js.Any])
    
    inline def setRootIdUndefined: Self = StObject.set(x, "RootId", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackStatus(value: StackStatus): Self = StObject.set(x, "StackStatus", value.asInstanceOf[js.Any])
    
    inline def setStackStatusReason(value: StackStatusReason): Self = StObject.set(x, "StackStatusReason", value.asInstanceOf[js.Any])
    
    inline def setStackStatusReasonUndefined: Self = StObject.set(x, "StackStatusReason", js.undefined)
    
    inline def setTemplateDescription(value: TemplateDescription): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
  }
}

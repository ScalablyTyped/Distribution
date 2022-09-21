package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotsRequest extends StObject {
  
  /**
    * Copies the tags from the specified volume to corresponding snapshot.
    */
  var CopyTagsFromSource: js.UndefOr[typings.awsSdk.ec2Mod.CopyTagsFromSource] = js.undefined
  
  /**
    *  A description propagated to every snapshot specified by the instance.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance to specify which volumes should be included in the snapshots.
    */
  var InstanceSpecification: typings.awsSdk.ec2Mod.InstanceSpecification
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost on which to create the local snapshots.   To create snapshots from an instance in a Region, omit this parameter. The snapshots are created in the same Region as the instance.   To create snapshots from an instance on an Outpost and store the snapshots in the Region, omit this parameter. The snapshots are created in the Region for the Outpost.   To create snapshots from an instance on an Outpost and store the snapshots on an Outpost, specify the ARN of the destination Outpost. The snapshots must be created on the same Outpost as the instance.   For more information, see  Create multi-volume local snapshots from instances on an Outpost in the Amazon Elastic Compute Cloud User Guide.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * Tags to apply to every snapshot specified by the instance.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateSnapshotsRequest {
  
  inline def apply(InstanceSpecification: InstanceSpecification): CreateSnapshotsRequest = {
    val __obj = js.Dynamic.literal(InstanceSpecification = InstanceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotsRequest]
  }
  
  extension [Self <: CreateSnapshotsRequest](x: Self) {
    
    inline def setCopyTagsFromSource(value: CopyTagsFromSource): Self = StObject.set(x, "CopyTagsFromSource", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsFromSourceUndefined: Self = StObject.set(x, "CopyTagsFromSource", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceSpecification(value: InstanceSpecification): Self = StObject.set(x, "InstanceSpecification", value.asInstanceOf[js.Any])
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}

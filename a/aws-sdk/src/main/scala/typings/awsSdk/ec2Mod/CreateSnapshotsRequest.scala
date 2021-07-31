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
    * Tags to apply to every snapshot specified by the instance.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateSnapshotsRequest {
  
  @scala.inline
  def apply(InstanceSpecification: InstanceSpecification): CreateSnapshotsRequest = {
    val __obj = js.Dynamic.literal(InstanceSpecification = InstanceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotsRequest]
  }
  
  @scala.inline
  implicit class CreateSnapshotsRequestMutableBuilder[Self <: CreateSnapshotsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyTagsFromSource(value: CopyTagsFromSource): Self = StObject.set(x, "CopyTagsFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsFromSourceUndefined: Self = StObject.set(x, "CopyTagsFromSource", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceSpecification(value: InstanceSpecification): Self = StObject.set(x, "InstanceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}

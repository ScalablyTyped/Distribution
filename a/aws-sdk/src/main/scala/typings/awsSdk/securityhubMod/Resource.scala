package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  /**
    * Additional details about the resource related to a finding.
    */
  var Details: js.UndefOr[ResourceDetails] = js.native
  
  /**
    * The canonical identifier for the given resource type.
    */
  var Id: NonEmptyString = js.native
  
  /**
    * The canonical AWS partition name that the Region is assigned to.
    */
  var Partition: js.UndefOr[typings.awsSdk.securityhubMod.Partition] = js.native
  
  /**
    * The canonical AWS external Region name where this resource is located.
    */
  var Region: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var ResourceRole: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var Tags: js.UndefOr[FieldMap] = js.native
  
  /**
    * The type of the resource that details are provided for. If possible, set Type to one of the supported resource types. For example, if the resource is an EC2 instance, then set Type to AwsEc2Instance. If the resource does not match any of the provided types, then set Type to Other. 
    */
  var Type: NonEmptyString = js.native
}
object Resource {
  
  @scala.inline
  def apply(Id: NonEmptyString, Type: NonEmptyString): Resource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: ResourceDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: Partition): Self = StObject.set(x, "Partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "Partition", js.undefined)
    
    @scala.inline
    def setRegion(value: NonEmptyString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setResourceRole(value: NonEmptyString): Self = StObject.set(x, "ResourceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRoleUndefined: Self = StObject.set(x, "ResourceRole", js.undefined)
    
    @scala.inline
    def setTags(value: FieldMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

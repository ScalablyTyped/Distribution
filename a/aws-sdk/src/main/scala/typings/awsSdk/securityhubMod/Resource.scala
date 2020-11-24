package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends js.Object {
  
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
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: ResourceDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setPartition(value: Partition): Self = this.set("Partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("Partition", js.undefined)
    
    @scala.inline
    def setRegion(value: NonEmptyString): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setResourceRole(value: NonEmptyString): Self = this.set("ResourceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRole: Self = this.set("ResourceRole", js.undefined)
    
    @scala.inline
    def setTags(value: FieldMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}

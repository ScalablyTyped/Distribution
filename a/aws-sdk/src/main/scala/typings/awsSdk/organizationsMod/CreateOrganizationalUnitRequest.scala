package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrganizationalUnitRequest extends js.Object {
  
  /**
    * The friendly name to assign to the new OU.
    */
  var Name: OrganizationalUnitName = js.native
  
  /**
    * The unique identifier (ID) of the parent root or OU that you want to create the new OU in. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var ParentId: typings.awsSdk.organizationsMod.ParentId = js.native
  
  /**
    * A list of tags that you want to attach to the newly created OU. For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to null. For more information about tagging, see Tagging AWS Organizations resources in the AWS Organizations User Guide.  If any one of the tags is invalid or if you exceed the allowed number of tags for an OU, then the entire request fails and the OU is not created. 
    */
  var Tags: js.UndefOr[typings.awsSdk.organizationsMod.Tags] = js.native
}
object CreateOrganizationalUnitRequest {
  
  @scala.inline
  def apply(Name: OrganizationalUnitName, ParentId: ParentId): CreateOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ParentId = ParentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationalUnitRequest]
  }
  
  @scala.inline
  implicit class CreateOrganizationalUnitRequestOps[Self <: CreateOrganizationalUnitRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: OrganizationalUnitName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: ParentId): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}

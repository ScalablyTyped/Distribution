package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activity extends js.Object {
  
  /**
    * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
    */
  var CommentMetadata: js.UndefOr[typings.awsSdk.workdocsMod.CommentMetadata] = js.native
  
  /**
    * The user who performed the action.
    */
  var Initiator: js.UndefOr[UserMetadata] = js.native
  
  /**
    * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
    */
  var IsIndirectActivity: js.UndefOr[BooleanType] = js.native
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  
  /**
    * The original parent of the resource. This is an optional field and is filled for move activities.
    */
  var OriginalParent: js.UndefOr[ResourceMetadata] = js.native
  
  /**
    * The list of users or groups impacted by this action. This is an optional field and is filled for the following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
    */
  var Participants: js.UndefOr[typings.awsSdk.workdocsMod.Participants] = js.native
  
  /**
    * The metadata of the resource involved in the user action.
    */
  var ResourceMetadata: js.UndefOr[typings.awsSdk.workdocsMod.ResourceMetadata] = js.native
  
  /**
    * The timestamp when the action was performed.
    */
  var TimeStamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The activity type.
    */
  var Type: js.UndefOr[ActivityType] = js.native
}
object Activity {
  
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    
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
    def setCommentMetadata(value: CommentMetadata): Self = this.set("CommentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentMetadata: Self = this.set("CommentMetadata", js.undefined)
    
    @scala.inline
    def setInitiator(value: UserMetadata): Self = this.set("Initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("Initiator", js.undefined)
    
    @scala.inline
    def setIsIndirectActivity(value: BooleanType): Self = this.set("IsIndirectActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIndirectActivity: Self = this.set("IsIndirectActivity", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    
    @scala.inline
    def setOriginalParent(value: ResourceMetadata): Self = this.set("OriginalParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalParent: Self = this.set("OriginalParent", js.undefined)
    
    @scala.inline
    def setParticipants(value: Participants): Self = this.set("Participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipants: Self = this.set("Participants", js.undefined)
    
    @scala.inline
    def setResourceMetadata(value: ResourceMetadata): Self = this.set("ResourceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceMetadata: Self = this.set("ResourceMetadata", js.undefined)
    
    @scala.inline
    def setTimeStamp(value: TimestampType): Self = this.set("TimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStamp: Self = this.set("TimeStamp", js.undefined)
    
    @scala.inline
    def setType(value: ActivityType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}

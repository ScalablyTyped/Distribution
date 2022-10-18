package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  /**
    * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
    */
  var CommentMetadata: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.CommentMetadata] = js.undefined
  
  /**
    * The user who performed the action.
    */
  var Initiator: js.UndefOr[UserMetadata] = js.undefined
  
  /**
    * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
    */
  var IsIndirectActivity: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The original parent of the resource. This is an optional field and is filled for move activities.
    */
  var OriginalParent: js.UndefOr[ResourceMetadata] = js.undefined
  
  /**
    * The list of users or groups impacted by this action. This is an optional field and is filled for the following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
    */
  var Participants: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.Participants] = js.undefined
  
  /**
    * The metadata of the resource involved in the user action.
    */
  var ResourceMetadata: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.ResourceMetadata] = js.undefined
  
  /**
    * The timestamp when the action was performed.
    */
  var TimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The activity type.
    */
  var Type: js.UndefOr[ActivityType] = js.undefined
}
object Activity {
  
  inline def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  
  extension [Self <: Activity](x: Self) {
    
    inline def setCommentMetadata(value: CommentMetadata): Self = StObject.set(x, "CommentMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommentMetadataUndefined: Self = StObject.set(x, "CommentMetadata", js.undefined)
    
    inline def setInitiator(value: UserMetadata): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
    
    inline def setIsIndirectActivity(value: BooleanType): Self = StObject.set(x, "IsIndirectActivity", value.asInstanceOf[js.Any])
    
    inline def setIsIndirectActivityUndefined: Self = StObject.set(x, "IsIndirectActivity", js.undefined)
    
    inline def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setOriginalParent(value: ResourceMetadata): Self = StObject.set(x, "OriginalParent", value.asInstanceOf[js.Any])
    
    inline def setOriginalParentUndefined: Self = StObject.set(x, "OriginalParent", js.undefined)
    
    inline def setParticipants(value: Participants): Self = StObject.set(x, "Participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "Participants", js.undefined)
    
    inline def setResourceMetadata(value: ResourceMetadata): Self = StObject.set(x, "ResourceMetadata", value.asInstanceOf[js.Any])
    
    inline def setResourceMetadataUndefined: Self = StObject.set(x, "ResourceMetadata", js.undefined)
    
    inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
    
    inline def setTimeStampUndefined: Self = StObject.set(x, "TimeStamp", js.undefined)
    
    inline def setType(value: ActivityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

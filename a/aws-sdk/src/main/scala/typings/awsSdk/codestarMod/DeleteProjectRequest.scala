package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectRequest extends StObject {
  
  /**
    * A user- or system-generated token that identifies the entity that requested project deletion. This token can be used to repeat the request. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the project and its resources. This option will delete all AWS resources for the project (except for any buckets in Amazon S3) as well as deleting the project itself. Recommended for most use cases.
    */
  var deleteStack: js.UndefOr[DeleteStack] = js.undefined
  
  /**
    * The ID of the project to be deleted in AWS CodeStar.
    */
  var id: ProjectId
}
object DeleteProjectRequest {
  
  @scala.inline
  def apply(id: ProjectId): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  
  @scala.inline
  implicit class DeleteProjectRequestMutableBuilder[Self <: DeleteProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setDeleteStack(value: DeleteStack): Self = StObject.set(x, "deleteStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteStackUndefined: Self = StObject.set(x, "deleteStack", js.undefined)
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

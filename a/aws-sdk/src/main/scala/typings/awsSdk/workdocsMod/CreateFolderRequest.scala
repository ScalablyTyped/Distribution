package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The name of the new folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: ResourceIdType
}
object CreateFolderRequest {
  
  @scala.inline
  def apply(ParentFolderId: ResourceIdType): CreateFolderRequest = {
    val __obj = js.Dynamic.literal(ParentFolderId = ParentFolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderRequest]
  }
  
  @scala.inline
  implicit class CreateFolderRequestMutableBuilder[Self <: CreateFolderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
  }
}

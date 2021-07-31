package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFolderPathRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * A comma-separated list of values. Specify "NAME" to include the names of the parent folders.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var FolderId: IdType
  
  /**
    * The maximum number of levels in the hierarchy to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * This value is not supported.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}
object GetFolderPathRequest {
  
  @scala.inline
  def apply(FolderId: IdType): GetFolderPathRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderPathRequest]
  }
  
  @scala.inline
  implicit class GetFolderPathRequestMutableBuilder[Self <: GetFolderPathRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setFields(value: FieldNamesType): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    @scala.inline
    def setFolderId(value: IdType): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}

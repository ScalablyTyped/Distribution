package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseItem extends StObject {
  
  /**
    * The comment that matches the query.
    */
  var CommentMetadata: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.CommentMetadata] = js.undefined
  
  /**
    * The document that matches the query.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.DocumentMetadata] = js.undefined
  
  /**
    * The document version that matches the metadata.
    */
  var DocumentVersionMetadata: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.DocumentVersionMetadata] = js.undefined
  
  /**
    * The folder that matches the query.
    */
  var FolderMetadata: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.FolderMetadata] = js.undefined
  
  /**
    * The type of item being returned.
    */
  var ResourceType: js.UndefOr[ResponseItemType] = js.undefined
  
  /**
    * The webUrl of the item being returned.
    */
  var WebUrl: js.UndefOr[ResponseItemWebUrl] = js.undefined
}
object ResponseItem {
  
  inline def apply(): ResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseItem] (val x: Self) extends AnyVal {
    
    inline def setCommentMetadata(value: CommentMetadata): Self = StObject.set(x, "CommentMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommentMetadataUndefined: Self = StObject.set(x, "CommentMetadata", js.undefined)
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setDocumentVersionMetadata(value: DocumentVersionMetadata): Self = StObject.set(x, "DocumentVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionMetadataUndefined: Self = StObject.set(x, "DocumentVersionMetadata", js.undefined)
    
    inline def setFolderMetadata(value: FolderMetadata): Self = StObject.set(x, "FolderMetadata", value.asInstanceOf[js.Any])
    
    inline def setFolderMetadataUndefined: Self = StObject.set(x, "FolderMetadata", js.undefined)
    
    inline def setResourceType(value: ResponseItemType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setWebUrl(value: ResponseItemWebUrl): Self = StObject.set(x, "WebUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "WebUrl", js.undefined)
  }
}

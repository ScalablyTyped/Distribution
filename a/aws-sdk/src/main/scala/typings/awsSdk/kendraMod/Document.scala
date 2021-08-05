package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /**
    * Information to use for user context filtering.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.undefined
  
  /**
    * Custom attributes to apply to the document. Use the custom attributes to provide additional information for searching, to provide facets for refining searches, and to provide additional information in the query response.
    */
  var Attributes: js.UndefOr[DocumentAttributeList] = js.undefined
  
  /**
    * The contents of the document.  Documents passed to the Blob parameter must be base64 encoded. Your code might not need to encode the document file bytes if you're using an AWS SDK to call Amazon Kendra operations. If you are calling the Amazon Kendra endpoint directly using REST, you must base64 encode the contents before sending.
    */
  var Blob: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The file type of the document in the Blob field.
    */
  var ContentType: js.UndefOr[typings.awsSdk.kendraMod.ContentType] = js.undefined
  
  /**
    * A unique identifier of the document in the index.
    */
  var Id: DocumentId
  
  var S3Path: js.UndefOr[typings.awsSdk.kendraMod.S3Path] = js.undefined
  
  /**
    * The title of the document.
    */
  var Title: js.UndefOr[typings.awsSdk.kendraMod.Title] = js.undefined
}
object Document {
  
  inline def apply(Id: DocumentId): Document = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setAccessControlList(value: PrincipalList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setAccessControlListVarargs(value: Principal*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
    
    inline def setAttributes(value: DocumentAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: DocumentAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    inline def setBlob(value: _Blob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "Blob", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setS3Path(value: S3Path): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    inline def setS3PathUndefined: Self = StObject.set(x, "S3Path", js.undefined)
    
    inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}

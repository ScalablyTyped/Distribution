package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentRequest extends StObject {
  
  /**
    * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.undefined
  
  /**
    * The document version for which you want information.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN
  
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and can't be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object GetDocumentRequest {
  
  @scala.inline
  def apply(Name: DocumentARN): GetDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentRequest]
  }
  
  @scala.inline
  implicit class GetDocumentRequestMutableBuilder[Self <: GetDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentFormat(value: DocumentFormat): Self = StObject.set(x, "DocumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFormatUndefined: Self = StObject.set(x, "DocumentFormat", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}

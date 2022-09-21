package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSSMDocumentDetails extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you use the Document Name, Config checks only your account and region for the SSM document. If you want to use an SSM document from another region or account, you must provide the ARN.
    */
  var DocumentName: SSMDocumentName
  
  /**
    * The version of the SSM document to use to create a conformance pack. By default, Config uses the latest version.  This field is optional. 
    */
  var DocumentVersion: js.UndefOr[SSMDocumentVersion] = js.undefined
}
object TemplateSSMDocumentDetails {
  
  inline def apply(DocumentName: SSMDocumentName): TemplateSSMDocumentDetails = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSSMDocumentDetails]
  }
  
  extension [Self <: TemplateSSMDocumentDetails](x: Self) {
    
    inline def setDocumentName(value: SSMDocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersion(value: SSMDocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
  }
}

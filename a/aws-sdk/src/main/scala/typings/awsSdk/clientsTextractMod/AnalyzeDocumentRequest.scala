package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeDocumentRequest extends StObject {
  
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPEG, PNG, PDF, or TIFF format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes that are passed using the Bytes field. 
    */
  var Document: typings.awsSdk.clientsTextractMod.Document
  
  /**
    * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that are detected in the input document. Add FORMS to return detected form data. Add SIGNATURES to return the locations of detected signatures. To perform both forms and table analysis, add TABLES and FORMS to FeatureTypes. To detect signatures within form data and table data, add SIGNATURES to either TABLES or FORMS. All lines and words detected in the document are included in the response (including text that isn't related to the value of FeatureTypes). 
    */
  var FeatureTypes: typings.awsSdk.clientsTextractMod.FeatureTypes
  
  /**
    * Sets the configuration for the human in the loop workflow for analyzing documents.
    */
  var HumanLoopConfig: js.UndefOr[typings.awsSdk.clientsTextractMod.HumanLoopConfig] = js.undefined
  
  /**
    * Contains Queries and the alias for those Queries, as determined by the input. 
    */
  var QueriesConfig: js.UndefOr[typings.awsSdk.clientsTextractMod.QueriesConfig] = js.undefined
}
object AnalyzeDocumentRequest {
  
  inline def apply(Document: Document, FeatureTypes: FeatureTypes): AnalyzeDocumentRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], FeatureTypes = FeatureTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeDocumentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyzeDocumentRequest] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypes(value: FeatureTypes): Self = StObject.set(x, "FeatureTypes", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypesVarargs(value: FeatureType*): Self = StObject.set(x, "FeatureTypes", js.Array(value*))
    
    inline def setHumanLoopConfig(value: HumanLoopConfig): Self = StObject.set(x, "HumanLoopConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopConfigUndefined: Self = StObject.set(x, "HumanLoopConfig", js.undefined)
    
    inline def setQueriesConfig(value: QueriesConfig): Self = StObject.set(x, "QueriesConfig", value.asInstanceOf[js.Any])
    
    inline def setQueriesConfigUndefined: Self = StObject.set(x, "QueriesConfig", js.undefined)
  }
}

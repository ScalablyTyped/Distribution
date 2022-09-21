package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReaderConfig extends StObject {
  
  /**
    * This enum field will start with two values which will apply to PDFs:    TEXTRACT_DETECT_DOCUMENT_TEXT - The service calls DetectDocumentText for PDF documents per page.    TEXTRACT_ANALYZE_DOCUMENT - The service calls AnalyzeDocument for PDF documents per page.  
    */
  var DocumentReadAction: typings.awsSdk.comprehendMod.DocumentReadAction
  
  /**
    * This enum field provides two values:    SERVICE_DEFAULT - use service defaults for Document reading. For Digital PDF it would mean using an internal parser instead of Textract APIs    FORCE_DOCUMENT_READ_ACTION - Always use specified action for DocumentReadAction, including Digital PDF.   
    */
  var DocumentReadMode: js.UndefOr[typings.awsSdk.comprehendMod.DocumentReadMode] = js.undefined
  
  /**
    * Specifies how the text in an input file should be processed:
    */
  var FeatureTypes: js.UndefOr[ListOfDocumentReadFeatureTypes] = js.undefined
}
object DocumentReaderConfig {
  
  inline def apply(DocumentReadAction: DocumentReadAction): DocumentReaderConfig = {
    val __obj = js.Dynamic.literal(DocumentReadAction = DocumentReadAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReaderConfig]
  }
  
  extension [Self <: DocumentReaderConfig](x: Self) {
    
    inline def setDocumentReadAction(value: DocumentReadAction): Self = StObject.set(x, "DocumentReadAction", value.asInstanceOf[js.Any])
    
    inline def setDocumentReadMode(value: DocumentReadMode): Self = StObject.set(x, "DocumentReadMode", value.asInstanceOf[js.Any])
    
    inline def setDocumentReadModeUndefined: Self = StObject.set(x, "DocumentReadMode", js.undefined)
    
    inline def setFeatureTypes(value: ListOfDocumentReadFeatureTypes): Self = StObject.set(x, "FeatureTypes", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypesUndefined: Self = StObject.set(x, "FeatureTypes", js.undefined)
    
    inline def setFeatureTypesVarargs(value: DocumentReadFeatureTypes*): Self = StObject.set(x, "FeatureTypes", js.Array(value*))
  }
}

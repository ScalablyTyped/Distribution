package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentGroup extends StObject {
  
  /**
    * A list of the detected signatures found in a document group.
    */
  var DetectedSignatures: js.UndefOr[DetectedSignatureList] = js.undefined
  
  /**
    * An array that contains information about the pages of a document, defined by logical boundary.
    */
  var SplitDocuments: js.UndefOr[SplitDocumentList] = js.undefined
  
  /**
    * The type of document that Amazon Textract has detected. See Analyze Lending Response Objects for a list of all types returned by Textract.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of any expected signatures not found in a document group.
    */
  var UndetectedSignatures: js.UndefOr[UndetectedSignatureList] = js.undefined
}
object DocumentGroup {
  
  inline def apply(): DocumentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentGroup] (val x: Self) extends AnyVal {
    
    inline def setDetectedSignatures(value: DetectedSignatureList): Self = StObject.set(x, "DetectedSignatures", value.asInstanceOf[js.Any])
    
    inline def setDetectedSignaturesUndefined: Self = StObject.set(x, "DetectedSignatures", js.undefined)
    
    inline def setDetectedSignaturesVarargs(value: DetectedSignature*): Self = StObject.set(x, "DetectedSignatures", js.Array(value*))
    
    inline def setSplitDocuments(value: SplitDocumentList): Self = StObject.set(x, "SplitDocuments", value.asInstanceOf[js.Any])
    
    inline def setSplitDocumentsUndefined: Self = StObject.set(x, "SplitDocuments", js.undefined)
    
    inline def setSplitDocumentsVarargs(value: SplitDocument*): Self = StObject.set(x, "SplitDocuments", js.Array(value*))
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUndetectedSignatures(value: UndetectedSignatureList): Self = StObject.set(x, "UndetectedSignatures", value.asInstanceOf[js.Any])
    
    inline def setUndetectedSignaturesUndefined: Self = StObject.set(x, "UndetectedSignatures", js.undefined)
    
    inline def setUndetectedSignaturesVarargs(value: UndetectedSignature*): Self = StObject.set(x, "UndetectedSignatures", js.Array(value*))
  }
}

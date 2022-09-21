package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationResult extends StObject {
  
  /**
    * Specifies whether Amazon Macie detected additional occurrences of sensitive data in the S3 object. A finding includes location data for a maximum of 15 occurrences of sensitive data. This value can help you determine whether to investigate additional occurrences of sensitive data in an object. You can do this by referring to the corresponding sensitive data discovery result for the finding (ClassificationDetails.detailedResultsLocation).
    */
  var additionalOccurrences: js.UndefOr[boolean] = js.undefined
  
  /**
    * The custom data identifiers that detected the sensitive data and the number of occurrences of the data that they detected.
    */
  var customDataIdentifiers: js.UndefOr[CustomDataIdentifiers] = js.undefined
  
  /**
    * The type of content, as a MIME type, that the finding applies to. For example, application/gzip, for a GNU Gzip compressed archive file, or application/pdf, for an Adobe Portable Document Format file.
    */
  var mimeType: js.UndefOr[string] = js.undefined
  
  /**
    * The category, types, and number of occurrences of the sensitive data that produced the finding.
    */
  var sensitiveData: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * The total size, in bytes, of the data that the finding applies to.
    */
  var sizeClassified: js.UndefOr[long] = js.undefined
  
  /**
    * The status of the finding.
    */
  var status: js.UndefOr[ClassificationResultStatus] = js.undefined
}
object ClassificationResult {
  
  inline def apply(): ClassificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationResult]
  }
  
  extension [Self <: ClassificationResult](x: Self) {
    
    inline def setAdditionalOccurrences(value: boolean): Self = StObject.set(x, "additionalOccurrences", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOccurrencesUndefined: Self = StObject.set(x, "additionalOccurrences", js.undefined)
    
    inline def setCustomDataIdentifiers(value: CustomDataIdentifiers): Self = StObject.set(x, "customDataIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setCustomDataIdentifiersUndefined: Self = StObject.set(x, "customDataIdentifiers", js.undefined)
    
    inline def setMimeType(value: string): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setSensitiveData(value: SensitiveData): Self = StObject.set(x, "sensitiveData", value.asInstanceOf[js.Any])
    
    inline def setSensitiveDataUndefined: Self = StObject.set(x, "sensitiveData", js.undefined)
    
    inline def setSensitiveDataVarargs(value: SensitiveDataItem*): Self = StObject.set(x, "sensitiveData", js.Array(value*))
    
    inline def setSizeClassified(value: long): Self = StObject.set(x, "sizeClassified", value.asInstanceOf[js.Any])
    
    inline def setSizeClassifiedUndefined: Self = StObject.set(x, "sizeClassified", js.undefined)
    
    inline def setStatus(value: ClassificationResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSensitiveDataOccurrencesAvailabilityResponse extends StObject {
  
  /**
    * Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are: AVAILABLE, the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved. If this value is UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
    */
  var code: js.UndefOr[AvailabilityCode] = js.undefined
  
  /**
    * Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are: INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve. There isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data discovery result specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't available, is malformed or corrupted, or uses an unsupported storage format. OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for retrieving occurrences of sensitive data. OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or deleted. Or the object was changed after Macie created the finding. UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding. UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support for retrieving occurrences of sensitive data. This value is null if sensitive data can be retrieved for the finding.
    */
  var reasons: js.UndefOr[listOfUnavailabilityReasonCode] = js.undefined
}
object GetSensitiveDataOccurrencesAvailabilityResponse {
  
  inline def apply(): GetSensitiveDataOccurrencesAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSensitiveDataOccurrencesAvailabilityResponse]
  }
  
  extension [Self <: GetSensitiveDataOccurrencesAvailabilityResponse](x: Self) {
    
    inline def setCode(value: AvailabilityCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReasons(value: listOfUnavailabilityReasonCode): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: UnavailabilityReasonCode*): Self = StObject.set(x, "reasons", js.Array(value*))
  }
}

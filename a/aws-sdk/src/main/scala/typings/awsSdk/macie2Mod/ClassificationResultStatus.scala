package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationResultStatus extends StObject {
  
  /**
    *  The status of the finding. Possible values are: COMPLETE - Amazon Macie successfully completed its analysis of the object that the finding applies to. PARTIAL - Macie analyzed only a subset of the data in the object that the finding applies to. For example, the object is an archive file that contains files in an unsupported format. SKIPPED - Macie wasn't able to analyze the object that the finding applies to. For example, the object is a malformed file or a file that uses an unsupported format.
    */
  var code: js.UndefOr[string] = js.undefined
  
  /**
    * A brief description of the status of the finding. Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact your analysis of the finding.
    */
  var reason: js.UndefOr[string] = js.undefined
}
object ClassificationResultStatus {
  
  inline def apply(): ClassificationResultStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationResultStatus]
  }
  
  extension [Self <: ClassificationResultStatus](x: Self) {
    
    inline def setCode(value: string): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: string): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}

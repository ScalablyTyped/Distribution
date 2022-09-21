package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorModelAnalysisResponse extends StObject {
  
  /**
    * The status of the analysis activity. The status can be one of the following values:    RUNNING - AWS IoT Events is analyzing your detector model. This process can take several minutes to complete.    COMPLETE - AWS IoT Events finished analyzing your detector model.    FAILED - AWS IoT Events couldn't analyze your detector model. Try again later.  
    */
  var status: js.UndefOr[AnalysisStatus] = js.undefined
}
object DescribeDetectorModelAnalysisResponse {
  
  inline def apply(): DescribeDetectorModelAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorModelAnalysisResponse]
  }
  
  extension [Self <: DescribeDetectorModelAnalysisResponse](x: Self) {
    
    inline def setStatus(value: AnalysisStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

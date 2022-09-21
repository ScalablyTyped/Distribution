package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorModelAnalysisRequest extends StObject {
  
  /**
    * The ID of the analysis result that you want to retrieve.
    */
  var analysisId: AnalysisId
}
object DescribeDetectorModelAnalysisRequest {
  
  inline def apply(analysisId: AnalysisId): DescribeDetectorModelAnalysisRequest = {
    val __obj = js.Dynamic.literal(analysisId = analysisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorModelAnalysisRequest]
  }
  
  extension [Self <: DescribeDetectorModelAnalysisRequest](x: Self) {
    
    inline def setAnalysisId(value: AnalysisId): Self = StObject.set(x, "analysisId", value.asInstanceOf[js.Any])
  }
}

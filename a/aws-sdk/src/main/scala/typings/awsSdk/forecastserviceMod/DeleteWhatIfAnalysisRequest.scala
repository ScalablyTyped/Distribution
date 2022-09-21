package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWhatIfAnalysisRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if analysis that you want to delete.
    */
  var WhatIfAnalysisArn: Arn
}
object DeleteWhatIfAnalysisRequest {
  
  inline def apply(WhatIfAnalysisArn: Arn): DeleteWhatIfAnalysisRequest = {
    val __obj = js.Dynamic.literal(WhatIfAnalysisArn = WhatIfAnalysisArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWhatIfAnalysisRequest]
  }
  
  extension [Self <: DeleteWhatIfAnalysisRequest](x: Self) {
    
    inline def setWhatIfAnalysisArn(value: Arn): Self = StObject.set(x, "WhatIfAnalysisArn", value.asInstanceOf[js.Any])
  }
}

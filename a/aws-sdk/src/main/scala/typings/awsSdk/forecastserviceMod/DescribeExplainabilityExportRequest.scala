package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExplainabilityExportRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability export.
    */
  var ExplainabilityExportArn: Arn
}
object DescribeExplainabilityExportRequest {
  
  inline def apply(ExplainabilityExportArn: Arn): DescribeExplainabilityExportRequest = {
    val __obj = js.Dynamic.literal(ExplainabilityExportArn = ExplainabilityExportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExplainabilityExportRequest]
  }
  
  extension [Self <: DescribeExplainabilityExportRequest](x: Self) {
    
    inline def setExplainabilityExportArn(value: Arn): Self = StObject.set(x, "ExplainabilityExportArn", value.asInstanceOf[js.Any])
  }
}

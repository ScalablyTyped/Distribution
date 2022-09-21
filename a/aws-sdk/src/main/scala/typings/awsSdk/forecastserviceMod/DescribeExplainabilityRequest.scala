package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExplainabilityRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Explaianability to describe.
    */
  var ExplainabilityArn: Arn
}
object DescribeExplainabilityRequest {
  
  inline def apply(ExplainabilityArn: Arn): DescribeExplainabilityRequest = {
    val __obj = js.Dynamic.literal(ExplainabilityArn = ExplainabilityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExplainabilityRequest]
  }
  
  extension [Self <: DescribeExplainabilityRequest](x: Self) {
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
  }
}

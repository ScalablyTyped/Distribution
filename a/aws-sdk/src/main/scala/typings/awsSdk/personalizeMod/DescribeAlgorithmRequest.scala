package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlgorithmRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm to describe.
    */
  var algorithmArn: Arn
}
object DescribeAlgorithmRequest {
  
  inline def apply(algorithmArn: Arn): DescribeAlgorithmRequest = {
    val __obj = js.Dynamic.literal(algorithmArn = algorithmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmRequest]
  }
  
  extension [Self <: DescribeAlgorithmRequest](x: Self) {
    
    inline def setAlgorithmArn(value: Arn): Self = StObject.set(x, "algorithmArn", value.asInstanceOf[js.Any])
  }
}

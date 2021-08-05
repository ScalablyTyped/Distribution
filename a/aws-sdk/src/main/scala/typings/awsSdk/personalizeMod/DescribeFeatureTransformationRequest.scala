package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeatureTransformationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the feature transformation to describe.
    */
  var featureTransformationArn: Arn
}
object DescribeFeatureTransformationRequest {
  
  inline def apply(featureTransformationArn: Arn): DescribeFeatureTransformationRequest = {
    val __obj = js.Dynamic.literal(featureTransformationArn = featureTransformationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureTransformationRequest]
  }
  
  extension [Self <: DescribeFeatureTransformationRequest](x: Self) {
    
    inline def setFeatureTransformationArn(value: Arn): Self = StObject.set(x, "featureTransformationArn", value.asInstanceOf[js.Any])
  }
}

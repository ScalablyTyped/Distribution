package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeatureTransformationResponse extends StObject {
  
  /**
    * A listing of the FeatureTransformation properties.
    */
  var featureTransformation: js.UndefOr[FeatureTransformation] = js.undefined
}
object DescribeFeatureTransformationResponse {
  
  @scala.inline
  def apply(): DescribeFeatureTransformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFeatureTransformationResponse]
  }
  
  @scala.inline
  implicit class DescribeFeatureTransformationResponseMutableBuilder[Self <: DescribeFeatureTransformationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureTransformation(value: FeatureTransformation): Self = StObject.set(x, "featureTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTransformationUndefined: Self = StObject.set(x, "featureTransformation", js.undefined)
  }
}

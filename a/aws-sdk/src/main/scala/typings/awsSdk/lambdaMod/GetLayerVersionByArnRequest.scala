package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayerVersionByArnRequest extends StObject {
  
  /**
    * The ARN of the layer version.
    */
  var Arn: LayerVersionArn
}
object GetLayerVersionByArnRequest {
  
  inline def apply(Arn: LayerVersionArn): GetLayerVersionByArnRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionByArnRequest]
  }
  
  extension [Self <: GetLayerVersionByArnRequest](x: Self) {
    
    inline def setArn(value: LayerVersionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}

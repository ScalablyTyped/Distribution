package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLayerVersionByArnRequest extends StObject {
  
  /**
    * The ARN of the layer version.
    */
  var Arn: LayerVersionArn = js.native
}
object GetLayerVersionByArnRequest {
  
  @scala.inline
  def apply(Arn: LayerVersionArn): GetLayerVersionByArnRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionByArnRequest]
  }
  
  @scala.inline
  implicit class GetLayerVersionByArnRequestMutableBuilder[Self <: GetLayerVersionByArnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: LayerVersionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}

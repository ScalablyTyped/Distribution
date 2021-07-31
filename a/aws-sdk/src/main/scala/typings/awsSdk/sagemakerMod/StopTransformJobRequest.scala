package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTransformJobRequest extends StObject {
  
  /**
    * The name of the transform job to stop.
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName
}
object StopTransformJobRequest {
  
  @scala.inline
  def apply(TransformJobName: TransformJobName): StopTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTransformJobRequest]
  }
  
  @scala.inline
  implicit class StopTransformJobRequestMutableBuilder[Self <: StopTransformJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
  }
}

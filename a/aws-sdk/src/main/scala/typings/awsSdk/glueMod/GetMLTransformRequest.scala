package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMLTransformRequest extends StObject {
  
  /**
    * The unique identifier of the transform, generated at the time that the transform was created.
    */
  var TransformId: HashString
}
object GetMLTransformRequest {
  
  @scala.inline
  def apply(TransformId: HashString): GetMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformRequest]
  }
  
  @scala.inline
  implicit class GetMLTransformRequestMutableBuilder[Self <: GetMLTransformRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}

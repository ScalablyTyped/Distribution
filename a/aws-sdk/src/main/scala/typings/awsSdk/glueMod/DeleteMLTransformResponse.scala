package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMLTransformResponse extends StObject {
  
  /**
    * The unique identifier of the transform that was deleted.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}
object DeleteMLTransformResponse {
  
  @scala.inline
  def apply(): DeleteMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMLTransformResponse]
  }
  
  @scala.inline
  implicit class DeleteMLTransformResponseMutableBuilder[Self <: DeleteMLTransformResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}

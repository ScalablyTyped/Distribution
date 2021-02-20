package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMLTransformResponse extends StObject {
  
  /**
    * A unique identifier that is generated for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}
object CreateMLTransformResponse {
  
  @scala.inline
  def apply(): CreateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMLTransformResponse]
  }
  
  @scala.inline
  implicit class CreateMLTransformResponseMutableBuilder[Self <: CreateMLTransformResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}

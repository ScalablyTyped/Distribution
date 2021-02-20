package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDimensionRequest extends StObject {
  
  /**
    * The unique identifier for the dimension that you want to delete.
    */
  var name: DimensionName = js.native
}
object DeleteDimensionRequest {
  
  @scala.inline
  def apply(name: DimensionName): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
  
  @scala.inline
  implicit class DeleteDimensionRequestMutableBuilder[Self <: DeleteDimensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

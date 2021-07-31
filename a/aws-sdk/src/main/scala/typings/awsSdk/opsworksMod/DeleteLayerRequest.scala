package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLayerRequest extends StObject {
  
  /**
    * The layer ID.
    */
  var LayerId: String
}
object DeleteLayerRequest {
  
  @scala.inline
  def apply(LayerId: String): DeleteLayerRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLayerRequest]
  }
  
  @scala.inline
  implicit class DeleteLayerRequestMutableBuilder[Self <: DeleteLayerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
  }
}

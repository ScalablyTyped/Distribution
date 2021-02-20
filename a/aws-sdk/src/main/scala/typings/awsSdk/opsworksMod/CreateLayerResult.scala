package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLayerResult extends StObject {
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
}
object CreateLayerResult {
  
  @scala.inline
  def apply(): CreateLayerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLayerResult]
  }
  
  @scala.inline
  implicit class CreateLayerResultMutableBuilder[Self <: CreateLayerResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "LayerId", js.undefined)
  }
}

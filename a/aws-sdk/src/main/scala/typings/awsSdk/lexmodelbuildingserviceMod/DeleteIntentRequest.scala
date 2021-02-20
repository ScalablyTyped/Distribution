package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIntentRequest extends StObject {
  
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName = js.native
}
object DeleteIntentRequest {
  
  @scala.inline
  def apply(name: IntentName): DeleteIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntentRequest]
  }
  
  @scala.inline
  implicit class DeleteIntentRequestMutableBuilder[Self <: DeleteIntentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

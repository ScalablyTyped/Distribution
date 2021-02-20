package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIntentRequest extends StObject {
  
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName = js.native
  
  /**
    * The version of the intent.
    */
  var version: Version = js.native
}
object GetIntentRequest {
  
  @scala.inline
  def apply(name: IntentName, version: Version): GetIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntentRequest]
  }
  
  @scala.inline
  implicit class GetIntentRequestMutableBuilder[Self <: GetIntentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

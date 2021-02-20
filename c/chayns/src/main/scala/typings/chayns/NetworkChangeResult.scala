package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setNetworkChangeCallback()
@js.native
trait NetworkChangeResult extends StObject {
  
  var isConnected: Boolean = js.native
  
  var `type`: Double = js.native
}
object NetworkChangeResult {
  
  @scala.inline
  def apply(isConnected: Boolean, `type`: Double): NetworkChangeResult = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkChangeResult]
  }
  
  @scala.inline
  implicit class NetworkChangeResultMutableBuilder[Self <: NetworkChangeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

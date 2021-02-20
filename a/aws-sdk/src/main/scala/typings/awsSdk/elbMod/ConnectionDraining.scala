package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionDraining extends StObject {
  
  /**
    * Specifies whether connection draining is enabled for the load balancer.
    */
  var Enabled: ConnectionDrainingEnabled = js.native
  
  /**
    * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
    */
  var Timeout: js.UndefOr[ConnectionDrainingTimeout] = js.native
}
object ConnectionDraining {
  
  @scala.inline
  def apply(Enabled: ConnectionDrainingEnabled): ConnectionDraining = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionDraining]
  }
  
  @scala.inline
  implicit class ConnectionDrainingMutableBuilder[Self <: ConnectionDraining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: ConnectionDrainingEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: ConnectionDrainingTimeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}

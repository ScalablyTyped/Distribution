package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Agent extends StObject {
  
  /**
    * Destroy any sockets that are currently in use by the agent.
    */
  def destroy(): Unit
  
  /**
    * For agents with keepAlive enabled, this sets the maximum number of sockets that will be left open in the free state.
    */
  var maxFreeSockets: Double
  
  /**
    * Determines how many concurrent sockets the agent can have open per origin.
    */
  var maxSockets: Double
  
  /**
    * An object which contains queues of requests that have not yet been assigned to sockets.
    */
  var requests: Any
  
  /**
    * An object which contains arrays of sockets currently in use by the agent.
    */
  var sockets: Any
}
object Agent {
  
  inline def apply(destroy: () => Unit, maxFreeSockets: Double, maxSockets: Double, requests: Any, sockets: Any): Agent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), maxFreeSockets = maxFreeSockets.asInstanceOf[js.Any], maxSockets = maxSockets.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: Any): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setSockets(value: Any): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
  }
}

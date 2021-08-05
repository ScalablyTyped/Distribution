package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeConfiguration extends StObject {
  
  /**
    * The maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
    */
  var GameSessionActivationTimeoutSeconds: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionActivationTimeoutSeconds] = js.undefined
  
  /**
    * The maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
    */
  var MaxConcurrentGameSessionActivations: js.UndefOr[typings.awsSdk.gameliftMod.MaxConcurrentGameSessionActivations] = js.undefined
  
  /**
    * A collection of server process configurations that describe which server processes to run on each instance in a fleet.
    */
  var ServerProcesses: js.UndefOr[ServerProcessList] = js.undefined
}
object RuntimeConfiguration {
  
  inline def apply(): RuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeConfiguration]
  }
  
  extension [Self <: RuntimeConfiguration](x: Self) {
    
    inline def setGameSessionActivationTimeoutSeconds(value: GameSessionActivationTimeoutSeconds): Self = StObject.set(x, "GameSessionActivationTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setGameSessionActivationTimeoutSecondsUndefined: Self = StObject.set(x, "GameSessionActivationTimeoutSeconds", js.undefined)
    
    inline def setMaxConcurrentGameSessionActivations(value: MaxConcurrentGameSessionActivations): Self = StObject.set(x, "MaxConcurrentGameSessionActivations", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentGameSessionActivationsUndefined: Self = StObject.set(x, "MaxConcurrentGameSessionActivations", js.undefined)
    
    inline def setServerProcesses(value: ServerProcessList): Self = StObject.set(x, "ServerProcesses", value.asInstanceOf[js.Any])
    
    inline def setServerProcessesUndefined: Self = StObject.set(x, "ServerProcesses", js.undefined)
    
    inline def setServerProcessesVarargs(value: ServerProcess*): Self = StObject.set(x, "ServerProcesses", js.Array(value :_*))
  }
}

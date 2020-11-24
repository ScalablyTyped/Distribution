package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeConfiguration extends js.Object {
  
  /**
    * The maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
    */
  var GameSessionActivationTimeoutSeconds: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionActivationTimeoutSeconds] = js.native
  
  /**
    * The maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
    */
  var MaxConcurrentGameSessionActivations: js.UndefOr[typings.awsSdk.gameliftMod.MaxConcurrentGameSessionActivations] = js.native
  
  /**
    * A collection of server process configurations that describe which server processes to run on each instance in a fleet.
    */
  var ServerProcesses: js.UndefOr[ServerProcessList] = js.native
}
object RuntimeConfiguration {
  
  @scala.inline
  def apply(): RuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeConfiguration]
  }
  
  @scala.inline
  implicit class RuntimeConfigurationOps[Self <: RuntimeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGameSessionActivationTimeoutSeconds(value: GameSessionActivationTimeoutSeconds): Self = this.set("GameSessionActivationTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionActivationTimeoutSeconds: Self = this.set("GameSessionActivationTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setMaxConcurrentGameSessionActivations(value: MaxConcurrentGameSessionActivations): Self = this.set("MaxConcurrentGameSessionActivations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentGameSessionActivations: Self = this.set("MaxConcurrentGameSessionActivations", js.undefined)
    
    @scala.inline
    def setServerProcessesVarargs(value: ServerProcess*): Self = this.set("ServerProcesses", js.Array(value :_*))
    
    @scala.inline
    def setServerProcesses(value: ServerProcessList): Self = this.set("ServerProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerProcesses: Self = this.set("ServerProcesses", js.undefined)
  }
}

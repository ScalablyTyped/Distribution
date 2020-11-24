package typings.broadcastChannel.leaderElectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("broadcast-channel/types/leader-election", "LeaderElector")
@js.native
class LeaderElector () extends js.Object {
  
  def applyOnce(): js.Promise[Boolean] = js.native
  
  def awaitLeadership(): js.Promise[Unit] = js.native
  
  def die(): js.Promise[Unit] = js.native
  
  val isDead: Boolean = js.native
  
  /**
    * IMPORTANT: The leader election is lazy,
    * it will not start before you call awaitLeadership()
    * so isLeader will never become true then
    */
  val isLeader: Boolean = js.native
  
  val token: String = js.native
}

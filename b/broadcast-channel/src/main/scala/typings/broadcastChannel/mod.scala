package typings.broadcastChannel

import typings.broadcastChannel.broadcastChannelBooleans.`false`
import typings.broadcastChannel.broadcastChannelMod.BroadcastChannelOptions
import typings.broadcastChannel.leaderElectionMod.CreateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("broadcast-channel", "BroadcastChannel")
  @js.native
  class BroadcastChannel[T] protected ()
    extends typings.broadcastChannel.broadcastChannelMod.BroadcastChannel[T] {
    def this(name: String) = this()
    def this(name: String, opts: BroadcastChannelOptions) = this()
  }
  
  @JSImport("broadcast-channel", "LeaderElector")
  @js.native
  class LeaderElector ()
    extends typings.broadcastChannel.leaderElectionMod.LeaderElector
  
  @JSImport("broadcast-channel", "clearNodeFolder")
  @js.native
  def clearNodeFolder(): js.Promise[Boolean] = js.native
  @JSImport("broadcast-channel", "clearNodeFolder")
  @js.native
  def clearNodeFolder(opts: BroadcastChannelOptions): js.Promise[Boolean] = js.native
  
  @JSImport("broadcast-channel", "createLeaderElection")
  @js.native
  val createLeaderElection: CreateFunction = js.native
  
  @JSImport("broadcast-channel", "enforceOptions")
  @js.native
  def enforceOptions(): Unit = js.native
  @JSImport("broadcast-channel", "enforceOptions")
  @js.native
  def enforceOptions(opts: BroadcastChannelOptions): Unit = js.native
  @JSImport("broadcast-channel", "enforceOptions")
  @js.native
  def enforceOptions_false(opts: `false`): Unit = js.native
}

package typings.broadcastChannel

import typings.broadcastChannel.broadcastChannelBooleans.`false`
import typings.broadcastChannel.broadcastChannelMod.BroadcastChannelOptions
import typings.broadcastChannel.leaderElectionMod.CreateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("broadcast-channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def clearNodeFolder(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")().asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def clearNodeFolder(opts: BroadcastChannelOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("broadcast-channel", "createLeaderElection")
  @js.native
  val createLeaderElection: CreateFunction = js.native
  
  @scala.inline
  def enforceOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")().asInstanceOf[Unit]
  @scala.inline
  def enforceOptions(opts: BroadcastChannelOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def enforceOptions_false(opts: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

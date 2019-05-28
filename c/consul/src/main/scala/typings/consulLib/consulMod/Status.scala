package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var consul: Consul = js.native
  /**
    * Returns the current Raft leader.
    */
  @JSName("leader")
  var leader_Original: consulLib.Fn_CallbackOptsLeaderOptions = js.native
  /**
    * Returns the current Raft peer set
    */
  @JSName("peers")
  var peers_Original: consulLib.Fn_CallbackOptsPeersOptions = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](callback: Callback[TData]): scala.Unit = js.native
  def leader[TData](opts: consulLib.consulMod.StatusNs.LeaderOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](opts: consulLib.consulMod.StatusNs.LeaderOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](callback: Callback[TData]): scala.Unit = js.native
  def peers[TData](opts: consulLib.consulMod.StatusNs.PeersOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](opts: consulLib.consulMod.StatusNs.PeersOptions, callback: Callback[TData]): scala.Unit = js.native
}


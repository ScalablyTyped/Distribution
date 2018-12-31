package typings
package consulLib.consulMod.ConsulNs

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
  var leader_Original: consulLib.Anon_OptsCallbackTDataLeaderOptions = js.native
  /**
    * Returns the current Raft peer set
    */
  @JSName("peers")
  var peers_Original: consulLib.Anon_OptsCallbackTDataPeersOptions = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](callback: Callback[TData]): scala.Unit = js.native
  def leader[TData](opts: consulLib.consulMod.ConsulNs.StatusNs.LeaderOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](opts: consulLib.consulMod.ConsulNs.StatusNs.LeaderOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](callback: Callback[TData]): scala.Unit = js.native
  def peers[TData](opts: consulLib.consulMod.ConsulNs.StatusNs.PeersOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](opts: consulLib.consulMod.ConsulNs.StatusNs.PeersOptions, callback: Callback[TData]): scala.Unit = js.native
}


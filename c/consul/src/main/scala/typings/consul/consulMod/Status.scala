package typings.consul.consulMod

import typings.consul.Fn_CallbackOptsLeaderOptions
import typings.consul.Fn_CallbackOptsPeersOptions
import typings.consul.consulMod.StatusNs.LeaderOptions
import typings.consul.consulMod.StatusNs.PeersOptions
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
  var leader_Original: Fn_CallbackOptsLeaderOptions = js.native
  /**
    * Returns the current Raft peer set
    */
  @JSName("peers")
  var peers_Original: Fn_CallbackOptsPeersOptions = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](callback: Callback[TData]): Unit = js.native
  def leader[TData](opts: LeaderOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](opts: LeaderOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](callback: Callback[TData]): Unit = js.native
  def peers[TData](opts: PeersOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](opts: PeersOptions, callback: Callback[TData]): Unit = js.native
}


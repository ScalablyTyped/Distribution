package typings.consul.mod

import typings.consul.mod.Status.LeaderOptions
import typings.consul.mod.Status.PeersOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends StObject {
  
  var consul: Consul = js.native
  
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
object Status {
  
  type LeaderOptions = CommonOptions
  
  type PeersOptions = CommonOptions
}

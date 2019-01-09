package typings
package consulLib.consulMod.ConsulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  var consul: Consul = js.native
  /**
    * Creates a new session
    */
  @JSName("create")
  var create_Original: consulLib.Anon_CallbackOptsCreateOptions = js.native
  /**
    * Destroys a given session
    */
  @JSName("destroy")
  var destroy_Original: consulLib.Anon_CallbackIdOptsDestroyOptions = js.native
  @JSName("get")
  var get_Original: consulLib.Anon_CallbackIdOptsGetOptionsString = js.native
  /**
    * Queries a given session
    */
  @JSName("info")
  var info_Original: consulLib.Anon_CallbackIdOptsInfoOptions = js.native
  /**
    * Lists all the active sessions
    */
  @JSName("list")
  var list_Original: consulLib.Anon_CallbackOptsListOptionsTDataThenableVoid = js.native
  /**
    * Lists sessions belonging to a node
    */
  @JSName("node")
  var node_Original: consulLib.Anon_CallbackNodeOptsNodeOptionsString = js.native
  /**
    * Renews a TTL-based session
    */
  @JSName("renew")
  var renew_Original: consulLib.Anon_CallbackIdOptsRenewOptions = js.native
  /**
    * Creates a new session
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](callback: Callback[TData]): scala.Unit = js.native
  def create[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.CreateOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.DestroyOptions, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](id: java.lang.String): Thenable[TData] = js.native
  def get[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.GetOptions): Thenable[TData] = js.native
  def get[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.GetOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Queries a given session
    */
  def info[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.InfoOptions): Thenable[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.InfoOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](callback: Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.ListOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: java.lang.String): Thenable[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.NodeOptions): Thenable[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.NodeOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.RenewOptions): Thenable[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: consulLib.consulMod.ConsulNs.SessionNs.RenewOptions, callback: Callback[TData]): scala.Unit = js.native
}


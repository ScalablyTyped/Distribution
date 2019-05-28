package typings
package consulLib.consulMod

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
  var create_Original: consulLib.Fn_CallbackOptsCreateOptions = js.native
  /**
    * Destroys a given session
    */
  @JSName("destroy")
  var destroy_Original: consulLib.Fn_CallbackIdOptsDestroyOptions = js.native
  @JSName("get")
  var get_Original: consulLib.Fn_CallbackIdOptsGetOptionsString = js.native
  /**
    * Queries a given session
    */
  @JSName("info")
  var info_Original: consulLib.Fn_CallbackIdOptsInfoOptions = js.native
  /**
    * Lists all the active sessions
    */
  @JSName("list")
  var list_Original: consulLib.Fn_CallbackOptsListOptionsTDataThenableVoid = js.native
  /**
    * Lists sessions belonging to a node
    */
  @JSName("node")
  var node_Original: consulLib.Fn_CallbackNodeOptsNodeOptionsString = js.native
  /**
    * Renews a TTL-based session
    */
  @JSName("renew")
  var renew_Original: consulLib.Fn_CallbackIdOptsRenewOptions = js.native
  /**
    * Creates a new session
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](callback: Callback[TData]): scala.Unit = js.native
  def create[TData](opts: consulLib.consulMod.SessionNs.CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](opts: consulLib.consulMod.SessionNs.CreateOptions, callback: Callback[TData]): scala.Unit = js.native
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
  def destroy[TData](opts: consulLib.consulMod.SessionNs.DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: consulLib.consulMod.SessionNs.DestroyOptions, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](id: java.lang.String): Thenable[TData] = js.native
  def get[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](opts: consulLib.consulMod.SessionNs.GetOptions): Thenable[TData] = js.native
  def get[TData](opts: consulLib.consulMod.SessionNs.GetOptions, callback: Callback[TData]): scala.Unit = js.native
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
  def info[TData](opts: consulLib.consulMod.SessionNs.InfoOptions): Thenable[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: consulLib.consulMod.SessionNs.InfoOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](callback: Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.SessionNs.ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](opts: consulLib.consulMod.SessionNs.ListOptions, callback: Callback[TData]): scala.Unit = js.native
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
  def node[TData](opts: consulLib.consulMod.SessionNs.NodeOptions): Thenable[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: consulLib.consulMod.SessionNs.NodeOptions, callback: Callback[TData]): scala.Unit = js.native
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
  def renew[TData](opts: consulLib.consulMod.SessionNs.RenewOptions): Thenable[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: consulLib.consulMod.SessionNs.RenewOptions, callback: Callback[TData]): scala.Unit = js.native
}


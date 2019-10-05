package typings.consul.consulMod

import typings.consul.Fn_CallbackIdOptsDestroyOptions
import typings.consul.Fn_CallbackIdOptsGetOptionsString
import typings.consul.Fn_CallbackIdOptsInfoOptions
import typings.consul.Fn_CallbackIdOptsRenewOptions
import typings.consul.Fn_CallbackNodeOptsNodeOptionsString
import typings.consul.Fn_CallbackOptsCreateOptions
import typings.consul.Fn_CallbackOptsListOptionsTDataThenableVoid
import typings.consul.consulMod.Session.CreateOptions
import typings.consul.consulMod.Session.DestroyOptions
import typings.consul.consulMod.Session.GetOptions
import typings.consul.consulMod.Session.InfoOptions
import typings.consul.consulMod.Session.ListOptions
import typings.consul.consulMod.Session.NodeOptions
import typings.consul.consulMod.Session.RenewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Session")
@js.native
trait Session_ extends js.Object {
  var consul: Consul = js.native
  /**
    * Creates a new session
    */
  @JSName("create")
  var create_Original: Fn_CallbackOptsCreateOptions = js.native
  /**
    * Destroys a given session
    */
  @JSName("destroy")
  var destroy_Original: Fn_CallbackIdOptsDestroyOptions = js.native
  @JSName("get")
  var get_Original: Fn_CallbackIdOptsGetOptionsString = js.native
  /**
    * Queries a given session
    */
  @JSName("info")
  var info_Original: Fn_CallbackIdOptsInfoOptions = js.native
  /**
    * Lists all the active sessions
    */
  @JSName("list")
  var list_Original: Fn_CallbackOptsListOptionsTDataThenableVoid = js.native
  /**
    * Lists sessions belonging to a node
    */
  @JSName("node")
  var node_Original: Fn_CallbackNodeOptsNodeOptionsString = js.native
  /**
    * Renews a TTL-based session
    */
  @JSName("renew")
  var renew_Original: Fn_CallbackIdOptsRenewOptions = js.native
  /**
    * Creates a new session
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](callback: Callback[TData]): Unit = js.native
  def create[TData](opts: CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](opts: CreateOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](id: String): Thenable[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: DestroyOptions, callback: Callback[TData]): Unit = js.native
  def get[TData](id: String): Thenable[TData] = js.native
  def get[TData](id: String, callback: Callback[TData]): Unit = js.native
  def get[TData](opts: GetOptions): Thenable[TData] = js.native
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Queries a given session
    */
  def info[TData](id: String): Thenable[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: InfoOptions): Thenable[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: InfoOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: String): Thenable[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: NodeOptions): Thenable[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: NodeOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: String): Thenable[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: RenewOptions): Thenable[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: RenewOptions, callback: Callback[TData]): Unit = js.native
}


package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  /**
    * Creates a new token by cloning an existing token
    */
  @JSName("clone")
  var clone_Original: consulLib.Anon_CallbackIdOptsCloneOptions = js.native
  var consul: Consul = js.native
  /**
    * Creates a new token with policy
    */
  @JSName("create")
  var create_Original: consulLib.Anon_Callback = js.native
  /**
    * Destroys a given token
    */
  @JSName("destroy")
  var destroy_Original: consulLib.Anon_CallbackId = js.native
  @JSName("get")
  var get_Original: consulLib.Anon_CallbackIdOptsGetOptions = js.native
  /**
    * Queries the policy of a given token
    */
  @JSName("info")
  var info_Original: consulLib.Anon_CallbackIdOpts = js.native
  /**
    * Lists all the active tokens
    */
  @JSName("list")
  var list_Original: consulLib.Anon_CallbackOptsListOptions = js.native
  /**
    * Update the policy of a token
    */
  @JSName("update")
  var update_Original: consulLib.Anon_CallbackOpts = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: consulLib.consulMod.AclNs.CloneOptions): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: consulLib.consulMod.AclNs.CloneOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](callback: Callback[TData]): scala.Unit = js.native
  def create[TData](opts: consulLib.consulMod.AclNs.CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](opts: consulLib.consulMod.AclNs.CreateOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: consulLib.consulMod.AclNs.DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: consulLib.consulMod.AclNs.DestroyOptions, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](id: java.lang.String): Thenable[TData] = js.native
  def get[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](opts: consulLib.consulMod.AclNs.GetOptions): Thenable[TData] = js.native
  def get[TData](opts: consulLib.consulMod.AclNs.GetOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: consulLib.consulMod.AclNs.InfoOptions): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: consulLib.consulMod.AclNs.InfoOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](callback: Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.AclNs.ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](opts: consulLib.consulMod.AclNs.ListOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: consulLib.consulMod.AclNs.UpdateOptions): Thenable[TData] = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: consulLib.consulMod.AclNs.UpdateOptions, callback: Callback[TData]): scala.Unit = js.native
}


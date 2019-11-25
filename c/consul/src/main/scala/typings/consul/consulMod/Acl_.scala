package typings.consul.consulMod

import typings.consul.consulMod.Acl.CloneOptions
import typings.consul.consulMod.Acl.CreateOptions
import typings.consul.consulMod.Acl.DestroyOptions
import typings.consul.consulMod.Acl.GetOptions
import typings.consul.consulMod.Acl.InfoOptions
import typings.consul.consulMod.Acl.ListOptions
import typings.consul.consulMod.Acl.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Acl")
@js.native
trait Acl_ extends js.Object {
  var consul: Consul = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: String): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: CloneOptions): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: CloneOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](callback: Callback[TData]): Unit = js.native
  def create[TData](opts: CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](opts: CreateOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: String): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: DestroyOptions, callback: Callback[TData]): Unit = js.native
  def get[TData](id: String): Thenable[TData] = js.native
  def get[TData](id: String, callback: Callback[TData]): Unit = js.native
  def get[TData](opts: GetOptions): Thenable[TData] = js.native
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: String): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: InfoOptions): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: InfoOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: UpdateOptions): Thenable[TData] = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: UpdateOptions, callback: Callback[TData]): Unit = js.native
}


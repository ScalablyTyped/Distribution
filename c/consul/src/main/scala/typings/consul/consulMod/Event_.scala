package typings.consul.consulMod

import typings.consul.Fn_CallbackNameOpts
import typings.consul.Fn_CallbackNameOptsListOptions
import typings.consul.consulMod.Event.FireOptions
import typings.consul.consulMod.Event.ListOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Event")
@js.native
trait Event_ extends js.Object {
  var consul: Consul = js.native
  /**
    * Fires a new user event
    */
  @JSName("fire")
  var fire_Original: Fn_CallbackNameOpts = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  @JSName("list")
  var list_Original: Fn_CallbackNameOptsListOptions = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, callback: Callback[TData]): Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, payload: String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, payload: String, callback: Callback[TData]): Unit = js.native
  def fire[TData](name: String, payload: Buffer): Thenable[TData] = js.native
  def fire[TData](name: String, payload: Buffer, callback: Callback[TData]): Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: FireOptions): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: FireOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](name: String): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](name: String, callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
}


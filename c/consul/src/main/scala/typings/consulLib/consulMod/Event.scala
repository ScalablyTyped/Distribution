package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var consul: Consul = js.native
  /**
    * Fires a new user event
    */
  @JSName("fire")
  var fire_Original: consulLib.Anon_CallbackNameOpts = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  @JSName("list")
  var list_Original: consulLib.Anon_CallbackNameOptsListOptions = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: java.lang.String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: java.lang.String, payload: java.lang.String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: java.lang.String, payload: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def fire[TData](name: java.lang.String, payload: nodeLib.Buffer): Thenable[TData] = js.native
  def fire[TData](name: java.lang.String, payload: nodeLib.Buffer, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: consulLib.consulMod.EventNs.FireOptions): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: consulLib.consulMod.EventNs.FireOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](callback: Callback[TData]): scala.Unit = js.native
  def list[TData](name: java.lang.String): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](name: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.EventNs.ListOptions): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](opts: consulLib.consulMod.EventNs.ListOptions, callback: Callback[TData]): scala.Unit = js.native
}


package typings.consul.consulMod

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Lock")
@js.native
trait Lock_ extends EventEmitter {
  var consul: Consul = js.native
  /**
    * Acquire lock
    */
  def acquire(): Unit = js.native
  /**
    * Release lock
    */
  def release(): Unit = js.native
}


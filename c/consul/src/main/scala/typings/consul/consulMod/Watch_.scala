package typings.consul.consulMod

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Watch")
@js.native
trait Watch_ extends EventEmitter {
  var consul: Consul = js.native
  /**
    * End watch
    */
  def end(): Unit = js.native
  /**
    * Is running
    */
  def isRunning(): Boolean = js.native
  /**
    * Update time
    */
  def updateTime(): Double = js.native
}


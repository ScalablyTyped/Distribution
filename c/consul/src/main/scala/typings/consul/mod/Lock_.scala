package typings.consul.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lock_ extends EventEmitter {
  
  /**
    * Acquire lock
    */
  def acquire(): Unit = js.native
  
  var consul: Consul = js.native
  
  /**
    * Release lock
    */
  def release(): Unit = js.native
}

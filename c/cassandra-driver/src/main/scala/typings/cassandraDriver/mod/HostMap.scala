package typings.cassandraDriver.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostMap extends EventEmitter {
  
  def forEach(callback: js.Function2[/* value */ Host, /* key */ String, Unit]): Unit = js.native
  
  def get(key: String): Host = js.native
  
  def keys(): js.Array[String] = js.native
  
  var length: Double = js.native
  
  def values(): js.Array[Host] = js.native
}

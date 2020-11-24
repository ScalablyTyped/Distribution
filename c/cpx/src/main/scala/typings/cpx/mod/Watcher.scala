package typings.cpx.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cpx", "Watcher")
@js.native
class Watcher protected () extends EventEmitter {
  def this(options: WatchOptions) = this()
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
}

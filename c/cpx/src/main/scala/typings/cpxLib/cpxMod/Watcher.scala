package typings
package cpxLib.cpxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cpx", "Watcher")
@js.native
class Watcher protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: WatchOptions) = this()
  def close(): scala.Unit = js.native
  def open(): scala.Unit = js.native
}


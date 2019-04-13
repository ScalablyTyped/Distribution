package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan", "RotatingFileStream")
@js.native
class RotatingFileStream protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: RotatingFileStreamOptions) = this()
  var periodNum: scala.Double = js.native
  var periodScope: java.lang.String = js.native
  var rotQueue: js.Array[_] = js.native
  var rotating: scala.Boolean = js.native
  var stream: js.Any = js.native
  var writable: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def destroySoon(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(record: js.Any): scala.Unit = js.native
  def rotate(): scala.Unit = js.native
  def write(record: js.Any): scala.Boolean = js.native
}


package typings.bunyan.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bunyan", "RotatingFileStream")
@js.native
class RotatingFileStream protected () extends EventEmitter {
  def this(options: RotatingFileStreamOptions) = this()
  
  def destroy(): Unit = js.native
  
  def destroySoon(): Unit = js.native
  
  def end(): Unit = js.native
  def end(record: js.Any): Unit = js.native
  
  var periodNum: Double = js.native
  
  var periodScope: String = js.native
  
  var rotQueue: js.Array[_] = js.native
  
  def rotate(): Unit = js.native
  
  var rotating: Boolean = js.native
  
  var stream: js.Any = js.native
  
  var writable: Boolean = js.native
  
  def write(record: js.Any): Boolean = js.native
}

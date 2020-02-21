package typings.clarinet.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clarinet", "CParser")
@js.native
class CParser () extends js.Object {
  def this(opt: Options) = this()
  var column: Double = js.native
  var line: Double = js.native
  var position: Double = js.native
  def close(): Unit = js.native
  def end(): Unit = js.native
  def onclosearray(): Unit = js.native
  def oncloseobject(): Unit = js.native
  def onend(): Unit = js.native
  def onerror(e: Error): Unit = js.native
  def onkey(key: String): Unit = js.native
  def onopenarray(): Unit = js.native
  def onopenobject(key: String): Unit = js.native
  def onready(): Unit = js.native
  def onvalue(): Unit = js.native
  def onvalue(value: String): Unit = js.native
  def onvalue(value: Boolean): Unit = js.native
  def resume(): Unit = js.native
  def write(chunk: String): Unit = js.native
}


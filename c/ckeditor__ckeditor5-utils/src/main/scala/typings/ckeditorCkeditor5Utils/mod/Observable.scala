package typings.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable extends Emitter {
  def bind(bindProperties: String*): BindChain = js.native
  def decorate(methodName: String): Unit = js.native
  def set(name: String, value: js.Any): Unit = js.native
  def set(name: js.Object): Unit = js.native
  def unbind(unbindProperties: String*): Unit = js.native
}


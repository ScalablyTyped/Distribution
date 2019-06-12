package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  def end(): Log = js.native
  def finish(): scala.Unit = js.native
  def get(): LogConfig = js.native
  @JSName("get")
  def get_displayName(attr: cypressLib.cypressLibStrings.displayName): java.lang.String = js.native
  @JSName("get")
  def get_el(attr: cypressLib.cypressLibStrings.DOLLARel): cypressLib.JQuery[stdLib.HTMLElement] = js.native
  @JSName("get")
  def get_message(attr: cypressLib.cypressLibStrings.message): js.Array[_] = js.native
  @JSName("get")
  def get_name(attr: cypressLib.cypressLibStrings.name): java.lang.String = js.native
  def set(options: stdLib.Partial[LogConfig]): Log = js.native
  @JSName("set")
  def set_displayName(key: cypressLib.cypressLibStrings.displayName, value: java.lang.String): Log = js.native
  @JSName("set")
  def set_el(key: cypressLib.cypressLibStrings.DOLLARel, value: cypressLib.JQuery[stdLib.HTMLElement]): Log = js.native
  @JSName("set")
  def set_message(key: cypressLib.cypressLibStrings.message, value: js.Array[_]): Log = js.native
  @JSName("set")
  def set_name(key: cypressLib.cypressLibStrings.name, value: java.lang.String): Log = js.native
  def snapshot(): Log = js.native
  def snapshot(name: java.lang.String): Log = js.native
  def snapshot(name: java.lang.String, options: cypressLib.Anon_At): Log = js.native
}


package typings.cypress.mod.Cypress

import typings.cypress.AnonAt
import typings.cypress.PartialLogConfig
import typings.cypress.cypressStrings.$el
import typings.cypress.cypressStrings.displayName
import typings.cypress.cypressStrings.message
import typings.cypress.cypressStrings.name
import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  def end(): Log = js.native
  def finish(): Unit = js.native
  def get(): LogConfig = js.native
  @JSName("get")
  def get_displayName(attr: displayName): String = js.native
  @JSName("get")
  def get_el(attr: $el): JQuery_[HTMLElement] = js.native
  @JSName("get")
  def get_message(attr: message): js.Array[_] = js.native
  @JSName("get")
  def get_name(attr: name): String = js.native
  def set(options: PartialLogConfig): Log = js.native
  @JSName("set")
  def set_displayName(key: displayName, value: String): Log = js.native
  @JSName("set")
  def set_el(key: $el, value: JQuery_[HTMLElement]): Log = js.native
  @JSName("set")
  def set_message(key: message, value: js.Array[_]): Log = js.native
  @JSName("set")
  def set_name(key: name, value: String): Log = js.native
  def snapshot(): Log = js.native
  def snapshot(name: String): Log = js.native
  def snapshot(name: String, options: AnonAt): Log = js.native
}


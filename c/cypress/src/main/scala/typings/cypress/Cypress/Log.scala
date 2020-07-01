package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.cypress.anon.At
import typings.cypress.anon.PartialLogConfig
import typings.cypress.cypressStrings.$el
import typings.cypress.cypressStrings.displayName
import typings.cypress.cypressStrings.message
import typings.cypress.cypressStrings.name
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
  def get_el(attr: $el): JQuery[HTMLElement] = js.native
  @JSName("get")
  def get_message(attr: message): js.Any = js.native
  @JSName("get")
  def get_name(attr: name): String = js.native
  def set(options: PartialLogConfig): Log = js.native
  @JSName("set")
  def set_displayName(key: displayName, value: String): Log = js.native
  @JSName("set")
  def set_el(key: $el, value: JQuery[HTMLElement]): Log = js.native
  @JSName("set")
  def set_message(key: message, value: js.Any): Log = js.native
  @JSName("set")
  def set_name(key: name, value: String): Log = js.native
  def snapshot(): Log = js.native
  def snapshot(name: String): Log = js.native
  def snapshot(name: String, options: At): Log = js.native
}


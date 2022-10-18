package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.cypress.anon.At
import typings.cypress.anon.PartialLogConfig
import typings.cypress.cypressStrings.$el
import typings.cypress.cypressStrings.`type`
import typings.cypress.cypressStrings.autoEnd
import typings.cypress.cypressStrings.child
import typings.cypress.cypressStrings.displayName
import typings.cypress.cypressStrings.end
import typings.cypress.cypressStrings.id
import typings.cypress.cypressStrings.message
import typings.cypress.cypressStrings.name
import typings.cypress.cypressStrings.parent
import typings.cypress.cypressStrings.timeout
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends StObject {
  
  def end(): Log = js.native
  
  def error(error: js.Error): Log = js.native
  
  def finish(): Unit = js.native
  
  def get(): LogConfig = js.native
  @JSName("get")
  def get_autoEnd(attr: autoEnd): Boolean = js.native
  @JSName("get")
  def get_displayName(attr: displayName): String = js.native
  @JSName("get")
  def get_el(attr: $el): JQuery[HTMLElement] = js.native
  @JSName("get")
  def get_end(attr: end): Boolean = js.native
  @JSName("get")
  def get_id(attr: id): String = js.native
  @JSName("get")
  def get_message(attr: message): Any = js.native
  @JSName("get")
  def get_name(attr: name): String = js.native
  @JSName("get")
  def get_timeout(attr: timeout): Double = js.native
  @JSName("get")
  def get_type(attr: `type`): parent | child = js.native
  
  def set(key: `type`, value: parent | child): Log = js.native
  def set(options: PartialLogConfig): Log = js.native
  @JSName("set")
  def set_autoEnd(key: autoEnd, value: Boolean): Log = js.native
  @JSName("set")
  def set_displayName(key: displayName, value: String): Log = js.native
  @JSName("set")
  def set_el(key: $el, value: JQuery[HTMLElement]): Log = js.native
  @JSName("set")
  def set_end(key: end, value: Boolean): Log = js.native
  @JSName("set")
  def set_id(key: id, value: String): Log = js.native
  @JSName("set")
  def set_message(key: message, value: Any): Log = js.native
  @JSName("set")
  def set_name(key: name, value: String): Log = js.native
  @JSName("set")
  def set_timeout(key: timeout, value: Double): Log = js.native
  
  def snapshot(): Log = js.native
  def snapshot(name: String): Log = js.native
  def snapshot(name: String, options: At): Log = js.native
  def snapshot(name: Unit, options: At): Log = js.native
}

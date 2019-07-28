package typings.backboneDotMarionette.backboneDotMarionetteMod

import typings.backboneDotRadio.backboneDotRadioMod.Channel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bindEvents(target: js.Any, entity: js.Any, bindings: js.Any): Unit = js.native
  def bindRequests(target: js.Any, channel: Channel, bindings: js.Any): Unit = js.native
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
  def getOption(target: js.Any, optionName: String): js.Any = js.native
  def isNodeAttached(el: HTMLElement): Boolean = js.native
  def mergeOptions(target: js.Any, options: js.Any, keys: js.Any): Unit = js.native
  def noConflict(): Unit = js.native
  def normalizeMethods[T](target: js.Any, hash: js.Any): T = js.native
  def triggerMethod(target: js.Any, name: String, args: js.Any*): js.Any = js.native
  def triggerMethodOn(ctx: js.Any, name: String, args: js.Any*): js.Any = js.native
  def unbindEvents(target: js.Any, entity: js.Any, bindings: js.Any): Unit = js.native
  def unbindRequests(target: js.Any, channel: Channel, bindings: js.Any): Unit = js.native
}


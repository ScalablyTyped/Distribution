package typings.chromeDashApps.chrome.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which allows the addition and removal of listeners for a Chrome event.
  * Also provides the possibility to provide a filter
  * @template T Callback function.
  * @template F Filter interface, leave this for default
  */
@js.native
trait FilteredEvent[T /* <: js.Function */, F] extends Event[T] {
  def addListener(callback: T, filter: F): Unit = js.native
}


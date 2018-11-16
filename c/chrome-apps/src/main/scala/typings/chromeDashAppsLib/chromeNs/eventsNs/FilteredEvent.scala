package typings
package chromeDashAppsLib.chromeNs.eventsNs

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
  /**
               * Registers an event listener callback to an event.
               * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
               * @param [filter] Optional key/value dictionary you can provide to filter the events
               */
  def addListener(callback: T, filter: F): scala.Unit = js.native
}


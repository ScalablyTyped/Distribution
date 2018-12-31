package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class that provides a small promise polyfill
  */
@JSImport("babylonjs", "PromisePolyfill")
@js.native
class PromisePolyfill ()
  extends babylonjsLib.BABYLONNs.PromisePolyfill

/**
  * Helper class that provides a small promise polyfill
  */
@JSImport("babylonjs", "PromisePolyfill")
@js.native
object PromisePolyfill extends js.Object {
  /**
    * Static function used to check if the polyfill is required
    * If this is the case then the function will inject the polyfill to window.Promise
    * @param force defines a boolean used to force the injection (mostly for testing purposes)
    */
  def Apply(): scala.Unit = js.native
  def Apply(force: scala.Boolean): scala.Unit = js.native
}


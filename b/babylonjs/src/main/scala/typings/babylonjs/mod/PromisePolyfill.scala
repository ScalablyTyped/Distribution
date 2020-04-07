package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "PromisePolyfill")
@js.native
class PromisePolyfill ()
  extends typings.babylonjs.legacyMod.PromisePolyfill

/* static members */
@JSImport("babylonjs", "PromisePolyfill")
@js.native
object PromisePolyfill extends js.Object {
  /**
    * Static function used to check if the polyfill is required
    * If this is the case then the function will inject the polyfill to window.Promise
    * @param force defines a boolean used to force the injection (mostly for testing purposes)
    */
  def Apply(): Unit = js.native
  def Apply(force: Boolean): Unit = js.native
}


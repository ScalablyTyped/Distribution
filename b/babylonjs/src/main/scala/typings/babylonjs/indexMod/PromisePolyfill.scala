package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "PromisePolyfill")
@js.native
class PromisePolyfill ()
  extends typings.babylonjs.miscIndexMod.PromisePolyfill

/* static members */
@JSImport("babylonjs/index", "PromisePolyfill")
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


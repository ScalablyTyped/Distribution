package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal class used by the engine to get list of InternalTexture already bound to the GL context
  */
@JSGlobal("BABYLON.DummyInternalTextureTracker")
@js.native
class DummyInternalTextureTracker () extends js.Object {
  /**
    * Gets or set the next tracker in the list
    */
  var next: Nullable[IInternalTextureTracker] = js.native
  /**
    * Gets or set the previous tracker in the list
    */
  var previous: Nullable[IInternalTextureTracker] = js.native
}


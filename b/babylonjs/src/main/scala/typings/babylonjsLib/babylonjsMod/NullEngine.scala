package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The null engine class provides support for headless version of babylon.js.
  * This can be used in server side scenario or for testing purposes
  */
@JSImport("babylonjs", "NullEngine")
@js.native
class NullEngine ()
  extends babylonjsLib.BABYLONNs.NullEngine {
  def this(options: babylonjsLib.BABYLONNs.NullEngineOptions) = this()
}


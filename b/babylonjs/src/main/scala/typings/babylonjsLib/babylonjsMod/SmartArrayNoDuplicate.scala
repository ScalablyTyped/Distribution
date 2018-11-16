package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines an GC Friendly array where the backfield array do not shrink to prevent over allocations.
     * The data in this array can only be present once
     */
@JSImport("babylonjs", "SmartArrayNoDuplicate")
@js.native
class SmartArrayNoDuplicate[T] ()
  extends babylonjsLib.BABYLONNs.SmartArrayNoDuplicate[T]


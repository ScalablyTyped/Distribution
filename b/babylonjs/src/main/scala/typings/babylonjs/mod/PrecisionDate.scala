package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "PrecisionDate")
@js.native
class PrecisionDate ()
  extends typings.babylonjs.legacyMod.PrecisionDate

/* static members */
@JSImport("babylonjs", "PrecisionDate")
@js.native
object PrecisionDate extends js.Object {
  /**
    * Gets either window.performance.now() if supported or Date.now() else
    */
  def Now: Double = js.native
}


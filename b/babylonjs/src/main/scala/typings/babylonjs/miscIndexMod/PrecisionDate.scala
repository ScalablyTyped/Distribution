package typings.babylonjs.miscIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/index", "PrecisionDate")
@js.native
class PrecisionDate ()
  extends typings.babylonjs.precisionDateMod.PrecisionDate

/* static members */
@JSImport("babylonjs/Misc/index", "PrecisionDate")
@js.native
object PrecisionDate extends js.Object {
  /**
    * Gets either window.performance.now() if supported or Date.now() else
    */
  def Now(): Double = js.native
}


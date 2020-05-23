package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PrecisionDate")
@js.native
class PrecisionDate ()
  extends typings.babylonjs.BABYLON.PrecisionDate

/* static members */
@JSGlobal("BABYLON.PrecisionDate")
@js.native
object PrecisionDate extends js.Object {
  /**
    * Gets either window.performance.now() if supported or Date.now() else
    */
  def Now: Double = js.native
}


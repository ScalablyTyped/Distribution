package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PrecisionDate")
@js.native
class PrecisionDate ()
  extends typings.babylonjs.miscIndexMod.PrecisionDate
/* static members */
@JSImport("babylonjs/index", "PrecisionDate")
@js.native
object PrecisionDate extends js.Object {
  
  /**
    * Gets either window.performance.now() if supported or Date.now() else
    */
  def Now: Double = js.native
}

package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/precisionDate", JSImport.Namespace)
@js.native
object precisionDateMod extends js.Object {
  @js.native
  class PrecisionDate () extends js.Object
  
  /* static members */
  @js.native
  object PrecisionDate extends js.Object {
    /**
      * Gets either window.performance.now() if supported or Date.now() else
      */
    def Now: Double = js.native
  }
  
}


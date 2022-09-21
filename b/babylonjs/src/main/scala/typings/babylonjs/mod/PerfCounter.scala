package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PerfCounter")
@js.native
/**
  * Creates a new counter
  */
open class PerfCounter ()
  extends typings.babylonjs.legacyMod.PerfCounter
/* static members */
object PerfCounter {
  
  @JSImport("babylonjs", "PerfCounter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets a global boolean to turn on and off all the counters
    */
  @JSImport("babylonjs", "PerfCounter.Enabled")
  @js.native
  def Enabled: Boolean = js.native
  inline def Enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(x.asInstanceOf[js.Any])
}

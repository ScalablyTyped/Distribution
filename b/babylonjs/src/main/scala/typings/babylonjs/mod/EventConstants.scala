package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EventConstants")
@js.native
open class EventConstants ()
  extends typings.babylonjs.legacyMod.EventConstants
/* static members */
object EventConstants {
  
  @JSImport("babylonjs", "EventConstants")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Line delta for Wheel Events
    */
  @JSImport("babylonjs", "EventConstants.DOM_DELTA_LINE")
  @js.native
  def DOM_DELTA_LINE: Double = js.native
  inline def DOM_DELTA_LINE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_LINE")(x.asInstanceOf[js.Any])
  
  /**
    * Page delta for Wheel Events
    */
  @JSImport("babylonjs", "EventConstants.DOM_DELTA_PAGE")
  @js.native
  def DOM_DELTA_PAGE: Double = js.native
  inline def DOM_DELTA_PAGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_PAGE")(x.asInstanceOf[js.Any])
  
  /**
    * Pixel delta for Wheel Events (Default)
    */
  @JSImport("babylonjs", "EventConstants.DOM_DELTA_PIXEL")
  @js.native
  def DOM_DELTA_PIXEL: Double = js.native
  inline def DOM_DELTA_PIXEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DELTA_PIXEL")(x.asInstanceOf[js.Any])
}

package typings.babylonjs.webXRHandTrackingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandPart extends StObject
@JSImport("babylonjs/XR/features/WebXRHandTracking", "HandPart")
@js.native
object HandPart extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HandPart & String] = js.native
  
  /**
    * HandPart - Index finger
    */
  @js.native
  sealed trait INDEX
    extends StObject
       with HandPart
  /* "index" */ val INDEX: typings.babylonjs.webXRHandTrackingMod.HandPart.INDEX & String = js.native
  
  /**
    * HandPart - Little finger
    */
  @js.native
  sealed trait LITTLE
    extends StObject
       with HandPart
  /* "little" */ val LITTLE: typings.babylonjs.webXRHandTrackingMod.HandPart.LITTLE & String = js.native
  
  /**
    * HandPart - Middle finger
    */
  @js.native
  sealed trait MIDDLE
    extends StObject
       with HandPart
  /* "middle" */ val MIDDLE: typings.babylonjs.webXRHandTrackingMod.HandPart.MIDDLE & String = js.native
  
  /**
    * HandPart - Ring finger
    */
  @js.native
  sealed trait RING
    extends StObject
       with HandPart
  /* "ring" */ val RING: typings.babylonjs.webXRHandTrackingMod.HandPart.RING & String = js.native
  
  /**
    * HandPart - The thumb
    */
  @js.native
  sealed trait THUMB
    extends StObject
       with HandPart
  /* "thumb" */ val THUMB: typings.babylonjs.webXRHandTrackingMod.HandPart.THUMB & String = js.native
  
  /**
    * HandPart - Wrist
    */
  @js.native
  sealed trait WRIST
    extends StObject
       with HandPart
  /* "wrist" */ val WRIST: typings.babylonjs.webXRHandTrackingMod.HandPart.WRIST & String = js.native
}

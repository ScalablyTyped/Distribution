package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NativePointerInput extends StObject
@JSGlobal("BABYLON.NativePointerInput")
@js.native
object NativePointerInput extends StObject {
  
  /** Browser Back */
  @js.native
  sealed trait BrowserBack
    extends StObject
       with NativePointerInput
  
  /** Browser Forward */
  @js.native
  sealed trait BrowserForward
    extends StObject
       with NativePointerInput
  
  /** Delta X */
  @js.native
  sealed trait DeltaHorizontal
    extends StObject
       with NativePointerInput
  
  /** Delta Y */
  @js.native
  sealed trait DeltaVertical
    extends StObject
       with NativePointerInput
  
  /** Horizontal Axis */
  @js.native
  sealed trait Horizontal
    extends StObject
       with NativePointerInput
  
  /** Left Click or Touch */
  @js.native
  sealed trait LeftClick
    extends StObject
       with NativePointerInput
  
  /** Middle Click */
  @js.native
  sealed trait MiddleClick
    extends StObject
       with NativePointerInput
  
  /** Mouse Wheel X */
  @js.native
  sealed trait MouseWheelX
    extends StObject
       with NativePointerInput
  
  /** Mouse Wheel Y */
  @js.native
  sealed trait MouseWheelY
    extends StObject
       with NativePointerInput
  
  /** Mouse Wheel Z */
  @js.native
  sealed trait MouseWheelZ
    extends StObject
       with NativePointerInput
  
  /** Right Click */
  @js.native
  sealed trait RightClick
    extends StObject
       with NativePointerInput
  
  /** Vertical Axis */
  @js.native
  sealed trait Vertical
    extends StObject
       with NativePointerInput
}

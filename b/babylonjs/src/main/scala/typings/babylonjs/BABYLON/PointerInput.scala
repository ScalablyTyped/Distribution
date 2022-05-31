package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerInput
  extends StObject
     with _DeviceInput[js.Any]
@JSGlobal("BABYLON.PointerInput")
@js.native
object PointerInput extends StObject {
  
  /** Browser Back */
  @js.native
  sealed trait BrowserBack
    extends StObject
       with PointerInput
  
  /** Browser Forward */
  @js.native
  sealed trait BrowserForward
    extends StObject
       with PointerInput
  
  /** Horizontal Axis */
  @js.native
  sealed trait Horizontal
    extends StObject
       with PointerInput
  
  /** Left Click or Touch */
  @js.native
  sealed trait LeftClick
    extends StObject
       with PointerInput
  
  /** Middle Click */
  @js.native
  sealed trait MiddleClick
    extends StObject
       with PointerInput
  
  /** Right Click */
  @js.native
  sealed trait RightClick
    extends StObject
       with PointerInput
  
  /** Vertical Axis */
  @js.native
  sealed trait Vertical
    extends StObject
       with PointerInput
}

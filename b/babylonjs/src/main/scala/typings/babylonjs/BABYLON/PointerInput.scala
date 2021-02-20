package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerInput
  extends _DeviceInput[js.Any]
@JSGlobal("BABYLON.PointerInput")
@js.native
object PointerInput extends StObject {
  
  /** Browser Back */
  @js.native
  sealed trait BrowserBack extends PointerInput
  
  /** Browser Forward */
  @js.native
  sealed trait BrowserForward extends PointerInput
  
  /** Horizontal Axis */
  @js.native
  sealed trait Horizontal extends PointerInput
  
  /** Left Click or Touch */
  @js.native
  sealed trait LeftClick extends PointerInput
  
  /** Middle Click */
  @js.native
  sealed trait MiddleClick extends PointerInput
  
  /** Right Click */
  @js.native
  sealed trait RightClick extends PointerInput
  
  /** Vertical Axis */
  @js.native
  sealed trait Vertical extends PointerInput
}

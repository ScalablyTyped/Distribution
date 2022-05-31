package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DualShockDpad extends StObject
@JSGlobal("BABYLON.DualShockDpad")
@js.native
object DualShockDpad extends StObject {
  
  /** Down */
  @js.native
  sealed trait Down
    extends StObject
       with DualShockDpad
  
  /** Left */
  @js.native
  sealed trait Left
    extends StObject
       with DualShockDpad
  
  /** Right */
  @js.native
  sealed trait Right
    extends StObject
       with DualShockDpad
  
  /** Up */
  @js.native
  sealed trait Up
    extends StObject
       with DualShockDpad
}

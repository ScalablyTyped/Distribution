package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
@JSGlobal("BABYLON.Orientation")
@js.native
object Orientation extends StObject {
  
  /** Counter clockwise */
  @js.native
  sealed trait CCW
    extends StObject
       with Orientation
  
  /**
    * Clockwise
    */
  @js.native
  sealed trait CW
    extends StObject
       with Orientation
}

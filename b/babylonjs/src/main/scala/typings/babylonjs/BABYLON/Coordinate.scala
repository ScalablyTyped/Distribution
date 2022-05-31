package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Coordinate extends StObject
@JSGlobal("BABYLON.Coordinate")
@js.native
object Coordinate extends StObject {
  
  /** X axis */
  @js.native
  sealed trait X
    extends StObject
       with Coordinate
  
  /** Y axis */
  @js.native
  sealed trait Y
    extends StObject
       with Coordinate
  
  /** Z axis */
  @js.native
  sealed trait Z
    extends StObject
       with Coordinate
}

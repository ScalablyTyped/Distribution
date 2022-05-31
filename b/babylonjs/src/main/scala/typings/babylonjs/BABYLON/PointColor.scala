package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointColor extends StObject
@JSGlobal("BABYLON.PointColor")
@js.native
object PointColor extends StObject {
  
  /** color value */
  @js.native
  sealed trait Color
    extends StObject
       with PointColor
  
  /** random value */
  @js.native
  sealed trait Random
    extends StObject
       with PointColor
  
  /** stated value */
  @js.native
  sealed trait Stated
    extends StObject
       with PointColor
  
  /** uv value */
  @js.native
  sealed trait UV
    extends StObject
       with PointColor
}

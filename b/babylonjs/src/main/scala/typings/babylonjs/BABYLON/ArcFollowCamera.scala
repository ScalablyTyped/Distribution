package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcFollowCamera extends TargetCamera {
  
  var _cartesianCoordinates: js.Any = js.native
  
  var _follow: js.Any = js.native
  
  /** Define the camera target (the mesh it should follow) */
  var _meshTarget: js.Any = js.native
  
  /** The longitudinal angle of the camera */
  var alpha: Double = js.native
  
  /** The latitudinal angle of the camera */
  var beta: Double = js.native
  
  /** The radius of the camera from its target */
  var radius: Double = js.native
}

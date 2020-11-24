package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointColor extends js.Object
@JSGlobal("BABYLON.PointColor")
@js.native
object PointColor extends js.Object {
  
  /** color value */
  @js.native
  sealed trait Color extends PointColor
  
  /** random value */
  @js.native
  sealed trait Random extends PointColor
  
  /** stated value */
  @js.native
  sealed trait Stated extends PointColor
  
  /** uv value */
  @js.native
  sealed trait UV extends PointColor
}

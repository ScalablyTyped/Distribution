package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointColor extends StObject
@JSGlobal("BABYLON.PointColor")
@js.native
object PointColor extends StObject {
  
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

package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointColor with Double] = js.native
  /* 2 */ @js.native
  object Color extends TopLevel[Color with Double]
  
  /* 0 */ @js.native
  object Random extends TopLevel[Random with Double]
  
  /* 3 */ @js.native
  object Stated extends TopLevel[Stated with Double]
  
  /* 1 */ @js.native
  object UV extends TopLevel[UV with Double]
  
}


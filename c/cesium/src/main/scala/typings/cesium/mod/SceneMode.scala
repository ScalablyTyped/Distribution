package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SceneMode extends js.Object

@JSImport("cesium", "SceneMode")
@js.native
object SceneMode extends js.Object {
  @js.native
  sealed trait COLUMBUS_VIEW extends SceneMode
  
  @js.native
  sealed trait MORPHING extends SceneMode
  
  @js.native
  sealed trait SCENE2D extends SceneMode
  
  @js.native
  sealed trait SCENE3D extends SceneMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SceneMode with Double] = js.native
  def getMorphTime(value: SceneMode): Double = js.native
  /* 1 */ @js.native
  object COLUMBUS_VIEW extends TopLevel[COLUMBUS_VIEW with Double]
  
  /* 0 */ @js.native
  object MORPHING extends TopLevel[MORPHING with Double]
  
  /* 2 */ @js.native
  object SCENE2D extends TopLevel[SCENE2D with Double]
  
  /* 3 */ @js.native
  object SCENE3D extends TopLevel[SCENE3D with Double]
  
}


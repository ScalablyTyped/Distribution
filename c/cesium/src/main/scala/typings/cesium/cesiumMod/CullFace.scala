package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.CullFace.BACK
import typings.cesium.cesiumMod.CullFace.FRONT
import typings.cesium.cesiumMod.CullFace.FRONT_AND_BACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CullFace extends js.Object

@JSImport("cesium", "CullFace")
@js.native
object CullFace extends js.Object {
  @js.native
  sealed trait BACK extends CullFace
  
  @js.native
  sealed trait FRONT extends CullFace
  
  @js.native
  sealed trait FRONT_AND_BACK extends CullFace
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CullFace with Double] = js.native
  /* 1 */ @js.native
  object BACK extends TopLevel[BACK with Double]
  
  /* 0 */ @js.native
  object FRONT extends TopLevel[FRONT with Double]
  
  /* 2 */ @js.native
  object FRONT_AND_BACK extends TopLevel[FRONT_AND_BACK with Double]
  
}


package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArcType extends js.Object

@JSImport("cesium", "ArcType")
@js.native
object ArcType extends js.Object {
  @js.native
  sealed trait GEODESIC extends ArcType
  
  @js.native
  sealed trait NONE extends ArcType
  
  @js.native
  sealed trait RHUMB extends ArcType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArcType with Double] = js.native
  /* 1 */ @js.native
  object GEODESIC extends TopLevel[GEODESIC with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object RHUMB extends TopLevel[RHUMB with Double]
  
}


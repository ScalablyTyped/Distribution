package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeStandard extends js.Object

@JSImport("cesium", "TimeStandard")
@js.native
object TimeStandard extends js.Object {
  @js.native
  sealed trait TAI extends TimeStandard
  
  @js.native
  sealed trait UTC extends TimeStandard
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeStandard with Double] = js.native
  /* 1 */ @js.native
  object TAI extends TopLevel[TAI with Double]
  
  /* 0 */ @js.native
  object UTC extends TopLevel[UTC with Double]
  
}


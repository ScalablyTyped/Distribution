package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeStandard extends StObject
@JSImport("cesium", "TimeStandard")
@js.native
object TimeStandard extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeStandard with Double] = js.native
  
  @js.native
  sealed trait TAI extends TimeStandard
  /* 1 */ val TAI: typings.cesium.mod.TimeStandard.TAI with Double = js.native
  
  @js.native
  sealed trait UTC extends TimeStandard
  /* 0 */ val UTC: typings.cesium.mod.TimeStandard.UTC with Double = js.native
}

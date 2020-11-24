package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeStandard extends js.Object
@JSImport("cesium", "TimeStandard")
@js.native
object TimeStandard extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeStandard with Double] = js.native
  
  @js.native
  sealed trait TAI extends TimeStandard
  /* 1 */ @js.native
  object TAI extends TopLevel[TAI with Double]
  
  @js.native
  sealed trait UTC extends TimeStandard
  /* 0 */ @js.native
  object UTC extends TopLevel[UTC with Double]
}

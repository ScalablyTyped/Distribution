package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindingOrder extends js.Object
@JSImport("cesium", "WindingOrder")
@js.native
object WindingOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WindingOrder with Double] = js.native
  
  @js.native
  sealed trait CLOCKWISE extends WindingOrder
  /* 0 */ @js.native
  object CLOCKWISE extends TopLevel[CLOCKWISE with Double]
  
  @js.native
  sealed trait COUNTER_CLOCKWISE extends WindingOrder
  /* 1 */ @js.native
  object COUNTER_CLOCKWISE extends TopLevel[COUNTER_CLOCKWISE with Double]
}

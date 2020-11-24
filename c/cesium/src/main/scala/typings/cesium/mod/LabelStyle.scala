package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelStyle extends js.Object
@JSImport("cesium", "LabelStyle")
@js.native
object LabelStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelStyle with Double] = js.native
  
  @js.native
  sealed trait FILL extends LabelStyle
  /* 0 */ @js.native
  object FILL extends TopLevel[FILL with Double]
  
  @js.native
  sealed trait FILL_AND_OUTLINE extends LabelStyle
  /* 2 */ @js.native
  object FILL_AND_OUTLINE extends TopLevel[FILL_AND_OUTLINE with Double]
  
  @js.native
  sealed trait OUTLINE extends LabelStyle
  /* 1 */ @js.native
  object OUTLINE extends TopLevel[OUTLINE with Double]
}

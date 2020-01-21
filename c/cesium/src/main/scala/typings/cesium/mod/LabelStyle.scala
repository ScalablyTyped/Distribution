package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelStyle extends js.Object

@JSImport("cesium", "LabelStyle")
@js.native
object LabelStyle extends js.Object {
  @js.native
  sealed trait FILL extends LabelStyle
  
  @js.native
  sealed trait FILL_AND_OUTLINE extends LabelStyle
  
  @js.native
  sealed trait OUTLINE extends LabelStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelStyle with Double] = js.native
  /* 0 */ @js.native
  object FILL extends TopLevel[FILL with Double]
  
  /* 2 */ @js.native
  object FILL_AND_OUTLINE extends TopLevel[FILL_AND_OUTLINE with Double]
  
  /* 1 */ @js.native
  object OUTLINE extends TopLevel[OUTLINE with Double]
  
}


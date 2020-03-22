package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorBlendMode extends js.Object

@JSImport("cesium", "ColorBlendMode")
@js.native
object ColorBlendMode extends js.Object {
  @js.native
  sealed trait HIGHLIGHT extends ColorBlendMode
  
  @js.native
  sealed trait MIX extends ColorBlendMode
  
  @js.native
  sealed trait REPLACE extends ColorBlendMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorBlendMode with Double] = js.native
  /* 0 */ @js.native
  object HIGHLIGHT extends TopLevel[HIGHLIGHT with Double]
  
  /* 2 */ @js.native
  object MIX extends TopLevel[MIX with Double]
  
  /* 1 */ @js.native
  object REPLACE extends TopLevel[REPLACE with Double]
  
}


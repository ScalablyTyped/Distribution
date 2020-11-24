package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorBlendMode extends js.Object
@JSImport("cesium", "ColorBlendMode")
@js.native
object ColorBlendMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorBlendMode with Double] = js.native
  
  @js.native
  sealed trait HIGHLIGHT extends ColorBlendMode
  /* 0 */ @js.native
  object HIGHLIGHT extends TopLevel[HIGHLIGHT with Double]
  
  @js.native
  sealed trait MIX extends ColorBlendMode
  /* 2 */ @js.native
  object MIX extends TopLevel[MIX with Double]
  
  @js.native
  sealed trait REPLACE extends ColorBlendMode
  /* 1 */ @js.native
  object REPLACE extends TopLevel[REPLACE with Double]
}

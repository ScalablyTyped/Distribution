package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalOrigin extends js.Object
@JSImport("cesium", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalOrigin with Double] = js.native
  
  @js.native
  sealed trait CENTER extends HorizontalOrigin
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  @js.native
  sealed trait LEFT extends HorizontalOrigin
  /* 1 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  @js.native
  sealed trait RIGHT extends HorizontalOrigin
  /* 2 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
}

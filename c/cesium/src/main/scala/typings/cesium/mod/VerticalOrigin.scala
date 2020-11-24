package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalOrigin extends js.Object
@JSImport("cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalOrigin with Double] = js.native
  
  @js.native
  sealed trait BOTTOM extends VerticalOrigin
  /* 1 */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with Double]
  
  @js.native
  sealed trait CENTER extends VerticalOrigin
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  @js.native
  sealed trait TOP extends VerticalOrigin
  /* 2 */ @js.native
  object TOP extends TopLevel[TOP with Double]
}

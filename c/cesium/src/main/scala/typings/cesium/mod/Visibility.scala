package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends js.Object
@JSImport("cesium", "Visibility")
@js.native
object Visibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  
  @js.native
  sealed trait FULL extends Visibility
  /* 2 */ @js.native
  object FULL extends TopLevel[FULL with Double]
  
  @js.native
  sealed trait NONE extends Visibility
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait PARTIAL extends Visibility
  /* 1 */ @js.native
  object PARTIAL extends TopLevel[PARTIAL with Double]
}

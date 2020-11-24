package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CullFace extends js.Object
@JSImport("cesium", "CullFace")
@js.native
object CullFace extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CullFace with Double] = js.native
  
  @js.native
  sealed trait BACK extends CullFace
  /* 1 */ @js.native
  object BACK extends TopLevel[BACK with Double]
  
  @js.native
  sealed trait FRONT extends CullFace
  /* 0 */ @js.native
  object FRONT extends TopLevel[FRONT with Double]
  
  @js.native
  sealed trait FRONT_AND_BACK extends CullFace
  /* 2 */ @js.native
  object FRONT_AND_BACK extends TopLevel[FRONT_AND_BACK with Double]
}

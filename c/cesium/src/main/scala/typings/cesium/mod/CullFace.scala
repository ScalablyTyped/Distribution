package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CullFace extends StObject
@JSImport("cesium", "CullFace")
@js.native
object CullFace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CullFace with Double] = js.native
  
  @js.native
  sealed trait BACK extends CullFace
  /* 1 */ val BACK: typings.cesium.mod.CullFace.BACK with Double = js.native
  
  @js.native
  sealed trait FRONT extends CullFace
  /* 0 */ val FRONT: typings.cesium.mod.CullFace.FRONT with Double = js.native
  
  @js.native
  sealed trait FRONT_AND_BACK extends CullFace
  /* 2 */ val FRONT_AND_BACK: typings.cesium.mod.CullFace.FRONT_AND_BACK with Double = js.native
}

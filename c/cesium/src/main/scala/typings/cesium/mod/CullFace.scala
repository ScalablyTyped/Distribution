package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CullFace extends StObject
@JSImport("cesium", "CullFace")
@js.native
object CullFace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CullFace & Double] = js.native
  
  @js.native
  sealed trait BACK
    extends StObject
       with CullFace
  /* 1 */ val BACK: typings.cesium.mod.CullFace.BACK & Double = js.native
  
  @js.native
  sealed trait FRONT
    extends StObject
       with CullFace
  /* 0 */ val FRONT: typings.cesium.mod.CullFace.FRONT & Double = js.native
  
  @js.native
  sealed trait FRONT_AND_BACK
    extends StObject
       with CullFace
  /* 2 */ val FRONT_AND_BACK: typings.cesium.mod.CullFace.FRONT_AND_BACK & Double = js.native
}

package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendOption extends StObject
@JSImport("cesium", "BlendOption")
@js.native
object BlendOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendOption & Double] = js.native
  
  @js.native
  sealed trait OPAQUE
    extends StObject
       with BlendOption
  /* 0 */ val OPAQUE: typings.cesium.mod.BlendOption.OPAQUE & Double = js.native
  
  @js.native
  sealed trait OPAQUE_AND_TRANSLUCENT
    extends StObject
       with BlendOption
  /* 1 */ val OPAQUE_AND_TRANSLUCENT: typings.cesium.mod.BlendOption.OPAQUE_AND_TRANSLUCENT & Double = js.native
  
  @js.native
  sealed trait TRANSLUCENT
    extends StObject
       with BlendOption
  /* 2 */ val TRANSLUCENT: typings.cesium.mod.BlendOption.TRANSLUCENT & Double = js.native
}

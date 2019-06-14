package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "MaterialAppearance")
@js.native
object MaterialAppearanceNs extends js.Object {
  @js.native
  sealed trait MaterialSupport extends js.Object
  
  @js.native
  object MaterialSupport extends js.Object {
    @js.native
    sealed trait ALL
      extends cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport
    
    @js.native
    sealed trait BASIC
      extends cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport
    
    @js.native
    sealed trait TEXTURED
      extends cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport
    
    /* 2 */ val ALL: ALL with scala.Double = js.native
    /* 0 */ val BASIC: BASIC with scala.Double = js.native
    /* 1 */ val TEXTURED: TEXTURED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport with scala.Double] = js.native
  }
  
}


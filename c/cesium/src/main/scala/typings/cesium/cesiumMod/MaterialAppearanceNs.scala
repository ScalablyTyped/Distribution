package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.MaterialAppearanceNs.MaterialSupport
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
    sealed trait ALL extends MaterialSupport
    
    @js.native
    sealed trait BASIC extends MaterialSupport
    
    @js.native
    sealed trait TEXTURED extends MaterialSupport
    
    /* 2 */ val ALL: typings.cesium.cesiumMod.MaterialAppearanceNs.MaterialSupport.ALL with Double = js.native
    /* 0 */ val BASIC: typings.cesium.cesiumMod.MaterialAppearanceNs.MaterialSupport.BASIC with Double = js.native
    /* 1 */ val TEXTURED: typings.cesium.cesiumMod.MaterialAppearanceNs.MaterialSupport.TEXTURED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MaterialSupport with Double] = js.native
  }
  
}


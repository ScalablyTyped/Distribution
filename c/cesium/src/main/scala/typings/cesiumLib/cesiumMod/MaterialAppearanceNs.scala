package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "MaterialAppearance")
@js.native
object MaterialAppearanceNs extends js.Object {
  @js.native
  object MaterialSupport extends js.Object {
    val ALL: cesiumLib.cesiumMod.CesiumNs.MaterialAppearanceNs.MaterialSupport.ALL with java.lang.String = js.native
    val BASIC: cesiumLib.cesiumMod.CesiumNs.MaterialAppearanceNs.MaterialSupport.BASIC with java.lang.String = js.native
    val TEXTURED: cesiumLib.cesiumMod.CesiumNs.MaterialAppearanceNs.MaterialSupport.TEXTURED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        cesiumLib.cesiumMod.CesiumNs.MaterialAppearanceNs.MaterialSupport with java.lang.String
      ] = js.native
  }
  
  type MaterialSupport = cesiumLib.cesiumMod.CesiumNs.MaterialAppearanceNs.MaterialSupport
}


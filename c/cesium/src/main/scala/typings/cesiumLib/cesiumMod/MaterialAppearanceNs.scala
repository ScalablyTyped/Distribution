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
    
    val ALL: ALL with java.lang.String = js.native
    val BASIC: BASIC with java.lang.String = js.native
    val TEXTURED: TEXTURED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport with java.lang.String] = js.native
  }
  
}


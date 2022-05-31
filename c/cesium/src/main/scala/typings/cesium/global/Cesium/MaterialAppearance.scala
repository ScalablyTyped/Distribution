package typings.cesium.global.Cesium

import typings.cesium.anon.FaceForward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.MaterialAppearance")
@js.native
class MaterialAppearance ()
  extends typings.cesium.mod.MaterialAppearance {
  def this(options: FaceForward) = this()
}
object MaterialAppearance {
  
  @JSGlobal("Cesium.MaterialAppearance.MaterialSupport")
  @js.native
  object MaterialSupport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cesium.mod.MaterialAppearance.MaterialSupport & Double] = js.native
    
    /* 2 */ val ALL: typings.cesium.mod.MaterialAppearance.MaterialSupport.ALL & Double = js.native
    
    /* 0 */ val BASIC: typings.cesium.mod.MaterialAppearance.MaterialSupport.BASIC & Double = js.native
    
    /* 1 */ val TEXTURED: typings.cesium.mod.MaterialAppearance.MaterialSupport.TEXTURED & Double = js.native
  }
}

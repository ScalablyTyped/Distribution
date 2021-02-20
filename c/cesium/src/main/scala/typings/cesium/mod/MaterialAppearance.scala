package typings.cesium.mod

import typings.cesium.anon.FaceForward
import typings.cesium.mod.MaterialAppearance.MaterialSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "MaterialAppearance")
@js.native
class MaterialAppearance () extends Appearance {
  def this(options: FaceForward) = this()
  
  val faceForward: Boolean = js.native
  
  val flat: Boolean = js.native
  
  val materialSupport: MaterialSupport = js.native
  
  val vertexFormat: VertexFormat = js.native
}
object MaterialAppearance {
  
  @js.native
  sealed trait MaterialSupport extends StObject
  @JSImport("cesium", "MaterialAppearance.MaterialSupport")
  @js.native
  object MaterialSupport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MaterialSupport with Double] = js.native
    
    @js.native
    sealed trait ALL extends MaterialSupport
    /* 2 */ val ALL: typings.cesium.mod.MaterialAppearance.MaterialSupport.ALL with Double = js.native
    
    @js.native
    sealed trait BASIC extends MaterialSupport
    /* 0 */ val BASIC: typings.cesium.mod.MaterialAppearance.MaterialSupport.BASIC with Double = js.native
    
    @js.native
    sealed trait TEXTURED extends MaterialSupport
    /* 1 */ val TEXTURED: typings.cesium.mod.MaterialAppearance.MaterialSupport.TEXTURED with Double = js.native
  }
}

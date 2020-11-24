package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.anon.FaceForward
import typings.cesium.mod.MaterialAppearance.MaterialSupport
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
@JSImport("cesium", "MaterialAppearance")
@js.native
object MaterialAppearance extends js.Object {
  
  @js.native
  sealed trait MaterialSupport extends js.Object
  @js.native
  object MaterialSupport extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MaterialSupport with Double] = js.native
    
    @js.native
    sealed trait ALL extends MaterialSupport
    /* 2 */ @js.native
    object ALL extends TopLevel[ALL with Double]
    
    @js.native
    sealed trait BASIC extends MaterialSupport
    /* 0 */ @js.native
    object BASIC extends TopLevel[BASIC with Double]
    
    @js.native
    sealed trait TEXTURED extends MaterialSupport
    /* 1 */ @js.native
    object TEXTURED extends TopLevel[TEXTURED with Double]
  }
}

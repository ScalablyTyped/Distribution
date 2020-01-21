package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.AnonClosedFaceForward
import typings.cesium.mod.MaterialAppearance.MaterialSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "MaterialAppearance")
@js.native
class MaterialAppearance () extends Appearance {
  def this(options: AnonClosedFaceForward) = this()
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
    @js.native
    sealed trait ALL extends MaterialSupport
    
    @js.native
    sealed trait BASIC extends MaterialSupport
    
    @js.native
    sealed trait TEXTURED extends MaterialSupport
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MaterialSupport with Double] = js.native
    /* 2 */ @js.native
    object ALL extends TopLevel[ALL with Double]
    
    /* 0 */ @js.native
    object BASIC extends TopLevel[BASIC with Double]
    
    /* 1 */ @js.native
    object TEXTURED extends TopLevel[TEXTURED with Double]
    
  }
  
}


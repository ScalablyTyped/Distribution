package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TextureAspect")
@js.native
object TextureAspect extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.babylonjs.BABYLON.TextureAspect & String] = js.native
  
  /* "all" */ val All: typings.babylonjs.BABYLON.TextureAspect.All & String = js.native
  
  /* "depth-only" */ val DepthOnly: typings.babylonjs.BABYLON.TextureAspect.DepthOnly & String = js.native
  
  /* "stencil-only" */ val StencilOnly: typings.babylonjs.BABYLON.TextureAspect.StencilOnly & String = js.native
}

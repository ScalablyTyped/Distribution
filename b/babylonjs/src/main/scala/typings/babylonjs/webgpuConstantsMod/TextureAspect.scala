package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureAspect extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "TextureAspect")
@js.native
object TextureAspect extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextureAspect & String] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with TextureAspect
  /* "all" */ val All: typings.babylonjs.webgpuConstantsMod.TextureAspect.All & String = js.native
  
  @js.native
  sealed trait DepthOnly
    extends StObject
       with TextureAspect
  /* "depth-only" */ val DepthOnly: typings.babylonjs.webgpuConstantsMod.TextureAspect.DepthOnly & String = js.native
  
  @js.native
  sealed trait StencilOnly
    extends StObject
       with TextureAspect
  /* "stencil-only" */ val StencilOnly: typings.babylonjs.webgpuConstantsMod.TextureAspect.StencilOnly & String = js.native
}

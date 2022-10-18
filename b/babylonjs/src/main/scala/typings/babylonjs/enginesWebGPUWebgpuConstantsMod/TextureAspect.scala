package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

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
  /* "all" */ val All: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureAspect.All & String = js.native
  
  @js.native
  sealed trait DepthOnly
    extends StObject
       with TextureAspect
  /* "depth-only" */ val DepthOnly: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureAspect.DepthOnly & String = js.native
  
  @js.native
  sealed trait StencilOnly
    extends StObject
       with TextureAspect
  /* "stencil-only" */ val StencilOnly: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureAspect.StencilOnly & String = js.native
}

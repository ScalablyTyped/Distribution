package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureViewDimension extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "TextureViewDimension")
@js.native
object TextureViewDimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextureViewDimension & String] = js.native
  
  @js.native
  sealed trait Cube
    extends StObject
       with TextureViewDimension
  /* "cube" */ val Cube: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureViewDimension.Cube & String = js.native
  
  @js.native
  sealed trait CubeArray
    extends StObject
       with TextureViewDimension
  /* "cube-array" */ val CubeArray: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureViewDimension.CubeArray & String = js.native
  
  @js.native
  sealed trait E1d
    extends StObject
       with TextureViewDimension
  /* "1d" */ val E1d: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureViewDimension.E1d & String = js.native
  
  @js.native
  sealed trait E2d
    extends StObject
       with TextureViewDimension
  /* "2d" */ val E2d: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureViewDimension.E2d & String = js.native
  
  @js.native
  sealed trait E2dArray
    extends StObject
       with TextureViewDimension
  /* "2d-array" */ val E2dArray: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureViewDimension.E2dArray & String = js.native
  
  @js.native
  sealed trait E3d
    extends StObject
       with TextureViewDimension
  /* "3d" */ val E3d: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureViewDimension.E3d & String = js.native
}

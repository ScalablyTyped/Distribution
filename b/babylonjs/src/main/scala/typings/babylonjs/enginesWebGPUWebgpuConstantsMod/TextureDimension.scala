package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureDimension extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "TextureDimension")
@js.native
object TextureDimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextureDimension & String] = js.native
  
  @js.native
  sealed trait E1d
    extends StObject
       with TextureDimension
  /* "1d" */ val E1d: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureDimension.E1d & String = js.native
  
  @js.native
  sealed trait E2d
    extends StObject
       with TextureDimension
  /* "2d" */ val E2d: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureDimension.E2d & String = js.native
  
  @js.native
  sealed trait E3d
    extends StObject
       with TextureDimension
  /* "3d" */ val E3d: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureDimension.E3d & String = js.native
}

package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShaderStage extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "ShaderStage")
@js.native
object ShaderStage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShaderStage & Double] = js.native
  
  @js.native
  sealed trait Compute
    extends StObject
       with ShaderStage
  /* 4 */ val Compute: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.ShaderStage.Compute & Double = js.native
  
  @js.native
  sealed trait Fragment
    extends StObject
       with ShaderStage
  /* 2 */ val Fragment: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.ShaderStage.Fragment & Double = js.native
  
  @js.native
  sealed trait Vertex
    extends StObject
       with ShaderStage
  /* 1 */ val Vertex: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.ShaderStage.Vertex & Double = js.native
}

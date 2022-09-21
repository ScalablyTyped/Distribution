package typings.babylonjs.webgpuConstantsMod

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
  /* 4 */ val Compute: typings.babylonjs.webgpuConstantsMod.ShaderStage.Compute & Double = js.native
  
  @js.native
  sealed trait Fragment
    extends StObject
       with ShaderStage
  /* 2 */ val Fragment: typings.babylonjs.webgpuConstantsMod.ShaderStage.Fragment & Double = js.native
  
  @js.native
  sealed trait Vertex
    extends StObject
       with ShaderStage
  /* 1 */ val Vertex: typings.babylonjs.webgpuConstantsMod.ShaderStage.Vertex & Double = js.native
}

package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureUsage extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "TextureUsage")
@js.native
object TextureUsage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureUsage & Double] = js.native
  
  @js.native
  sealed trait CopyDst
    extends StObject
       with TextureUsage
  /* 2 */ val CopyDst: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureUsage.CopyDst & Double = js.native
  
  @js.native
  sealed trait CopySrc
    extends StObject
       with TextureUsage
  /* 1 */ val CopySrc: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureUsage.CopySrc & Double = js.native
  
  @js.native
  sealed trait RenderAttachment
    extends StObject
       with TextureUsage
  /* 16 */ val RenderAttachment: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureUsage.RenderAttachment & Double = js.native
  
  @js.native
  sealed trait StorageBinding
    extends StObject
       with TextureUsage
  /* 8 */ val StorageBinding: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureUsage.StorageBinding & Double = js.native
  
  @js.native
  sealed trait TextureBinding
    extends StObject
       with TextureUsage
  /* 4 */ val TextureBinding: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureUsage.TextureBinding & Double = js.native
}

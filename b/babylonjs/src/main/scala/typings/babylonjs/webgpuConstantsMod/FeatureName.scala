package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FeatureName extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "FeatureName")
@js.native
object FeatureName extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FeatureName & String] = js.native
  
  @js.native
  sealed trait BGRA8UnormStorage
    extends StObject
       with FeatureName
  /* "bgra8unorm-storage" */ val BGRA8UnormStorage: typings.babylonjs.webgpuConstantsMod.FeatureName.BGRA8UnormStorage & String = js.native
  
  @js.native
  sealed trait Depth24UnormStencil8
    extends StObject
       with FeatureName
  /* "depth24unorm-stencil8" */ val Depth24UnormStencil8: typings.babylonjs.webgpuConstantsMod.FeatureName.Depth24UnormStencil8 & String = js.native
  
  @js.native
  sealed trait Depth32FloatStencil8
    extends StObject
       with FeatureName
  /* "depth32float-stencil8" */ val Depth32FloatStencil8: typings.babylonjs.webgpuConstantsMod.FeatureName.Depth32FloatStencil8 & String = js.native
  
  @js.native
  sealed trait DepthClipControl
    extends StObject
       with FeatureName
  /* "depth-clip-control" */ val DepthClipControl: typings.babylonjs.webgpuConstantsMod.FeatureName.DepthClipControl & String = js.native
  
  @js.native
  sealed trait IndirectFirstInstance
    extends StObject
       with FeatureName
  /* "indirect-first-instance" */ val IndirectFirstInstance: typings.babylonjs.webgpuConstantsMod.FeatureName.IndirectFirstInstance & String = js.native
  
  @js.native
  sealed trait ShaderF16
    extends StObject
       with FeatureName
  /* "shader-f16" */ val ShaderF16: typings.babylonjs.webgpuConstantsMod.FeatureName.ShaderF16 & String = js.native
  
  @js.native
  sealed trait TextureCompressionASTC
    extends StObject
       with FeatureName
  /* "texture-compression-astc" */ val TextureCompressionASTC: typings.babylonjs.webgpuConstantsMod.FeatureName.TextureCompressionASTC & String = js.native
  
  @js.native
  sealed trait TextureCompressionBC
    extends StObject
       with FeatureName
  /* "texture-compression-bc" */ val TextureCompressionBC: typings.babylonjs.webgpuConstantsMod.FeatureName.TextureCompressionBC & String = js.native
  
  @js.native
  sealed trait TextureCompressionETC2
    extends StObject
       with FeatureName
  /* "texture-compression-etc2" */ val TextureCompressionETC2: typings.babylonjs.webgpuConstantsMod.FeatureName.TextureCompressionETC2 & String = js.native
  
  @js.native
  sealed trait TimestampQuery
    extends StObject
       with FeatureName
  /* "timestamp-query" */ val TimestampQuery: typings.babylonjs.webgpuConstantsMod.FeatureName.TimestampQuery & String = js.native
}

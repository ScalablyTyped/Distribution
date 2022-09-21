package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComputeBindingType extends StObject
@JSGlobal("BABYLON.ComputeBindingType")
@js.native
object ComputeBindingType extends StObject {
  
  @js.native
  sealed trait Sampler
    extends StObject
       with ComputeBindingType
  
  @js.native
  sealed trait StorageBuffer
    extends StObject
       with ComputeBindingType
  
  @js.native
  sealed trait StorageTexture
    extends StObject
       with ComputeBindingType
  
  @js.native
  sealed trait Texture
    extends StObject
       with ComputeBindingType
  
  @js.native
  sealed trait TextureWithoutSampler
    extends StObject
       with ComputeBindingType
  
  @js.native
  sealed trait UniformBuffer
    extends StObject
       with ComputeBindingType
}

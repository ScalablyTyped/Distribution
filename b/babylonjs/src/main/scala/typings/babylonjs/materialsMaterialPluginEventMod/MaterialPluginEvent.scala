package typings.babylonjs.materialsMaterialPluginEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaterialPluginEvent extends StObject
@JSImport("babylonjs/Materials/materialPluginEvent", "MaterialPluginEvent")
@js.native
object MaterialPluginEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaterialPluginEvent & Double] = js.native
  
  @js.native
  sealed trait BindForSubMesh
    extends StObject
       with MaterialPluginEvent
  /* 64 */ val BindForSubMesh: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.BindForSubMesh & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with MaterialPluginEvent
  /* 1 */ val Created: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.Created & Double = js.native
  
  @js.native
  sealed trait Disposed
    extends StObject
       with MaterialPluginEvent
  /* 2 */ val Disposed: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.Disposed & Double = js.native
  
  @js.native
  sealed trait FillRenderTargetTextures
    extends StObject
       with MaterialPluginEvent
  /* 2048 */ val FillRenderTargetTextures: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.FillRenderTargetTextures & Double = js.native
  
  @js.native
  sealed trait GetActiveTextures
    extends StObject
       with MaterialPluginEvent
  /* 512 */ val GetActiveTextures: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.GetActiveTextures & Double = js.native
  
  @js.native
  sealed trait GetAnimatables
    extends StObject
       with MaterialPluginEvent
  /* 256 */ val GetAnimatables: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.GetAnimatables & Double = js.native
  
  @js.native
  sealed trait GetDefineNames
    extends StObject
       with MaterialPluginEvent
  /* 4 */ val GetDefineNames: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.GetDefineNames & Double = js.native
  
  @js.native
  sealed trait HardBindForSubMesh
    extends StObject
       with MaterialPluginEvent
  /* 8192 */ val HardBindForSubMesh: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.HardBindForSubMesh & Double = js.native
  
  @js.native
  sealed trait HasRenderTargetTextures
    extends StObject
       with MaterialPluginEvent
  /* 4096 */ val HasRenderTargetTextures: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.HasRenderTargetTextures & Double = js.native
  
  @js.native
  sealed trait HasTexture
    extends StObject
       with MaterialPluginEvent
  /* 1024 */ val HasTexture: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.HasTexture & Double = js.native
  
  @js.native
  sealed trait IsReadyForSubMesh
    extends StObject
       with MaterialPluginEvent
  /* 16 */ val IsReadyForSubMesh: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.IsReadyForSubMesh & Double = js.native
  
  @js.native
  sealed trait PrepareDefines
    extends StObject
       with MaterialPluginEvent
  /* 32 */ val PrepareDefines: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.PrepareDefines & Double = js.native
  
  @js.native
  sealed trait PrepareEffect
    extends StObject
       with MaterialPluginEvent
  /* 128 */ val PrepareEffect: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.PrepareEffect & Double = js.native
  
  @js.native
  sealed trait PrepareUniformBuffer
    extends StObject
       with MaterialPluginEvent
  /* 8 */ val PrepareUniformBuffer: typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.PrepareUniformBuffer & Double = js.native
}

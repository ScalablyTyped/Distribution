package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaterialPluginEvent extends StObject
@JSGlobal("BABYLON.MaterialPluginEvent")
@js.native
object MaterialPluginEvent extends StObject {
  
  @js.native
  sealed trait BindForSubMesh
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait Created
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait Disposed
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait FillRenderTargetTextures
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait GetActiveTextures
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait GetAnimatables
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait GetDefineNames
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait HardBindForSubMesh
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait HasRenderTargetTextures
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait HasTexture
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait IsReadyForSubMesh
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait PrepareDefines
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait PrepareEffect
    extends StObject
       with MaterialPluginEvent
  
  @js.native
  sealed trait PrepareUniformBuffer
    extends StObject
       with MaterialPluginEvent
}

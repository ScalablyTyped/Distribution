package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sceneComponentMod {
  
  type CameraStageAction = js.Function1[/* camera */ typings.babylonjs.cameraMod.Camera, scala.Unit]
  
  type CameraStageFrameBufferAction = js.Function1[/* camera */ typings.babylonjs.cameraMod.Camera, scala.Boolean]
  
  type EvaluateSubMeshStageAction = js.Function2[
    /* mesh */ typings.babylonjs.abstractMeshMod.AbstractMesh, 
    /* subMesh */ typings.babylonjs.subMeshMod.SubMesh, 
    scala.Unit
  ]
  
  type MeshStageAction = js.Function2[
    /* mesh */ typings.babylonjs.abstractMeshMod.AbstractMesh, 
    /* hardwareInstancedRendering */ scala.Boolean, 
    scala.Boolean
  ]
  
  type PointerMoveStageAction = js.Function5[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ typings.babylonjs.typesMod.Nullable[typings.babylonjs.pickingInfoMod.PickingInfo], 
    /* isMeshPicked */ scala.Boolean, 
    /* element */ typings.std.HTMLElement, 
    typings.babylonjs.typesMod.Nullable[typings.babylonjs.pickingInfoMod.PickingInfo]
  ]
  
  type PointerUpDownStageAction = js.Function4[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ typings.babylonjs.typesMod.Nullable[typings.babylonjs.pickingInfoMod.PickingInfo], 
    /* evt */ typings.std.PointerEvent, 
    typings.babylonjs.typesMod.Nullable[typings.babylonjs.pickingInfoMod.PickingInfo]
  ]
  
  type PreActiveMeshStageAction = js.Function1[/* mesh */ typings.babylonjs.abstractMeshMod.AbstractMesh, scala.Unit]
  
  type RenderTargetStageAction = js.Function1[
    /* renderTarget */ typings.babylonjs.renderTargetTextureMod.RenderTargetTexture, 
    scala.Unit
  ]
  
  type RenderTargetsStageAction = js.Function1[
    /* renderTargets */ typings.babylonjs.smartArrayMod.SmartArrayNoDuplicate[typings.babylonjs.renderTargetTextureMod.RenderTargetTexture], 
    scala.Unit
  ]
  
  type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ scala.Double, scala.Unit]
  
  type RenderingMeshStageAction = js.Function4[
    /* mesh */ typings.babylonjs.meshMod.Mesh, 
    /* subMesh */ typings.babylonjs.subMeshMod.SubMesh, 
    /* batch */ typings.babylonjs.meshMod.InstancesBatch, 
    /* effect */ typings.babylonjs.typesMod.Nullable[typings.babylonjs.effectMod.Effect], 
    scala.Unit
  ]
  
  type SimpleStageAction = js.Function0[scala.Unit]
}

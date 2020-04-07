package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sceneComponentMod {
  type ActiveMeshStageAction = js.Function2[
    /* sourceMesh */ typings.babylonjs.abstractMeshMod.AbstractMesh, 
    /* mesh */ typings.babylonjs.abstractMeshMod.AbstractMesh, 
    scala.Unit
  ]
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
  type RenderTargetStageAction = js.Function1[
    /* renderTarget */ typings.babylonjs.renderTargetTextureMod.RenderTargetTexture, 
    scala.Unit
  ]
  type RenderTargetsStageAction = js.Function1[
    /* renderTargets */ typings.babylonjs.smartArrayMod.SmartArrayNoDuplicate[typings.babylonjs.renderTargetTextureMod.RenderTargetTexture], 
    scala.Unit
  ]
  type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ scala.Double, scala.Unit]
  type RenderingMeshStageAction = js.Function3[
    /* mesh */ typings.babylonjs.meshMod.Mesh, 
    /* subMesh */ typings.babylonjs.subMeshMod.SubMesh, 
    /* batch */ typings.babylonjs.meshMod.InstancesBatch, 
    scala.Unit
  ]
  type SimpleStageAction = js.Function0[scala.Unit]
}

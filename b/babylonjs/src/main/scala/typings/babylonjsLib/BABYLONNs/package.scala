package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BABYLONNs {
  /**
    * Strong typing of a Active Mesh related stage step action
    */
  type ActiveMeshStageAction = js.Function2[/* sourceMesh */ AbstractMesh, /* mesh */ AbstractMesh, scala.Unit]
  /**
    * Defines how the parser contract is defined.
    * These parsers are used to parse a list of specific assets (like particle systems, etc..)
    */
  type BabylonFileParser = js.Function4[
    /* parsedData */ js.Any, 
    /* scene */ Scene, 
    /* container */ AssetContainer, 
    /* rootUrl */ java.lang.String, 
    scala.Unit
  ]
  /**
    * Represents a map of input types to input instance or input index to input instance.
    */
  type CameraInputsMap[TCamera /* <: Camera */] = (/**
    * Accessor to the input by input type.
    */
  org.scalablytyped.runtime.StringDictionary[ICameraInput[TCamera]]) with (/**
    * Accessor to the input by input index.
    */
  org.scalablytyped.runtime.NumberDictionary[ICameraInput[TCamera]])
  /**
    * Strong typing of a Camera related stage step action
    */
  type CameraStageAction = js.Function1[/* camera */ Camera, scala.Unit]
  /**
    * Alias for types that can be used by a Buffer or VertexBuffer.
    */
  type DataArray = js.Array[scala.Double] | stdLib.ArrayBuffer | stdLib.ArrayBufferView
  /**
    * Strong typing of a Evaluate Sub Mesh related stage step action
    */
  type EvaluateSubMeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* subMesh */ SubMesh, scala.Unit]
  /** Alias type for number array or Float32Array */
  type FloatArray = js.Array[scala.Double] | stdLib.Float32Array
  /**
    * Interface used by SceneLoader plugins to define supported file extensions
    */
  type ISceneLoaderPluginExtensions = /**
    * Defines the list of supported extensions
    */
  org.scalablytyped.runtime.StringDictionary[babylonjsLib.Anon_IsBinary]
  /** Alias type for number array or Float32Array or Int32Array or Uint32Array or Uint16Array */
  type IndicesArray = js.Array[scala.Double] | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Uint16Array
  /**
    * Defines how the individual parser contract is defined.
    * These parser can parse an individual asset
    */
  type IndividualBabylonFileParser = js.Function3[/* parsedData */ js.Any, /* scene */ Scene, /* rootUrl */ java.lang.String, js.Any]
  /**
    * Strong typing of a Mesh related stage step action
    */
  type MeshStageAction = js.Function2[
    /* mesh */ AbstractMesh, 
    /* hardwareInstancedRendering */ scala.Boolean, 
    scala.Boolean
  ]
  /**
    * Defines how a node can be built from a string name.
    */
  type NodeConstructor = js.Function3[
    /* name */ java.lang.String, 
    /* scene */ Scene, 
    /* options */ js.UndefOr[js.Any], 
    js.Function0[Node]
  ]
  /** Alias type for value that can be null */
  type Nullable[T] = T | scala.Null
  /**
    * Strong typing of a pointer move action.
    */
  type PointerMoveStageAction = js.Function5[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ Nullable[PickingInfo], 
    /* isMeshPicked */ scala.Boolean, 
    /* canvas */ babylonjsLib.HTMLCanvasElement, 
    Nullable[PickingInfo]
  ]
  /**
    * Strong typing of a pointer up/down action.
    */
  type PointerUpDownStageAction = js.Function4[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ Nullable[PickingInfo], 
    /* evt */ stdLib.PointerEvent, 
    Nullable[PickingInfo]
  ]
  /**
    * Strong typing of a render target action.
    */
  type RenderTargetsStageAction = js.Function1[/* renderTargets */ SmartArrayNoDuplicate[RenderTargetTexture], scala.Unit]
  /**
    * Strong typing of a RenderingGroup related stage step action
    */
  type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ scala.Double, scala.Unit]
  /**
    * Strong typing of a Mesh Render related stage step action
    */
  type RenderingMeshStageAction = js.Function3[
    /* mesh */ AbstractMesh, 
    /* subMesh */ SubMesh, 
    /* batch */ _InstancesBatch, 
    scala.Unit
  ]
  /**
    * Strong typing of a simple stage step action
    */
  type SimpleStageAction = js.Function0[scala.Unit]
  /**
    * Alias type for number that are doubles.
    * @ignorenaming
    */
  type double = scala.Double
  /**
    * Alias type for number that are floats
    * @ignorenaming
    */
  type float = scala.Double
  /**
    * Alias type for number that are integer
    * @ignorenaming
    */
  type int = scala.Double
}

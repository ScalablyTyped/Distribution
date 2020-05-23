package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeMaterialSystemValues extends js.Object

@JSGlobal("BABYLON.NodeMaterialSystemValues")
@js.native
object NodeMaterialSystemValues extends js.Object {
  /** CameraPosition */
  @js.native
  sealed trait CameraPosition extends NodeMaterialSystemValues
  
  /** Delta time */
  @js.native
  sealed trait DeltaTime extends NodeMaterialSystemValues
  
  /** Fog Color */
  @js.native
  sealed trait FogColor extends NodeMaterialSystemValues
  
  /** Projection */
  @js.native
  sealed trait Projection extends NodeMaterialSystemValues
  
  /** View */
  @js.native
  sealed trait View extends NodeMaterialSystemValues
  
  /** ViewProjection */
  @js.native
  sealed trait ViewProjection extends NodeMaterialSystemValues
  
  /** World */
  @js.native
  sealed trait World extends NodeMaterialSystemValues
  
  /** WorldView */
  @js.native
  sealed trait WorldView extends NodeMaterialSystemValues
  
  /** WorldViewProjection */
  @js.native
  sealed trait WorldViewProjection extends NodeMaterialSystemValues
  
}


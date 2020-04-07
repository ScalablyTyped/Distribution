package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeMaterialSystemValues with Double] = js.native
  /* 7 */ @js.native
  object CameraPosition extends TopLevel[CameraPosition with Double]
  
  /* 9 */ @js.native
  object DeltaTime extends TopLevel[DeltaTime with Double]
  
  /* 8 */ @js.native
  object FogColor extends TopLevel[FogColor with Double]
  
  /* 3 */ @js.native
  object Projection extends TopLevel[Projection with Double]
  
  /* 2 */ @js.native
  object View extends TopLevel[View with Double]
  
  /* 4 */ @js.native
  object ViewProjection extends TopLevel[ViewProjection with Double]
  
  /* 1 */ @js.native
  object World extends TopLevel[World with Double]
  
  /* 5 */ @js.native
  object WorldView extends TopLevel[WorldView with Double]
  
  /* 6 */ @js.native
  object WorldViewProjection extends TopLevel[WorldViewProjection with Double]
  
}


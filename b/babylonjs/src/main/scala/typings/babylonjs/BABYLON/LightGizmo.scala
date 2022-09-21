package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.ILightGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined onClickedObservable, light, material */ @js.native
trait LightGizmo
  extends StObject
     with Gizmo {
  
  /* protected */ var _attachedMeshParent: TransformNode = js.native
  
  /* protected */ var _cachedForward: Vector3 = js.native
  
  /* protected */ var _cachedPosition: Vector3 = js.native
  
  /* protected */ var _light: Nullable[Light] = js.native
  
  /* protected */ var _lightMesh: Mesh = js.native
  
  /* protected */ var _material: StandardMaterial = js.native
  
  /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
  
  /**
    * Override attachedNode because lightgizmo only support attached mesh
    * It will return the attached mesh (if any) and setting an attached node will log
    * a warning
    */
  @JSName("attachedNode")
  def attachedNode_MLightGizmo: Nullable[Node] = js.native
  
  def light: Nullable[Light] = js.native
  /**
    * The light that the gizmo is attached to
    */
  def light_=(light: Nullable[Light]): Unit = js.native
  /** The light that the gizmo is attached to */
  @JSName("light")
  var light_FLightGizmo: Nullable[Light] = js.native
  
  /**
    * Gets the material used to render the light gizmo
    */
  def material: StandardMaterial = js.native
  /** The material used to render the light gizmo */
  @JSName("material")
  val material_FLightGizmo: StandardMaterial = js.native
  
  /**
    * Event that fires each time the gizmo is clicked
    */
  var onClickedObservable: Observable[Light] = js.native
}

package typings.babylonjs

import typings.babylonjs.gizmoMod.GizmoAxisCache
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.pointerEventsMod.PointerInfo
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.standardMaterialMod.StandardMaterial
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gizmos/index", JSImport.Namespace)
@js.native
object gizmosIndexMod extends js.Object {
  
  @js.native
  class AxisDragGizmo protected ()
    extends typings.babylonjs.axisDragGizmoMod.AxisDragGizmo {
    /**
      * Creates an AxisDragGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragAxis The axis which the gizmo will be able to drag on
      * @param color The color of the gizmo
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: js.UndefOr[scala.Nothing], gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
      thickness: Double
    ) = this()
  }
  /* static members */
  @js.native
  object AxisDragGizmo extends js.Object {
    
    /** @hidden */
    def _CreateArrow(scene: Scene, material: StandardMaterial): TransformNode = js.native
    def _CreateArrow(
      scene: Scene,
      material: StandardMaterial,
      thickness: js.UndefOr[scala.Nothing],
      isCollider: Boolean
    ): TransformNode = js.native
    def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double): TransformNode = js.native
    def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double, isCollider: Boolean): TransformNode = js.native
    
    /** @hidden */
    def _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode = js.native
  }
  
  @js.native
  class AxisScaleGizmo protected ()
    extends typings.babylonjs.axisScaleGizmoMod.AxisScaleGizmo {
    /**
      * Creates an AxisScaleGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragAxis The axis which the gizmo will be able to scale on
      * @param color The color of the gizmo
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: js.UndefOr[scala.Nothing], gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: js.UndefOr[Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: js.UndefOr[Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]],
      thickness: Double
    ) = this()
  }
  
  @js.native
  /**
    * Creates an BoundingBoxGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param color The color of the gizmo
    */
  class BoundingBoxGizmo ()
    extends typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo {
    def this(color: Color3) = this()
    def this(color: js.UndefOr[scala.Nothing], gizmoLayer: UtilityLayerRenderer) = this()
    def this(color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  @js.native
  object BoundingBoxGizmo extends js.Object {
    
    /**
      * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
      * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
      * @returns the bounding box mesh with the passed in mesh as a child
      */
    def MakeNotPickableAndWrapInBoundingBox(mesh: Mesh): Mesh = js.native
  }
  
  @js.native
  /**
    * Creates a CameraGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class CameraGizmo ()
    extends typings.babylonjs.cameraGizmoMod.CameraGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  @js.native
  object CameraGizmo extends js.Object {
    
    var _CreateCameraFrustum: js.Any = js.native
    
    var _CreateCameraMesh: js.Any = js.native
    
    var _Scale: js.Any = js.native
  }
  
  @js.native
  /**
    * Creates a gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class Gizmo ()
    extends typings.babylonjs.gizmoMod.Gizmo {
    def this(/** The utility layer the gizmo will be added to */
    gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  @js.native
  object Gizmo extends js.Object {
    
    /**
      * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
      * @returns {Observer<PointerInfo>} pointerObserver
      */
    def GizmoAxisPointerObserver(gizmoLayer: UtilityLayerRenderer, gizmoAxisCache: Map[Mesh, GizmoAxisCache]): Observer[PointerInfo] = js.native
  }
  
  @js.native
  class GizmoManager protected ()
    extends typings.babylonjs.gizmoManagerMod.GizmoManager {
    /**
      * Instatiates a gizmo manager
      * @param scene the scene to overlay the gizmos on top of
      * @param thickness display gizmo axis thickness
      * @param utilityLayer the layer where gizmos are rendered
      * @param keepDepthUtilityLayer the layer where occluded gizmos are rendered
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, thickness: Double) = this()
    def this(scene: Scene, thickness: js.UndefOr[scala.Nothing], utilityLayer: UtilityLayerRenderer) = this()
    def this(scene: Scene, thickness: Double, utilityLayer: UtilityLayerRenderer) = this()
    def this(
      scene: Scene,
      thickness: js.UndefOr[scala.Nothing],
      utilityLayer: js.UndefOr[scala.Nothing],
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
    def this(
      scene: Scene,
      thickness: js.UndefOr[scala.Nothing],
      utilityLayer: UtilityLayerRenderer,
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
    def this(
      scene: Scene,
      thickness: Double,
      utilityLayer: js.UndefOr[scala.Nothing],
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
    def this(
      scene: Scene,
      thickness: Double,
      utilityLayer: UtilityLayerRenderer,
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
  }
  
  @js.native
  /**
    * Creates a LightGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class LightGizmo ()
    extends typings.babylonjs.lightGizmoMod.LightGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  @js.native
  object LightGizmo extends js.Object {
    
    var _CreateDirectionalLightMesh: js.Any = js.native
    
    var _CreateHemisphericLightMesh: js.Any = js.native
    
    /**
      * Creates the lines for a light mesh
      */
    var _CreateLightLines: js.Any = js.native
    
    var _CreatePointLightMesh: js.Any = js.native
    
    var _CreateSpotLightMesh: js.Any = js.native
    
    var _Scale: js.Any = js.native
  }
  
  @js.native
  class PlaneDragGizmo protected ()
    extends typings.babylonjs.planeDragGizmoMod.PlaneDragGizmo {
    /**
      * Creates a PlaneDragGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
      * @param color The color of the gizmo
      */
    def this(dragPlaneNormal: Vector3) = this()
    def this(dragPlaneNormal: Vector3, color: Color3) = this()
    def this(dragPlaneNormal: Vector3, color: js.UndefOr[scala.Nothing], gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragPlaneNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
    ) = this()
  }
  /* static members */
  @js.native
  object PlaneDragGizmo extends js.Object {
    
    /** @hidden */
    def _CreatePlane(scene: Scene, material: StandardMaterial): TransformNode = js.native
  }
  
  @js.native
  class PlaneRotationGizmo protected ()
    extends typings.babylonjs.planeRotationGizmoMod.PlaneRotationGizmo {
    /**
      * Creates a PlaneRotationGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
      * @param color The color of the gizmo
      * @param tessellation Amount of tessellation to be used when creating rotation circles
      * @param useEulerRotation Use and update Euler angle instead of quaternion
      * @param thickness display gizmo axis thickness
      */
    def this(
      planeNormal: Vector3,
      color: js.UndefOr[Color3],
      gizmoLayer: js.UndefOr[UtilityLayerRenderer],
      tessellation: js.UndefOr[Double],
      parent: js.UndefOr[Nullable[typings.babylonjs.rotationGizmoMod.RotationGizmo]],
      useEulerRotation: js.UndefOr[Boolean],
      thickness: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  @js.native
  object PlaneRotationGizmo extends js.Object {
    
    var _CircleConstants: js.Any = js.native
  }
  
  @js.native
  /**
    * Creates a PositionGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    @param thickness display gizmo axis thickness
    */
  class PositionGizmo ()
    extends typings.babylonjs.positionGizmoMod.PositionGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
  }
  
  @js.native
  /**
    * Creates a RotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    * @param thickness display gizmo axis thickness
    */
  class RotationGizmo ()
    extends typings.babylonjs.rotationGizmoMod.RotationGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], tessellation: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Double) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean
    ) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], tessellation: Double, useEulerRotation: Boolean) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean
    ) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Double, useEulerRotation: Boolean) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean,
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: Double,
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean,
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Double
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean,
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: Double,
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: Double,
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean,
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: js.UndefOr[scala.Nothing],
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
  }
  
  @js.native
  /**
    * Creates a ScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param thickness display gizmo axis thickness
    */
  class ScaleGizmo ()
    extends typings.babylonjs.scaleGizmoMod.ScaleGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: Double,
      gizmoManager: typings.babylonjs.gizmoManagerMod.GizmoManager
    ) = this()
  }
}

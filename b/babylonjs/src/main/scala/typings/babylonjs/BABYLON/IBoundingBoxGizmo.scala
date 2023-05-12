package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoundingBoxGizmo
  extends StObject
     with IGizmo {
  
  /** Scale factor vector used for masking some axis */
  var axisFactor: Vector3 = js.native
  
  /** Default material used to render when gizmo is not disabled or hovered */
  var coloredMaterial: StandardMaterial = js.native
  
  /** Enables a pointer drag behavior on the bounding box of the gizmo */
  def enableDragBehavior(): Unit = js.native
  
  /**
    * If set, the rotation spheres and scale boxes will increase in size based on the size of the bounding box
    * Note : fixedDragMeshScreenSize takes precedence over fixedDragMeshBoundsSize if both are true
    */
  var fixedDragMeshBoundsSize: Boolean = js.native
  
  /**
    * If set, the rotation spheres and scale boxes will increase in size based on the distance away from the camera to have a consistent screen size
    * Note : fixedDragMeshScreenSize takes precedence over fixedDragMeshBoundsSize if both are true
    */
  var fixedDragMeshScreenSize: Boolean = js.native
  
  /**
    * The distance away from the object which the draggable meshes should appear world sized when fixedDragMeshScreenSize is set to true
    */
  var fixedDragMeshScreenSizeDistanceFactor: Double = js.native
  
  /** Returns an array containing all boxes used for scaling (in increasing x, y and z orders) */
  def getScaleBoxes(): js.Array[AbstractMesh] = js.native
  
  /** Material used to render when gizmo is hovered with mouse*/
  var hoverMaterial: StandardMaterial = js.native
  
  /**
    * If child meshes should be ignored when calculating the bounding box. This should be set to true to avoid perf hits with heavily nested meshes.
    */
  var ignoreChildren: Boolean = js.native
  
  /**
    * Returns true if a descendant should be included when computing the bounding box. When null, all descendants are included. If ignoreChildren is set this will be ignored.
    */
  var includeChildPredicate: Nullable[js.Function1[/* abstractMesh */ AbstractMesh, Boolean]] = js.native
  
  /** Fired when a rotation sphere or scale box is dragged */
  var onDragStartObservable: Observable[js.Object] = js.native
  
  /** Fired when a rotation sphere drag is ended */
  var onRotationSphereDragEndObservable: Observable[js.Object] = js.native
  
  /** Fired when a rotation sphere is dragged */
  var onRotationSphereDragObservable: Observable[js.Object] = js.native
  
  /** Fired when a scale box drag is ended */
  var onScaleBoxDragEndObservable: Observable[js.Object] = js.native
  
  /** Fired when a scale box is dragged */
  var onScaleBoxDragObservable: Observable[js.Object] = js.native
  
  /** The size of the rotation spheres attached to the bounding box */
  var rotationSphereSize: Double = js.native
  
  /** The size of the scale boxes attached to the bounding box */
  var scaleBoxSize: Double = js.native
  
  /** Scale factor scalar affecting all axes' drag speed */
  var scaleDragSpeed: Double = js.native
  
  /** Relative bounding box pivot used when scaling the attached node. */
  var scalePivot: Nullable[Vector3] = js.native
  
  /**
    * Sets the color of the bounding box gizmo
    * @param color the color to set
    */
  def setColor(color: Color3): Unit = js.native
  
  /**
    * Enables rotation on the specified axis and disables rotation on the others
    * @param axis The list of axis that should be enabled (eg. "xy" or "xyz")
    */
  def setEnabledRotationAxis(axis: String): Unit = js.native
  
  /**
    * Enables/disables scaling
    * @param enable if scaling should be enabled
    * @param homogeneousScaling defines if scaling should only be homogeneous
    */
  def setEnabledScaling(enable: Boolean): Unit = js.native
  def setEnabledScaling(enable: Boolean, homogeneousScaling: Boolean): Unit = js.native
  
  /** Updates the bounding box information for the Gizmo */
  def updateBoundingBox(): Unit = js.native
}

package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.behaviorMod.Behavior
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object surfaceMagnetismBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Meshes/surfaceMagnetismBehavior", "SurfaceMagnetismBehavior")
  @js.native
  open class SurfaceMagnetismBehavior ()
    extends StObject
       with Behavior[Mesh] {
    
    /* private */ var _addObservables: Any = js.native
    
    /* private */ var _attachPointLocalOffset: Any = js.native
    
    /* private */ var _attachedMesh: Any = js.native
    
    /* private */ var _getAttachPointOffsetToRef: Any = js.native
    
    /* private */ var _getTargetPose: Any = js.native
    
    /* private */ var _hit: Any = js.native
    
    /* private */ var _lastTick: Any = js.native
    
    /* private */ var _onBeforeRender: Any = js.native
    
    /* private */ var _pointerObserver: Any = js.native
    
    /* private */ var _removeObservables: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _updateTransformToGoal: Any = js.native
    
    /* private */ var _workingPosition: Any = js.native
    
    /* private */ var _workingQuaternion: Any = js.native
    
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: Mesh): Unit = js.native
    def attach(target: Mesh, scene: Scene): Unit = js.native
    
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    
    /**
      * Is this behavior reacting to pointer events
      */
    var enabled: Boolean = js.native
    
    /**
      * Finds the intersection point of the given ray onto the meshes and updates the target.
      * Transformation will be interpolated according to `interpolatePose` and `lerpTime` properties.
      * If no mesh of `meshes` are hit, this does nothing.
      * @param pickInfo The input pickingInfo that will be used to intersect the meshes
      * @returns a boolean indicating if we found a hit to stick to
      */
    def findAndUpdateTarget(pickInfo: PickingInfo): Boolean = js.native
    
    /**
      * Distance offset from the hit point to place the target at, along the hit normal.
      */
    var hitNormalOffset: Double = js.native
    
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      * Set to false if the node should strictly follow the camera without any interpolation time
      */
    var interpolatePose: Boolean = js.native
    
    /**
      * If true, pitch and roll are omitted.
      */
    var keepOrientationVertical: Boolean = js.native
    
    /**
      * Rate of interpolation of position and rotation of the attached node.
      * Higher values will give a slower interpolation.
      */
    var lerpTime: Double = js.native
    
    /**
      * Maximum distance for the node to stick to the surface
      */
    var maxStickingDistance: Double = js.native
    
    /**
      * Spatial mapping meshes to collide with
      */
    var meshes: js.Array[AbstractMesh] = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
    /**
      * Name of the behavior
      */
    @JSName("name")
    def name_MSurfaceMagnetismBehavior: String = js.native
    
    /**
      * Updates the attach point with the current geometry extents of the attached mesh
      */
    def updateAttachPoint(): Unit = js.native
  }
}

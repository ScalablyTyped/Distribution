package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.BoundingBoxGizmo
import typings.babylonjs.anon.PositionGizmo
import typings.babylonjs.gizmoMod.GizmoAxisCache
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.pointerEventsMod.PointerInfo
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.sixDofDragBehaviorMod.SixDofDragBehavior
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmoManagerMod {
  
  @JSImport("babylonjs/Gizmos/gizmoManager", "GizmoManager")
  @js.native
  open class GizmoManager protected ()
    extends StObject
       with IDisposable {
    /**
      * Instantiates a gizmo manager
      * @param _scene the scene to overlay the gizmos on top of
      * @param thickness display gizmo axis thickness
      * @param utilityLayer the layer where gizmos are rendered
      * @param keepDepthUtilityLayer the layer where occluded gizmos are rendered
      */
    def this(_scene: Scene) = this()
    def this(_scene: Scene, thickness: Double) = this()
    def this(_scene: Scene, thickness: Double, utilityLayer: UtilityLayerRenderer) = this()
    def this(_scene: Scene, thickness: Unit, utilityLayer: UtilityLayerRenderer) = this()
    def this(_scene: Scene, thickness: Double, utilityLayer: Unit, keepDepthUtilityLayer: UtilityLayerRenderer) = this()
    def this(
      _scene: Scene,
      thickness: Double,
      utilityLayer: UtilityLayerRenderer,
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
    def this(_scene: Scene, thickness: Unit, utilityLayer: Unit, keepDepthUtilityLayer: UtilityLayerRenderer) = this()
    def this(
      _scene: Scene,
      thickness: Unit,
      utilityLayer: UtilityLayerRenderer,
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
    
    /**
      * Subscribes to pointer down events, for attaching and detaching mesh
      * @param scene The scene layer the observer will be added to
      */
    /* private */ var _attachToMeshPointerObserver: Any = js.native
    
    /* protected */ var _attachedMesh: Nullable[AbstractMesh] = js.native
    
    /* protected */ var _attachedNode: Nullable[Node] = js.native
    
    /* protected */ var _boundingBoxColor: Color3 = js.native
    
    /* protected */ var _defaultKeepDepthUtilityLayer: UtilityLayerRenderer = js.native
    
    /* protected */ var _defaultUtilityLayer: UtilityLayerRenderer = js.native
    
    /** Node Caching for quick lookup */
    /* private */ var _gizmoAxisCache: Any = js.native
    
    /* protected */ var _gizmosEnabled: PositionGizmo = js.native
    
    /* protected */ var _pointerObservers: js.Array[Observer[PointerInfo]] = js.native
    
    /* protected */ var _scaleRatio: Double = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* protected */ var _thickness: Double = js.native
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(gizmoAxisCache: Map[Mesh, GizmoAxisCache]): Unit = js.native
    
    /**
      * Attaches a set of gizmos to the specified mesh
      * @param mesh The mesh the gizmo's should be attached to
      */
    def attachToMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
    
    /**
      * Attaches a set of gizmos to the specified node
      * @param node The node the gizmo's should be attached to
      */
    def attachToNode(node: Nullable[Node]): Unit = js.native
    
    /**
      * Array of meshes which will have the gizmo attached when a pointer selected them. If null, all meshes are attachable. (Default: null)
      */
    var attachableMeshes: Nullable[js.Array[AbstractMesh]] = js.native
    
    /**
      * Array of nodes which will have the gizmo attached when a pointer selected them. If null, all nodes are attachable. (Default: null)
      */
    var attachableNodes: Nullable[js.Array[Node]] = js.native
    
    /**
      * When bounding box gizmo is enabled, this can be used to track drag/end events
      */
    var boundingBoxDragBehavior: SixDofDragBehavior = js.native
    
    def boundingBoxGizmoEnabled: Boolean = js.native
    /**
      * If the boundingBox gizmo is enabled
      */
    def boundingBoxGizmoEnabled_=(value: Boolean): Unit = js.native
    
    /** When true, the gizmo will be detached from the current object when a pointer down occurs with an empty picked mesh */
    var clearGizmoOnEmptyPointerEvent: Boolean = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /** When true (default), picking to attach a new mesh is enabled. This works in sync with inspector autopicking. */
    var enableAutoPicking: Boolean = js.native
    
    /**
      * Gizmo's created by the gizmo manager, gizmo will be null until gizmo has been enabled for the first time
      */
    var gizmos: BoundingBoxGizmo = js.native
    
    /**
      * True when the mouse pointer is hovering a gizmo mesh
      */
    def isHovered: Boolean = js.native
    
    /**
      * Utility layer that the bounding box gizmo belongs to
      */
    def keepDepthUtilityLayer: UtilityLayerRenderer = js.native
    
    /** Fires an event when the manager is attached to a mesh */
    var onAttachedToMeshObservable: Observable[Nullable[AbstractMesh]] = js.native
    
    /** Fires an event when the manager is attached to a node */
    var onAttachedToNodeObservable: Observable[Nullable[Node]] = js.native
    
    def positionGizmoEnabled: Boolean = js.native
    /**
      * If the position gizmo is enabled
      */
    def positionGizmoEnabled_=(value: Boolean): Unit = js.native
    
    def rotationGizmoEnabled: Boolean = js.native
    /**
      * If the rotation gizmo is enabled
      */
    def rotationGizmoEnabled_=(value: Boolean): Unit = js.native
    
    def scaleGizmoEnabled: Boolean = js.native
    /**
      * If the scale gizmo is enabled
      */
    def scaleGizmoEnabled_=(value: Boolean): Unit = js.native
    
    def scaleRatio: Double = js.native
    /**
      * Ratio for the scale of the gizmo (Default: 1)
      */
    def scaleRatio_=(value: Double): Unit = js.native
    
    /**
      * If pointer events should perform attaching/detaching a gizmo, if false this can be done manually via attachToMesh/attachToNode. (Default: true)
      */
    var usePointerToAttachGizmos: Boolean = js.native
    
    /**
      * Utility layer that all gizmos besides bounding box belong to
      */
    def utilityLayer: UtilityLayerRenderer = js.native
  }
}

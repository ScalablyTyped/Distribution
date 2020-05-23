package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractActionManagerMod.AbstractActionManager
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableMod.Animatable
import typings.babylonjs.animationMod.Animation
import typings.babylonjs.animationPropertiesOverrideMod.AnimationPropertiesOverride
import typings.babylonjs.animationRangeMod.AnimationRange
import typings.babylonjs.anon.Max
import typings.babylonjs.behaviorMod.Behavior
import typings.babylonjs.behaviorMod.IBehaviorAware
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.iInspectableMod.IInspectable
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  @js.native
  class Node protected () extends IBehaviorAware[Node] {
    /**
      * Creates a new Node
      * @param name the name and id to be given to this node
      * @param scene the scene this node will be added to
      */
    def this(name: String) = this()
    def this(name: String, scene: Nullable[Scene]) = this()
    var _animationPropertiesOverride: js.Any = js.native
    var _behaviors: js.Any = js.native
    /** @hidden */
    var _cache: js.Any = js.native
    /** @hidden */
    var _childUpdateId: Double = js.native
    var _children: js.Any = js.native
    /** @hidden */
    var _currentRenderId: Double = js.native
    var _doNotSerialize: js.Any = js.native
    /** @hidden */
    var _isDisposed: Boolean = js.native
    var _isEnabled: js.Any = js.native
    /** @hidden */
    val _isNode: Boolean = js.native
    var _isParentEnabled: js.Any = js.native
    var _isReady: js.Any = js.native
    var _onDisposeObserver: js.Any = js.native
    var _parentNode: js.Any = js.native
    var _parentUpdateId: js.Any = js.native
    var _ranges: StringDictionary[Nullable[AnimationRange]] = js.native
    /** @hidden */
    var _scene: Scene = js.native
    /** @hidden */
    var _sceneRootNodesIndex: js.Any = js.native
    /** @hidden */
    var _waitingParentId: Nullable[String] = js.native
    /** @hidden */
    var _worldMatrix: Matrix = js.native
    /** @hidden */
    var _worldMatrixDeterminant: Double = js.native
    /** @hidden */
    var _worldMatrixDeterminantIsDirty: Boolean = js.native
    /**
      * Gets a list of Animations associated with the node
      */
    var animations: js.Array[Animation] = js.native
    /**
      * Gets or sets the id of the node
      */
    var id: String = js.native
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable] = js.native
    /**
      * Gets or sets an object used to store user defined information for the node
      */
    var metadata: js.Any = js.native
    /**
      * Gets or sets the name of the node
      */
    var name: String = js.native
    /**
      * An event triggered when the mesh is disposed
      */
    var onDisposeObservable: Observable[Node] = js.native
    /**
      * Callback raised when the node is ready to be used
      */
    var onReady: Nullable[js.Function1[/* node */ this.type, Unit]] = js.native
    /**
      * For internal use only. Please do not use.
      */
    var reservedDataStore: js.Any = js.native
    /**
      * Gets or sets a string used to store user defined state for the node
      */
    var state: String = js.native
    /**
      * Gets or sets the unique id of the node
      */
    var uniqueId: Double = js.native
    /** @hidden */
    def _addToSceneRootNodes(): Unit = js.native
    /** @hidden */
    def _getActionManagerForTrigger(): Nullable[AbstractActionManager] = js.native
    def _getActionManagerForTrigger(trigger: Double): Nullable[AbstractActionManager] = js.native
    def _getActionManagerForTrigger(trigger: Double, initialCall: Boolean): Nullable[AbstractActionManager] = js.native
    /** @hidden */
    def _getDescendants(results: js.Array[Node]): Unit = js.native
    def _getDescendants(results: js.Array[Node], directDescendantsOnly: Boolean): Unit = js.native
    def _getDescendants(
      results: js.Array[Node],
      directDescendantsOnly: Boolean,
      predicate: js.Function1[/* node */ this.type, Boolean]
    ): Unit = js.native
    /** @hidden */
    def _getWorldMatrixDeterminant(): Double = js.native
    /** @hidden */
    def _initCache(): Unit = js.native
    /** @hidden */
    def _isSynchronized(): Boolean = js.native
    /** @hidden */
    def _markSyncedWithParent(): Unit = js.native
    /** @hidden */
    def _removeFromSceneRootNodes(): Unit = js.native
    /** @hidden */
    def _setReady(state: Boolean): Unit = js.native
    /** @hidden */
    /* protected */ def _syncParentEnabledState(): Unit = js.native
    /** @hidden */
    def _updateCache(): Unit = js.native
    def _updateCache(ignoreParentClass: Boolean): Unit = js.native
    /**
      * Attach a behavior
      * @param behavior defines the behavior to attach
      * @returns the current host
      */
    /* CompleteClass */
    override def addBehavior(behavior: Behavior[Node]): Node = js.native
    def addBehavior(behavior: Behavior[Node], attachImmediately: Boolean): Node = js.native
    /**
      * Gets or sets the animation properties override
      */
    def animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
    def animationPropertiesOverride(value: Nullable[AnimationPropertiesOverride]): js.Any = js.native
    /**
      * Will start the animation sequence
      * @param name defines the range frames for animation sequence
      * @param loop defines if the animation should loop (false by default)
      * @param speedRatio defines the speed factor in which to run the animation (1 by default)
      * @param onAnimationEnd defines a function to be executed when the animation ended (undefined by default)
      * @returns the object created for this animation. If range does not exist, it will return null
      */
    def beginAnimation(name: String): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Boolean): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Boolean, speedRatio: Double): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Boolean, speedRatio: Double, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
    /**
      * Gets the list of attached behaviors
      * @see http://doc.babylonjs.com/features/behaviour
      */
    def behaviors: js.Array[Behavior[Node]] = js.native
    /**
      * Computes the world matrix of the node
      * @param force defines if the cache version should be invalidated forcing the world matrix to be created from scratch
      * @returns the world matrix
      */
    def computeWorldMatrix(): Matrix = js.native
    def computeWorldMatrix(force: Boolean): Matrix = js.native
    /**
      * Creates an animation range for this node
      * @param name defines the name of the range
      * @param from defines the starting key
      * @param to defines the end key
      */
    def createAnimationRange(name: String, from: Double, to: Double): Unit = js.native
    /**
      * Delete a specific animation range
      * @param name defines the name of the range to delete
      * @param deleteFrames defines if animation frames from the range must be deleted as well
      */
    def deleteAnimationRange(name: String): Unit = js.native
    def deleteAnimationRange(name: String, deleteFrames: Boolean): Unit = js.native
    /**
      * Releases resources associated with this node.
      * @param doNotRecurse Set to true to not recurse into each children (recurse into each children by default)
      * @param disposeMaterialAndTextures Set to true to also dispose referenced materials and textures (false by default)
      */
    def dispose(): Unit = js.native
    def dispose(doNotRecurse: Boolean): Unit = js.native
    def dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean): Unit = js.native
    /**
      * Gets or sets a boolean used to define if the node must be serialized
      */
    def doNotSerialize: Boolean = js.native
    def doNotSerialize(value: Boolean): js.Any = js.native
    /**
      * Get an animation by name
      * @param name defines the name of the animation to look for
      * @returns null if not found else the requested animation
      */
    def getAnimationByName(name: String): Nullable[Animation] = js.native
    /**
      * Get an animation range by name
      * @param name defines the name of the animation range to look for
      * @returns null if not found else the requested animation range
      */
    def getAnimationRange(name: String): Nullable[AnimationRange] = js.native
    /**
      * Gets the list of all animation ranges defined on this node
      * @returns an array
      */
    def getAnimationRanges(): js.Array[Nullable[AnimationRange]] = js.native
    /**
      * Gets a behavior using its name to search
      * @param name defines the name to search
      * @returns the behavior or null if not found
      */
    /* CompleteClass */
    override def getBehaviorByName(name: String): Nullable[Behavior[Node]] = js.native
    /**
      * Get all child-meshes of this node
      * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered (Default: false)
      * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
      * @returns an array of AbstractMesh
      */
    def getChildMeshes(): js.Array[AbstractMesh] = js.native
    def getChildMeshes(directDescendantsOnly: Boolean): js.Array[AbstractMesh] = js.native
    def getChildMeshes(directDescendantsOnly: Boolean, predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[AbstractMesh] = js.native
    /**
      * Get all direct children of this node
      * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
      * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered (Default: true)
      * @returns an array of Node
      */
    def getChildren(): js.Array[Node] = js.native
    def getChildren(predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[Node] = js.native
    def getChildren(predicate: js.Function1[/* node */ this.type, Boolean], directDescendantsOnly: Boolean): js.Array[Node] = js.native
    /**
      * Gets a string idenfifying the name of the class
      * @returns "Node" string
      */
    def getClassName(): String = js.native
    /**
      * Will return all nodes that have this node as ascendant
      * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered
      * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
      * @return all children nodes of all types
      */
    def getDescendants(): js.Array[Node] = js.native
    def getDescendants(directDescendantsOnly: Boolean): js.Array[Node] = js.native
    def getDescendants(directDescendantsOnly: Boolean, predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[Node] = js.native
    /**
      * Gets the engine of the node
      * @returns a Engine
      */
    def getEngine(): Engine = js.native
    /**
      * Return the minimum and maximum world vectors of the entire hierarchy under current node
      * @param includeDescendants Include bounding info from descendants as well (true by default)
      * @param predicate defines a callback function that can be customize to filter what meshes should be included in the list used to compute the bounding vectors
      * @returns the new bounding vectors
      */
    def getHierarchyBoundingVectors(): Max = js.native
    def getHierarchyBoundingVectors(includeDescendants: Boolean): Max = js.native
    def getHierarchyBoundingVectors(
      includeDescendants: Boolean,
      predicate: Nullable[js.Function1[/* abstractMesh */ AbstractMesh, Boolean]]
    ): Max = js.native
    /**
      * Gets the scene of the node
      * @returns a scene
      */
    def getScene(): Scene = js.native
    /**
      * Returns the latest update of the World matrix
      * @returns a Matrix
      */
    def getWorldMatrix(): Matrix = js.native
    /**
      * Is this node a descendant of the given node?
      * The function will iterate up the hierarchy until the ancestor was found or no more parents defined
      * @param ancestor defines the parent node to inspect
      * @returns a boolean indicating if this node is a descendant of the given node
      */
    def isDescendantOf(ancestor: Node): Boolean = js.native
    /**
      * Gets a boolean indicating if the node has been disposed
      * @returns true if the node was disposed
      */
    def isDisposed(): Boolean = js.native
    /**
      * Is this node enabled?
      * If the node has a parent, all ancestors will be checked and false will be returned if any are false (not enabled), otherwise will return true
      * @param checkAncestors indicates if this method should check the ancestors. The default is to check the ancestors. If set to false, the method will return the value of this node without checking ancestors
      * @return whether this node (and its parent) is enabled
      */
    def isEnabled(): Boolean = js.native
    def isEnabled(checkAncestors: Boolean): Boolean = js.native
    /**
      * Is this node ready to be used/rendered
      * @param completeCheck defines if a complete check (including materials and lights) has to be done (false by default)
      * @return true if the node is ready
      */
    def isReady(): Boolean = js.native
    def isReady(completeCheck: Boolean): Boolean = js.native
    /** @hidden */
    def isSynchronized(): Boolean = js.native
    /** @hidden */
    def isSynchronizedWithParent(): Boolean = js.native
    /**
      * Sets a callback that will be raised when the node will be disposed
      */
    def onDispose(callback: js.Function0[Unit]): js.Any = js.native
    def parent: Nullable[Node] = js.native
    /**
      * Gets or sets the parent of the node (without keeping the current position in the scene)
      * @see https://doc.babylonjs.com/how_to/parenting
      */
    def parent(parent: Nullable[Node]): js.Any = js.native
    /**
      * Remove a behavior from the current object
      * @param behavior defines the behavior to detach
      * @returns the current host
      */
    /* CompleteClass */
    override def removeBehavior(behavior: Behavior[Node]): Node = js.native
    /**
      * Serialize animation ranges into a JSON compatible object
      * @returns serialization object
      */
    def serializeAnimationRanges(): js.Any = js.native
    /**
      * Set the enabled state of this node
      * @param value defines the new enabled state
      */
    def setEnabled(value: Boolean): Unit = js.native
    /** @hidden */
    def updateCache(): Unit = js.native
    def updateCache(force: Boolean): Unit = js.native
    /**
      * Returns directly the latest state of the mesh World matrix.
      * A Matrix is returned.
      */
    def worldMatrixFromCache: Matrix = js.native
  }
  
  /* static members */
  @js.native
  object Node extends js.Object {
    var _NodeConstructors: js.Any = js.native
    /**
      * Add a new node constructor
      * @param type defines the type name of the node to construct
      * @param constructorFunc defines the constructor function
      */
    def AddNodeConstructor(`type`: String, constructorFunc: NodeConstructor): Unit = js.native
    /**
      * Returns a node constructor based on type name
      * @param type defines the type name
      * @param name defines the new node name
      * @param scene defines the hosting scene
      * @param options defines optional options to transmit to constructors
      * @returns the new constructor or null
      */
    def Construct(`type`: String, name: String, scene: Scene): Nullable[js.Function0[this.type]] = js.native
    def Construct(`type`: String, name: String, scene: Scene, options: js.Any): Nullable[js.Function0[this.type]] = js.native
    /**
      * Parse animation range data from a serialization object and store them into a given node
      * @param node defines where to store the animation ranges
      * @param parsedNode defines the serialization object to read data from
      * @param scene defines the hosting scene
      */
    def ParseAnimationRanges(node: Node, parsedNode: js.Any, scene: Scene): Unit = js.native
    /** @hidden */
    def _AnimationRangeFactory(name: String, from: Double, to: Double): AnimationRange = js.native
  }
  
  type NodeConstructor = js.Function3[
    /* name */ String, 
    /* scene */ Scene, 
    /* options */ js.UndefOr[js.Any], 
    js.Function0[Node]
  ]
}


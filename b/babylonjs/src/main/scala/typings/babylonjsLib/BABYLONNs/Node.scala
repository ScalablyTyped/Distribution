package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node is the basic class for all scene objects (Mesh, Light, Camera.)
  */
@JSGlobal("BABYLON.Node")
@js.native
class Node protected () extends IBehaviorAware[Node] {
  /**
    * Creates a new Node
    * @param name the name and id to be given to this node
    * @param scene the scene this node will be added to
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, scene: Nullable[Scene]) = this()
  var _animationPropertiesOverride: js.Any = js.native
  var _behaviors: js.Any = js.native
  /** @hidden */
  var _cache: js.Any = js.native
  var _childRenderId: scala.Double = js.native
  var _children: js.Any = js.native
  /** @hidden */
  var _currentRenderId: scala.Double = js.native
  /** @hidden */
  var _isDisposed: scala.Boolean = js.native
  var _isEnabled: js.Any = js.native
  var _isParentEnabled: js.Any = js.native
  var _isReady: js.Any = js.native
  var _onDisposeObserver: js.Any = js.native
  var _parentNode: js.Any = js.native
  var _parentRenderId: js.Any = js.native
  var _ranges: org.scalablytyped.runtime.StringDictionary[Nullable[AnimationRange]] = js.native
  /** @hidden */
  var _scene: Scene = js.native
  /** @hidden */
  var _sceneRootNodesIndex: js.Any = js.native
  /** @hidden */
  var _waitingParentId: Nullable[java.lang.String] = js.native
  /** @hidden */
  var _worldMatrix: Matrix = js.native
  /** @hidden */
  var _worldMatrixDeterminant: scala.Double = js.native
  var addToSceneRootNodes: js.Any = js.native
  /**
    * Gets or sets the animation properties override
    */
  var animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
  /**
    * Gets a list of Animations associated with the node
    */
  var animations: js.Array[Animation] = js.native
  /**
    * Gets the list of attached behaviors
    * @see http://doc.babylonjs.com/features/behaviour
    */
  val behaviors: js.Array[Behavior[Node]] = js.native
  /**
    * Gets or sets a boolean used to define if the node must be serialized
    */
  var doNotSerialize: scala.Boolean = js.native
  /**
    * Gets or sets the id of the node
    */
  var id: java.lang.String = js.native
  /**
    * Gets or sets an object used to store user defined information for the node
    */
  var metadata: js.Any = js.native
  /**
    * Gets or sets the name of the node
    */
  var name: java.lang.String = js.native
  /**
    * An event triggered when the mesh is disposed
    */
  var onDisposeObservable: Observable[Node] = js.native
  /**
    * Gets or sets the parent of the node
    */
  var parent: Nullable[Node] = js.native
  var removeFromSceneRootNodes: js.Any = js.native
  /**
    * Gets or sets a string used to store user defined state for the node
    */
  var state: java.lang.String = js.native
  /**
    * Gets or sets the unique id of the node
    */
  var uniqueId: scala.Double = js.native
  /**
    * Returns directly the latest state of the mesh World matrix.
    * A Matrix is returned.
    */
  val worldMatrixFromCache: Matrix = js.native
  /** @hidden */
  def _getDescendants(results: js.Array[Node]): scala.Unit = js.native
  def _getDescendants(results: js.Array[Node], directDescendantsOnly: scala.Boolean): scala.Unit = js.native
  def _getDescendants(
    results: js.Array[Node],
    directDescendantsOnly: scala.Boolean,
    predicate: js.Function1[/* node */ this.type, scala.Boolean]
  ): scala.Unit = js.native
  /** @hidden */
  def _getWorldMatrixDeterminant(): scala.Double = js.native
  /** @hidden */
  def _initCache(): scala.Unit = js.native
  /** @hidden */
  def _isSynchronized(): scala.Boolean = js.native
  /** @hidden */
  def _markSyncedWithParent(): scala.Unit = js.native
  /** @hidden */
  def _setReady(state: scala.Boolean): scala.Unit = js.native
  /** @hidden */
  /* protected */ def _syncParentEnabledState(): scala.Unit = js.native
  /** @hidden */
  def _updateCache(): scala.Unit = js.native
  def _updateCache(ignoreParentClass: scala.Boolean): scala.Unit = js.native
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[Node]): Node = js.native
  def addBehavior(behavior: Behavior[Node], attachImmediately: scala.Boolean): Node = js.native
  /**
    * Will start the animation sequence
    * @param name defines the range frames for animation sequence
    * @param loop defines if the animation should loop (false by default)
    * @param speedRatio defines the speed factor in which to run the animation (1 by default)
    * @param onAnimationEnd defines a function to be executed when the animation ended (undefined by default)
    * @returns the object created for this animation. If range does not exist, it will return null
    */
  def beginAnimation(name: java.lang.String): Nullable[Animatable] = js.native
  def beginAnimation(name: java.lang.String, loop: scala.Boolean): Nullable[Animatable] = js.native
  def beginAnimation(name: java.lang.String, loop: scala.Boolean, speedRatio: scala.Double): Nullable[Animatable] = js.native
  def beginAnimation(
    name: java.lang.String,
    loop: scala.Boolean,
    speedRatio: scala.Double,
    onAnimationEnd: js.Function0[scala.Unit]
  ): Nullable[Animatable] = js.native
  /**
    * Computes the world matrix of the node
    * @param force defines if the cache version should be invalidated forcing the world matrix to be created from scratch
    * @returns the world matrix
    */
  def computeWorldMatrix(): Matrix = js.native
  def computeWorldMatrix(force: scala.Boolean): Matrix = js.native
  /**
    * Creates an animation range for this node
    * @param name defines the name of the range
    * @param from defines the starting key
    * @param to defines the end key
    */
  def createAnimationRange(name: java.lang.String, from: scala.Double, to: scala.Double): scala.Unit = js.native
  /**
    * Delete a specific animation range
    * @param name defines the name of the range to delete
    * @param deleteFrames defines if animation frames from the range must be deleted as well
    */
  def deleteAnimationRange(name: java.lang.String): scala.Unit = js.native
  def deleteAnimationRange(name: java.lang.String, deleteFrames: scala.Boolean): scala.Unit = js.native
  /**
    * Releases resources associated with this node.
    * @param doNotRecurse Set to true to not recurse into each children (recurse into each children by default)
    * @param disposeMaterialAndTextures Set to true to also dispose referenced materials and textures (false by default)
    */
  def dispose(): scala.Unit = js.native
  def dispose(doNotRecurse: scala.Boolean): scala.Unit = js.native
  def dispose(doNotRecurse: scala.Boolean, disposeMaterialAndTextures: scala.Boolean): scala.Unit = js.native
  /**
    * Get an animation by name
    * @param name defines the name of the animation to look for
    * @returns null if not found else the requested animation
    */
  def getAnimationByName(name: java.lang.String): Nullable[Animation] = js.native
  /**
    * Get an animation range by name
    * @param name defines the name of the animation range to look for
    * @returns null if not found else the requested animation range
    */
  def getAnimationRange(name: java.lang.String): Nullable[AnimationRange] = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: java.lang.String): Nullable[Behavior[Node]] = js.native
  /**
    * Get all child-meshes of this node
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns an array of AbstractMesh
    */
  def getChildMeshes(): js.Array[AbstractMesh] = js.native
  def getChildMeshes(directDescendantsOnly: scala.Boolean): js.Array[AbstractMesh] = js.native
  def getChildMeshes(directDescendantsOnly: scala.Boolean, predicate: js.Function1[/* node */ this.type, scala.Boolean]): js.Array[AbstractMesh] = js.native
  /**
    * Get all child-transformNodes of this node
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns an array of TransformNode
    */
  def getChildTransformNodes(): js.Array[TransformNode] = js.native
  def getChildTransformNodes(directDescendantsOnly: scala.Boolean): js.Array[TransformNode] = js.native
  def getChildTransformNodes(directDescendantsOnly: scala.Boolean, predicate: js.Function1[/* node */ this.type, scala.Boolean]): js.Array[TransformNode] = js.native
  /**
    * Get all direct children of this node
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns an array of Node
    */
  def getChildren(): js.Array[Node] = js.native
  def getChildren(predicate: js.Function1[/* node */ this.type, scala.Boolean]): js.Array[Node] = js.native
  /**
    * Gets a string idenfifying the name of the class
    * @returns "Node" string
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Will return all nodes that have this node as ascendant
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @return all children nodes of all types
    */
  def getDescendants(): js.Array[Node] = js.native
  def getDescendants(directDescendantsOnly: scala.Boolean): js.Array[Node] = js.native
  def getDescendants(directDescendantsOnly: scala.Boolean, predicate: js.Function1[/* node */ this.type, scala.Boolean]): js.Array[Node] = js.native
  /**
    * Gets the engine of the node
    * @returns a Engine
    */
  def getEngine(): Engine = js.native
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
  def isDescendantOf(ancestor: Node): scala.Boolean = js.native
  /**
    * Gets a boolean indicating if the node has been disposed
    * @returns true if the node was disposed
    */
  def isDisposed(): scala.Boolean = js.native
  /**
    * Is this node enabled?
    * If the node has a parent, all ancestors will be checked and false will be returned if any are false (not enabled), otherwise will return true
    * @param checkAncestors indicates if this method should check the ancestors. The default is to check the ancestors. If set to false, the method will return the value of this node without checking ancestors
    * @return whether this node (and its parent) is enabled
    */
  def isEnabled(): scala.Boolean = js.native
  def isEnabled(checkAncestors: scala.Boolean): scala.Boolean = js.native
  /**
    * Is this node ready to be used/rendered
    * @param completeCheck defines if a complete check (including materials and lights) has to be done (false by default)
    * @return true if the node is ready
    */
  def isReady(): scala.Boolean = js.native
  def isReady(completeCheck: scala.Boolean): scala.Boolean = js.native
  /** @hidden */
  def isSynchronized(): scala.Boolean = js.native
  /** @hidden */
  def isSynchronizedWithParent(): scala.Boolean = js.native
  /**
    * Sets a callback that will be raised when the node will be disposed
    */
  def onDispose(): scala.Unit = js.native
  /**
    * Callback raised when the node is ready to be used
    */
  def onReady(node: Node): scala.Unit = js.native
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
  def setEnabled(value: scala.Boolean): scala.Unit = js.native
  /** @hidden */
  def updateCache(): scala.Unit = js.native
  def updateCache(force: scala.Boolean): scala.Unit = js.native
}

/**
  * Node is the basic class for all scene objects (Mesh, Light, Camera.)
  */
@JSGlobal("BABYLON.Node")
@js.native
object Node extends js.Object {
  var _NodeConstructors: js.Any = js.native
  /**
    * Add a new node constructor
    * @param type defines the type name of the node to construct
    * @param constructorFunc defines the constructor function
    */
  def AddNodeConstructor(`type`: java.lang.String, constructorFunc: babylonjsLib.BABYLONNs.NodeConstructor): scala.Unit = js.native
  /**
    * Returns a node constructor based on type name
    * @param type defines the type name
    * @param name defines the new node name
    * @param scene defines the hosting scene
    * @param options defines optional options to transmit to constructors
    * @returns the new constructor or null
    */
  def Construct(`type`: java.lang.String, name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[js.Function0[this.type]] = js.native
  def Construct(
    `type`: java.lang.String,
    name: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Scene,
    options: js.Any
  ): babylonjsLib.BABYLONNs.Nullable[js.Function0[this.type]] = js.native
  /**
    * Parse animation range data from a serialization object and store them into a given node
    * @param node defines where to store the animation ranges
    * @param parsedNode defines the serialization object to read data from
    * @param scene defines the hosting scene
    */
  def ParseAnimationRanges(node: babylonjsLib.BABYLONNs.Node, parsedNode: js.Any, scene: babylonjsLib.BABYLONNs.Scene): scala.Unit = js.native
}


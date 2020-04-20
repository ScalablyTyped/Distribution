package typings.babylonjs.nodeMaterialMod

import typings.babylonjs.PartialINodeMaterialOptio
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.inputBlockMod.InputBlock
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.nodeMaterialOptimizerMod.NodeMaterialOptimizer
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.pushMaterialMod.PushMaterial
import typings.babylonjs.reflectionTextureBlockMod.ReflectionTextureBlock
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.textureBlockMod.TextureBlock
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/nodeMaterial", "NodeMaterial")
@js.native
class NodeMaterial protected () extends PushMaterial {
  /**
    * Create a new node based material
    * @param name defines the material name
    * @param scene defines the hosting scene
    * @param options defines creation option
    */
  def this(name: String) = this()
  def this(name: String, scene: Scene) = this()
  def this(name: String, scene: Scene, options: PartialINodeMaterialOptio) = this()
  var BJSNODEMATERIALEDITOR: js.Any = js.native
  var _addFragmentOutputNode: js.Any = js.native
  var _addVertexOutputNode: js.Any = js.native
  var _animationFrame: js.Any = js.native
  var _buildId: js.Any = js.native
  var _buildWasSuccessful: js.Any = js.native
  var _cachedWorldViewMatrix: js.Any = js.native
  var _cachedWorldViewProjectionMatrix: js.Any = js.native
  /** Creates the node editor window. */
  var _createNodeEditor: js.Any = js.native
  var _fragmentCompilationState: js.Any = js.native
  /**
    * Gets or sets the root nodes of the material fragment (pixel) shader
    */
  var _fragmentOutputNodes: js.Array[NodeMaterialBlock] = js.native
  var _gatherBlocks: js.Any = js.native
  /** Get the inspector from bundle or global */
  var _getGlobalNodeMaterialEditor: js.Any = js.native
  /**
    * Default configuration related to image processing available in the standard Material.
    */
  var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * Keep track of the image processing observer to allow dispose and replace.
    */
  var _imageProcessingObserver: js.Any = js.native
  var _initializeBlock: js.Any = js.native
  var _optimizers: js.Any = js.native
  var _options: js.Any = js.native
  var _prepareDefinesForAttributes: js.Any = js.native
  var _removeFragmentOutputNode: js.Any = js.native
  var _removeVertexOutputNode: js.Any = js.native
  var _resetDualBlocks: js.Any = js.native
  var _restoreConnections: js.Any = js.native
  var _sharedData: js.Any = js.native
  var _vertexCompilationState: js.Any = js.native
  /**
    * Gets or sets the root nodes of the material vertex shader
    */
  var _vertexOutputNodes: js.Array[NodeMaterialBlock] = js.native
  /**
    * Gets an array of blocks that needs to be serialized even if they are not yet connected
    */
  var attachedBlocks: js.Array[NodeMaterialBlock] = js.native
  /**
    * Gets or sets data used by visual editor
    * @see https://nme.babylonjs.com
    */
  var editorData: js.Any = js.native
  /**
    * Gets or sets a boolean indicating that alpha value must be ignored (This will turn alpha blending off even if an alpha value is produced by the material)
    */
  var ignoreAlpha: Boolean = js.native
  /**
    * Defines the maximum number of lights that can be used in the material
    */
  var maxSimultaneousLights: Double = js.native
  /**
    * Observable raised when the material is built
    */
  var onBuildObservable: Observable[NodeMaterial] = js.native
  /**
    * Attaches a new image processing configuration to the Standard Material.
    * @param configuration
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
  /**
    * Add a new block to the list of output nodes
    * @param node defines the node to add
    * @returns the current material
    */
  def addOutputNode(node: NodeMaterialBlock): this.type = js.native
  /**
    * Build the material and generates the inner effect
    * @param verbose defines if the build should log activity
    */
  def build(): Unit = js.native
  def build(verbose: Boolean): Unit = js.native
  /**
    * Clear the current material
    */
  def clear(): Unit = js.native
  /**
    * Get a string representing the shaders built by the current node graph
    */
  def compiledShaders: String = js.native
  /**
    * Launch the node material editor
    * @param config Define the configuration of the editor
    * @return a promise fulfilled when the node editor is visible
    */
  def edit(): js.Promise[Unit] = js.native
  def edit(config: INodeMaterialEditorOptions): js.Promise[Unit] = js.native
  /**
    * Generate a string containing the code declaration required to create an equivalent of this material
    * @returns a string
    */
  def generateCode(): String = js.native
  /**
    * Get a block by its name
    * @param name defines the name of the block to retrieve
    * @returns the required block or null if not found
    */
  def getBlockByName(name: String): Nullable[NodeMaterialBlock] = js.native
  /**
    * Get a block by its name
    * @param predicate defines the predicate used to find the good candidate
    * @returns the required block or null if not found
    */
  def getBlockByPredicate(predicate: js.Function1[/* block */ NodeMaterialBlock, Boolean]): Nullable[NodeMaterialBlock] = js.native
  /**
    * Get an input block by its name
    * @param predicate defines the predicate used to find the good candidate
    * @returns the required input block or null if not found
    */
  def getInputBlockByPredicate(predicate: js.Function1[/* block */ InputBlock, Boolean]): Nullable[InputBlock] = js.native
  /**
    * Gets the list of input blocks attached to this material
    * @returns an array of InputBlocks
    */
  def getInputBlocks(): js.Array[InputBlock] = js.native
  /**
    * Gets the list of texture blocks
    * @returns an array of texture blocks
    */
  def getTextureBlocks(): js.Array[TextureBlock | ReflectionTextureBlock] = js.native
  /**
    * Gets the image processing configuration used either in this material.
    */
  def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * Sets the Default image processing configuration used either in the this material.
    *
    * If sets to null, the scene one is in use.
    */
  def imageProcessingConfiguration(value: ImageProcessingConfiguration): js.Any = js.native
  /**
    * Get if the submesh is ready to be used and all its information available.
    * Child classes can use it to update shaders
    * @param mesh defines the mesh to check
    * @param subMesh defines which submesh to check
    * @param useInstances specifies that instances should be used
    * @returns a boolean indicating that the submesh is ready or not
    */
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh): Boolean = js.native
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  /**
    * Loads the current Node Material from a url pointing to a file save by the Node Material Editor
    * @param url defines the url to load from
    * @returns a promise that will fullfil when the material is fully loaded
    */
  def loadAsync(url: String): js.Promise[Unit] = js.native
  /**
    * Clear the current graph and load a new one from a serialization object
    * @param source defines the JSON representation of the material
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    */
  def loadFromSerialization(source: js.Any): Unit = js.native
  def loadFromSerialization(source: js.Any, rootUrl: String): Unit = js.native
  /**
    * Runs an otpimization phase to try to improve the shader code
    */
  def optimize(): Unit = js.native
  /** Gets or sets options to control the node material overall behavior */
  def options: INodeMaterialOptions = js.native
  def options(options: INodeMaterialOptions): js.Any = js.native
  /**
    * Adds a new optimizer to the list of optimizers
    * @param optimizer defines the optimizers to add
    * @returns the current material
    */
  def registerOptimizer(optimizer: NodeMaterialOptimizer): js.UndefOr[this.type] = js.native
  /**
    * Remove a block from the current node material
    * @param block defines the block to remove
    */
  def removeBlock(block: NodeMaterialBlock): Unit = js.native
  /**
    * Remove a block from the list of root nodes
    * @param node defines the node to remove
    * @returns the current material
    */
  def removeOutputNode(node: NodeMaterialBlock): this.type = js.native
  def serialize(selectedBlocks: js.Array[NodeMaterialBlock]): js.Any = js.native
  /**
    * Clear the current material and set it to a default state
    */
  def setToDefault(): Unit = js.native
  /**
    * Remove an optimizer from the list of optimizers
    * @param optimizer defines the optimizers to remove
    * @returns the current material
    */
  def unregisterOptimizer(optimizer: NodeMaterialOptimizer): js.UndefOr[this.type] = js.native
}

/* static members */
@JSImport("babylonjs/Materials/Node/nodeMaterial", "NodeMaterial")
@js.native
object NodeMaterial extends js.Object {
  /** Define the Url to load node editor script */
  var EditorURL: String = js.native
  /** Define the Url to load snippets */
  var SnippetUrl: String = js.native
  var _BuildIdGenerator: js.Any = js.native
  /**
    * Creates a new node material set to default basic configuration
    * @param name defines the name of the material
    * @param scene defines the hosting scene
    * @returns a new NodeMaterial
    */
  def CreateDefault(name: String): NodeMaterial = js.native
  def CreateDefault(name: String, scene: Scene): NodeMaterial = js.native
  /**
    * Creates a node material from parsed material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new node material
    */
  def Parse(source: js.Any, scene: Scene): NodeMaterial = js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): NodeMaterial = js.native
  /**
    * Creates a node material from a snippet saved in a remote file
    * @param name defines the name of the material to create
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @returns a promise that will resolve to the new node material
    */
  def ParseFromFileAsync(name: String, url: String, scene: Scene): js.Promise[NodeMaterial] = js.native
  /**
    * Creates a node material from a snippet saved by the node material editor
    * @param snippetId defines the snippet to load
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new node material
    */
  def ParseFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[NodeMaterial] = js.native
  def ParseFromSnippetAsync(snippetId: String, scene: Scene, rootUrl: String): js.Promise[NodeMaterial] = js.native
}


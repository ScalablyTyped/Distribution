package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Layers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMaterial
  extends StObject
     with PushMaterial {
  
  /* private */ var BJSNODEMATERIALEDITOR: Any = js.native
  
  /* private */ var _addFragmentOutputNode: Any = js.native
  
  /* private */ var _addVertexOutputNode: Any = js.native
  
  /* private */ var _animationFrame: Any = js.native
  
  /**
    * Attaches a new image processing configuration to the Standard Material.
    * @param configuration
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
  
  /* private */ var _buildId: Any = js.native
  
  /* private */ var _buildWasSuccessful: Any = js.native
  
  /* private */ var _cachedWorldViewMatrix: Any = js.native
  
  /* private */ var _cachedWorldViewProjectionMatrix: Any = js.native
  
  /* private */ var _checkInternals: Any = js.native
  
  /* private */ var _createEffectForParticles: Any = js.native
  
  /* private */ var _createEffectForPostProcess: Any = js.native
  
  /** Creates the node editor window. */
  /* private */ var _createNodeEditor: Any = js.native
  
  /* private */ var _fragmentCompilationState: Any = js.native
  
  /**
    * Gets or sets the root nodes of the material fragment (pixel) shader
    */
  var _fragmentOutputNodes: js.Array[NodeMaterialBlock] = js.native
  
  /* private */ var _gatherBlocks: Any = js.native
  
  /** Get the inspector from bundle or global */
  /* private */ var _getGlobalNodeMaterialEditor: Any = js.native
  
  /**
    * Default configuration related to image processing available in the standard Material.
    */
  /* protected */ var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  
  /**
    * Keep track of the image processing observer to allow dispose and replace.
    */
  /* private */ var _imageProcessingObserver: Any = js.native
  
  /* private */ var _initializeBlock: Any = js.native
  
  /**
    * Specifies the mode of the node material
    * @internal
    */
  var _mode: NodeMaterialModes = js.native
  
  /* private */ var _optimizers: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _prepareDefinesForAttributes: Any = js.native
  
  /* private */ var _processDefines: Any = js.native
  
  /* private */ var _removeFragmentOutputNode: Any = js.native
  
  /* private */ var _removeVertexOutputNode: Any = js.native
  
  /* private */ var _resetDualBlocks: Any = js.native
  
  /* private */ var _restoreConnections: Any = js.native
  
  /* private */ var _sharedData: Any = js.native
  
  /* private */ var _vertexCompilationState: Any = js.native
  
  /**
    * Gets or sets the root nodes of the material vertex shader
    */
  var _vertexOutputNodes: js.Array[NodeMaterialBlock] = js.native
  
  /**
    * Add a new block to the list of output nodes
    * @param node defines the node to add
    * @returns the current material
    */
  def addOutputNode(node: NodeMaterialBlock): this.type = js.native
  
  /**
    * Gets an array of blocks that needs to be serialized even if they are not yet connected
    */
  var attachedBlocks: js.Array[NodeMaterialBlock] = js.native
  
  /**
    * Build the material and generates the inner effect
    * @param verbose defines if the build should log activity
    * @param updateBuildId defines if the internal build Id should be updated (default is true)
    * @param autoConfigure defines if the autoConfigure method should be called when initializing blocks (default is true)
    */
  def build(): Unit = js.native
  def build(verbose: Boolean): Unit = js.native
  def build(verbose: Boolean, updateBuildId: Boolean): Unit = js.native
  def build(verbose: Boolean, updateBuildId: Boolean, autoConfigure: Boolean): Unit = js.native
  def build(verbose: Boolean, updateBuildId: Unit, autoConfigure: Boolean): Unit = js.native
  def build(verbose: Unit, updateBuildId: Boolean): Unit = js.native
  def build(verbose: Unit, updateBuildId: Boolean, autoConfigure: Boolean): Unit = js.native
  def build(verbose: Unit, updateBuildId: Unit, autoConfigure: Boolean): Unit = js.native
  
  /** Gets or sets the unique identifier used to identified the effect associated with the material */
  def buildId: Double = js.native
  def buildId_=(value: Double): Unit = js.native
  
  /**
    * Clear the current material
    */
  def clear(): Unit = js.native
  
  def clone(name: String, shareEffect: Boolean): NodeMaterial = js.native
  
  /**
    * A free comment about the material
    */
  var comment: String = js.native
  
  /**
    * Get a string representing the shaders built by the current node graph
    */
  def compiledShaders: String = js.native
  
  /**
    * Use this material as the shadow depth wrapper of a target material
    * @param targetMaterial defines the target material
    */
  def createAsShadowDepthWrapper(targetMaterial: Material): Unit = js.native
  
  /**
    * Create the effect to be used as the custom effect for a particle system
    * @param particleSystem Particle system to create the effect for
    * @param onCompiled defines a function to call when the effect creation is successful
    * @param onError defines a function to call when the effect creation has failed
    */
  def createEffectForParticles(particleSystem: IParticleSystem): Unit = js.native
  def createEffectForParticles(particleSystem: IParticleSystem, onCompiled: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
  def createEffectForParticles(
    particleSystem: IParticleSystem,
    onCompiled: js.Function1[/* effect */ Effect, Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
  ): Unit = js.native
  def createEffectForParticles(
    particleSystem: IParticleSystem,
    onCompiled: Unit,
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
  ): Unit = js.native
  
  /**
    * Create the post process effect from the material
    * @param postProcess The post process to create the effect for
    */
  def createEffectForPostProcess(postProcess: PostProcess): Unit = js.native
  
  /**
    * Create a post process from the material
    * @param camera The camera to apply the render pass to.
    * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
    * @returns the post process created
    */
  def createPostProcess(
    camera: Nullable[Camera],
    options: js.UndefOr[Double | PostProcessOptions],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    textureFormat: js.UndefOr[Double]
  ): Nullable[PostProcess] = js.native
  
  /**
    * Create a new procedural texture based on this node material
    * @param size defines the size of the texture
    * @param scene defines the hosting scene
    * @returns the new procedural texture attached to this node material
    */
  def createProceduralTexture(size: Double, scene: Scene): Nullable[ProceduralTexture] = js.native
  def createProceduralTexture(size: Layers, scene: Scene): Nullable[ProceduralTexture] = js.native
  
  /**
    * Launch the node material editor
    * @param config Define the configuration of the editor
    * @returns a promise fulfilled when the node editor is visible
    */
  def edit(): js.Promise[Unit] = js.native
  def edit(config: INodeMaterialEditorOptions): js.Promise[Unit] = js.native
  
  /**
    * Gets or sets data used by visual editor
    * @see https://nme.babylonjs.com
    */
  var editorData: Any = js.native
  
  /**
    * Gets or sets a boolean indicating that alpha blending must be enabled no matter what alpha value or alpha channel of the FragmentBlock are
    */
  var forceAlphaBlending: Boolean = js.native
  
  /**
    * Generate a string containing the code declaration required to create an equivalent of this material
    * @returns a string
    */
  def generateCode(): String = js.native
  
  /**
    * Gets the list of all texture blocks
    * Note that this method will scan all attachedBlocks and return blocks that are texture blocks
    * @returns
    */
  def getAllTextureBlocks(): js.Array[NodeMaterialTextureBlocks] = js.native
  
  /**
    * Get a block by its name
    * @param name defines the name of the block to retrieve
    * @returns the required block or null if not found
    */
  def getBlockByName(name: String): NodeMaterialBlock | Null = js.native
  
  /**
    * Get a block by its name
    * @param predicate defines the predicate used to find the good candidate
    * @returns the required block or null if not found
    */
  def getBlockByPredicate(predicate: js.Function1[/* block */ NodeMaterialBlock, Boolean]): NodeMaterialBlock | Null = js.native
  
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
    * Note that this method will only return blocks that are reachable from the final block(s) and only after the material has been built!
    * @returns an array of texture blocks
    */
  def getTextureBlocks(): js.Array[NodeMaterialTextureBlocks] = js.native
  
  /**
    * Gets or sets a boolean indicating that alpha value must be ignored (This will turn alpha blending off even if an alpha value is produced by the material)
    */
  var ignoreAlpha: Boolean = js.native
  
  /**
    * Gets the image processing configuration used either in this material.
    */
  def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * Sets the Default image processing configuration used either in the this material.
    *
    * If sets to null, the scene one is in use.
    */
  def imageProcessingConfiguration_=(value: ImageProcessingConfiguration): Unit = js.native
  
  /**
    * Loads the current Node Material from a url pointing to a file save by the Node Material Editor
    * @deprecated Please use NodeMaterial.ParseFromFileAsync instead
    * @param url defines the url to load from
    * @param rootUrl defines the root URL for nested url in the node material
    * @returns a promise that will fulfil when the material is fully loaded
    */
  def loadAsync(url: String): js.Promise[NodeMaterial] = js.native
  def loadAsync(url: String, rootUrl: String): js.Promise[NodeMaterial] = js.native
  
  /**
    * Clear the current graph and load a new one from a serialization object
    * @param source defines the JSON representation of the material
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @param merge defines whether or not the source must be merged or replace the current content
    * @deprecated Please use the parseSerializedObject method instead
    */
  def loadFromSerialization(source: Any): Unit = js.native
  def loadFromSerialization(source: Any, rootUrl: String): Unit = js.native
  def loadFromSerialization(source: Any, rootUrl: String, merge: Boolean): Unit = js.native
  def loadFromSerialization(source: Any, rootUrl: Unit, merge: Boolean): Unit = js.native
  
  /**
    * Defines the maximum number of lights that can be used in the material
    */
  var maxSimultaneousLights: Double = js.native
  
  /**
    * Gets or sets the mode property
    */
  def mode: NodeMaterialModes = js.native
  def mode_=(value: NodeMaterialModes): Unit = js.native
  
  /**
    * Observable raised when the material is built
    */
  var onBuildObservable: Observable[NodeMaterial] = js.native
  
  /**
    * Runs an otpimization phase to try to improve the shader code
    */
  def optimize(): Unit = js.native
  
  /** Gets or sets options to control the node material overall behavior */
  def options: INodeMaterialOptions = js.native
  def options_=(options: INodeMaterialOptions): Unit = js.native
  
  /**
    * Clear the current graph and load a new one from a serialization object
    * @param source defines the JSON representation of the material
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @param merge defines whether or not the source must be merged or replace the current content
    */
  def parseSerializedObject(source: Any): Unit = js.native
  def parseSerializedObject(source: Any, rootUrl: String): Unit = js.native
  def parseSerializedObject(source: Any, rootUrl: String, merge: Boolean): Unit = js.native
  def parseSerializedObject(source: Any, rootUrl: Unit, merge: Boolean): Unit = js.native
  
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
  
  def serialize(selectedBlocks: js.Array[NodeMaterialBlock]): Any = js.native
  
  /**
    * Clear the current material and set it to a default state
    */
  def setToDefault(): Unit = js.native
  
  /**
    * Clear the current material and set it to a default state for particle
    */
  def setToDefaultParticle(): Unit = js.native
  
  /**
    * Clear the current material and set it to a default state for post process
    */
  def setToDefaultPostProcess(): Unit = js.native
  
  /**
    * Clear the current material and set it to a default state for procedural texture
    */
  def setToDefaultProceduralTexture(): Unit = js.native
  
  /**
    * Snippet ID if the material was created from the snippet server
    */
  var snippetId: String = js.native
  
  /**
    * Remove an optimizer from the list of optimizers
    * @param optimizer defines the optimizers to remove
    * @returns the current material
    */
  def unregisterOptimizer(optimizer: NodeMaterialOptimizer): js.UndefOr[this.type] = js.native
}

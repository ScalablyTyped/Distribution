package typings.babylonjs

import typings.babylonjs.anon.Input
import typings.babylonjs.materialsEffectFallbacksMod.EffectFallbacks
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.materialsNodeNodeMaterialMod.NodeMaterial
import typings.babylonjs.materialsNodeNodeMaterialMod.NodeMaterialDefines
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeNodeMaterialBlockMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialBlock", "NodeMaterialBlock")
  @js.native
  open class NodeMaterialBlock protected () extends StObject {
    /**
      * Creates a new NodeMaterialBlock
      * @param name defines the block name
      * @param target defines the target of that block (Vertex by default)
      * @param isFinalMerger defines a boolean indicating that this block is an end block (e.g. it is generating a system value). Default is false
      * @param isInput defines a boolean indicating that this block is an input (e.g. it sends data to the shader). Default is false
      */
    def this(name: String) = this()
    def this(name: String, target: NodeMaterialBlockTargets) = this()
    def this(name: String, target: Unit, isFinalMerger: Boolean) = this()
    def this(name: String, target: NodeMaterialBlockTargets, isFinalMerger: Boolean) = this()
    def this(name: String, target: Unit, isFinalMerger: Boolean, isInput: Boolean) = this()
    def this(name: String, target: Unit, isFinalMerger: Unit, isInput: Boolean) = this()
    def this(name: String, target: NodeMaterialBlockTargets, isFinalMerger: Boolean, isInput: Boolean) = this()
    def this(name: String, target: NodeMaterialBlockTargets, isFinalMerger: Unit, isInput: Boolean) = this()
    
    /* protected */ def _buildBlock(state: NodeMaterialBuildState): Unit = js.native
    
    /* private */ var _buildId: Any = js.native
    
    /* private */ var _buildTarget: Any = js.native
    
    /** @internal */
    var _codeVariableName: String = js.native
    
    /* protected */ def _declareOutput(output: NodeMaterialConnectionPoint, state: NodeMaterialBuildState): String = js.native
    
    /**
      * @internal
      */
    def _deserialize(serializationObject: Any, scene: Scene, rootUrl: String): Unit = js.native
    
    /* private */ var _deserializePortDisplayNamesAndExposedOnFrame: Any = js.native
    
    /**
      * @internal
      */
    def _dumpCode(uniqueNames: js.Array[String], alreadyDumped: js.Array[NodeMaterialBlock]): String = js.native
    
    /**
      * @internal
      */
    def _dumpCodeForOutputConnections(alreadyDumped: js.Array[NodeMaterialBlock]): String = js.native
    
    /* protected */ def _dumpPropertiesCode(): String = js.native
    
    /* protected */ def _inputRename(name: String): String = js.native
    
    /** @internal */
    var _inputs: js.Array[NodeMaterialConnectionPoint] = js.native
    
    /* private */ var _isFinalMerger: Any = js.native
    
    /* private */ var _isInput: Any = js.native
    
    /* protected */ var _isUnique: Boolean = js.native
    
    /* protected */ def _linkConnectionTypes(inputIndex0: Double, inputIndex1: Double): Unit = js.native
    /* protected */ def _linkConnectionTypes(inputIndex0: Double, inputIndex1: Double, looseCoupling: Boolean): Unit = js.native
    
    /* private */ var _name: Any = js.native
    
    /** @internal */
    val _originalTargetIsNeutral: Boolean = js.native
    
    /* protected */ def _outputRename(name: String): String = js.native
    
    /** @internal */
    var _outputs: js.Array[NodeMaterialConnectionPoint] = js.native
    
    /** @internal */
    var _preparationId: Double = js.native
    
    /* private */ var _processBuild: Any = js.native
    
    /** @internal */
    def _setInitialTarget(target: NodeMaterialBlockTargets): Unit = js.native
    
    /* protected */ var _target: NodeMaterialBlockTargets = js.native
    
    /* protected */ def _writeFloat(value: Double): String = js.native
    
    /* protected */ def _writeVariable(currentPoint: NodeMaterialConnectionPoint): String = js.native
    
    /**
      * Lets the block try to connect some inputs automatically
      * @param material defines the hosting NodeMaterial
      */
    def autoConfigure(material: NodeMaterial): Unit = js.native
    
    /**
      * Bind data to effect. Will only be called for blocks with isBindable === true
      * @param effect defines the effect to bind data to
      * @param nodeMaterial defines the hosting NodeMaterial
      * @param mesh defines the mesh that will be rendered
      * @param subMesh defines the submesh that will be rendered
      */
    def bind(effect: Effect, nodeMaterial: NodeMaterial): Unit = js.native
    def bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Unit, subMesh: SubMesh): Unit = js.native
    def bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh): Unit = js.native
    def bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh, subMesh: SubMesh): Unit = js.native
    
    /**
      * Compile the current node and generate the shader code
      * @param state defines the current compilation state (uniforms, samplers, current string)
      * @param activeBlocks defines the list of active blocks (i.e. blocks to compile)
      * @returns true if already built
      */
    def build(state: NodeMaterialBuildState, activeBlocks: js.Array[NodeMaterialBlock]): Boolean = js.native
    
    /**
      * Gets or sets the build Id
      */
    def buildId: Double = js.native
    def buildId_=(value: Double): Unit = js.native
    
    /**
      * Clone the current block to a new identical block
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a copy of the current block
      */
    def clone(scene: Scene): NodeMaterialBlock | Null = js.native
    def clone(scene: Scene, rootUrl: String): NodeMaterialBlock | Null = js.native
    
    /**
      * Gets or sets the comments associated with this block
      */
    var comments: String = js.native
    
    /**
      * Connect current block with another block
      * @param other defines the block to connect with
      * @param options define the various options to help pick the right connections
      * @param options.input
      * @param options.output
      * @param options.outputSwizzle
      * @returns the current block
      */
    def connectTo(other: NodeMaterialBlock): js.UndefOr[this.type] = js.native
    def connectTo(other: NodeMaterialBlock, options: Input): js.UndefOr[this.type] = js.native
    
    /**
      * Release resources
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the current class name e.g. "NodeMaterialBlock"
      * @returns the class name
      */
    def getClassName(): String = js.native
    
    /**
      * Will return the first available input e.g. the first one which is not an uniform or an attribute
      * @param forOutput defines an optional connection point to check compatibility with
      * @returns the first available input or null
      */
    def getFirstAvailableInput(): NodeMaterialConnectionPoint | Null = js.native
    def getFirstAvailableInput(forOutput: Nullable[NodeMaterialConnectionPoint]): NodeMaterialConnectionPoint | Null = js.native
    
    /**
      * Will return the first available output e.g. the first one which is not yet connected and not a varying
      * @param forBlock defines an optional block to check compatibility with
      * @returns the first available input or null
      */
    def getFirstAvailableOutput(): NodeMaterialConnectionPoint | Null = js.native
    def getFirstAvailableOutput(forBlock: Nullable[NodeMaterialBlock]): NodeMaterialConnectionPoint | Null = js.native
    
    /**
      * Find an input by its name
      * @param name defines the name of the input to look for
      * @returns the input or null if not found
      */
    def getInputByName(name: String): NodeMaterialConnectionPoint | Null = js.native
    
    /**
      * Find an output by its name
      * @param name defines the name of the output to look for
      * @returns the output or null if not found
      */
    def getOutputByName(name: String): NodeMaterialConnectionPoint | Null = js.native
    
    /**
      * Gets the sibling of the given output
      * @param current defines the current output
      * @returns the next output in the list or null
      */
    def getSiblingOutput(current: NodeMaterialConnectionPoint): NodeMaterialConnectionPoint | Null = js.native
    
    /**
      * Initialize the block and prepare the context for build
      * @param state defines the state that will be used for the build
      */
    def initialize(state: NodeMaterialBuildState): Unit = js.native
    
    /**
      * Initialize defines for shader compilation
      * @param mesh defines the mesh to be rendered
      * @param nodeMaterial defines the node material requesting the update
      * @param defines defines the material defines to update
      * @param useInstances specifies that instances should be used
      */
    def initializeDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines): Unit = js.native
    def initializeDefines(
      mesh: AbstractMesh,
      nodeMaterial: NodeMaterial,
      defines: NodeMaterialDefines,
      useInstances: Boolean
    ): Unit = js.native
    
    /**
      * Gets the list of input points
      */
    def inputs: js.Array[NodeMaterialConnectionPoint] = js.native
    
    /** Gets or sets a boolean indicating that only one input can be connected at a time */
    var inputsAreExclusive: Boolean = js.native
    
    /**
      * Checks if the current block is an ancestor of a given block
      * @param block defines the potential descendant block to check
      * @returns true if block is a descendant
      */
    def isAnAncestorOf(block: NodeMaterialBlock): Boolean = js.native
    
    /**
      * Gets a boolean indicating that this block is an end block (e.g. it is generating a system value)
      */
    def isFinalMerger: Boolean = js.native
    
    /**
      * Gets a boolean indicating that this block is an input (e.g. it sends data to the shader)
      */
    def isInput: Boolean = js.native
    
    /**
      * Checks if the block is ready
      * @param mesh defines the mesh to be rendered
      * @param nodeMaterial defines the node material requesting the update
      * @param defines defines the material defines to update
      * @param useInstances specifies that instances should be used
      * @returns true if the block is ready
      */
    def isReady(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines): Boolean = js.native
    def isReady(
      mesh: AbstractMesh,
      nodeMaterial: NodeMaterial,
      defines: NodeMaterialDefines,
      useInstances: Boolean
    ): Boolean = js.native
    
    /**
      * Gets a boolean indicating that this block can only be used once per NodeMaterial
      */
    def isUnique: Boolean = js.native
    
    /**
      * Gets the name of the block
      */
    def name: String = js.native
    /**
      * Sets the name of the block. Will check if the name is valid.
      */
    def name_=(newName: String): Unit = js.native
    
    /** Gets the list of output points */
    def outputs: js.Array[NodeMaterialConnectionPoint] = js.native
    
    /**
      * Update defines for shader compilation
      * @param mesh defines the mesh to be rendered
      * @param nodeMaterial defines the node material requesting the update
      * @param defines defines the material defines to update
      * @param useInstances specifies that instances should be used
      * @param subMesh defines which submesh to render
      */
    def prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines): Unit = js.native
    def prepareDefines(
      mesh: AbstractMesh,
      nodeMaterial: NodeMaterial,
      defines: NodeMaterialDefines,
      useInstances: Boolean
    ): Unit = js.native
    def prepareDefines(
      mesh: AbstractMesh,
      nodeMaterial: NodeMaterial,
      defines: NodeMaterialDefines,
      useInstances: Boolean,
      subMesh: SubMesh
    ): Unit = js.native
    def prepareDefines(
      mesh: AbstractMesh,
      nodeMaterial: NodeMaterial,
      defines: NodeMaterialDefines,
      useInstances: Unit,
      subMesh: SubMesh
    ): Unit = js.native
    
    /**
      * Add potential fallbacks if shader compilation fails
      * @param mesh defines the mesh to be rendered
      * @param fallbacks defines the current prioritized list of fallbacks
      */
    def provideFallbacks(mesh: AbstractMesh, fallbacks: EffectFallbacks): Unit = js.native
    
    /**
      * Register a new input. Must be called inside a block constructor
      * @param name defines the connection point name
      * @param type defines the connection point type
      * @param isOptional defines a boolean indicating that this input can be omitted
      * @param target defines the target to use to limit the connection point (will be VertexAndFragment by default)
      * @param point an already created connection point. If not provided, create a new one
      * @returns the current block
      */
    def registerInput(name: String, `type`: NodeMaterialBlockConnectionPointTypes): this.type = js.native
    def registerInput(name: String, `type`: NodeMaterialBlockConnectionPointTypes, isOptional: Boolean): this.type = js.native
    def registerInput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      isOptional: Boolean,
      target: Unit,
      point: NodeMaterialConnectionPoint
    ): this.type = js.native
    def registerInput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      isOptional: Boolean,
      target: NodeMaterialBlockTargets
    ): this.type = js.native
    def registerInput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      isOptional: Boolean,
      target: NodeMaterialBlockTargets,
      point: NodeMaterialConnectionPoint
    ): this.type = js.native
    def registerInput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      isOptional: Unit,
      target: Unit,
      point: NodeMaterialConnectionPoint
    ): this.type = js.native
    def registerInput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      isOptional: Unit,
      target: NodeMaterialBlockTargets
    ): this.type = js.native
    def registerInput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      isOptional: Unit,
      target: NodeMaterialBlockTargets,
      point: NodeMaterialConnectionPoint
    ): this.type = js.native
    
    /**
      * Register a new output. Must be called inside a block constructor
      * @param name defines the connection point name
      * @param type defines the connection point type
      * @param target defines the target to use to limit the connection point (will be VertexAndFragment by default)
      * @param point an already created connection point. If not provided, create a new one
      * @returns the current block
      */
    def registerOutput(name: String, `type`: NodeMaterialBlockConnectionPointTypes): this.type = js.native
    def registerOutput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      target: Unit,
      point: NodeMaterialConnectionPoint
    ): this.type = js.native
    def registerOutput(name: String, `type`: NodeMaterialBlockConnectionPointTypes, target: NodeMaterialBlockTargets): this.type = js.native
    def registerOutput(
      name: String,
      `type`: NodeMaterialBlockConnectionPointTypes,
      target: NodeMaterialBlockTargets,
      point: NodeMaterialConnectionPoint
    ): this.type = js.native
    
    /**
      * Function called when a block is declared as repeatable content generator
      * @param vertexShaderState defines the current compilation state for the vertex shader
      * @param fragmentShaderState defines the current compilation state for the fragment shader
      * @param mesh defines the mesh to be rendered
      * @param defines defines the material defines to update
      */
    def replaceRepeatableContent(
      vertexShaderState: NodeMaterialBuildState,
      fragmentShaderState: NodeMaterialBuildState,
      mesh: AbstractMesh,
      defines: NodeMaterialDefines
    ): Unit = js.native
    
    /**
      * Serializes this block in a JSON representation
      * @returns the serialized block object
      */
    def serialize(): Any = js.native
    
    /**
      * Gets or sets the target of the block
      */
    def target: NodeMaterialBlockTargets = js.native
    def target_=(value: NodeMaterialBlockTargets): Unit = js.native
    
    /**
      * Gets or sets the unique id of the node
      */
    var uniqueId: Double = js.native
    
    /**
      * Add uniforms, samplers and uniform buffers at compilation time
      * @param state defines the state to update
      * @param nodeMaterial defines the node material requesting the update
      * @param defines defines the material defines to update
      * @param uniformBuffers defines the list of uniform buffer names
      */
    def updateUniformsAndSamples(
      state: NodeMaterialBuildState,
      nodeMaterial: NodeMaterial,
      defines: NodeMaterialDefines,
      uniformBuffers: js.Array[String]
    ): Unit = js.native
    
    /**
      * Validates the new name for the block node.
      * @param newName the new name to be given to the node.
      * @returns false if the name is a reserve word, else true.
      */
    def validateBlockName(newName: String): Boolean = js.native
    
    /** Gets or sets a boolean indicating that this input can be edited in the Inspector (false by default) */
    var visibleInInspector: Boolean = js.native
    
    /** Gets or sets a boolean indicating that this input can be edited from a collapsed frame */
    var visibleOnFrame: Boolean = js.native
    
    /** Gets a boolean indicating that the code of this block will be promoted to vertex shader even if connected to fragment output */
    def willBeGeneratedIntoVertexShaderFromFragmentShader: Boolean = js.native
  }
}

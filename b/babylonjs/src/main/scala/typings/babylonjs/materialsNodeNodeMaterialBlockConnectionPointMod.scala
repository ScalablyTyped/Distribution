package typings.babylonjs

import typings.babylonjs.materialsNodeBlocksInputInputBlockMod.InputBlock
import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeNodeMaterialBlockConnectionPointMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialBlockConnectionPoint", "NodeMaterialConnectionPoint")
  @js.native
  open class NodeMaterialConnectionPoint protected () extends StObject {
    /**
      * Creates a new connection point
      * @param name defines the connection point name
      * @param ownerBlock defines the block hosting this connection point
      * @param direction defines the direction of the connection point
      */
    def this(name: String, ownerBlock: NodeMaterialBlock, direction: NodeMaterialConnectionPointDirection) = this()
    
    /** @internal */
    var _acceptedConnectionPointType: Nullable[NodeMaterialConnectionPoint] = js.native
    
    /* private */ var _associatedVariableName: Any = js.native
    
    /** @internal */
    var _connectedPoint: Nullable[NodeMaterialConnectionPoint] = js.native
    
    /** @internal */
    var _defaultConnectionPointType: Nullable[NodeMaterialBlockConnectionPointTypes] = js.native
    
    /* private */ var _direction: Any = js.native
    
    /* private */ var _endpoints: Any = js.native
    
    /** @internal */
    var _enforceAssociatedVariableName: Boolean = js.native
    
    /** @internal */
    var _linkedConnectionSource: Nullable[NodeMaterialConnectionPoint] = js.native
    
    /** @internal */
    var _ownerBlock: NodeMaterialBlock = js.native
    
    /** @internal */
    var _prioritizeVertex: Boolean = js.native
    
    /* private */ var _target: Any = js.native
    
    /* private */ var _type: Any = js.native
    
    /** @internal */
    var _typeConnectionSource: Nullable[NodeMaterialConnectionPoint] = js.native
    
    /**
      * Gets or sets the additional types supported by this connection point
      */
    var acceptedConnectionPointTypes: js.Array[NodeMaterialBlockConnectionPointTypes] = js.native
    
    /**
      * Fill the list of excluded connection point types with all types other than those passed in the parameter
      * @param mask Types (ORed values of NodeMaterialBlockConnectionPointTypes) that are allowed, and thus will not be pushed to the excluded list
      */
    def addExcludedConnectionPointFromAllowedTypes(mask: Double): Unit = js.native
    
    /**
      * Gets or sets the associated variable name in the shader
      */
    def associatedVariableName: String = js.native
    def associatedVariableName_=(value: String): Unit = js.native
    
    /**
      * Gets a boolean indicating if the current point can be connected to another point
      * @param connectionPoint defines the other connection point
      * @returns a boolean
      */
    def canConnectTo(connectionPoint: NodeMaterialConnectionPoint): Boolean = js.native
    
    /**
      * Gets a number indicating if the current point can be connected to another point
      * @param connectionPoint defines the other connection point
      * @returns a number defining the compatibility state
      */
    def checkCompatibilityState(connectionPoint: NodeMaterialConnectionPoint): NodeMaterialConnectionPointCompatibilityStates = js.native
    
    /**
      * Gets a the connected input block (if any)
      */
    def connectInputBlock: Nullable[InputBlock] = js.native
    
    /**
      * Connect this point to another connection point
      * @param connectionPoint defines the other connection point
      * @param ignoreConstraints defines if the system will ignore connection type constraints (default is false)
      * @returns the current connection point
      */
    def connectTo(connectionPoint: NodeMaterialConnectionPoint): NodeMaterialConnectionPoint = js.native
    def connectTo(connectionPoint: NodeMaterialConnectionPoint, ignoreConstraints: Boolean): NodeMaterialConnectionPoint = js.native
    
    /** Get the block connected on the endpoints of this connection (if any) */
    def connectedBlocks: js.Array[NodeMaterialBlock] = js.native
    
    /** Get the other side of the connection (if any) */
    def connectedPoint: Nullable[NodeMaterialConnectionPoint] = js.native
    
    /**
      * Creates a block suitable to be used as an input for this input point.
      * If null is returned, a block based on the point type will be created.
      * @returns The returned string parameter is the name of the output point of NodeMaterialBlock (first parameter of the returned array) that can be connected to the input
      */
    def createCustomInputBlock(): Nullable[js.Tuple2[NodeMaterialBlock, String]] = js.native
    
    /**
      * Gets or sets a string indicating that this uniform must be defined under a #ifdef
      */
    var define: String = js.native
    
    /** Gets the direction of the point */
    def direction: NodeMaterialConnectionPointDirection = js.native
    
    /**
      * Disconnect this point from one of his endpoint
      * @param endpoint defines the other connection point
      * @returns the current connection point
      */
    def disconnectFrom(endpoint: NodeMaterialConnectionPoint): NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the connection point name
      */
    var displayName: String = js.native
    
    /**
      * Release resources
      */
    def dispose(): Unit = js.native
    
    /** Gets the list of connected endpoints */
    def endpoints: js.Array[NodeMaterialConnectionPoint] = js.native
    
    /**
      * Gets or sets the additional types excluded by this connection point
      */
    var excludedConnectionPointTypes: js.Array[NodeMaterialBlockConnectionPointTypes] = js.native
    
    /**
      * Gets or sets number indicating the position that the port is exposed to on a frame
      */
    var exposedPortPosition: Double = js.native
    
    /**
      * Gets the current class name e.g. "NodeMaterialConnectionPoint"
      * @returns the class name
      */
    def getClassName(): String = js.native
    
    /** Gets a boolean indicating if that output point is connected to at least one input */
    def hasEndpoints: Boolean = js.native
    
    /** Get the inner type (ie AutoDetect for instance instead of the inferred one) */
    def innerType: NodeMaterialBlockConnectionPointTypes = js.native
    
    /**
      * Gets a boolean indicating that the current point is connected to another NodeMaterialBlock
      */
    def isConnected: Boolean = js.native
    
    /** Gets a boolean indicating that this connection will be used in the fragment shader */
    def isConnectedInFragmentShader: Boolean = js.native
    
    /** Gets a boolean indicating that this connection will be used in the vertex shader */
    def isConnectedInVertexShader: Boolean = js.native
    
    /**
      * Gets a boolean indicating that the current point is connected to an input block
      */
    def isConnectedToInputBlock: Boolean = js.native
    
    /** Gets a boolean indicating that this connection has a path to the vertex output*/
    def isDirectlyConnectedToVertexOutput: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating that this connection point is exposed on a frame
      */
    var isExposedOnFrame: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating that this connection point can be omitted
      */
    var isOptional: Boolean = js.native
    
    /**
      * Gets or sets the connection point name
      */
    var name: String = js.native
    
    /** Indicates that this connection point needs dual validation before being connected to another point */
    var needDualDirectionValidation: Boolean = js.native
    
    /**
      * Observable triggered when this point is connected
      */
    var onConnectionObservable: Observable[NodeMaterialConnectionPoint] = js.native
    
    /** Get the block that owns this connection point */
    def ownerBlock: NodeMaterialBlock = js.native
    
    /**
      * Serializes this point in a JSON representation
      * @param isInput defines if the connection point is an input (default is true)
      * @returns the serialized point object
      */
    def serialize(): Any = js.native
    def serialize(isInput: Boolean): Any = js.native
    
    /** Get the block connected on the other side of this connection (if any) */
    def sourceBlock: Nullable[NodeMaterialBlock] = js.native
    
    /** Gets or sets the target of that connection point */
    def target: NodeMaterialBlockTargets = js.native
    def target_=(value: NodeMaterialBlockTargets): Unit = js.native
    
    /**
      * Gets or sets the connection point type (default is float)
      */
    def `type`: NodeMaterialBlockConnectionPointTypes = js.native
    def type_=(value: NodeMaterialBlockConnectionPointTypes): Unit = js.native
  }
  /* static members */
  object NodeMaterialConnectionPoint {
    
    @JSImport("babylonjs/Materials/Node/nodeMaterialBlockConnectionPoint", "NodeMaterialConnectionPoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if two types are equivalent
      * @param type1 type 1 to check
      * @param type2 type 2 to check
      * @returns true if both types are equivalent, else false
      */
    inline def AreEquivalentTypes(type1: Double, type2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEquivalentTypes")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait NodeMaterialConnectionPointCompatibilityStates extends StObject
  @JSImport("babylonjs/Materials/Node/nodeMaterialBlockConnectionPoint", "NodeMaterialConnectionPointCompatibilityStates")
  @js.native
  object NodeMaterialConnectionPointCompatibilityStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialConnectionPointCompatibilityStates & Double] = js.native
    
    /** Points are compatibles */
    @js.native
    sealed trait Compatible
      extends StObject
         with NodeMaterialConnectionPointCompatibilityStates
    /* 0 */ val Compatible: typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointCompatibilityStates.Compatible & Double = js.native
    
    /** Points are incompatible because they are in the same hierarchy **/
    @js.native
    sealed trait HierarchyIssue
      extends StObject
         with NodeMaterialConnectionPointCompatibilityStates
    /* 3 */ val HierarchyIssue: typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointCompatibilityStates.HierarchyIssue & Double = js.native
    
    /** Points are incompatible because of their targets (vertex vs fragment) */
    @js.native
    sealed trait TargetIncompatible
      extends StObject
         with NodeMaterialConnectionPointCompatibilityStates
    /* 2 */ val TargetIncompatible: typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointCompatibilityStates.TargetIncompatible & Double = js.native
    
    /** Points are incompatible because of their types */
    @js.native
    sealed trait TypeIncompatible
      extends StObject
         with NodeMaterialConnectionPointCompatibilityStates
    /* 1 */ val TypeIncompatible: typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointCompatibilityStates.TypeIncompatible & Double = js.native
  }
  
  @js.native
  sealed trait NodeMaterialConnectionPointDirection extends StObject
  @JSImport("babylonjs/Materials/Node/nodeMaterialBlockConnectionPoint", "NodeMaterialConnectionPointDirection")
  @js.native
  object NodeMaterialConnectionPointDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialConnectionPointDirection & Double] = js.native
    
    /** Input */
    @js.native
    sealed trait Input
      extends StObject
         with NodeMaterialConnectionPointDirection
    /* 0 */ val Input: typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection.Input & Double = js.native
    
    /** Output */
    @js.native
    sealed trait Output
      extends StObject
         with NodeMaterialConnectionPointDirection
    /* 1 */ val Output: typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection.Output & Double = js.native
  }
}

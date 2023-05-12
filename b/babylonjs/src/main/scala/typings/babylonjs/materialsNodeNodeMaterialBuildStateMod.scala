package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.RemoveAttributes
import typings.babylonjs.anon.RepeatKey
import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import typings.babylonjs.materialsNodeNodeMaterialBuildStateSharedDataMod.NodeMaterialBuildStateSharedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeNodeMaterialBuildStateMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialBuildState", "NodeMaterialBuildState")
  @js.native
  open class NodeMaterialBuildState () extends StObject {
    
    /** @internal */
    var _attributeDeclaration: String = js.native
    
    /** @internal */
    var _builtCompilationString: String = js.native
    
    /** @internal */
    var _constantDeclaration: String = js.native
    
    /**
      * @internal
      */
    def _emit2DArraySampler(name: String): Unit = js.native
    
    /**
      * @internal
      */
    def _emit2DSampler(name: String): Unit = js.native
    
    /**
      * @internal
      */
    def _emitCodeFromInclude(includeName: String, comments: String): String = js.native
    def _emitCodeFromInclude(includeName: String, comments: String, options: RepeatKey): String = js.native
    
    /**
      * @internal
      */
    def _emitExtension(name: String, `extension`: String): Unit = js.native
    def _emitExtension(name: String, `extension`: String, define: String): Unit = js.native
    
    /**
      * @internal
      */
    def _emitFloat(value: Double): String = js.native
    
    /**
      * @internal
      */
    def _emitFunction(name: String, code: String, comments: String): Unit = js.native
    
    /**
      * @internal
      */
    def _emitFunctionFromInclude(includeName: String, comments: String): Unit = js.native
    def _emitFunctionFromInclude(includeName: String, comments: String, options: Unit, storeKey: String): Unit = js.native
    def _emitFunctionFromInclude(includeName: String, comments: String, options: RemoveAttributes): Unit = js.native
    def _emitFunctionFromInclude(includeName: String, comments: String, options: RemoveAttributes, storeKey: String): Unit = js.native
    
    /**
      * @internal
      */
    def _emitUniformFromString(name: String, `type`: String): Unit = js.native
    def _emitUniformFromString(name: String, `type`: String, define: String): Unit = js.native
    def _emitUniformFromString(name: String, `type`: String, define: String, notDefine: Boolean): Unit = js.native
    def _emitUniformFromString(name: String, `type`: String, define: Unit, notDefine: Boolean): Unit = js.native
    
    /**
      * @internal
      */
    def _emitVaryingFromString(name: String, `type`: String): Boolean = js.native
    def _emitVaryingFromString(name: String, `type`: String, define: String): Boolean = js.native
    def _emitVaryingFromString(name: String, `type`: String, define: String, notDefine: Boolean): Boolean = js.native
    def _emitVaryingFromString(name: String, `type`: String, define: Unit, notDefine: Boolean): Boolean = js.native
    
    /**
      * @internal
      */
    def _excludeVariableName(name: String): Unit = js.native
    
    /**
      * @internal
      */
    def _getFreeDefineName(prefix: String): String = js.native
    
    /**
      * @internal
      */
    def _getFreeVariableName(prefix: String): String = js.native
    
    /**
      * @internal
      */
    def _getGLType(`type`: NodeMaterialBlockConnectionPointTypes): String = js.native
    
    /** @internal */
    var _injectAtEnd: String = js.native
    
    /**
      * @internal
      */
    def _registerTempVariable(name: String): Boolean = js.native
    
    /** @internal */
    def _repeatableContentAnchor: String = js.native
    
    /* private */ var _repeatableContentAnchorIndex: Any = js.native
    
    /** @internal */
    var _samplerDeclaration: String = js.native
    
    /** @internal */
    var _uniformDeclaration: String = js.native
    
    /** @internal */
    var _varyingTransfer: String = js.native
    
    /** @internal */
    var _vertexState: NodeMaterialBuildState = js.native
    
    /**
      * Gets the list of emitted attributes
      */
    var attributes: js.Array[String] = js.native
    
    /**
      * Gets the emitted compilation strings
      */
    var compilationString: String = js.native
    
    /**
      * Gets the list of emitted constants
      */
    var constants: js.Array[String] = js.native
    
    /**
      * Gets the list of emitted counters
      */
    var counters: StringDictionary[Double] = js.native
    
    /**
      * Gets the list of emitted extensions
      */
    var extensions: StringDictionary[String] = js.native
    
    /**
      * Finalize the compilation strings
      * @param state defines the current compilation state
      */
    def finalize(state: NodeMaterialBuildState): Unit = js.native
    
    /**
      * Gets the list of emitted functions
      */
    var functions: StringDictionary[String] = js.native
    
    /**
      * Gets the list of emitted samplers
      */
    var samplers: js.Array[String] = js.native
    
    /**
      * Shared data between multiple NodeMaterialBuildState instances
      */
    var sharedData: NodeMaterialBuildStateSharedData = js.native
    
    /** Gets or sets a boolean indicating if the current state can emit uniform buffers */
    var supportUniformBuffers: Boolean = js.native
    
    /**
      * Gets the target of the compilation state
      */
    var target: NodeMaterialBlockTargets = js.native
    
    /**
      * Gets the list of emitted uniforms
      */
    var uniforms: js.Array[String] = js.native
  }
}

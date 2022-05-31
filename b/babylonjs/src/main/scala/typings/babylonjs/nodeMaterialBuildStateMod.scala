package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.RemoveAttributes
import typings.babylonjs.anon.RepeatKey
import typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import typings.babylonjs.nodeMaterialBuildStateSharedDataMod.NodeMaterialBuildStateSharedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialBuildStateMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialBuildState", "NodeMaterialBuildState")
  @js.native
  class NodeMaterialBuildState () extends StObject {
    
    /** @hidden */
    var _attributeDeclaration: String = js.native
    
    /** @hidden */
    var _builtCompilationString: String = js.native
    
    /** @hidden */
    var _constantDeclaration: String = js.native
    
    /** @hidden */
    def _emit2DSampler(name: String): Unit = js.native
    
    /** @hidden */
    def _emitCodeFromInclude(includeName: String, comments: String): String = js.native
    def _emitCodeFromInclude(includeName: String, comments: String, options: RepeatKey): String = js.native
    
    /** @hidden */
    def _emitExtension(name: String, `extension`: String): Unit = js.native
    def _emitExtension(name: String, `extension`: String, define: String): Unit = js.native
    
    /** @hidden */
    def _emitFloat(value: Double): String = js.native
    
    /** @hidden */
    def _emitFunction(name: String, code: String, comments: String): Unit = js.native
    
    /** @hidden */
    def _emitFunctionFromInclude(includeName: String, comments: String): Unit = js.native
    def _emitFunctionFromInclude(includeName: String, comments: String, options: Unit, storeKey: String): Unit = js.native
    def _emitFunctionFromInclude(includeName: String, comments: String, options: RemoveAttributes): Unit = js.native
    def _emitFunctionFromInclude(includeName: String, comments: String, options: RemoveAttributes, storeKey: String): Unit = js.native
    
    /** @hidden */
    def _emitUniformFromString(name: String, `type`: String): Unit = js.native
    def _emitUniformFromString(name: String, `type`: String, define: String): Unit = js.native
    def _emitUniformFromString(name: String, `type`: String, define: String, notDefine: Boolean): Unit = js.native
    def _emitUniformFromString(name: String, `type`: String, define: Unit, notDefine: Boolean): Unit = js.native
    
    /** @hidden */
    def _emitVaryingFromString(name: String, `type`: String): Boolean = js.native
    def _emitVaryingFromString(name: String, `type`: String, define: String): Boolean = js.native
    def _emitVaryingFromString(name: String, `type`: String, define: String, notDefine: Boolean): Boolean = js.native
    def _emitVaryingFromString(name: String, `type`: String, define: Unit, notDefine: Boolean): Boolean = js.native
    
    /** @hidden */
    def _excludeVariableName(name: String): Unit = js.native
    
    /** @hidden */
    def _getFreeDefineName(prefix: String): String = js.native
    
    /** @hidden */
    def _getFreeVariableName(prefix: String): String = js.native
    
    /** @hidden */
    def _getGLType(`type`: NodeMaterialBlockConnectionPointTypes): String = js.native
    
    /** @hidden */
    var _injectAtEnd: String = js.native
    
    /** @hidden */
    def _registerTempVariable(name: String): Boolean = js.native
    
    /** @hidden */
    def _repeatableContentAnchor: String = js.native
    
    /* private */ var _repeatableContentAnchorIndex: js.Any = js.native
    
    /** @hidden */
    var _samplerDeclaration: String = js.native
    
    /** @hidden */
    var _uniformDeclaration: String = js.native
    
    /** @hidden */
    var _varyingTransfer: String = js.native
    
    /** @hidden */
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

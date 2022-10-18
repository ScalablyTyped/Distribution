package typings.babylonjs

import typings.babylonjs.materialsNodeBlocksDualReflectionTextureBaseBlockMod.ReflectionTextureBaseBlock
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBuildStateMod.NodeMaterialBuildState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksPbrReflectionBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/reflectionBlock", "ReflectionBlock")
  @js.native
  open class ReflectionBlock protected () extends ReflectionTextureBaseBlock {
    /**
      * Create a new ReflectionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /** @internal */
    var _defineLODReflectionAlpha: String = js.native
    
    /** @internal */
    var _defineLinearSpecularReflection: String = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _vEnvironmentIrradianceName: Any = js.native
    
    /** @internal */
    var _vReflectionFilteringInfoName: String = js.native
    
    /** @internal */
    var _vReflectionInfosName: String = js.native
    
    /** @internal */
    var _vReflectionMicrosurfaceInfosName: String = js.native
    
    /** @internal */
    var cameraPositionConnectionPoint: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the color input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Force the shader to compute irradiance in the fragment shader in order to take bump in account.
      */
    var forceIrradianceInFragment: Boolean = js.native
    
    /**
      * Gets the main code of the block (fragment side)
      * @param state current state of the node material building
      * @param normalVarName name of the existing variable corresponding to the normal
      * @returns the shader code
      */
    def getCode(state: NodeMaterialBuildState, normalVarName: String): String = js.native
    
    /**
      * Returns true if the block has a texture (either its own texture or the environment texture from the scene, if set)
      */
    def hasTexture: Boolean = js.native
    
    /**
      * Gets the reflection object output component
      */
    def reflection: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the reflection color (either the name of the variable if the color input is connected, else a default value)
      */
    def reflectionColor: String = js.native
    
    /**
      * Defines if the material uses spherical harmonics vs spherical polynomials for the
      * diffuse part of the IBL.
      */
    var useSphericalHarmonics: Boolean = js.native
    
    /** @internal */
    var viewConnectionPoint: NodeMaterialConnectionPoint = js.native
    
    /** @internal */
    var worldNormalConnectionPoint: NodeMaterialConnectionPoint = js.native
    
    /**
      * The properties below are set by the main PBR block prior to calling methods of this class.
      * This is to avoid having to add them as inputs here whereas they are already inputs of the main block, so already known.
      * It's less burden on the user side in the editor part.
      */
    /** @internal */
    var worldPositionConnectionPoint: NodeMaterialConnectionPoint = js.native
  }
}

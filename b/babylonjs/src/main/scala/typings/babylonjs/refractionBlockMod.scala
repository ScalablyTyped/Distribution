package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.nodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refractionBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/refractionBlock", "RefractionBlock")
  @js.native
  class RefractionBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new RefractionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /** @hidden */
    var _2DSamplerName: String = js.native
    
    /** @hidden */
    var _cubeSamplerName: String = js.native
    
    /** @hidden */
    var _define3DName: String = js.native
    
    /** @hidden */
    var _defineLODRefractionAlpha: String = js.native
    
    /** @hidden */
    var _defineLinearSpecularRefraction: String = js.native
    
    /** @hidden */
    var _defineOppositeZ: String = js.native
    
    /* protected */ def _getTexture(): Nullable[BaseTexture] = js.native
    
    /** @hidden */
    var _refractionMatrixName: String = js.native
    
    /* private */ var _scene: js.Any = js.native
    
    /** @hidden */
    var _vRefractionFilteringInfoName: String = js.native
    
    /** @hidden */
    var _vRefractionInfosName: String = js.native
    
    /** @hidden */
    var _vRefractionMicrosurfaceInfosName: String = js.native
    
    /**
      * Gets the main code of the block (fragment side)
      * @param state current state of the node material building
      * @returns the shader code
      */
    def getCode(state: NodeMaterialBuildState): String = js.native
    
    /**
      * Returns true if the block has a texture
      */
    def hasTexture: Boolean = js.native
    
    /** @hidden */
    var indexOfRefractionConnectionPoint: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the intensity input component
      */
    def intensity: NodeMaterialConnectionPoint = js.native
    
    /**
      * Controls if refraction needs to be inverted on Y. This could be useful for procedural texture.
      */
    var invertRefractionY: Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    /**
      * This parameters will make the material used its opacity to control how much it is refracting aginst not.
      * Materials half opaque for instance using refraction could benefit from this control.
      */
    var linkRefractionWithTransparency: Boolean = js.native
    
    /**
      * Gets the refraction object output component
      */
    def refraction: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the texture associated with the node
      */
    var texture: Nullable[BaseTexture] = js.native
    
    /**
      * Gets the tint at distance input component
      */
    def tintAtDistance: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the view input component
      */
    def view: NodeMaterialConnectionPoint = js.native
    
    /**
      * The properties below are set by the main PBR block prior to calling methods of this class.
      * This is to avoid having to add them as inputs here whereas they are already inputs of the main block, so already known.
      * It's less burden on the user side in the editor part.
      */
    /** @hidden */
    var viewConnectionPoint: NodeMaterialConnectionPoint = js.native
  }
}

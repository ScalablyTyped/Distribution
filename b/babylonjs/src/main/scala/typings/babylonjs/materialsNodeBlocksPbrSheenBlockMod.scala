package typings.babylonjs

import typings.babylonjs.materialsNodeBlocksPbrReflectionBlockMod.ReflectionBlock
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksPbrSheenBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/sheenBlock", "SheenBlock")
  @js.native
  open class SheenBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new SheenBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * If true, the sheen effect is layered above the base BRDF with the albedo-scaling technique.
      * It allows the strength of the sheen effect to not depend on the base color of the material,
      * making it easier to setup and tweak the effect
      */
    var albedoScaling: Boolean = js.native
    
    /**
      * Gets the color input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the main code of the block (fragment side)
      * @param reflectionBlock instance of a ReflectionBlock null if the code must be generated without an active reflection module
      * @returns the shader code
      */
    def getCode(reflectionBlock: Nullable[ReflectionBlock]): String = js.native
    
    /**
      * Gets the intensity input component
      */
    def intensity: NodeMaterialConnectionPoint = js.native
    
    /**
      * Defines if the sheen is linked to the sheen color.
      */
    var linkSheenWithAlbedo: Boolean = js.native
    
    /**
      * Gets the roughness input component
      */
    def roughness: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the sheen object output component
      */
    def sheen: NodeMaterialConnectionPoint = js.native
  }
}

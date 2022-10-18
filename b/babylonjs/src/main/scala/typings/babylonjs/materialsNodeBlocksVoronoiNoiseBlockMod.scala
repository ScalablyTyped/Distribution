package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksVoronoiNoiseBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/voronoiNoiseBlock", "VoronoiNoiseBlock")
  @js.native
  open class VoronoiNoiseBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new VoronoiNoiseBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def cells: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the density input component
      */
    def density: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the offset input component
      */
    def offset: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the seed input component
      */
    def seed: NodeMaterialConnectionPoint = js.native
  }
}

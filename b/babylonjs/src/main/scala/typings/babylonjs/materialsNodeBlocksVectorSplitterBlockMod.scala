package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksVectorSplitterBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/vectorSplitterBlock", "VectorSplitterBlock")
  @js.native
  open class VectorSplitterBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new VectorSplitterBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the w component (output)
      */
    def w: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the x component (output)
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xy component (input)
      */
    def xyIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xy component (output)
      */
    def xyOut: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyz component (input)
      */
    def xyzIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyz component (output)
      */
    def xyzOut: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyzw component (input)
      */
    def xyzw: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y component (output)
      */
    def y: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the z component (output)
      */
    def z: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the zw component (output)
      */
    def zw: NodeMaterialConnectionPoint = js.native
  }
}

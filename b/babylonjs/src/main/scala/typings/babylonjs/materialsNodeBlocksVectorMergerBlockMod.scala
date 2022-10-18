package typings.babylonjs

import typings.babylonjs.babylonjsStrings.w
import typings.babylonjs.babylonjsStrings.x
import typings.babylonjs.babylonjsStrings.y
import typings.babylonjs.babylonjsStrings.z
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksVectorMergerBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/vectorMergerBlock", "VectorMergerBlock")
  @js.native
  open class VectorMergerBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new VectorMergerBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /* private */ var _buildSwizzle: Any = js.native
    
    /**
      * Gets the w component (input)
      */
    def w: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the swizzle for w (meaning which component to affect to the output.w)
      */
    var wSwizzle: x | y | z | w = js.native
    
    /**
      * Gets the x component (input)
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the swizzle for x (meaning which component to affect to the output.x)
      */
    var xSwizzle: x | y | z | w = js.native
    
    /**
      * Gets the xy component (output)
      * @deprecated Please use xyOut instead.
      */
    def xy: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xy component (input)
      */
    def xyIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xy component (output)
      */
    def xyOut: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyz component (output)
      * @deprecated Please use xyzOut instead.
      */
    def xyz: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyz component (input)
      */
    def xyzIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyz component (output)
      */
    def xyzOut: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyzw component (output)
      */
    def xyzw: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyzw component (input)
      */
    def xyzwIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y component (input)
      */
    def y: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the swizzle for y (meaning which component to affect to the output.y)
      */
    var ySwizzle: x | y | z | w = js.native
    
    /**
      * Gets the z component (input)
      */
    def z: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the swizzle for z (meaning which component to affect to the output.z)
      */
    var zSwizzle: x | y | z | w = js.native
    
    /**
      * Gets the zw component (input)
      */
    def zwIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the zw component (output)
      */
    def zwOut: NodeMaterialConnectionPoint = js.native
  }
}

package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fragmentOutputBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/fragmentOutputBlock", "FragmentOutputBlock")
  @js.native
  open class FragmentOutputBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new FragmentOutputBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /* private */ var _gammaDefineName: Any = js.native
    
    /* private */ var _linearDefineName: Any = js.native
    
    /**
      * Gets the a input component
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /** Gets or sets a boolean indicating if content needs to be converted to gamma space */
    var convertToGammaSpace: Boolean = js.native
    
    /** Gets or sets a boolean indicating if content needs to be converted to linear space */
    var convertToLinearSpace: Boolean = js.native
    
    /**
      * Gets the rgb input component
      */
    def rgb: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgba input component
      */
    def rgba: NodeMaterialConnectionPoint = js.native
    
    /** Gets or sets a boolean indicating if logarithmic depth should be used */
    var useLogarithmicDepth: Boolean = js.native
  }
}

package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/customBlock", "CustomBlock")
  @js.native
  open class CustomBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new CustomBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /* private */ var _code: Any = js.native
    
    /* private */ var _deserializeOptions: Any = js.native
    
    /* private */ var _findInputByName: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /**
      * Gets or sets the options for this custom block
      */
    def options: Any = js.native
    def options_=(options: Any): Unit = js.native
  }
}

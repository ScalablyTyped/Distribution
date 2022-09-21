package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twirlBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/twirlBlock", "TwirlBlock")
  @js.native
  open class TwirlBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new TwirlBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    def autoConfigure(): Unit = js.native
    
    /**
      * Gets the center component
      */
    def center: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the offset component
      */
    def offset: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the strength component
      */
    def strength: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the x output component
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y output component
      */
    def y: NodeMaterialConnectionPoint = js.native
  }
}

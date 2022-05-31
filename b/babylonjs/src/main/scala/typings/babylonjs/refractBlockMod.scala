package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refractBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/refractBlock", "RefractBlock")
  @js.native
  class RefractBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new RefractBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the incident component
      */
    def incident: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the index of refraction component
      */
    def ior: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the normal component
      */
    def normal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}

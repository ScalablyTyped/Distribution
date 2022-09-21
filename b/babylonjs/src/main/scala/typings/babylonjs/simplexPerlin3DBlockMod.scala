package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplexPerlin3DBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/simplexPerlin3DBlock", "SimplexPerlin3DBlock")
  @js.native
  open class SimplexPerlin3DBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new SimplexPerlin3DBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the seed operand input component
      */
    def seed: NodeMaterialConnectionPoint = js.native
  }
}

package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.nodeMaterialBuildStateMod.NodeMaterialBuildState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fragCoordBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/fragCoordBlock", "FragCoordBlock")
  @js.native
  open class FragCoordBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new FragCoordBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the w component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /* protected */ def writeOutputs(state: NodeMaterialBuildState): String = js.native
    
    /**
      * Gets the x component
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xy component
      */
    def xy: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyz component
      */
    def xyz: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyzw component
      */
    def xyzw: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y component
      */
    def y: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the z component
      */
    def z: NodeMaterialConnectionPoint = js.native
  }
}

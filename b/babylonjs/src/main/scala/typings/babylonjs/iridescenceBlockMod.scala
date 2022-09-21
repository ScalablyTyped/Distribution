package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iridescenceBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/iridescenceBlock", "IridescenceBlock")
  @js.native
  open class IridescenceBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new IridescenceBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    def autoConfigure(): Unit = js.native
    
    /**
      * Gets the indexOfRefraction input component
      */
    def indexOfRefraction: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the intensity input component
      */
    def intensity: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the iridescence object output component
      */
    def iridescence: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the thickness input component
      */
    def thickness: NodeMaterialConnectionPoint = js.native
  }
  /* static members */
  object IridescenceBlock {
    
    @JSImport("babylonjs/Materials/Node/Blocks/PBR/iridescenceBlock", "IridescenceBlock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the main code of the block (fragment side)
      * @param iridescenceBlock instance of a IridescenceBlock or null if the code must be generated without an active iridescence module
      * @returns the shader code
      */
    inline def GetCode(iridescenceBlock: Nullable[IridescenceBlock]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCode")(iridescenceBlock.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}

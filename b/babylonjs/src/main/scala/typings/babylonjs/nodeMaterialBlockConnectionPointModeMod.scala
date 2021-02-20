package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialBlockConnectionPointModeMod {
  
  @js.native
  sealed trait NodeMaterialBlockConnectionPointMode extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointMode", "NodeMaterialBlockConnectionPointMode")
  @js.native
  object NodeMaterialBlockConnectionPointMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointMode with Double] = js.native
    
    /** Value is a mesh attribute */
    @js.native
    sealed trait Attribute extends NodeMaterialBlockConnectionPointMode
    /* 1 */ val Attribute: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Attribute with Double = js.native
    
    /** Mode is undefined */
    @js.native
    sealed trait Undefined extends NodeMaterialBlockConnectionPointMode
    /* 3 */ val Undefined: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Undefined with Double = js.native
    
    /** Value is an uniform */
    @js.native
    sealed trait Uniform extends NodeMaterialBlockConnectionPointMode
    /* 0 */ val Uniform: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Uniform with Double = js.native
    
    /** Value is a varying between vertex and fragment shaders */
    @js.native
    sealed trait Varying extends NodeMaterialBlockConnectionPointMode
    /* 2 */ val Varying: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Varying with Double = js.native
  }
}

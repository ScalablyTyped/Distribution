package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialBlockConnectionPointModeMod {
  
  @js.native
  sealed trait NodeMaterialBlockConnectionPointMode extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointMode", "NodeMaterialBlockConnectionPointMode")
  @js.native
  object NodeMaterialBlockConnectionPointMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointMode & Double] = js.native
    
    /** Value is a mesh attribute */
    @js.native
    sealed trait Attribute
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 1 */ val Attribute: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Attribute & Double = js.native
    
    /** Mode is undefined */
    @js.native
    sealed trait Undefined
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 3 */ val Undefined: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Undefined & Double = js.native
    
    /** Value is an uniform */
    @js.native
    sealed trait Uniform
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 0 */ val Uniform: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Uniform & Double = js.native
    
    /** Value is a varying between vertex and fragment shaders */
    @js.native
    sealed trait Varying
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 2 */ val Varying: typings.babylonjs.nodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Varying & Double = js.native
  }
}

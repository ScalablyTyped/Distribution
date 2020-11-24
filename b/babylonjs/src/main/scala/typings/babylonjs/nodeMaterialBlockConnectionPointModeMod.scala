package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointMode", JSImport.Namespace)
@js.native
object nodeMaterialBlockConnectionPointModeMod extends js.Object {
  
  @js.native
  sealed trait NodeMaterialBlockConnectionPointMode extends js.Object
  @js.native
  object NodeMaterialBlockConnectionPointMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointMode with Double] = js.native
    
    /** Value is a mesh attribute */
    @js.native
    sealed trait Attribute extends NodeMaterialBlockConnectionPointMode
    /* 1 */ @js.native
    object Attribute extends TopLevel[Attribute with Double]
    
    /** Mode is undefined */
    @js.native
    sealed trait Undefined extends NodeMaterialBlockConnectionPointMode
    /* 3 */ @js.native
    object Undefined extends TopLevel[Undefined with Double]
    
    /** Value is an uniform */
    @js.native
    sealed trait Uniform extends NodeMaterialBlockConnectionPointMode
    /* 0 */ @js.native
    object Uniform extends TopLevel[Uniform with Double]
    
    /** Value is a varying between vertex and fragment shaders */
    @js.native
    sealed trait Varying extends NodeMaterialBlockConnectionPointMode
    /* 2 */ @js.native
    object Varying extends TopLevel[Varying with Double]
  }
}

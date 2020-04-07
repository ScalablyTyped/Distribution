package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointMode", JSImport.Namespace)
@js.native
object nodeMaterialBlockConnectionPointModeMod extends js.Object {
  @js.native
  sealed trait NodeMaterialBlockConnectionPointMode extends js.Object
  
  @js.native
  object NodeMaterialBlockConnectionPointMode extends js.Object {
    /** Value is a mesh attribute */
    @js.native
    sealed trait Attribute extends NodeMaterialBlockConnectionPointMode
    
    /** Mode is undefined */
    @js.native
    sealed trait Undefined extends NodeMaterialBlockConnectionPointMode
    
    /** Value is an uniform */
    @js.native
    sealed trait Uniform extends NodeMaterialBlockConnectionPointMode
    
    /** Value is a varying between vertex and fragment shaders */
    @js.native
    sealed trait Varying extends NodeMaterialBlockConnectionPointMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointMode with Double] = js.native
    /* 1 */ @js.native
    object Attribute extends TopLevel[Attribute with Double]
    
    /* 3 */ @js.native
    object Undefined extends TopLevel[Undefined with Double]
    
    /* 0 */ @js.native
    object Uniform extends TopLevel[Uniform with Double]
    
    /* 2 */ @js.native
    object Varying extends TopLevel[Varying with Double]
    
  }
  
}


package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeMaterialBlockConnectionPointMode extends js.Object
@JSGlobal("BABYLON.NodeMaterialBlockConnectionPointMode")
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
}

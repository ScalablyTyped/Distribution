package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeMaterialBlockConnectionPointMode extends StObject
@JSGlobal("BABYLON.NodeMaterialBlockConnectionPointMode")
@js.native
object NodeMaterialBlockConnectionPointMode extends StObject {
  
  /** Value is a mesh attribute */
  @js.native
  sealed trait Attribute
    extends StObject
       with NodeMaterialBlockConnectionPointMode
  
  /** Mode is undefined */
  @js.native
  sealed trait Undefined
    extends StObject
       with NodeMaterialBlockConnectionPointMode
  
  /** Value is an uniform */
  @js.native
  sealed trait Uniform
    extends StObject
       with NodeMaterialBlockConnectionPointMode
  
  /** Value is a varying between vertex and fragment shaders */
  @js.native
  sealed trait Varying
    extends StObject
       with NodeMaterialBlockConnectionPointMode
}

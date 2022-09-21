package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProcessingBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the color input component
    */
  def color: NodeMaterialConnectionPoint = js.native
  
  /**
    * Defines if the input should be converted to linear space (default: true)
    */
  var convertInputToLinearSpace: Boolean = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}

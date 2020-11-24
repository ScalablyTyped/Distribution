package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewDirectionBlock extends NodeMaterialBlock {
  
  /**
    * Gets the camera position component
    */
  def cameraPosition: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world position component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}

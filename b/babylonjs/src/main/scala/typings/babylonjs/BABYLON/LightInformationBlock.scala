package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightInformationBlock extends NodeMaterialBlock {
  
  var _lightColorUniformName: js.Any = js.native
  
  var _lightDataUniformName: js.Any = js.native
  
  var _lightTypeDefineName: js.Any = js.native
  
  /**
    * Gets the direction output component
    */
  def color: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the direction output component
    */
  def direction: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the direction output component
    */
  def intensity: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the light associated with this block
    */
  var light: Nullable[Light] = js.native
  
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}

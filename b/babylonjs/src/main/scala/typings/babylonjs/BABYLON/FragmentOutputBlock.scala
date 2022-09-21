package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentOutputBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _gammaDefineName: Any = js.native
  
  /* private */ var _linearDefineName: Any = js.native
  
  /**
    * Gets the a input component
    */
  def a: NodeMaterialConnectionPoint = js.native
  
  /** Gets or sets a boolean indicating if content needs to be converted to gamma space */
  var convertToGammaSpace: Boolean = js.native
  
  /** Gets or sets a boolean indicating if content needs to be converted to linear space */
  var convertToLinearSpace: Boolean = js.native
  
  /**
    * Gets the rgb input component
    */
  def rgb: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgba input component
    */
  def rgba: NodeMaterialConnectionPoint = js.native
  
  /** Gets or sets a boolean indicating if logarithmic depth should be used */
  var useLogarithmicDepth: Boolean = js.native
}

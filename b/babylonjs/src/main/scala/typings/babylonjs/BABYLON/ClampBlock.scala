package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClampBlock extends NodeMaterialBlock {
  
  /** Gets or sets the maximum range */
  var maximum: Double = js.native
  
  /** Gets or sets the minimum range */
  var minimum: Double = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the value input component
    */
  def value: NodeMaterialConnectionPoint = js.native
}

package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IridescenceBlock
  extends StObject
     with NodeMaterialBlock {
  
  def autoConfigure(): Unit = js.native
  
  /**
    * Gets the indexOfRefraction input component
    */
  def indexOfRefraction: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the intensity input component
    */
  def intensity: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the iridescence object output component
    */
  def iridescence: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the thickness input component
    */
  def thickness: NodeMaterialConnectionPoint = js.native
}

package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragCoordBlock extends NodeMaterialBlock {
  
  /**
    * Gets the w component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /* protected */ def writeOutputs(state: NodeMaterialBuildState): String = js.native
  
  /**
    * Gets the x component
    */
  def x: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the xy component
    */
  def xy: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the xyz component
    */
  def xyz: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the xyzw component
    */
  def xyzw: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the y component
    */
  def y: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the z component
    */
  def z: NodeMaterialConnectionPoint = js.native
}

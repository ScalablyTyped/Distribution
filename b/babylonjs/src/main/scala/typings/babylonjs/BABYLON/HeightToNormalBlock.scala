package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightToNormalBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Defines that the worldNormal input will be normalized by the HeightToNormal block before being used
    */
  var automaticNormalizationNormal: Boolean = js.native
  
  /**
    * Defines that the worldTangent input will be normalized by the HeightToNormal block before being used
    */
  var automaticNormalizationTangent: Boolean = js.native
  
  /**
    * Defines if the output should be generated in world or tangent space.
    * Note that in tangent space the result is also scaled by 0.5 and offsetted by 0.5 so that it can directly be used as a PerturbNormal.normalMapColor input
    */
  var generateInWorldSpace: Boolean = js.native
  
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the normal component
    */
  def worldNormal: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the position component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the tangent component
    */
  def worldTangent: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the xyz component
    */
  def xyz: NodeMaterialConnectionPoint = js.native
}

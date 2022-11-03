package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerturbNormalBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the TBN input component
    */
  def TBN: NodeMaterialConnectionPoint = js.native
  
  /* private */ var _tangentCorrectionFactorName: Any = js.native
  
  /* private */ var _tangentSpaceParameterName: Any = js.native
  
  /** Gets or sets a boolean indicating that normal should be inverted on X axis */
  var invertX: Boolean = js.native
  
  /** Gets or sets a boolean indicating that normal should be inverted on Y axis */
  var invertY: Boolean = js.native
  
  /**
    * Gets the normal map color input component
    */
  def normalMapColor: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the parallax height input component
    */
  def parallaxHeight: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the parallax scale input component
    */
  def parallaxScale: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the strength input component
    */
  def strength: NodeMaterialConnectionPoint = js.native
  
  /** Gets or sets a boolean indicating that parallax occlusion should be enabled */
  var useParallaxOcclusion: Boolean = js.native
  
  /**
    * Gets the uv input component
    */
  def uv: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the uv offset output component
    */
  def uvOffset: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the view direction input component
    */
  def viewDirection: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world normal input component
    */
  def worldNormal: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world tangent input component
    */
  def worldTangent: NodeMaterialConnectionPoint = js.native
}

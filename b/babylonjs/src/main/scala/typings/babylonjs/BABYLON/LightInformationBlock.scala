package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightInformationBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _forcePrepareDefines: Any = js.native
  
  /* private */ var _lightColorUniformName: Any = js.native
  
  /* private */ var _lightDataUniformName: Any = js.native
  
  /* private */ var _lightShadowExtraUniformName: Any = js.native
  
  /* private */ var _lightShadowUniformName: Any = js.native
  
  /* private */ var _lightTypeDefineName: Any = js.native
  
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
    * Gets the shadow bias output component
    */
  def shadowBias: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the shadow depth range component
    */
  def shadowDepthRange: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the shadow depth scale component
    */
  def shadowDepthScale: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the shadow normal bias output component
    */
  def shadowNormalBias: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}

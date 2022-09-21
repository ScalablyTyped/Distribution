package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRBaseSimpleMaterial
  extends StObject
     with PBRBaseMaterial {
  
  /**
    * Defines the alpha limits in alpha test mode.
    */
  var alphaCutOff: Double = js.native
  
  /**
    * If sets to true, disables all the lights affecting the material.
    */
  var disableLighting: Boolean = js.native
  
  /**
    * Gets the current double sided mode.
    */
  def doubleSided: Boolean = js.native
  /**
    * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
    */
  def doubleSided_=(value: Boolean): Unit = js.native
  
  /**
    * Emissivie color used to self-illuminate the model.
    */
  var emissiveColor: Color3 = js.native
  
  /**
    * Emissivie texture used to self-illuminate the model.
    */
  var emissiveTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Environment Texture used in the material (this is use for both reflection and environment lighting).
    */
  var environmentTexture: Nullable[BaseTexture] = js.native
  
  /**
    * If sets to true, x component of normal map value will invert (x = 1.0 - x).
    */
  var invertNormalMapX: Boolean = js.native
  
  /**
    * If sets to true, y component of normal map value will invert (y = 1.0 - y).
    */
  var invertNormalMapY: Boolean = js.native
  
  /**
    * Stores the pre-calculated light information of a mesh in a texture.
    */
  var lightmapTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Number of Simultaneous lights allowed on the material.
    */
  var maxSimultaneousLights: Double = js.native
  
  /**
    * Normal map used in the model.
    */
  var normalTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Occlusion Channel Strength.
    */
  var occlusionStrength: Double = js.native
  
  /**
    * Occlusion Texture of the material (adding extra occlusion effects).
    */
  var occlusionTexture: Nullable[BaseTexture] = js.native
  
  /**
    * If true, the light map contains occlusion information instead of lighting info.
    */
  var useLightmapAsShadowmap: Boolean = js.native
}

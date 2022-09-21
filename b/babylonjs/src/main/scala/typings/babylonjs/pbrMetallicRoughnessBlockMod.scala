package typings.babylonjs

import typings.babylonjs.lightMod.Light
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrMetallicRoughnessBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/PBR/pbrMetallicRoughnessBlock", "PBRMetallicRoughnessBlock")
  @js.native
  open class PBRMetallicRoughnessBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ReflectionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /* private */ var _environmentBRDFTexture: Any = js.native
    
    /* private */ var _environmentBrdfSamplerName: Any = js.native
    
    /* private */ var _getAlbedoOpacityCode: Any = js.native
    
    /* private */ var _getAmbientOcclusionCode: Any = js.native
    
    /* private */ var _getReflectivityCode: Any = js.native
    
    /* private */ var _injectVertexCode: Any = js.native
    
    /* private */ var _invertNormalName: Any = js.native
    
    /* private */ var _lightId: Any = js.native
    
    /* private */ var _metallicF0Factor: Any = js.native
    
    /* private */ var _metallicReflectanceColor: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _vMetallicReflectanceFactorsName: Any = js.native
    
    /* private */ var _vNormalWName: Any = js.native
    
    /**
      * Gets the alpha output component
      */
    def alpha: NodeMaterialConnectionPoint = js.native
    
    /**
      * Defines the alpha limits in alpha test mode.
      */
    var alphaTestCutoff: Double = js.native
    
    /**
      * Gets the ambient output component
      */
    def ambientClr: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the ambient color input component
      */
    def ambientColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the ambient occlusion input component
      */
    def ambientOcc: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the anisotropy object parameters
      */
    def anisotropy: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the base color input component
      */
    def baseColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the camera position input component
      */
    def cameraPosition: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the clear coat object parameters
      */
    def clearcoat: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the clear coat output component
      */
    def clearcoatDir: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the indirect clear coat output component
      */
    def clearcoatInd: NodeMaterialConnectionPoint = js.native
    
    /**
      * As the default viewing range might not be enough (if the ambient is really small for instance)
      * You can use the factor to better multiply the final value.
      */
    var debugFactor: Double = js.native
    
    /**
      * Specify from where on screen the debug mode should start.
      * The value goes from -1 (full screen) to 1 (not visible)
      * It helps with side by side comparison against the final render
      * This defaults to 0
      */
    var debugLimit: Double = js.native
    
    /**
      * Defines the material debug mode.
      * It helps seeing only some components of the material while troubleshooting.
      */
    var debugMode: Double = js.native
    
    /**
      * Gets the diffuse output component
      */
    def diffuseDir: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the indirect diffuse output component
      */
    def diffuseInd: NodeMaterialConnectionPoint = js.native
    
    /**
      * Intensity of the direct lights e.g. the four lights available in your scene.
      * This impacts both the direct diffuse and specular highlights.
      */
    var directIntensity: Double = js.native
    
    /**
      * Enables specular anti aliasing in the PBR shader.
      * It will both interacts on the Geometry for analytical and IBL lighting.
      * It also prefilter the roughness map based on the bump values.
      */
    var enableSpecularAntiAliasing: Boolean = js.native
    
    /**
      * Intensity of the environment e.g. how much the environment will light the object
      * either through harmonics for rough material or through the reflection for shiny ones.
      */
    var environmentIntensity: Double = js.native
    
    /**
      * Force normal to face away from face.
      */
    var forceNormalForward: Boolean = js.native
    
    /**
      * Gets the index of refraction input component
      */
    def indexOfRefraction: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the iridescence object parameters
      */
    def iridescence: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the light associated with this block
      */
    var light: Nullable[Light] = js.native
    
    /**
      * Defines the  falloff type used in this material.
      * It by default is Physical.
      */
    var lightFalloff: Double = js.native
    
    /**
      * Gets the global lighting output component
      */
    def lighting: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the metallic input component
      */
    def metallic: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the opacity input component
      */
    def opacity: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the perturbed normal input component
      */
    def perturbedNormal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Enables realtime filtering on the texture.
      */
    var realTimeFiltering: Boolean = js.native
    
    /**
      * Quality switch for realtime filtering
      */
    var realTimeFilteringQuality: Double = js.native
    
    /**
      * Gets the reflection object parameters
      */
    def reflection: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the refraction output component
      */
    def refraction: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the roughness input component
      */
    def roughness: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the shadow output component
      */
    def shadow: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the sheen object parameters
      */
    def sheen: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the sheen output component
      */
    def sheenDir: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the indirect sheen output component
      */
    def sheenInd: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the specular output component
      */
    def specularDir: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the indirect specular output component
      */
    def specularInd: NodeMaterialConnectionPoint = js.native
    
    /**
      * This is a special control allowing the reduction of the specular highlights coming from the
      * four lights of the scene. Those highlights may not be needed in full environment lighting.
      */
    var specularIntensity: Double = js.native
    
    /**
      * Gets the sub surface object parameters
      */
    def subsurface: NodeMaterialConnectionPoint = js.native
    
    /**
      * If set to true, no lighting calculations will be applied.
      */
    var unlit: Boolean = js.native
    
    /**
      * Specifies that alpha blending should be used
      */
    var useAlphaBlending: Boolean = js.native
    
    /**
      * Specifies that alpha test should be used
      */
    var useAlphaTest: Boolean = js.native
    
    /**
      * Defines if the material uses energy conservation.
      */
    var useEnergyConservation: Boolean = js.native
    
    /**
      * This parameters will enable/disable Horizon occlusion to prevent normal maps to look shiny when the normal
      * makes the reflect vector face the model (under horizon).
      */
    var useHorizonOcclusion: Boolean = js.native
    
    /**
      * This parameters will enable/disable radiance occlusion by preventing the radiance to lit
      * too much the area relying on ambient texture to define their ambient occlusion.
      */
    var useRadianceOcclusion: Boolean = js.native
    
    /**
      * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most luminous ones).
      * A car glass is a good example of that. When the street lights reflects on it you can not see what is behind.
      */
    var useRadianceOverAlpha: Boolean = js.native
    
    /**
      * Specifies that the material will keeps the specular highlights over a transparent surface (only the most luminous ones).
      * A car glass is a good example of that. When sun reflects on it you can not see what is behind.
      */
    var useSpecularOverAlpha: Boolean = js.native
    
    /**
      * Gets the view matrix parameter
      */
    def view: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world normal input component
      */
    def worldNormal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world position input component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}

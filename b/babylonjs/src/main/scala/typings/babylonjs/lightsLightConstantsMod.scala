package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsLightConstantsMod {
  
  @JSImport("babylonjs/Lights/lightConstants", "LightConstants")
  @js.native
  open class LightConstants () extends StObject
  /* static members */
  object LightConstants {
    
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Sort function to order lights for rendering.
      * @param a First Light object to compare to second.
      * @param b Second Light object to compare first.
      * @returns -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
      */
    inline def CompareLightsPriority(a: ISortableLight, b: ISortableLight): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CompareLightsPriority")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Falloff Default: light is falling off following the material specification:
      * standard material is using standard falloff whereas pbr material can request special falloff per materials.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.FALLOFF_DEFAULT")
    @js.native
    val FALLOFF_DEFAULT: Double = js.native
    
    /**
      * Falloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.FALLOFF_GLTF")
    @js.native
    val FALLOFF_GLTF: Double = js.native
    
    /**
      * Falloff Physical: light is falling off following the inverse squared distance law.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.FALLOFF_PHYSICAL")
    @js.native
    val FALLOFF_PHYSICAL: Double = js.native
    
    /**
      * Falloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.FALLOFF_STANDARD")
    @js.native
    val FALLOFF_STANDARD: Double = js.native
    
    /**
      * Each light type uses the default quantity according to its type:
      *      point/spot lights use luminous intensity
      *      directional lights use illuminance
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.INTENSITYMODE_AUTOMATIC")
    @js.native
    val INTENSITYMODE_AUTOMATIC: Double = js.native
    
    /**
      * lux (lm/m^2)
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.INTENSITYMODE_ILLUMINANCE")
    @js.native
    val INTENSITYMODE_ILLUMINANCE: Double = js.native
    
    /**
      * nit (cd/m^2)
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.INTENSITYMODE_LUMINANCE")
    @js.native
    val INTENSITYMODE_LUMINANCE: Double = js.native
    
    /**
      * candela (lm/sr)
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.INTENSITYMODE_LUMINOUSINTENSITY")
    @js.native
    val INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
    
    /**
      * lumen (lm)
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.INTENSITYMODE_LUMINOUSPOWER")
    @js.native
    val INTENSITYMODE_LUMINOUSPOWER: Double = js.native
    
    /**
      * If every light affecting the material is in this lightmapMode,
      * material.lightmapTexture adds or multiplies
      * (depends on material.useLightmapAsShadowmap)
      * after every other light calculations.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.LIGHTMAP_DEFAULT")
    @js.native
    val LIGHTMAP_DEFAULT: Double = js.native
    
    /**
      * material.lightmapTexture as only lighting
      * no light calculation from this light
      * only adds dynamic shadows from this light
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.LIGHTMAP_SHADOWSONLY")
    @js.native
    val LIGHTMAP_SHADOWSONLY: Double = js.native
    
    /**
      * material.lightmapTexture as only diffuse lighting from this light
      * adds only specular lighting from this light
      * adds dynamic shadows
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.LIGHTMAP_SPECULAR")
    @js.native
    val LIGHTMAP_SPECULAR: Double = js.native
    
    /**
      * Light type const id of the directional light.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.LIGHTTYPEID_DIRECTIONALLIGHT")
    @js.native
    val LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
    
    /**
      * Light type const id of the hemispheric light.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.LIGHTTYPEID_HEMISPHERICLIGHT")
    @js.native
    val LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
    
    /**
      * Light type const id of the point light.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.LIGHTTYPEID_POINTLIGHT")
    @js.native
    val LIGHTTYPEID_POINTLIGHT: Double = js.native
    
    /**
      * Light type const id of the spot light.
      */
    @JSImport("babylonjs/Lights/lightConstants", "LightConstants.LIGHTTYPEID_SPOTLIGHT")
    @js.native
    val LIGHTTYPEID_SPOTLIGHT: Double = js.native
  }
  
  trait ISortableLight extends StObject {
    
    /**
      * Defines the rendering priority of the lights. It can help in case of fallback or number of lights
      * exceeding the number allowed of the materials.
      */
    var renderPriority: Double
    
    /**
      * Gets or sets whether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
      * the current shadow generator.
      */
    var shadowEnabled: Boolean
  }
  object ISortableLight {
    
    inline def apply(renderPriority: Double, shadowEnabled: Boolean): ISortableLight = {
      val __obj = js.Dynamic.literal(renderPriority = renderPriority.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISortableLight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISortableLight] (val x: Self) extends AnyVal {
      
      inline def setRenderPriority(value: Double): Self = StObject.set(x, "renderPriority", value.asInstanceOf[js.Any])
      
      inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
    }
  }
}

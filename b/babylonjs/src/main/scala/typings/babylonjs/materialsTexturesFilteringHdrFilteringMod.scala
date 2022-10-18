package typings.babylonjs

import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesFilteringHdrFilteringMod {
  
  @JSImport("babylonjs/Materials/Textures/Filtering/hdrFiltering", "HDRFiltering")
  @js.native
  open class HDRFiltering protected () extends StObject {
    /**
      * Instantiates HDR filter for reflection maps
      *
      * @param engine Thin engine
      * @param options Options
      */
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, options: IHDRFilteringOptions) = this()
    
    /* private */ var _createEffect: Any = js.native
    
    /* private */ var _createRenderTarget: Any = js.native
    
    /* private */ var _effectRenderer: Any = js.native
    
    /* private */ var _effectWrapper: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _lodGenerationOffset: Any = js.native
    
    /* private */ var _lodGenerationScale: Any = js.native
    
    /* private */ var _prefilterInternal: Any = js.native
    
    /**
      * Scales pixel intensity for the input HDR map.
      */
    var hdrScale: Double = js.native
    
    /**
      * Get a value indicating if the filter is ready to be used
      * @param texture Texture to filter
      * @returns true if the filter is ready
      */
    def isReady(texture: BaseTexture): Boolean = js.native
    
    /**
      * Prefilters a cube texture to have mipmap levels representing roughness values.
      * Prefiltering will be invoked at the end of next rendering pass.
      * This has to be done once the map is loaded, and has not been prefiltered by a third party software.
      * See http://blog.selfshadow.com/publications/s2013-shading-course/karis/s2013_pbs_epic_notes_v2.pdf for more information
      * @param texture Texture to filter
      * @param onFinished Callback when filtering is done
      * @returns Promise called when prefiltering is done
      */
    def prefilter(texture: BaseTexture): js.Promise[Unit] = js.native
    def prefilter(texture: BaseTexture, onFinished: Nullable[js.Function0[Unit]]): js.Promise[Unit] = js.native
    
    /**
      * Quality switch for prefiltering. Should be set to `Constants.TEXTURE_FILTERING_QUALITY_OFFLINE` unless
      * you care about baking speed.
      */
    var quality: Double = js.native
  }
  
  /**
    * Options for texture filtering
    */
  trait IHDRFilteringOptions extends StObject {
    
    /**
      * Scales pixel intensity for the input HDR map.
      */
    var hdrScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Quality of the filter. Should be `Constants.TEXTURE_FILTERING_QUALITY_OFFLINE` for prefiltering
      */
    var quality: js.UndefOr[Double] = js.undefined
  }
  object IHDRFilteringOptions {
    
    inline def apply(): IHDRFilteringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHDRFilteringOptions]
    }
    
    extension [Self <: IHDRFilteringOptions](x: Self) {
      
      inline def setHdrScale(value: Double): Self = StObject.set(x, "hdrScale", value.asInstanceOf[js.Any])
      
      inline def setHdrScaleUndefined: Self = StObject.set(x, "hdrScale", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}

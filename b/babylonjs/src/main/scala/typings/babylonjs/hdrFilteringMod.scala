package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdrFilteringMod {
  
  @JSImport("babylonjs/Materials/Textures/Filtering/hdrFiltering", "HDRFiltering")
  @js.native
  class HDRFiltering protected () extends StObject {
    /**
      * Instantiates HDR filter for reflection maps
      *
      * @param engine Thin engine
      * @param options Options
      */
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, options: IHDRFilteringOptions) = this()
    
    var _createEffect: js.Any = js.native
    
    var _createRenderTarget: js.Any = js.native
    
    var _effectRenderer: js.Any = js.native
    
    var _effectWrapper: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _lodGenerationOffset: js.Any = js.native
    
    var _lodGenerationScale: js.Any = js.native
    
    var _prefilterInternal: js.Any = js.native
    
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
      * @return Promise called when prefiltering is done
      */
    def prefilter(texture: BaseTexture): js.UndefOr[js.Promise[_]] = js.native
    def prefilter(texture: BaseTexture, onFinished: Nullable[js.Function0[Unit]]): js.UndefOr[js.Promise[_]] = js.native
    
    /**
      * Quality switch for prefiltering. Should be set to `Constants.TEXTURE_FILTERING_QUALITY_OFFLINE` unless
      * you care about baking speed.
      */
    var quality: Double = js.native
  }
  
  /**
    * Options for texture filtering
    */
  @js.native
  trait IHDRFilteringOptions extends StObject {
    
    /**
      * Scales pixel intensity for the input HDR map.
      */
    var hdrScale: js.UndefOr[Double] = js.native
    
    /**
      * Quality of the filter. Should be `Constants.TEXTURE_FILTERING_QUALITY_OFFLINE` for prefiltering
      */
    var quality: js.UndefOr[Double] = js.native
  }
  object IHDRFilteringOptions {
    
    @scala.inline
    def apply(): IHDRFilteringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHDRFilteringOptions]
    }
    
    @scala.inline
    implicit class IHDRFilteringOptionsMutableBuilder[Self <: IHDRFilteringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHdrScale(value: Double): Self = StObject.set(x, "hdrScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHdrScaleUndefined: Self = StObject.set(x, "hdrScale", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}

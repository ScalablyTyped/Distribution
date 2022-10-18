package typings.cesium

import typings.cesium.anon.Brightness
import typings.cesium.mod.ImageryLayer
import typings.cesium.mod.ImageryProvider
import typings.cesium.mod.SplitDirection
import typings.cesium.mod.TextureMagnificationFilter
import typings.cesium.mod.TextureMinificationFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneImageryLayerMod {
  
  @JSImport("cesium/Source/Scene/ImageryLayer", JSImport.Default)
  @js.native
  open class default protected () extends ImageryLayer {
    def this(imageryProvider: ImageryProvider) = this()
    def this(imageryProvider: ImageryProvider, options: Brightness) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/ImageryLayer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This value is used as the default threshold for color-to-alpha if one is not provided
      * during construction or by the imagery provider.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD")
    @js.native
    def DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD: Double = js.native
    inline def DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default brightness for the imagery layer if one is not provided during construction
      * or by the imagery provider. This value does not modify the brightness of the imagery.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_BRIGHTNESS")
    @js.native
    def DEFAULT_BRIGHTNESS: Double = js.native
    inline def DEFAULT_BRIGHTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BRIGHTNESS")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default contrast for the imagery layer if one is not provided during construction
      * or by the imagery provider. This value does not modify the contrast of the imagery.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_CONTRAST")
    @js.native
    def DEFAULT_CONTRAST: Double = js.native
    inline def DEFAULT_CONTRAST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CONTRAST")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default gamma for the imagery layer if one is not provided during construction
      * or by the imagery provider. This value does not modify the gamma of the imagery.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_GAMMA")
    @js.native
    def DEFAULT_GAMMA: Double = js.native
    inline def DEFAULT_GAMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GAMMA")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default hue for the imagery layer if one is not provided during construction
      * or by the imagery provider. This value does not modify the hue of the imagery.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_HUE")
    @js.native
    def DEFAULT_HUE: Double = js.native
    inline def DEFAULT_HUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HUE")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default texture magnification filter for the imagery layer if one is not provided
      * during construction or by the imagery provider.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_MAGNIFICATION_FILTER")
    @js.native
    def DEFAULT_MAGNIFICATION_FILTER: TextureMagnificationFilter = js.native
    inline def DEFAULT_MAGNIFICATION_FILTER_=(x: TextureMagnificationFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAGNIFICATION_FILTER")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default texture minification filter for the imagery layer if one is not provided
      * during construction or by the imagery provider.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_MINIFICATION_FILTER")
    @js.native
    def DEFAULT_MINIFICATION_FILTER: TextureMinificationFilter = js.native
    inline def DEFAULT_MINIFICATION_FILTER_=(x: TextureMinificationFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MINIFICATION_FILTER")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default saturation for the imagery layer if one is not provided during construction
      * or by the imagery provider. This value does not modify the saturation of the imagery.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_SATURATION")
    @js.native
    def DEFAULT_SATURATION: Double = js.native
    inline def DEFAULT_SATURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SATURATION")(x.asInstanceOf[js.Any])
    
    /**
      * This value is used as the default split for the imagery layer if one is not provided during construction
      * or by the imagery provider.
      */
    @JSImport("cesium/Source/Scene/ImageryLayer", "default.DEFAULT_SPLIT")
    @js.native
    def DEFAULT_SPLIT: SplitDirection = js.native
    inline def DEFAULT_SPLIT_=(x: SplitDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SPLIT")(x.asInstanceOf[js.Any])
  }
}

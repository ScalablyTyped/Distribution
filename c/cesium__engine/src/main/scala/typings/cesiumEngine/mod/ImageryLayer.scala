package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.ImageryLayer.ConstructorOptions
import typings.cesiumEngine.mod.ImageryLayer.ReadyEventCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ImageryLayer")
@js.native
open class ImageryLayer protected () extends StObject {
  def this(imageryProvider: ImageryProvider, options: ConstructorOptions) = this()
  
  /**
    * The alpha blending value of this layer, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque.
    */
  var alpha: Double = js.native
  
  /**
    * The brightness of this layer.  1.0 uses the unmodified imagery color.  Less than 1.0
    * makes the imagery darker while greater than 1.0 makes it brighter.
    */
  var brightness: Double = js.native
  
  /**
    * Color value that should be set to transparent.
    */
  var colorToAlpha: Color = js.native
  
  /**
    * Normalized (0-1) threshold for color-to-alpha.
    */
  var colorToAlphaThreshold: Double = js.native
  
  /**
    * The contrast of this layer.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
    * the contrast while greater than 1.0 increases it.
    */
  var contrast: Double = js.native
  
  /**
    * Rectangle cutout in this layer of imagery.
    */
  var cutoutRectangle: Rectangle = js.native
  
  /**
    * The alpha blending value of this layer on the day side of the globe, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque. This only takes effect when {@link Globe#enableLighting} is <code>true</code>.
    */
  var dayAlpha: Double = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * imageryLayer = imageryLayer && imageryLayer.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * The gamma correction to apply to this layer.  1.0 uses the unmodified imagery color.
    */
  var gamma: Double = js.native
  
  /**
    * Computes the intersection of this layer's rectangle with the imagery provider's availability rectangle,
    * producing the overall bounds of imagery that can be produced by this layer.
    * @example
    * // Zoom to an imagery layer.
    * const imageryRectangle = imageryLayer.getImageryRectangle();
    * scene.camera.flyTo({
    *     destination: rectangle
    * });
    * @returns A rectangle which defines the overall bounds of imagery that can be produced by this layer.
    */
  def getImageryRectangle(): Rectangle = js.native
  
  /**
    * Computes the intersection of this layer's rectangle with the imagery provider's availability rectangle,
    * producing the overall bounds of imagery that can be produced by this layer.
    * @example
    * // Zoom to an imagery layer.
    * imageryLayer.getViewableRectangle().then(function (rectangle) {
    *     return camera.flyTo({
    *         destination: rectangle
    *     });
    * });
    * @returns A promise to a rectangle which defines the overall bounds of imagery that can be produced by this layer.
    */
  def getViewableRectangle(): js.Promise[Rectangle] = js.native
  
  /**
    * The hue of this layer in radians. 0.0 uses the unmodified imagery color.
    */
  var hue: Double = js.native
  
  /**
    * Gets the imagery provider for this layer. This should not be called before {@link ImageryLayer#ready} returns true.
    */
  val imageryProvider: ImageryProvider = js.native
  
  /**
    * Gets a value indicating whether this layer is the base layer in the
    * {@link ImageryLayerCollection}.  The base layer is the one that underlies all
    * others.  It is special in that it is treated as if it has global rectangle, even if
    * it actually does not, by stretching the texels at the edges over the entire
    * globe.
    * @returns true if this is the base layer; otherwise, false.
    */
  def isBaseLayer(): Boolean = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * The {@link TextureMagnificationFilter} to apply to this layer.
    * Possible values are {@link TextureMagnificationFilter.LINEAR} (the default)
    * and {@link TextureMagnificationFilter.NEAREST}.
    *
    * To take effect, this property must be set immediately after adding the imagery layer.
    * Once a texture is loaded it won't be possible to change the texture filter used.
    */
  var magnificationFilter: TextureMagnificationFilter = js.native
  
  /**
    * The {@link TextureMinificationFilter} to apply to this layer.
    * Possible values are {@link TextureMinificationFilter.LINEAR} (the default)
    * and {@link TextureMinificationFilter.NEAREST}.
    *
    * To take effect, this property must be set immediately after adding the imagery layer.
    * Once a texture is loaded it won't be possible to change the texture filter used.
    */
  var minificationFilter: TextureMinificationFilter = js.native
  
  /**
    * The alpha blending value of this layer on the night side of the globe, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque. This only takes effect when {@link Globe#enableLighting} is <code>true</code>.
    */
  var nightAlpha: Double = js.native
  
  /**
    * Returns true when the terrain provider has been successfully created. Otherwise, returns false.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets an event that is raised when the imagery provider has been successfully created. Event listeners
    * are passed the created instance of {@link ImageryProvider}.
    */
  val readyEvent: Event[ReadyEventCallback] = js.native
  
  /**
    * Gets the rectangle of this layer.  If this rectangle is smaller than the rectangle of the
    * {@link ImageryProvider}, only a portion of the imagery provider is shown.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * The saturation of this layer. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
    * saturation while greater than 1.0 increases it.
    */
  var saturation: Double = js.native
  
  /**
    * Determines if this layer is shown.
    */
  var show: Boolean = js.native
  
  /**
    * The {@link SplitDirection} to apply to this layer.
    */
  var splitDirection: SplitDirection = js.native
}
/* static members */
object ImageryLayer {
  
  @JSImport("@cesium/engine", "ImageryLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This value is used as the default threshold for color-to-alpha if one is not provided
    * during construction or by the imagery provider.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD")
  @js.native
  def DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD: Double = js.native
  inline def DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default brightness for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the brightness of the imagery.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_BRIGHTNESS")
  @js.native
  def DEFAULT_BRIGHTNESS: Double = js.native
  inline def DEFAULT_BRIGHTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BRIGHTNESS")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default contrast for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the contrast of the imagery.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_CONTRAST")
  @js.native
  def DEFAULT_CONTRAST: Double = js.native
  inline def DEFAULT_CONTRAST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CONTRAST")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default gamma for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the gamma of the imagery.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_GAMMA")
  @js.native
  def DEFAULT_GAMMA: Double = js.native
  inline def DEFAULT_GAMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GAMMA")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default hue for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the hue of the imagery.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_HUE")
  @js.native
  def DEFAULT_HUE: Double = js.native
  inline def DEFAULT_HUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HUE")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default texture magnification filter for the imagery layer if one is not provided
    * during construction or by the imagery provider.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_MAGNIFICATION_FILTER")
  @js.native
  def DEFAULT_MAGNIFICATION_FILTER: TextureMagnificationFilter = js.native
  inline def DEFAULT_MAGNIFICATION_FILTER_=(x: TextureMagnificationFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAGNIFICATION_FILTER")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default texture minification filter for the imagery layer if one is not provided
    * during construction or by the imagery provider.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_MINIFICATION_FILTER")
  @js.native
  def DEFAULT_MINIFICATION_FILTER: TextureMinificationFilter = js.native
  inline def DEFAULT_MINIFICATION_FILTER_=(x: TextureMinificationFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MINIFICATION_FILTER")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default saturation for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the saturation of the imagery.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_SATURATION")
  @js.native
  def DEFAULT_SATURATION: Double = js.native
  inline def DEFAULT_SATURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SATURATION")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default split for the imagery layer if one is not provided during construction
    * or by the imagery provider.
    */
  @JSImport("@cesium/engine", "ImageryLayer.DEFAULT_SPLIT")
  @js.native
  def DEFAULT_SPLIT: SplitDirection = js.native
  inline def DEFAULT_SPLIT_=(x: SplitDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SPLIT")(x.asInstanceOf[js.Any])
  
  /**
    * Create a new imagery layer from an asynchronous imagery provider. The layer will handle any asynchronous loads or errors, and begin rendering the imagery layer once ready.
    * @example
    * // Create a new base layer
    * const viewer = new Cesium.Viewer("cesiumContainer", {
    *   baseLayer: Cesium.ImageryLayer.fromProviderAsync(Cesium.IonImageryProvider.fromAssetId(3812));
    * });
    * @example
    * // Add a new transparent layer
    * const imageryLayer = Cesium.ImageryLayer.fromProviderAsync(Cesium.IonImageryProvider.fromAssetId(3812));
    * imageryLayer.alpha = 0.5;
    * viewer.imageryLayers.add(imageryLayer);
    * @example
    * // Handle loading events
    * const imageryLayer = Cesium.ImageryLayer.fromProviderAsync(Cesium.IonImageryProvider.fromAssetId(3812));
    * viewer.imageryLayers.add(imageryLayer);
    *
    * imageryLayer.readyEvent.addEventListener(provider => {
    *   imageryLayer.provider.errorEvent.addEventListener(error => {
    *     alert(`Encountered an error while loading imagery tiles! ${error}`);
    *   });
    * });
    *
    * imageryLayer.errorEvent.addEventListener(error => {
    *   alert(`Encountered an error while creating an imagery layer! ${error}`);
    * });
    * @param imageryProviderPromise - A promise which resolves to a imagery provider
    * @param options - An object describing initialization options
    * @returns The created imagery layer.
    */
  inline def fromProviderAsync(imageryProviderPromise: js.Promise[ImageryProvider], options: ConstructorOptions): ImageryLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProviderAsync")(imageryProviderPromise.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImageryLayer]
  
  /**
    * Create a new imagery layer for ion's default global base imagery layer, currently Bing Maps. The layer will handle any asynchronous loads or errors, and begin rendering the imagery layer once ready.
    * @example
    * // Add a new transparent layer
    * const imageryLayer = Cesium.ImageryLayer.fromWorldImagery();
    * imageryLayer.alpha = 0.5;
    * viewer.imageryLayers.add(imageryLayer);
    * @example
    * // Handle loading events
    * const imageryLayer = Cesium.ImageryLayer.fromWorldImagery();
    * viewer.imageryLayers.add(imageryLayer);
    *
    * imageryLayer.readyEvent.addEventListener(provider => {
    *   imageryLayer.provider.errorEvent.addEventListener(error => {
    *     alert(`Encountered an error while loading imagery tiles! ${error}`);
    *   });
    * });
    *
    * imageryLayer.errorEvent.addEventListener(error => {
    *   alert(`Encountered an error while creating an imagery layer! ${error}`);
    * });
    * @param options - An object describing initialization options
    * @returns The created imagery layer.
    *
    * * @example
    * // Create a new base layer
    * const viewer = new Cesium.Viewer("cesiumContainer", {
    *   baseLayer: Cesium.ImageryLayer.fromWorldImagery();
    * });
    */
  inline def fromWorldImagery(options: WorldImageryConstructorOptions): ImageryLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWorldImagery")(options.asInstanceOf[js.Any]).asInstanceOf[ImageryLayer]
  
  /**
    * Initialization options for the ImageryLayer constructor.
    * @property [rectangle = imageryProvider.rectangle] - The rectangle of the layer.  This rectangle
    *        can limit the visible portion of the imagery provider.
    * @property [alpha = 1.0] - The alpha blending value of this layer, from 0.0 to 1.0.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates of the
    *                          imagery tile for which the alpha is required, and it is expected to return
    *                          the alpha value to use for the tile.
    * @property [nightAlpha = 1.0] - The alpha blending value of this layer on the night side of the globe, from 0.0 to 1.0.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates of the
    *                          imagery tile for which the alpha is required, and it is expected to return
    *                          the alpha value to use for the tile. This only takes effect when <code>enableLighting</code> is <code>true</code>.
    * @property [dayAlpha = 1.0] - The alpha blending value of this layer on the day side of the globe, from 0.0 to 1.0.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates of the
    *                          imagery tile for which the alpha is required, and it is expected to return
    *                          the alpha value to use for the tile. This only takes effect when <code>enableLighting</code> is <code>true</code>.
    * @property [brightness = 1.0] - The brightness of this layer.  1.0 uses the unmodified imagery
    *                          color.  Less than 1.0 makes the imagery darker while greater than 1.0 makes it brighter.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates of the
    *                          imagery tile for which the brightness is required, and it is expected to return
    *                          the brightness value to use for the tile.  The function is executed for every
    *                          frame and for every tile, so it must be fast.
    * @property [contrast = 1.0] - The contrast of this layer.  1.0 uses the unmodified imagery color.
    *                          Less than 1.0 reduces the contrast while greater than 1.0 increases it.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates of the
    *                          imagery tile for which the contrast is required, and it is expected to return
    *                          the contrast value to use for the tile.  The function is executed for every
    *                          frame and for every tile, so it must be fast.
    * @property [hue = 0.0] - The hue of this layer.  0.0 uses the unmodified imagery color.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates
    *                          of the imagery tile for which the hue is required, and it is expected to return
    *                          the contrast value to use for the tile.  The function is executed for every
    *                          frame and for every tile, so it must be fast.
    * @property [saturation = 1.0] - The saturation of this layer.  1.0 uses the unmodified imagery color.
    *                          Less than 1.0 reduces the saturation while greater than 1.0 increases it.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates
    *                          of the imagery tile for which the saturation is required, and it is expected to return
    *                          the contrast value to use for the tile.  The function is executed for every
    *                          frame and for every tile, so it must be fast.
    * @property [gamma = 1.0] - The gamma correction to apply to this layer.  1.0 uses the unmodified imagery color.
    *                          This can either be a simple number or a function with the signature
    *                          <code>function(frameState, layer, x, y, level)</code>.  The function is passed the
    *                          current frame state, this layer, and the x, y, and level coordinates of the
    *                          imagery tile for which the gamma is required, and it is expected to return
    *                          the gamma value to use for the tile.  The function is executed for every
    *                          frame and for every tile, so it must be fast.
    * @property [splitDirection = SplitDirection.NONE] - The {@link SplitDirection} split to apply to this layer.
    * @property [minificationFilter = TextureMinificationFilter.LINEAR] - The
    *                                    texture minification filter to apply to this layer. Possible values
    *                                    are <code>TextureMinificationFilter.LINEAR</code> and
    *                                    <code>TextureMinificationFilter.NEAREST</code>.
    * @property [magnificationFilter = TextureMagnificationFilter.LINEAR] - The
    *                                     texture minification filter to apply to this layer. Possible values
    *                                     are <code>TextureMagnificationFilter.LINEAR</code> and
    *                                     <code>TextureMagnificationFilter.NEAREST</code>.
    * @property [show = true] - True if the layer is shown; otherwise, false.
    * @property [maximumAnisotropy = maximum supported] - The maximum anisotropy level to use
    *        for texture filtering.  If this parameter is not specified, the maximum anisotropy supported
    *        by the WebGL stack will be used.  Larger values make the imagery look better in horizon
    *        views.
    * @property [minimumTerrainLevel] - The minimum terrain level-of-detail at which to show this imagery layer,
    *                 or undefined to show it at all levels.  Level zero is the least-detailed level.
    * @property [maximumTerrainLevel] - The maximum terrain level-of-detail at which to show this imagery layer,
    *                 or undefined to show it at all levels.  Level zero is the least-detailed level.
    * @property [cutoutRectangle] - Cartographic rectangle for cutting out a portion of this ImageryLayer.
    * @property [colorToAlpha] - Color to be used as alpha.
    * @property [colorToAlphaThreshold = 0.004] - Threshold for color-to-alpha.
    */
  trait ConstructorOptions extends StObject {
    
    var alpha: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var brightness: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var colorToAlpha: js.UndefOr[Color] = js.undefined
    
    var colorToAlphaThreshold: js.UndefOr[Double] = js.undefined
    
    var contrast: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var cutoutRectangle: js.UndefOr[Rectangle] = js.undefined
    
    var dayAlpha: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var gamma: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var hue: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var magnificationFilter: js.UndefOr[TextureMagnificationFilter] = js.undefined
    
    var maximumAnisotropy: js.UndefOr[Double] = js.undefined
    
    var maximumTerrainLevel: js.UndefOr[Double] = js.undefined
    
    var minificationFilter: js.UndefOr[TextureMinificationFilter] = js.undefined
    
    var minimumTerrainLevel: js.UndefOr[Double] = js.undefined
    
    var nightAlpha: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var saturation: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var splitDirection: js.UndefOr[SplitDirection | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "alpha", js.Any.fromFunction1(value))
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBrightness(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "brightness", js.Any.fromFunction1(value))
      
      inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      inline def setColorToAlpha(value: Color): Self = StObject.set(x, "colorToAlpha", value.asInstanceOf[js.Any])
      
      inline def setColorToAlphaThreshold(value: Double): Self = StObject.set(x, "colorToAlphaThreshold", value.asInstanceOf[js.Any])
      
      inline def setColorToAlphaThresholdUndefined: Self = StObject.set(x, "colorToAlphaThreshold", js.undefined)
      
      inline def setColorToAlphaUndefined: Self = StObject.set(x, "colorToAlpha", js.undefined)
      
      inline def setContrast(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
      
      inline def setContrastFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "contrast", js.Any.fromFunction1(value))
      
      inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
      
      inline def setCutoutRectangle(value: Rectangle): Self = StObject.set(x, "cutoutRectangle", value.asInstanceOf[js.Any])
      
      inline def setCutoutRectangleUndefined: Self = StObject.set(x, "cutoutRectangle", js.undefined)
      
      inline def setDayAlpha(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "dayAlpha", value.asInstanceOf[js.Any])
      
      inline def setDayAlphaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "dayAlpha", js.Any.fromFunction1(value))
      
      inline def setDayAlphaUndefined: Self = StObject.set(x, "dayAlpha", js.undefined)
      
      inline def setGamma(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      inline def setGammaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "gamma", js.Any.fromFunction1(value))
      
      inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
      
      inline def setHue(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "hue", js.Any.fromFunction1(value))
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setMagnificationFilter(value: TextureMagnificationFilter): Self = StObject.set(x, "magnificationFilter", value.asInstanceOf[js.Any])
      
      inline def setMagnificationFilterUndefined: Self = StObject.set(x, "magnificationFilter", js.undefined)
      
      inline def setMaximumAnisotropy(value: Double): Self = StObject.set(x, "maximumAnisotropy", value.asInstanceOf[js.Any])
      
      inline def setMaximumAnisotropyUndefined: Self = StObject.set(x, "maximumAnisotropy", js.undefined)
      
      inline def setMaximumTerrainLevel(value: Double): Self = StObject.set(x, "maximumTerrainLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumTerrainLevelUndefined: Self = StObject.set(x, "maximumTerrainLevel", js.undefined)
      
      inline def setMinificationFilter(value: TextureMinificationFilter): Self = StObject.set(x, "minificationFilter", value.asInstanceOf[js.Any])
      
      inline def setMinificationFilterUndefined: Self = StObject.set(x, "minificationFilter", js.undefined)
      
      inline def setMinimumTerrainLevel(value: Double): Self = StObject.set(x, "minimumTerrainLevel", value.asInstanceOf[js.Any])
      
      inline def setMinimumTerrainLevelUndefined: Self = StObject.set(x, "minimumTerrainLevel", js.undefined)
      
      inline def setNightAlpha(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "nightAlpha", value.asInstanceOf[js.Any])
      
      inline def setNightAlphaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "nightAlpha", js.Any.fromFunction1(value))
      
      inline def setNightAlphaUndefined: Self = StObject.set(x, "nightAlpha", js.undefined)
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setSaturation(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "saturation", js.Any.fromFunction1(value))
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSplitDirection(value: SplitDirection | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "splitDirection", value.asInstanceOf[js.Any])
      
      inline def setSplitDirectionFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "splitDirection", js.Any.fromFunction1(value))
      
      inline def setSplitDirectionUndefined: Self = StObject.set(x, "splitDirection", js.undefined)
    }
  }
  
  /**
    * A function that is called when an error occurs.
    * @param err - An object holding details about the error that occurred.
    */
  type ErrorEventCallback = js.ThisFunction1[/* this */ ImageryLayer, /* err */ js.Error, Unit]
  
  /**
    * A function that is called when the provider has been created
    * @param provider - The created imagery provider.
    */
  type ReadyEventCallback = js.ThisFunction1[/* this */ ImageryLayer, /* provider */ ImageryProvider, Unit]
  
  /**
    * Initialization options for ImageryLayer.fromWorldImagery
    * @property [options.style = IonWorldImageryStyle] - The style of base imagery, only AERIAL, AERIAL_WITH_LABELS, and ROAD are currently supported.
    */
  type WorldImageryConstructorOptions = ConstructorOptions
}

package typings.cesium.mod

import typings.cesium.anon.Brightness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ImageryLayer")
@js.native
open class ImageryLayer protected () extends StObject {
  def this(imageryProvider: ImageryProvider) = this()
  def this(imageryProvider: ImageryProvider, options: Brightness) = this()
  
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
    * Gets the imagery provider for this layer.
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
  
  @JSImport("cesium", "ImageryLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This value is used as the default threshold for color-to-alpha if one is not provided
    * during construction or by the imagery provider.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD")
  @js.native
  def DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD: Double = js.native
  inline def DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default brightness for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the brightness of the imagery.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_BRIGHTNESS")
  @js.native
  def DEFAULT_BRIGHTNESS: Double = js.native
  inline def DEFAULT_BRIGHTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BRIGHTNESS")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default contrast for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the contrast of the imagery.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_CONTRAST")
  @js.native
  def DEFAULT_CONTRAST: Double = js.native
  inline def DEFAULT_CONTRAST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CONTRAST")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default gamma for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the gamma of the imagery.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_GAMMA")
  @js.native
  def DEFAULT_GAMMA: Double = js.native
  inline def DEFAULT_GAMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GAMMA")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default hue for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the hue of the imagery.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_HUE")
  @js.native
  def DEFAULT_HUE: Double = js.native
  inline def DEFAULT_HUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HUE")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default texture magnification filter for the imagery layer if one is not provided
    * during construction or by the imagery provider.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_MAGNIFICATION_FILTER")
  @js.native
  def DEFAULT_MAGNIFICATION_FILTER: TextureMagnificationFilter = js.native
  inline def DEFAULT_MAGNIFICATION_FILTER_=(x: TextureMagnificationFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAGNIFICATION_FILTER")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default texture minification filter for the imagery layer if one is not provided
    * during construction or by the imagery provider.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_MINIFICATION_FILTER")
  @js.native
  def DEFAULT_MINIFICATION_FILTER: TextureMinificationFilter = js.native
  inline def DEFAULT_MINIFICATION_FILTER_=(x: TextureMinificationFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MINIFICATION_FILTER")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default saturation for the imagery layer if one is not provided during construction
    * or by the imagery provider. This value does not modify the saturation of the imagery.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_SATURATION")
  @js.native
  def DEFAULT_SATURATION: Double = js.native
  inline def DEFAULT_SATURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SATURATION")(x.asInstanceOf[js.Any])
  
  /**
    * This value is used as the default split for the imagery layer if one is not provided during construction
    * or by the imagery provider.
    */
  @JSImport("cesium", "ImageryLayer.DEFAULT_SPLIT")
  @js.native
  def DEFAULT_SPLIT: SplitDirection = js.native
  inline def DEFAULT_SPLIT_=(x: SplitDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SPLIT")(x.asInstanceOf[js.Any])
}

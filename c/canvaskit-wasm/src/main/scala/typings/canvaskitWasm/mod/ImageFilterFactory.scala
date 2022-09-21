package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageFilterFactory extends StObject {
  
  /**
    * Create a filter that takes a BlendMode and uses it to composite the two filters together.
    *
    *  At least one of background and foreground should be non-null in nearly all circumstances.
    *
    *  @param blend       The blend mode that defines the compositing operation
    *  @param background The Dst pixels used in blending; if null, use the dynamic source image
    *                    (e.g. a saved layer).
    *  @param foreground The Src pixels used in blending; if null, use the dynamic source image.
    */
  def MakeBlend(blend: BlendMode): ImageFilter = js.native
  def MakeBlend(blend: BlendMode, background: Null, foreground: ImageFilter): ImageFilter = js.native
  def MakeBlend(blend: BlendMode, background: ImageFilter): ImageFilter = js.native
  def MakeBlend(blend: BlendMode, background: ImageFilter, foreground: ImageFilter): ImageFilter = js.native
  
  /**
    * Create a filter that blurs its input by the separate X and Y sigmas. The provided tile mode
    * is used when the blur kernel goes outside the input image.
    *
    * @param sigmaX - The Gaussian sigma value for blurring along the X axis.
    * @param sigmaY - The Gaussian sigma value for blurring along the Y axis.
    * @param mode
    * @param input - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeBlur(sigmaX: Double, sigmaY: Double, mode: TileMode): ImageFilter = js.native
  def MakeBlur(sigmaX: Double, sigmaY: Double, mode: TileMode, input: ImageFilter): ImageFilter = js.native
  
  /**
    * Create a filter that applies the color filter to the input filter results.
    * @param cf
    * @param input - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeColorFilter(cf: ColorFilter): ImageFilter = js.native
  def MakeColorFilter(cf: ColorFilter, input: ImageFilter): ImageFilter = js.native
  
  /**
    * Create a filter that composes 'inner' with 'outer', such that the results of 'inner' are
    * treated as the source bitmap passed to 'outer'.
    * If either param is null, the other param will be returned.
    * @param outer
    * @param inner - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeCompose(): ImageFilter = js.native
  def MakeCompose(outer: Null, inner: ImageFilter): ImageFilter = js.native
  def MakeCompose(outer: ImageFilter): ImageFilter = js.native
  def MakeCompose(outer: ImageFilter, inner: ImageFilter): ImageFilter = js.native
  
  /**
    *  Create a filter that dilates each input pixel's channel values to the max value within the
    *  given radii along the x and y axes.
    *  @param radiusX  The distance to dilate along the x axis to either side of each pixel.
    *  @param radiusY  The distance to dilate along the y axis to either side of each pixel.
    *  @param input     if null, it will use the dynamic source image (e.g. a saved layer).
    */
  def MakeDilate(radiusX: Double, radiusY: Double): ImageFilter = js.native
  def MakeDilate(radiusX: Double, radiusY: Double, input: ImageFilter): ImageFilter = js.native
  
  /**
    *  Create a filter that moves each pixel in its color input based on an (x,y) vector encoded
    *  in its displacement input filter. Two color components of the displacement image are
    *  mapped into a vector as scale * (color[xChannel], color[yChannel]), where the channel
    *  selectors are one of R, G, B, or A.
    *  The mapping takes the 0-255 RGBA values of the image and scales them to be [-0.5 to 0.5],
    *  in a similar fashion to https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feDisplacementMap
    *
    *  At least one of displacement and color should be non-null in nearly all circumstances.
    *
    *  @param xChannel RGBA channel that encodes the x displacement per pixel.
    *  @param yChannel RGBA channel that encodes the y displacement per pixel.
    *  @param scale    Scale applied to displacement extracted from image.
    *  @param displacement The filter defining the displacement image, or null to use source.
    *  @param color   The filter providing the color pixels to be displaced, or null to use source.
    */
  def MakeDisplacementMap(xChannel: ColorChannel, yChannel: ColorChannel, scale: Double): ImageFilter = js.native
  def MakeDisplacementMap(
    xChannel: ColorChannel,
    yChannel: ColorChannel,
    scale: Double,
    displacement: Null,
    color: ImageFilter
  ): ImageFilter = js.native
  def MakeDisplacementMap(xChannel: ColorChannel, yChannel: ColorChannel, scale: Double, displacement: ImageFilter): ImageFilter = js.native
  def MakeDisplacementMap(
    xChannel: ColorChannel,
    yChannel: ColorChannel,
    scale: Double,
    displacement: ImageFilter,
    color: ImageFilter
  ): ImageFilter = js.native
  
  /**
    *  Create a filter that draws a drop shadow under the input content. This filter produces an
    *  image that includes the inputs' content.
    *  @param dx       The X offset of the shadow.
    *  @param dy       The Y offset of the shadow.
    *  @param sigmaX   The blur radius for the shadow, along the X axis.
    *  @param sigmaY   The blur radius for the shadow, along the Y axis.
    *  @param color    The color of the drop shadow.
    *  @param input    The input filter; if null, it will use the dynamic source image.
    */
  def MakeDropShadow(dx: Double, dy: Double, sigmaX: Double, sigmaY: Double, color: js.typedarray.Float32Array): ImageFilter = js.native
  def MakeDropShadow(
    dx: Double,
    dy: Double,
    sigmaX: Double,
    sigmaY: Double,
    color: js.typedarray.Float32Array,
    input: ImageFilter
  ): ImageFilter = js.native
  
  /**
    *  Just like MakeDropShadow, except the input content is not in the resulting image.
    *  @param dx       The X offset of the shadow.
    *  @param dy       The Y offset of the shadow.
    *  @param sigmaX   The blur radius for the shadow, along the X axis.
    *  @param sigmaY   The blur radius for the shadow, along the Y axis.
    *  @param color    The color of the drop shadow.
    *  @param input    The input filter; if null, it will use the dynamic source image.
    */
  def MakeDropShadowOnly(dx: Double, dy: Double, sigmaX: Double, sigmaY: Double, color: js.typedarray.Float32Array): ImageFilter = js.native
  def MakeDropShadowOnly(
    dx: Double,
    dy: Double,
    sigmaX: Double,
    sigmaY: Double,
    color: js.typedarray.Float32Array,
    input: ImageFilter
  ): ImageFilter = js.native
  
  /**
    *  Create a filter that erodes each input pixel's channel values to the minimum channel value
    *  within the given radii along the x and y axes.
    *  @param radiusX  The distance to erode along the x axis to either side of each pixel.
    *  @param radiusY  The distance to erode along the y axis to either side of each pixel.
    *  @param input     if null, it will use the dynamic source image (e.g. a saved layer).
    */
  def MakeErode(radiusX: Double, radiusY: Double): ImageFilter = js.native
  def MakeErode(radiusX: Double, radiusY: Double, input: ImageFilter): ImageFilter = js.native
  
  def MakeImage(img: Image, sampling: CubicResampler): ImageFilter | Null = js.native
  def MakeImage(img: Image, sampling: CubicResampler, srcRect: InputRect, dstRect: InputRect): ImageFilter | Null = js.native
  /**
    *  Create a filter using the given image as a source. Returns null if 'image' is null.
    *
    *  @param img      The image that is output by the filter, subset by 'srcRect'.
    *  @param sampling The sampling to use when drawing the image.
    */
  def MakeImage(img: Image, sampling: FilterOptions): ImageFilter | Null = js.native
  /**
    *  Create a filter that draws the 'srcRect' portion of image into 'dstRect' using the given
    *  filter quality. Similar to Canvas.drawImageRect. Returns null if 'image' is null.
    *
    *  @param img      The image that is output by the filter, subset by 'srcRect'.
    *  @param sampling The sampling to use when drawing the image.
    *  @param srcRect  The source pixels sampled into 'dstRect'.
    *  @param dstRect  The local rectangle to draw the image into.
    */
  def MakeImage(img: Image, sampling: FilterOptions, srcRect: InputRect, dstRect: InputRect): ImageFilter | Null = js.native
  
  def MakeMatrixTransform(matr: InputMatrix, sampling: CubicResampler): ImageFilter = js.native
  def MakeMatrixTransform(matr: InputMatrix, sampling: CubicResampler, input: ImageFilter): ImageFilter = js.native
  /**
    * Create a filter that transforms the input image by 'matrix'. This matrix transforms the
    * local space, which means it effectively happens prior to any transformation coming from the
    * Canvas initiating the filtering.
    * @param matr
    * @param sampling
    * @param input - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeMatrixTransform(matr: InputMatrix, sampling: FilterOptions): ImageFilter = js.native
  def MakeMatrixTransform(matr: InputMatrix, sampling: FilterOptions, input: ImageFilter): ImageFilter = js.native
  
  /**
    *  Create a filter that offsets the input filter by the given vector.
    *  @param dx       The x offset in local space that the image is shifted.
    *  @param dy       The y offset in local space that the image is shifted.
    *  @param input    The input that will be moved, if null, will use the dynamic source image.
    */
  def MakeOffset(dx: Double, dy: Double): ImageFilter = js.native
  def MakeOffset(dx: Double, dy: Double, input: ImageFilter): ImageFilter = js.native
  
  /**
    * Transforms a shader into an image filter
    *
    * @param shader - The Shader to be transformed
    */
  def MakeShader(shader: Shader): ImageFilter = js.native
}

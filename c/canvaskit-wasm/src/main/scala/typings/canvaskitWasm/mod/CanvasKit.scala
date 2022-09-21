package typings.canvaskitWasm.mod

import typings.std.CanvasImageSource
import typings.std.HTMLCanvasElement
import typings.std.Record
import typings.webgpuTypes.GPUDevice
import typings.webgpuTypes.GPUTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasKit extends StObject {
  
  // true if base Skottie code was compiled in
  // Paragraph Enums
  val Affinity: AffinityEnumValues = js.native
  
  // Core Enums
  val AlphaType: AlphaTypeEnumValues = js.native
  
  val BLACK: js.typedarray.Float32Array = js.native
  
  val BLUE: js.typedarray.Float32Array = js.native
  
  val BlendMode: BlendModeEnumValues = js.native
  
  val BlurStyle: BlurStyleEnumValues = js.native
  
  val CLOSE_VERB: Double = js.native
  
  val CONIC_VERB: Double = js.native
  
  val CUBIC_VERB: Double = js.native
  
  val CYAN: js.typedarray.Float32Array = js.native
  
  val ClipOp: ClipOpEnumValues = js.native
  
  // Helpers
  /**
    * Constructs a Color with the same API as CSS's rgba(), that is
    * Internally, Colors are four unpremultiplied 32-bit floats: r, g, b, a.
    * In order to construct one with more precision or in a wider gamut,
    * use CanvasKit.Color4f().
    *
    * @param r - red value, clamped to [0, 255].
    * @param g - green value, clamped to [0, 255].
    * @param b - blue value, clamped to [0, 255].
    * @param a - alpha value, from 0 to 1.0. By default is 1.0 (opaque).
    */
  def Color(r: Double, g: Double, b: Double): js.typedarray.Float32Array = js.native
  def Color(r: Double, g: Double, b: Double, a: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Construct a 4-float color. Float values are typically between 0.0 and 1.0.
    * @param r - red value.
    * @param g - green value.
    * @param b - blue value.
    * @param a - alpha value. By default is 1.0 (opaque).
    */
  def Color4f(r: Double, g: Double, b: Double): js.typedarray.Float32Array = js.native
  def Color4f(r: Double, g: Double, b: Double, a: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Constructs a Color as a 32 bit unsigned integer, with 8 bits assigned to each channel.
    * Channels are expected to be between 0 and 255 and will be clamped as such.
    * If a is omitted, it will be 255 (opaque).
    *
    * This is not the preferred way to use colors in Skia APIs, use Color or Color4f.
    * @param r - red value, clamped to [0, 255].
    * @param g - green value, clamped to [0, 255].
    * @param b - blue value, clamped to [0, 255].
    * @param a - alpha value, from 0 to 1.0. By default is 1.0 (opaque).
    */
  def ColorAsInt(r: Double, g: Double, b: Double): ColorInt = js.native
  def ColorAsInt(r: Double, g: Double, b: Double, a: Double): ColorInt = js.native
  
  val ColorChannel: ColorChannelEnumValues = js.native
  
  val ColorFilter: ColorFilterFactory = js.native
  
  // Misc
  val ColorMatrix: ColorMatrixHelpers = js.native
  
  val ColorSpace: ColorSpaceEnumValues = js.native
  
  val ColorType: ColorTypeEnumValues = js.native
  
  val ContourMeasureIter: ContourMeasureIterConstructor = js.native
  
  val DecorationStyle: DecorationStyleEnumValues = js.native
  
  val FillType: FillTypeEnumValues = js.native
  
  val FilterMode: FilterModeEnumValues = js.native
  
  val Font: FontConstructor = js.native
  
  val FontEdging: FontEdgingEnumValues = js.native
  
  val FontHinting: FontHintingEnumValues = js.native
  
  val FontMgr: FontMgrFactory = js.native
  
  val FontSlant: FontSlantEnumValues = js.native
  
  val FontWeight: FontWeightEnumValues = js.native
  
  val FontWidth: FontWidthEnumValues = js.native
  
  /**
    * Free frees the memory returned by Malloc.
    * Any memory allocated by CanvasKit.Malloc needs to be released with CanvasKit.Free.
    */
  def Free(m: MallocObj): Unit = js.native
  
  val GREEN: js.typedarray.Float32Array = js.native
  
  /**
    * Creates a WebGL Context from the given canvas with the given options. If options are omitted,
    * sensible defaults will be used.
    * @param canvas
    * @param opts
    */
  def GetWebGLContext(canvas: HTMLCanvasElement): WebGLContextHandle = js.native
  def GetWebGLContext(canvas: HTMLCanvasElement, opts: WebGLOptions): WebGLContextHandle = js.native
  
  val GlyphRunFlags: GlyphRunFlagValues = js.native
  
  // Constructors, i.e. things made with `new CanvasKit.Foo()`;
  val ImageData: ImageDataConstructor = js.native
  
  val ImageFilter: ImageFilterFactory = js.native
  
  val ImageFormat: ImageFormatEnumValues = js.native
  
  val LINE_VERB: Double = js.native
  
  /**
    * Returns a rectangle with the given paramaters. See Rect.h for more.
    * @param left - The x coordinate of the upper-left corner.
    * @param top  - The y coordinate of the upper-left corner.
    * @param right - The x coordinate of the lower-right corner.
    * @param bottom - The y coordinate of the lower-right corner.
    */
  def LTRBRect(left: Double, top: Double, right: Double, bottom: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Returns a rectangle with the given integer paramaters. See Rect.h for more.
    * @param left - The x coordinate of the upper-left corner.
    * @param top  - The y coordinate of the upper-left corner.
    * @param right - The x coordinate of the lower-right corner.
    * @param bottom - The y coordinate of the lower-right corner.
    */
  def LTRBiRect(left: Double, top: Double, right: Double, bottom: Double): js.typedarray.Int32Array = js.native
  
  val LineThroughDecoration: Double = js.native
  
  val M44: Matrix4x4Helpers = js.native
  
  val MAGENTA: js.typedarray.Float32Array = js.native
  
  val MOVE_VERB: Double = js.native
  
  def MakeAnimatedImageFromEncoded(bytes: js.typedarray.ArrayBuffer): AnimatedImage | Null = js.native
  /**
    * Decodes the given bytes into an animated image. Returns null if the bytes were invalid.
    * The passed in bytes will be copied into the WASM heap, so the caller can dispose of them.
    *
    * The returned AnimatedImage will be "pointing to" the first frame, i.e. currentFrameDuration
    * and makeImageAtCurrentFrame will be referring to the first frame.
    * @param bytes
    */
  def MakeAnimatedImageFromEncoded(bytes: js.typedarray.Uint8Array): AnimatedImage | Null = js.native
  
  /**
    * Returns a Skottie animation built from the provided json string.
    * Requires that Skottie be compiled into CanvasKit.
    * @param json
    */
  def MakeAnimation(json: String): SkottieAnimation = js.native
  
  /**
    * Returns an emulated Canvas2D of the given size.
    * @param width
    * @param height
    */
  def MakeCanvas(width: Double, height: Double): EmulatedCanvas2D = js.native
  
  def MakeCanvasSurface(canvas: String): Surface | Null = js.native
  // Surface related functions
  /**
    * Creates a Surface on a given canvas. If both GPU and CPU modes have been compiled in, this
    * will first try to create a GPU surface and then fallback to a CPU one if that fails. If just
    * the CPU mode has been compiled in, a CPU surface will be created.
    * @param canvas - either the canvas element itself or a string with the DOM id of it.
    * @deprecated - Use MakeSWCanvasSurface, MakeWebGLCanvasSurface, or MakeGPUCanvasSurface.
    */
  def MakeCanvasSurface(canvas: HTMLCanvasElement): Surface | Null = js.native
  
  /**
    * Creates and configures a WebGPU context for the given canvas.
    * @param ctx
    * @param canvas
    * @param opts
    */
  def MakeGPUCanvasContext(ctx: WebGPUDeviceContext, canvas: HTMLCanvasElement): WebGPUCanvasContext | Null = js.native
  def MakeGPUCanvasContext(ctx: WebGPUDeviceContext, canvas: HTMLCanvasElement, opts: WebGPUCanvasOptions): WebGPUCanvasContext | Null = js.native
  
  /**
    * Creates a Surface backed by the next available texture in the swapchain associated with the
    * given WebGPU canvas context. The context must have been already successfully configured using
    * the same GPUDevice associated with `ctx`.
    * @param canvasContext - WebGPU context associated with the canvas. The canvas can either be an
    *                        on-screen HTMLCanvasElement or an OffscreenCanvas.
    * @param colorSpace
    * @param width - width of the visible region. If not present, the canvas width from `canvasContext`
    *                is used.
    * @param height - height of the visible region. If not present, the canvas width from `canvasContext`
    *                is used.
    */
  def MakeGPUCanvasSurface(canvasContext: WebGPUCanvasContext, colorSpace: typings.canvaskitWasm.mod.ColorSpace): Surface | Null = js.native
  def MakeGPUCanvasSurface(
    canvasContext: WebGPUCanvasContext,
    colorSpace: typings.canvaskitWasm.mod.ColorSpace,
    width: Double
  ): Surface | Null = js.native
  def MakeGPUCanvasSurface(
    canvasContext: WebGPUCanvasContext,
    colorSpace: typings.canvaskitWasm.mod.ColorSpace,
    width: Double,
    height: Double
  ): Surface | Null = js.native
  def MakeGPUCanvasSurface(
    canvasContext: WebGPUCanvasContext,
    colorSpace: typings.canvaskitWasm.mod.ColorSpace,
    width: Unit,
    height: Double
  ): Surface | Null = js.native
  
  /**
    * Creates a context that operates over the given WebGPU Device.
    * @param device
    */
  def MakeGPUDeviceContext(device: GPUDevice): WebGPUDeviceContext | Null = js.native
  
  /**
    * Creates a Surface that draws to the given GPU texture.
    * @param ctx
    * @param texture - A texture that was created on the GPU device associated with `ctx`.
    * @param width - Width of the visible region in pixels.
    * @param height - Height of the visible region in pixels.
    * @param colorSpace
    */
  def MakeGPUTextureSurface(
    ctx: WebGPUDeviceContext,
    texture: GPUTexture,
    width: Double,
    height: Double,
    colorSpace: typings.canvaskitWasm.mod.ColorSpace
  ): Surface | Null = js.native
  
  /**
    * Creates a GrDirectContext from the given WebGL Context.
    * @param ctx
    * @deprecated Use MakeWebGLContext instead.
    */
  def MakeGrContext(ctx: WebGLContextHandle): GrDirectContext | Null = js.native
  
  /**
    * Returns an image with the given pixel data and format.
    * Note that we will always make a copy of the pixel data, because of inconsistencies in
    * behavior between GPU and CPU (i.e. the pixel data will be turned into a GPU texture and
    * not modifiable after creation).
    *
    * @param info
    * @param bytes - bytes representing the pixel data.
    * @param bytesPerRow
    */
  def MakeImage(info: ImageInfo, bytes: js.Array[Double], bytesPerRow: Double): Image | Null = js.native
  def MakeImage(info: ImageInfo, bytes: js.typedarray.Uint8Array, bytesPerRow: Double): Image | Null = js.native
  def MakeImage(info: ImageInfo, bytes: js.typedarray.Uint8ClampedArray, bytesPerRow: Double): Image | Null = js.native
  
  /**
    * Returns an Image with the data from the provided CanvasImageSource (e.g. <img>). This will
    * use the browser's built in codecs, in that src will be drawn to a canvas and then readback
    * and placed into an Image.
    * @param src
    */
  def MakeImageFromCanvasImageSource(src: CanvasImageSource): Image = js.native
  
  def MakeImageFromEncoded(bytes: js.typedarray.ArrayBuffer): Image | Null = js.native
  /**
    * Return an Image backed by the encoded data, but attempt to defer decoding until the image
    * is actually used/drawn. This deferral allows the system to cache the result, either on the
    * CPU or on the GPU, depending on where the image is drawn.
    * This decoding uses the codecs that have been compiled into CanvasKit. If the bytes are
    * invalid (or an unrecognized codec), null will be returned. See Image.h for more details.
    * @param bytes
    */
  def MakeImageFromEncoded(bytes: js.typedarray.Uint8Array): Image | Null = js.native
  
  /**
    * Returns a texture-backed image based on the content in src. It assumes the image is
    * RGBA_8888, unpremul and SRGB. This image can be re-used across multiple surfaces.
    *
    * Not available for software-backed surfaces.
    * @param src - CanvasKit will take ownership of the TextureSource and clean it up when
    *              the image is destroyed.
    * @param info - If provided, will be used to determine the width/height/format of the
    *               source image. If not, sensible defaults will be used.
    * @param srcIsPremul - set to true if the src data has premultiplied alpha. Otherwise, it will
    *         be assumed to be Unpremultiplied. Note: if this is true and info specifies
    *         Unpremul, Skia will not convert the src pixels first.
    */
  def MakeLazyImageFromTextureSource(src: TextureSource): Image = js.native
  def MakeLazyImageFromTextureSource(src: TextureSource, info: Unit, srcIsPremul: Boolean): Image = js.native
  def MakeLazyImageFromTextureSource(src: TextureSource, info: ImageInfo): Image = js.native
  def MakeLazyImageFromTextureSource(src: TextureSource, info: ImageInfo, srcIsPremul: Boolean): Image = js.native
  def MakeLazyImageFromTextureSource(src: TextureSource, info: PartialImageInfo): Image = js.native
  def MakeLazyImageFromTextureSource(src: TextureSource, info: PartialImageInfo, srcIsPremul: Boolean): Image = js.native
  
  /**
    * Returns a managed Skottie animation built from the provided json string and assets.
    * Requires that Skottie be compiled into CanvasKit.
    * @param json
    * @param assets - a dictionary of named blobs: { key: ArrayBuffer, ... }
    * @param filterPrefix - an optional string acting as a name filter for selecting "interesting"
    *                       Lottie properties (surfaced in the embedded player controls)
    * @param soundMap - an optional mapping of sound identifiers (strings) to AudioPlayers.
    *                   Only needed if the animation supports sound.
    */
  def MakeManagedAnimation(json: String): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: Unit, filterPrefix: String): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: Unit, filterPrefix: String, soundMap: SoundMap): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: Unit, filterPrefix: Unit, soundMap: SoundMap): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: Record[String, js.typedarray.ArrayBuffer]): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: Record[String, js.typedarray.ArrayBuffer], filterPrefix: String): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(
    json: String,
    assets: Record[String, js.typedarray.ArrayBuffer],
    filterPrefix: String,
    soundMap: SoundMap
  ): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(
    json: String,
    assets: Record[String, js.typedarray.ArrayBuffer],
    filterPrefix: Unit,
    soundMap: SoundMap
  ): ManagedSkottieAnimation = js.native
  
  /**
    * Creates a Surface that will be drawn to the given GrDirectContext (and show up on screen).
    * @param ctx
    * @param width - number of pixels of the width of the visible area.
    * @param height - number of pixels of the height of the visible area.
    * @param colorSpace
    */
  def MakeOnScreenGLSurface(
    ctx: GrDirectContext,
    width: Double,
    height: Double,
    colorSpace: typings.canvaskitWasm.mod.ColorSpace
  ): Surface | Null = js.native
  
  /**
    * Returns a Particles effect built from the provided json string and assets.
    * Requires that Particles be compiled into CanvasKit
    * @param json
    * @param assets
    */
  def MakeParticles(json: String): Particles = js.native
  def MakeParticles(json: String, assets: Record[String, js.typedarray.ArrayBuffer]): Particles = js.native
  
  def MakePicture(bytes: js.typedarray.ArrayBuffer): SkPicture | Null = js.native
  /**
    * Returns an SkPicture which has been serialized previously to the given bytes.
    * @param bytes
    */
  def MakePicture(bytes: js.typedarray.Uint8Array): SkPicture | Null = js.native
  
  /**
    * Creates a Raster (CPU) Surface that will draw into the provided Malloc'd buffer. This allows
    * clients to efficiently be able to read the current pixels w/o having to copy.
    * The length of pixels must be at least height * bytesPerRow bytes big.
    * @param ii
    * @param pixels
    * @param bytesPerRow - How many bytes are per row. This is at least width * bytesPerColorType. For example,
    *                      an 8888 ColorType has 4 bytes per pixel, so a 5 pixel wide 8888 surface needs at least
    *                      5 * 4 = 20 bytesPerRow. Some clients may have more than the usual to make the data line
    *                      up with a particular multiple.
    */
  def MakeRasterDirectSurface(ii: ImageInfo, pixels: MallocObj, bytesPerRow: Double): Surface | Null = js.native
  
  /**
    * Returns a (non-visible) Surface on the GPU. It has the settings provided by image info.
    * See Surface.h for more details.
    * @param ctx
    * @param info
    */
  def MakeRenderTarget(ctx: GrDirectContext, info: ImageInfo): Surface | Null = js.native
  /**
    * Returns a (non-visible) Surface on the GPU. It has the given dimensions and uses 8888
    * color depth and premultiplied alpha. See Surface.h for more details.
    * @param ctx
    * @param width
    * @param height
    */
  def MakeRenderTarget(ctx: GrDirectContext, width: Double, height: Double): Surface | Null = js.native
  
  def MakeSWCanvasSurface(canvas: String): Surface | Null = js.native
  /**
    * Creates a CPU backed (aka raster) surface.
    * @param canvas - either the canvas element itself or a string with the DOM id of it.
    */
  def MakeSWCanvasSurface(canvas: HTMLCanvasElement): Surface | Null = js.native
  
  /**
    * Returns a CPU backed surface with the given dimensions, an SRGB colorspace, Unpremul
    * alphaType and 8888 color type. The pixels belonging to this surface  will be in memory and
    * not visible.
    * @param width - number of pixels of the width of the drawable area.
    * @param height - number of pixels of the height of the drawable area.
    */
  def MakeSurface(width: Double, height: Double): Surface | Null = js.native
  
  /**
    * Returns an Vertices based on the given positions and optional parameters.
    * See SkVertices.h (especially the Builder) for more details.
    * @param mode
    * @param positions
    * @param textureCoordinates
    * @param colors - either a list of int colors or a flattened color array.
    * @param indices
    * @param isVolatile
    */
  def MakeVertices(
    mode: typings.canvaskitWasm.mod.VertexMode,
    positions: InputFlattenedPointArray,
    textureCoordinates: js.UndefOr[InputFlattenedPointArray | Null],
    colors: js.UndefOr[js.typedarray.Float32Array | ColorIntArray | Null],
    indices: js.UndefOr[js.Array[Double] | Null],
    isVolatile: js.UndefOr[Boolean]
  ): Vertices = js.native
  
  def MakeWebGLCanvasSurface(canvas: String): Surface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: String, colorSpace: Unit, opts: WebGLOptions): Surface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: String, colorSpace: typings.canvaskitWasm.mod.ColorSpace): Surface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: String, colorSpace: typings.canvaskitWasm.mod.ColorSpace, opts: WebGLOptions): Surface | Null = js.native
  /**
    * A helper for creating a WebGL backed (aka GPU) surface and falling back to a CPU surface if
    * the GPU one cannot be created. This works for both WebGL 1 and WebGL 2.
    * @param canvas - Either the canvas element itself or a string with the DOM id of it.
    * @param colorSpace - One of the supported color spaces. Default is SRGB.
    * @param opts - Options that will get passed to the creation of the WebGL context.
    */
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement): Surface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement, colorSpace: Unit, opts: WebGLOptions): Surface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement, colorSpace: typings.canvaskitWasm.mod.ColorSpace): Surface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement, colorSpace: typings.canvaskitWasm.mod.ColorSpace, opts: WebGLOptions): Surface | Null = js.native
  
  /**
    * Creates a GrDirectContext from the given WebGL Context.
    * @param ctx
    */
  def MakeWebGLContext(ctx: WebGLContextHandle): GrDirectContext | Null = js.native
  
  /**
    * Malloc returns a TypedArray backed by the C++ memory of the
    * given length. It should only be used by advanced users who
    * can manage memory and initialize values properly. When used
    * correctly, it can save copying of data between JS and C++.
    * When used incorrectly, it can lead to memory leaks.
    * Any memory allocated by CanvasKit.Malloc needs to be released with CanvasKit.Free.
    *
    * const mObj = CanvasKit.Malloc(Float32Array, 20);
    * Get a TypedArray view around the malloc'd memory (this does not copy anything).
    * const ta = mObj.toTypedArray();
    * // store data into ta
    * const cf = CanvasKit.ColorFilter.MakeMatrix(ta); // mObj could also be used.
    *
    * // eventually...
    * CanvasKit.Free(mObj);
    *
    * @param typedArray - constructor for the typedArray.
    * @param len - number of *elements* to store.
    */
  def Malloc(typedArray: TypedArrayConstructor, len: Double): MallocObj = js.native
  
  /**
    * As Malloc but for GlyphIDs. This helper exists to make sure the JS side and the C++ side
    * stay in agreement with how wide GlyphIDs are.
    * @param len - number of GlyphIDs to make space for.
    */
  def MallocGlyphIDs(len: Double): MallocObj = js.native
  
  val MaskFilter: MaskFilterFactory = js.native
  
  val Matrix: Matrix3x3Helpers = js.native
  
  val MipmapMode: MipmapModeEnumValues = js.native
  
  // Paragraph Constants
  val NoDecoration: Double = js.native
  
  val OverlineDecoration: Double = js.native
  
  val Paint: DefaultConstructor[typings.canvaskitWasm.mod.Paint] = js.native
  
  val PaintStyle: PaintStyleEnumValues = js.native
  
  // Factories, i.e. things made with CanvasKit.Foo.MakeTurboEncabulator()
  val ParagraphBuilder: ParagraphBuilderFactory = js.native
  
  val ParagraphStyle: ParagraphStyleConstructor = js.native
  
  val Path: PathConstructorAndFactory = js.native
  
  val Path1DEffect: Path1DEffectStyleEnumValues = js.native
  
  val PathEffect: PathEffectFactory = js.native
  
  val PathOp: PathOpEnumValues = js.native
  
  val PictureRecorder: DefaultConstructor[typings.canvaskitWasm.mod.PictureRecorder] = js.native
  
  val PlaceholderAlignment: PlaceholderAlignmentEnumValues = js.native
  
  val PointMode: PointModeEnumValues = js.native
  
  val QUAD_VERB: Double = js.native
  
  val RED: js.typedarray.Float32Array = js.native
  
  /**
    * Returns a rectangle with rounded corners consisting of the given rectangle and
    * the same radiusX and radiusY for all four corners.
    * @param rect - The base rectangle.
    * @param rx - The radius of the corners in the x direction.
    * @param ry - The radius of the corners in the y direction.
    */
  def RRectXY(rect: InputRect, rx: Double, ry: Double): js.typedarray.Float32Array = js.native
  
  val RectHeightStyle: RectHeightStyleEnumValues = js.native
  
  val RectWidthStyle: RectWidthStyleEnumValues = js.native
  
  val RuntimeEffect: RuntimeEffectFactory = js.native
  
  val SaveLayerF16ColorType: SaveLayerFlag = js.native
  
  val SaveLayerInitWithPrevious: SaveLayerFlag = js.native
  
  val Shader: ShaderFactory = js.native
  
  /**
    * Use this shadow flag to indicate the light position represents a direction and light radius
    * is blur radius at elevation 1.
    */
  val ShadowDirectionalLight: Double = js.native
  
  /**
    * Use this shadow flag to not use analytic shadows.
    */
  val ShadowGeometricOnly: Double = js.native
  
  /**
    * Use this shadow flag to indicate the occluding object is not opaque. Knowing that the
    * occluder is opaque allows us to cull shadow geometry behind it and improve performance.
    */
  val ShadowTransparentOccluder: Double = js.native
  
  val StrokeCap: StrokeCapEnumValues = js.native
  
  val StrokeJoin: StrokeJoinEnumValues = js.native
  
  // Core Constants
  val TRANSPARENT: js.typedarray.Float32Array = js.native
  
  val TextAlign: TextAlignEnumValues = js.native
  
  val TextBaseline: TextBaselineEnumValues = js.native
  
  val TextBlob: TextBlobFactory = js.native
  
  val TextDirection: TextDirectionEnumValues = js.native
  
  val TextHeightBehavior: TextHeightBehaviorEnumValues = js.native
  
  val TextStyle: TextStyleConstructor = js.native
  
  val TileMode: TileModeEnumValues = js.native
  
  val Typeface: TypefaceFactory = js.native
  
  val TypefaceFontProvider: TypefaceFontProviderFactory = js.native
  
  val UnderlineDecoration: Double = js.native
  
  val Vector: VectorHelpers = js.native
  
  val VertexMode: VertexModeEnumValues = js.native
  
  val WHITE: js.typedarray.Float32Array = js.native
  
  /**
    * Returns a rectangle with the given paramaters. See Rect.h for more.
    * @param x - The x coordinate of the upper-left corner.
    * @param y  - The y coordinate of the upper-left corner.
    * @param width - The width of the rectangle.
    * @param height - The height of the rectangle.
    */
  def XYWHRect(x: Double, y: Double, width: Double, height: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Returns a rectangle with the given paramaters. See Rect.h for more.
    * @param x - The x coordinate of the upper-left corner.
    * @param y  - The y coordinate of the upper-left corner.
    * @param width - The width of the rectangle.
    * @param height - The height of the rectangle.
    */
  def XYWHiRect(x: Double, y: Double, width: Double, height: Double): js.typedarray.Int32Array = js.native
  
  val YELLOW: js.typedarray.Float32Array = js.native
  
  /**
    * Computes color values for one-pass tonal alpha.
    * Note, if malloced colors are passed in, the memory pointed at by the MallocObj
    * will be overwritten with the computed tonal colors (and thus the return val can be
    * ignored).
    * @param colors
    */
  def computeTonalColors(colors: TonalColorsInput): TonalColorsOutput = js.native
  
  /**
    * Deletes the associated WebGLContext. Function not available on the CPU version.
    * @param ctx
    */
  def deleteContext(ctx: WebGLContextHandle): Unit = js.native
  
  /**
    * Returns a css style [r, g, b, a] where r, g, b are returned as
    * ints in the range [0, 255] and where a is scaled between 0 and 1.0.
    * [Deprecated] - this is trivial now that Color is 4 floats.
    */
  def getColorComponents(c: js.typedarray.Float32Array): js.Array[Double] = js.native
  
  /**
    * Returns the max size of the global cache for bitmaps used by CanvasKit.
    */
  def getDecodeCacheLimitBytes(): Double = js.native
  
  /**
    * Returns the current size of the global cache for bitmaps used by CanvasKit.
    */
  def getDecodeCacheUsedBytes(): Double = js.native
  
  /**
    * Generate bounding box for shadows relative to path. Includes both the ambient and spot
    * shadow bounds. This pairs with Canvas.drawShadow().
    * See SkShadowUtils.h for more details.
    * @param ctm - Current transformation matrix to device space.
    * @param path - The occluder used to generate the shadows.
    * @param zPlaneParams - Values for the plane function which returns the Z offset of the
    *                       occluder from the canvas based on local x and y values (the current
    *                       matrix is not applied).
    * @param lightPos - The 3D position of the light relative to the canvas plane. This is
    *                   independent of the canvas's current matrix.
    * @param lightRadius - The radius of the disc light.
    * @param flags - See SkShadowFlags.h; 0 means use default options.
    * @param dstRect - if provided, the bounds will be copied into this rect instead of allocating
    *                  a new one.
    * @returns The bounding rectangle or null if it could not be computed.
    */
  def getShadowLocalBounds(
    ctm: InputMatrix,
    path: typings.canvaskitWasm.mod.Path,
    zPlaneParams: InputVector3,
    lightPos: InputVector3,
    lightRadius: Double,
    flags: Double
  ): js.typedarray.Float32Array | Null = js.native
  def getShadowLocalBounds(
    ctm: InputMatrix,
    path: typings.canvaskitWasm.mod.Path,
    zPlaneParams: InputVector3,
    lightPos: InputVector3,
    lightRadius: Double,
    flags: Double,
    dstRect: js.typedarray.Float32Array
  ): js.typedarray.Float32Array | Null = js.native
  
  val gpu: js.UndefOr[Boolean] = js.native
  
  // true if GPU code was compiled in
  val managed_skottie: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns a copy of the passed in color with a new alpha value applied.
    * [Deprecated] - this is trivial now that Color is 4 floats.
    */
  def multiplyByAlpha(c: js.typedarray.Float32Array, alpha: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Takes in a CSS color value and returns a CanvasKit.Color
    * (which is an array of 4 floats in RGBA order). An optional colorMap
    * may be provided which maps custom strings to values.
    * In the CanvasKit canvas2d shim layer, we provide this map for processing
    * canvas2d calls, but not here for code size reasons.
    */
  def parseColorString(color: String): js.typedarray.Float32Array = js.native
  def parseColorString(color: String, colorMap: Record[String, js.typedarray.Float32Array]): js.typedarray.Float32Array = js.native
  
  // true if advanced (managed) Skottie code was compiled in
  val particles: js.UndefOr[Boolean] = js.native
  
  // true if Particles code was compiled in
  val rt_effect: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the max size of the global cache for bitmaps used by CanvasKit.
    * @param size - number of bytes that can be used to cache bitmaps.
    */
  def setDecodeCacheLimitBytes(size: Double): Unit = js.native
  
  // true if RuntimeEffect was compiled in
  val skottie: js.UndefOr[Boolean] = js.native
}

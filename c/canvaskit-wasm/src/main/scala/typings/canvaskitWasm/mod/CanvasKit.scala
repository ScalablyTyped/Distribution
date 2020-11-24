package typings.canvaskitWasm.mod

import typings.std.ArrayBuffer
import typings.std.CanvasImageSource
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.Record
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasKit extends js.Object {
  
   // if GPU code was compiled in
  // Paragraph Enums
  val Affinity: AffinityEnumValues = js.native
  
  // Core Enums
  val AlphaType: AlphaTypeEnumValues = js.native
  
  val BLACK: SkColor = js.native
  
  val BLUE: SkColor = js.native
  
  val BlendMode: BlendModeEnumValues = js.native
  
  val BlurStyle: BlurStyleEnumValues = js.native
  
  val CLOSE_VERB: Double = js.native
  
  val CONIC_VERB: Double = js.native
  
  val CUBIC_VERB: Double = js.native
  
  val CYAN: SkColor = js.native
  
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
  def Color(r: Double, g: Double, b: Double): SkColor = js.native
  def Color(r: Double, g: Double, b: Double, a: Double): SkColor = js.native
  
  /**
    * Construct a 4-float color. Float values are typically between 0.0 and 1.0.
    * @param r - red value.
    * @param g - green value.
    * @param b - blue value.
    * @param a - alpha value. By default is 1.0 (opaque).
    */
  def Color4f(r: Double, g: Double, b: Double): SkColor = js.native
  def Color4f(r: Double, g: Double, b: Double, a: Double): SkColor = js.native
  
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
  def ColorAsInt(r: Double, g: Double, b: Double): SkColorInt = js.native
  def ColorAsInt(r: Double, g: Double, b: Double, a: Double): SkColorInt = js.native
  
  val ColorType: ColorTypeEnumValues = js.native
  
  val DecorationStyle: DecorationStyleEnumValues = js.native
  
  val FillType: FillTypeEnumValues = js.native
  
  val FilterQuality: FilterQualityEnumValues = js.native
  
  val FontEdging: FontEdgingEnumValues = js.native
  
  val FontHinting: FontHintingEnumValues = js.native
  
  val FontSlant: FontSlantEnumValues = js.native
  
  val FontWeight: FontWeightEnumValues = js.native
  
  val FontWidth: FontWidthEnumValues = js.native
  
  /**
    * Free frees the memory returned by Malloc.
    * Any memory allocated by CanvasKit.Malloc needs to be released with CanvasKit.Free.
    */
  def Free(m: MallocObj): Unit = js.native
  
  val GREEN: SkColor = js.native
  
  /**
    * Creates a WebGL Context from the given canvas with the given options. If options are omitted,
    * sensible defaults will be used.
    * @param canvas
    * @param opts
    */
  def GetWebGLContext(canvas: HTMLCanvasElement): WebGLContextHandle = js.native
  def GetWebGLContext(canvas: HTMLCanvasElement, opts: WebGLOptions): WebGLContextHandle = js.native
  
  // Constructors, i.e. things made with `new CanvasKit.Foo()`;
  val ImageData: ImageDataConstructor = js.native
  
  val ImageFormat: ImageFormatEnumValues = js.native
  
  val LINE_VERB: Double = js.native
  
  /**
    * Returns a rectangle with the given paramaters. See SkRect.h for more.
    * @param left - The x coordinate of the upper-left corner.
    * @param top  - The y coordinate of the upper-left corner.
    * @param right - The x coordinate of the lower-right corner.
    * @param bottom - The y coordinate of the lower-right corner.
    */
  def LTRBRect(left: Double, top: Double, right: Double, bottom: Double): SkRect = js.native
  
  /**
    * Returns a rectangle with the given integer paramaters. See SkRect.h for more.
    * @param left - The x coordinate of the upper-left corner.
    * @param top  - The y coordinate of the upper-left corner.
    * @param right - The x coordinate of the lower-right corner.
    * @param bottom - The y coordinate of the lower-right corner.
    */
  def LTRBiRect(left: Double, top: Double, right: Double, bottom: Double): SkIRect = js.native
  
  val LineThroughDecoration: Double = js.native
  
  val MAGENTA: SkColor = js.native
  
  val MOVE_VERB: Double = js.native
  
  def MakeAnimatedImageFromEncoded(bytes: ArrayBuffer): SkAnimatedImage | Null = js.native
  /**
    * Decodes the given bytes into an animated image. Returns null if the bytes were invalid.
    * The passed in bytes will be copied into the WASM heap, so the caller can dispose of them.
    * @param bytes
    */
  def MakeAnimatedImageFromEncoded(bytes: Uint8Array): SkAnimatedImage | Null = js.native
  
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
  
  def MakeCanvasSurface(canvas: String): SkSurface | Null = js.native
  // Surface related functions
  /**
    * Creates a Surface on a given canvas. If both GPU and CPU modes have been compiled in, this
    * will first try to create a GPU surface and then fallback to a CPU one if that fails. If just
    * the CPU mode has been compiled in, a CPU surface will be created.
    * @param canvas - either the canvas element itself or a string with the DOM id of it.
    */
  def MakeCanvasSurface(canvas: HTMLCanvasElement): SkSurface | Null = js.native
  
  /**
    * Creates a GrContext from the given WebGL Context.
    * @param ctx
    */
  def MakeGrContext(ctx: WebGLContextHandle): GrContext = js.native
  
  /**
    * Returns an SkImage with the data from the provided CanvasImageSource (e.g. <img>). This will
    * use the browser's built in codecs, in that src will be drawn to a canvas and then readback
    * and placed into an SkImage.
    * @param src
    */
  def MakeImageFromCanvasImageSource(src: CanvasImageSource): SkImage = js.native
  
  def MakeImageFromEncoded(bytes: ArrayBuffer): SkImage | Null = js.native
  /**
    * Return an SkImage backed by the encoded data, but attempt to defer decoding until the image
    * is actually used/drawn. This deferral allows the system to cache the result, either on the
    * CPU or on the GPU, depending on where the image is drawn.
    * This decoding uses the codecs that have been compiled into CanvasKit. If the bytes are
    * invalid (or an unrecognized codec), null will be returned. See SkImage.h for more details.
    * @param bytes
    */
  def MakeImageFromEncoded(bytes: Uint8Array): SkImage | Null = js.native
  
  /**
    * Returns a managed Skottie animation built from the provided json string and assets.
    * Requires that Skottie be compiled into CanvasKit.
    * @param json
    * @param assets - a dictionary of named blobs: { key: ArrayBuffer, ... }
    * @param filterPrefix - an optional string acting as a name filter for selecting "interesting"
    *                       Lottie properties (surfaced in the embedded player controls)
    */
  def MakeManagedAnimation(json: String): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: js.UndefOr[scala.Nothing], filterPrefix: String): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: Record[String, ArrayBuffer]): ManagedSkottieAnimation = js.native
  def MakeManagedAnimation(json: String, assets: Record[String, ArrayBuffer], filterPrefix: String): ManagedSkottieAnimation = js.native
  
  /**
    * Creates a Surface that will be drawn to the given GrContext (and show up on screen).
    * @param ctx
    * @param width - number of pixels of the width of the visible area.
    * @param height - number of pixels of the height of the visible area.
    * @param colorSpace
    */
  def MakeOnScreenGLSurface(ctx: GrContext, width: Double, height: Double, colorSpace: ColorSpace): SkSurface | Null = js.native
  
  /**
    * Returns a Particles effect built from the provided json string and assets.
    * Requires that Particles be compiled into CanvasKit
    * @param json
    * @param assets
    */
  def MakeParticles(json: String): Particles = js.native
  def MakeParticles(json: String, assets: Record[String, ArrayBuffer]): Particles = js.native
  
  /**
    * Creates a new path by combining the given paths according to op. If this fails, null will
    * be returned instead.
    * @param one
    * @param two
    * @param op
    */
  def MakePathFromOp(
    one: typings.canvaskitWasm.mod.SkPath,
    two: typings.canvaskitWasm.mod.SkPath,
    op: typings.canvaskitWasm.mod.PathOp
  ): typings.canvaskitWasm.mod.SkPath | Null = js.native
  
  /**
    * Creates a new path from the provided SVG string. If this fails, null will be
    * returned instead.
    * @param str
    */
  def MakePathFromSVGString(str: String): typings.canvaskitWasm.mod.SkPath | Null = js.native
  
  /**
    * Returns a (non-visible) SkSurface on the GPU. It has the settings provided by image info.
    * See SkSurface.h for more details.
    * @param ctx
    * @param info
    */
  def MakeRenderTarget(ctx: GrContext, info: SkImageInfo): SkSurface | Null = js.native
  /**
    * Returns a (non-visible) SkSurface on the GPU. It has the given dimensions and uses 8888
    * color depth and premultiplied alpha. See SkSurface.h for more details.
    * @param ctx
    * @param width
    * @param height
    */
  def MakeRenderTarget(ctx: GrContext, width: Double, height: Double): SkSurface | Null = js.native
  
  def MakeSWCanvasSurface(canvas: String): SkSurface | Null = js.native
  /**
    * Creates a CPU backed (aka raster) surface.
    * @param canvas - either the canvas element itself or a string with the DOM id of it.
    */
  def MakeSWCanvasSurface(canvas: HTMLCanvasElement): SkSurface | Null = js.native
  
  def MakeSkPicture(bytes: ArrayBuffer): SkPicture | Null = js.native
  /**
    * Returns an SkPicture which has been serialized previously to the given bytes.
    * @param bytes
    */
  def MakeSkPicture(bytes: Uint8Array): SkPicture | Null = js.native
  
  /**
    * Returns an SkVertices based on the given positions and optional parameters.
    * See SkVertices.h (especially the Builder) for more details.
    * @param mode
    * @param positions
    * @param textureCoordinates
    * @param colors - either a list of int colors or a flattened color array.
    * @param indices
    * @param isVolatile
    */
  def MakeSkVertices(
    mode: typings.canvaskitWasm.mod.VertexMode,
    positions: js.Array[js.Array[Double]],
    textureCoordinates: js.UndefOr[js.Array[js.Array[Double]] | Null],
    colors: js.UndefOr[Float32Array | ColorIntArray | Null],
    indices: js.UndefOr[js.Array[Double] | Null],
    isVolatile: js.UndefOr[Boolean]
  ): SkVertices = js.native
  
  /**
    * Returns a CPU backed surface with the given dimensions, an SRGB colorspace, Unpremul
    * alphaType and 8888 color type. The pixels belonging to this surface  will be in memory and
    * not visible.
    * @param width - number of pixels of the width of the drawable area.
    * @param height - number of pixels of the height of the drawable area.
    */
  def MakeSurface(width: Double, height: Double): SkSurface | Null = js.native
  
  def MakeWebGLCanvasSurface(canvas: String): SkSurface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: String, colorSpace: js.UndefOr[scala.Nothing], opts: WebGLOptions): SkSurface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: String, colorSpace: ColorSpace): SkSurface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: String, colorSpace: ColorSpace, opts: WebGLOptions): SkSurface | Null = js.native
  /**
    * A helper for creating a WebGL backed (aka GPU) surface and falling back to a CPU surface if
    * the GPU one cannot be created. This works for both WebGL 1 and WebGL 2.
    * @param canvas - Either the canvas element itself or a string with the DOM id of it.
    * @param colorSpace - One of the supported color spaces. Default is SRGB.
    * @param opts - Options that will get passed to the creation of the WebGL context.
    */
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement): SkSurface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement, colorSpace: js.UndefOr[scala.Nothing], opts: WebGLOptions): SkSurface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement, colorSpace: ColorSpace): SkSurface | Null = js.native
  def MakeWebGLCanvasSurface(canvas: HTMLCanvasElement, colorSpace: ColorSpace, opts: WebGLOptions): SkSurface | Null = js.native
  
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
    * const cf = CanvasKit.SkColorFilter.MakeMatrix(ta); // mObj could also be used.
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
  
  // Paragraph Constants
  val NoDecoration: Double = js.native
  
  val OverlineDecoration: Double = js.native
  
  val PaintStyle: PaintStyleEnumValues = js.native
  
  // Factories, i.e. things made with CanvasKit.Foo.MakeTurboEncapsulator()
  val ParagraphBuilder: ParagraphBuilderFactory = js.native
  
  val ParagraphStyle: ParagraphStyleConstructor = js.native
  
  val PathOp: PathOpEnumValues = js.native
  
  val PlaceholderAlignment: PlaceholderAlignmentEnumValues = js.native
  
  val PointMode: PointModeEnumValues = js.native
  
  val QUAD_VERB: Double = js.native
  
  val RED: SkColor = js.native
  
  /**
    * Returns a rectangle with rounded corners consisting of the given rectangle and
    * the same radiusX and radiusY for all four corners.
    * @param rect - The base rectangle.
    * @param rx - The radius of the corners in the x direction.
    * @param ry - The radius of the corners in the y direction.
    */
  def RRectXY(rect: InputRect, rx: Double, ry: Double): SkRRect = js.native
  
  val RectHeightStyle: RectHeightStyleEnumValues = js.native
  
  val RectWidthStyle: RectWidthStyleEnumValues = js.native
  
  val SaveLayerF16ColorType: SaveLayerFlag = js.native
  
  val SaveLayerInitWithPrevious: SaveLayerFlag = js.native
  
  val ShapedText: ShapedTextConstructor = js.native
  
  val SkColorFilter: SkColorFilterFactory = js.native
  
  // Misc
  val SkColorMatrix: ColorMatrixHelpers = js.native
  
  val SkColorSpace: ColorSpaceEnumValues = js.native
  
  val SkContourMeasureIter: SkContourMeasureIterConstructor = js.native
  
  val SkFont: SkFontConstructor = js.native
  
  val SkFontMgr: SkFontMgrFactory = js.native
  
  val SkImageFilter: SkImageFilterFactory = js.native
  
  val SkM44: Matrix4x4Helpers = js.native
  
  val SkMaskFilter: SkMaskFilterFactory = js.native
  
  val SkMatrix: Matrix3x3Helpers = js.native
  
  val SkPaint: DefaultConstructor[typings.canvaskitWasm.mod.SkPaint] = js.native
  
  val SkPath: SkPathConstructorAndFactory = js.native
  
  val SkPathEffect: SkPathEffectFactory = js.native
  
  val SkPictureRecorder: DefaultConstructor[typings.canvaskitWasm.mod.SkPictureRecorder] = js.native
  
  val SkRuntimeEffect: SkRuntimeEffectFactory = js.native
  
  val SkShader: SkShaderFactory = js.native
  
  val SkTextBlob: SkTextBlobFactory = js.native
  
  val SkVector: VectorHelpers = js.native
  
  val StrokeCap: StrokeCapEnumValues = js.native
  
  val StrokeJoin: StrokeJoinEnumValues = js.native
  
  // Core Constants
  val TRANSPARENT: SkColor = js.native
  
  val TextAlign: TextAlignEnumValues = js.native
  
  val TextBaseline: TextBaselineEnumValues = js.native
  
  val TextDirection: TextDirectionEnumValues = js.native
  
  val TextStyle: TextStyleConstructor = js.native
  
  val TileMode: TileModeEnumValues = js.native
  
  val TypefaceFontProvider: TypefaceFontProviderFactory = js.native
  
  val UnderlineDecoration: Double = js.native
  
  val VertexMode: VertexModeEnumValues = js.native
  
  val WHITE: SkColor = js.native
  
  /**
    * Returns a rectangle with the given paramaters. See SkRect.h for more.
    * @param x - The x coordinate of the upper-left corner.
    * @param y  - The y coordinate of the upper-left corner.
    * @param width - The width of the rectangle.
    * @param height - The height of the rectangle.
    */
  def XYWHRect(x: Double, y: Double, width: Double, height: Double): SkRect = js.native
  
  /**
    * Returns a rectangle with the given paramaters. See SkRect.h for more.
    * @param x - The x coordinate of the upper-left corner.
    * @param y  - The y coordinate of the upper-left corner.
    * @param width - The width of the rectangle.
    * @param height - The height of the rectangle.
    */
  def XYWHiRect(x: Double, y: Double, width: Double, height: Double): SkIRect = js.native
  
  val YELLOW: SkColor = js.native
  
  /**
    * Computes color values for one-pass tonal alpha.
    * Note, if malloced colors are passed in, the memory pointed at by the MallocObj
    * will be overwritten with the computed tonal colors (and thus the return val can be
    * ignored).
    * @param colors
    */
  def computeTonalColors(colors: TonalColorsInput): TonalColorsOutput = js.native
  
  /**
    * Returns the current WebGLContext that the wasm code is configured to draw to. It is
    * recommended to capture this value after creating a new WebGL surface if there are multiple
    * surfaces on the screen.
    */
  def currentContext(): WebGLContextHandle = js.native
  
  /**
    * Returns a css style [r, g, b, a] where r, g, b are returned as
    * ints in the range [0, 255] and where a is scaled between 0 and 1.0.
    * [Deprecated] - this is trivial now that SkColor is 4 floats.
    */
  def getColorComponents(c: SkColor): js.Array[Double] = js.native
  
  /**
    * Returns the max size of the global cache for bitmaps used by CanvasKit.
    */
  def getDecodeCacheLimitBytes(): Double = js.native
  
  /**
    * Returns the current size of the global cache for bitmaps used by CanvasKit.
    */
  def getDecodeCacheUsedBytes(): Double = js.native
  
  /**
    * Returns the underlying data from SkData as a Uint8Array.
    * @param data
    */
  def getSkDataBytes(data: SkData): Uint8Array = js.native
  
  val gpu: Boolean = js.native
  
  /**
    * Returns a copy of the passed in color with a new alpha value applied.
    * [Deprecated] - this is trivial now that SkColor is 4 floats.
    */
  def multiplyByAlpha(c: SkColor, alpha: Double): SkColor = js.native
  
  /**
    * Takes in a CSS color value and returns a CanvasKit.Color
    * (which is an array of 4 floats in RGBA order). An optional colorMap
    * may be provided which maps custom strings to values.
    * In the CanvasKit canvas2d shim layer, we provide this map for processing
    * canvas2d calls, but not here for code size reasons.
    */
  def parseColorString(color: String): SkColor = js.native
  def parseColorString(color: String, colorMap: js.Object): SkColor = js.native
  
  /**
    * Sets the WebGLContext that the wasm code will draw to.
    *
    * When a WebGL call is made on the C++ side, it is routed to the JS side to target a specific
    * WebGL context. WebGL calls are methods on a WebGL context, so CanvasKit needs to know which
    * context to send the calls to.
    * @param ctx
    */
  def setCurrentContext(ctx: WebGLContextHandle): Unit = js.native
  
  /**
    * Sets the max size of the global cache for bitmaps used by CanvasKit.
    * @param size - number of bytes that can be used to cache bitmaps.
    */
  def setDecodeCacheLimitBytes(size: Double): Unit = js.native
}

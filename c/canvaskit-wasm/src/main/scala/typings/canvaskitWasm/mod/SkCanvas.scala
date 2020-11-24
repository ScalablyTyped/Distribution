package typings.canvaskitWasm.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkCanvas extends EmbindObject[SkCanvas] {
  
  /**
    * Fills the current clip with the given color using Src BlendMode.
    * This has the effect of replacing all pixels contained by clip with color.
    * @param color
    */
  def clear(color: InputColor): Unit = js.native
  
  /**
    * Replaces clip with the intersection or difference of the current clip and path,
    * with an aliased or anti-aliased clip edge.
    * @param path
    * @param op
    * @param doAntiAlias
    */
  def clipPath(path: SkPath, op: ClipOp, doAntiAlias: Boolean): Unit = js.native
  
  /**
    * Replaces clip with the intersection or difference of the current clip and rrect,
    * with an aliased or anti-aliased clip edge.
    * @param rrect
    * @param op
    * @param doAntiAlias
    */
  def clipRRect(rrect: InputRRect, op: ClipOp, doAntiAlias: Boolean): Unit = js.native
  
  /**
    * Replaces clip with the intersection or difference of the current clip and rect,
    * with an aliased or anti-aliased clip edge.
    * @param rect
    * @param op
    * @param doAntiAlias
    */
  def clipRect(rect: InputRect, op: ClipOp, doAntiAlias: Boolean): Unit = js.native
  
  /**
    * Replaces current matrix with m premultiplied with the existing matrix.
    * @param m
    */
  def concat(m: InputMatrix): Unit = js.native
  
  /**
    * Draws arc using clip, SkMatrix, and SkPaint paint.
    *
    * Arc is part of oval bounded by oval, sweeping from startAngle to startAngle plus
    * sweepAngle. startAngle and sweepAngle are in degrees.
    * @param oval - bounds of oval containing arc to draw
    * @param startAngle - angle in degrees where arc begins
    * @param sweepAngle - sweep angle in degrees; positive is clockwise
    * @param useCenter - if true, include the center of the oval
    * @param paint
    */
  def drawArc(
    oval: InputRect,
    startAngle: AngleInDegrees,
    sweepAngle: AngleInDegrees,
    useCenter: Boolean,
    paint: SkPaint
  ): Unit = js.native
  
  /**
    * Draws a set of sprites from atlas, using clip, SkMatrix, and optional SkPaint paint.
    * @param atlas - SkImage containing sprites
    * @param srcRects - SkRect locations of sprites in atlas
    * @param dstXforms - SkRSXform mappings for sprites in atlas
    * @param paint
    * @param blendMode - BlendMode combining colors and sprites
    * @param colors - If provided, will be blended with sprite using blendMode.
    */
  def drawAtlas(
    atlas: SkImage,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: SkPaint
  ): Unit = js.native
  def drawAtlas(
    atlas: SkImage,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: SkPaint,
    blendMode: js.UndefOr[scala.Nothing],
    colors: ColorIntArray
  ): Unit = js.native
  def drawAtlas(
    atlas: SkImage,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: SkPaint,
    blendMode: BlendMode
  ): Unit = js.native
  def drawAtlas(
    atlas: SkImage,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: SkPaint,
    blendMode: BlendMode,
    colors: ColorIntArray
  ): Unit = js.native
  
  /**
    * Draws a circle at (cx, cy) with the given radius.
    * @param cx
    * @param cy
    * @param radius
    * @param paint
    */
  def drawCircle(cx: Double, cy: Double, radius: Double, paint: SkPaint): Unit = js.native
  
  /**
    * Fills clip with the given color.
    * @param color
    * @param blendMode - defaults to SrcOver.
    */
  def drawColor(color: InputColor): Unit = js.native
  def drawColor(color: InputColor, blendMode: BlendMode): Unit = js.native
  
  /**
    * Fills clip with the given color.
    * @param r - red value (typically from 0 to 1.0).
    * @param g - green value (typically from 0 to 1.0).
    * @param b - blue value (typically from 0 to 1.0).
    * @param a - alpha value, range 0 to 1.0 (1.0 is opaque).
    * @param blendMode - defaults to SrcOver.
    */
  def drawColorComponents(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def drawColorComponents(r: Double, g: Double, b: Double, a: Double, blendMode: BlendMode): Unit = js.native
  
  /**
    * Fills clip with the given color.
    * @param color
    * @param blendMode - defaults to SrcOver.
    */
  def drawColorInt(color: SkColorInt): Unit = js.native
  def drawColorInt(color: SkColorInt, blendMode: BlendMode): Unit = js.native
  
  /**
    * Draws SkRRect outer and inner using clip, SkMatrix, and SkPaint paint.
    * outer must contain inner or the drawing is undefined.
    * @param outer
    * @param inner
    * @param paint
    */
  def drawDRRect(outer: InputRRect, inner: InputRRect, paint: SkPaint): Unit = js.native
  
  /**
    * Draws the given image with its top-left corner at (left, top) using the current clip,
    * the current matrix, and optionally-provided paint.
    * @param img
    * @param left
    * @param top
    * @param paint
    */
  def drawImage(img: SkImage, left: Double, top: Double): Unit = js.native
  def drawImage(img: SkImage, left: Double, top: Double, paint: SkPaint): Unit = js.native
  
  /**
    * Draws the current frame of the given animated image with its top-left corner at
    * (left, top) using the current clip, the current matrix, and optionally-provided paint.
    * @param aImg
    * @param left
    * @param top
    * @param paint
    */
  def drawImageAtCurrentFrame(aImg: SkAnimatedImage, left: Double, top: Double): Unit = js.native
  def drawImageAtCurrentFrame(aImg: SkAnimatedImage, left: Double, top: Double, paint: SkPaint): Unit = js.native
  
  /**
    *  Draws the provided image stretched proportionally to fit into dst rectangle.
    *  The center rectangle divides the image into nine sections: four sides, four corners, and
    *  the center.
    * @param img
    * @param center
    * @param dest
    * @param paint
    */
  def drawImageNine(img: SkImage, center: InputIRect, dest: InputRect, paint: SkPaint): Unit = js.native
  
  /**
    * Draws sub-rectangle src from provided image, scaled and translated to fill dst rectangle.
    * @param img
    * @param src
    * @param dest
    * @param paint
    * @param fastSample - if false, will filter strictly within src.
    */
  def drawImageRect(img: SkImage, src: InputRect, dest: InputRect, paint: SkPaint): Unit = js.native
  def drawImageRect(img: SkImage, src: InputRect, dest: InputRect, paint: SkPaint, fastSample: Boolean): Unit = js.native
  
  /**
    * Draws line segment from (x0, y0) to (x1, y1) using the current clip, current matrix,
    * and the provided paint.
    * @param x0
    * @param y0
    * @param x1
    * @param y1
    * @param paint
    */
  def drawLine(x0: Double, y0: Double, x1: Double, y1: Double, paint: SkPaint): Unit = js.native
  
  /**
    * Draws an oval bounded by the given rectangle using the current clip, current matrix,
    * and the provided paint.
    * @param oval
    * @param paint
    */
  def drawOval(oval: InputRect, paint: SkPaint): Unit = js.native
  
  /**
    * Fills clip with the given paint.
    * @param paint
    */
  def drawPaint(paint: SkPaint): Unit = js.native
  
  /**
    * Draws the given Paragraph at the provided coordinates.
    * Requires the Paragraph code to be compiled in.
    * @param p
    * @param x
    * @param y
    */
  def drawParagraph(p: Paragraph, x: Double, y: Double): Unit = js.native
  
  /**
    * Draws the given path using the current clip, current matrix, and the provided paint.
    * @param path
    * @param paint
    */
  def drawPath(path: SkPath, paint: SkPaint): Unit = js.native
  
  /**
    * Draws the given picture using the current clip, current matrix, and the provided paint.
    * @param skp
    */
  def drawPicture(skp: SkPicture): Unit = js.native
  
  /**
    * Draws the given points using the current clip, current matrix, and the provided paint.
    *
    * See SkCanvas.h for more on the mode and its interaction with paint.
    * @param mode
    * @param points
    * @param paint
    */
  def drawPoints(mode: PointMode, points: InputFlattenedPointArray, paint: SkPaint): Unit = js.native
  
  /**
    * Draws the given rectangle with rounded corners using the current clip, current matrix,
    * and the provided paint.
    * @param rrect
    * @param paint
    */
  def drawRRect(rrect: InputRRect, paint: SkPaint): Unit = js.native
  
  /**
    * Draws the given rectangle using the current clip, current matrix, and the provided paint.
    * @param rect
    * @param paint
    */
  def drawRect(rect: InputRect, paint: SkPaint): Unit = js.native
  
  /**
    * Draws the given rectangle using the current clip, current matrix, and the provided paint.
    * @param left
    * @param top
    * @param right
    * @param bottom
    * @param paint
    */
  def drawRect4f(left: Double, top: Double, right: Double, bottom: Double, paint: SkPaint): Unit = js.native
  
  /**
    * Draw an offset spot shadow and outlining ambient shadow for the given path using a disc
    * light. See SkShadowUtils.h for more details
    * @param path - The occluder used to generate the shadows.
    * @param zPlaneParams - Values for the plane function which returns the Z offset of the
    *                       occluder from the canvas based on local x and y values (the current
    *                       matrix is not applied).
    * @param lightPos - The 3D position of the light relative to the canvas plane. This is
    *                   independent of the canvas's current matrix.
    * @param lightRadius - The radius of the disc light.
    * @param ambientColor - The color of the ambient shadow.
    * @param spotColor -  The color of the spot shadow.
    * @param flags - See SkShadowFlags.h; 0 means use default options.
    */
  def drawShadow(
    path: SkPath,
    zPlaneParams: Vector3,
    lightPos: Vector3,
    lightRadius: Double,
    ambientColor: InputColor,
    spotColor: InputColor,
    flags: Double
  ): Unit = js.native
  
  /**
    * Draw the given text at the location (x, y) using the provided paint and font. If non-shaped
    * text is provided, the text will be drawn as is; no line-breaking, no ligatures, etc.
    * @param str - either a string or pre-shaped text. Unicode text is supported.
    * @param x
    * @param y
    * @param paint
    * @param font
    */
  def drawText(str: String, x: Double, y: Double, paint: SkPaint, font: SkFont): Unit = js.native
  def drawText(str: ShapedText, x: Double, y: Double, paint: SkPaint, font: SkFont): Unit = js.native
  
  /**
    * Draws the given TextBlob at (x, y) using the current clip, current matrix, and the
    * provided paint. Reminder that the fonts used to draw TextBlob are part of the blob.
    * @param blob
    * @param x
    * @param y
    * @param paint
    */
  def drawTextBlob(blob: SkTextBlob, x: Double, y: Double, paint: SkPaint): Unit = js.native
  
  /**
    * Draws the given vertices (a triangle mesh) using the current clip, current matrix, and the
    * provided paint.
    *  If paint contains an SkShader and vertices does not contain texCoords, the shader
    *  is mapped using the vertices' positions.
    *  If vertices colors are defined in vertices, and SkPaint paint contains SkShader,
    *  SkBlendMode mode combines vertices colors with SkShader.
    * @param verts
    * @param mode
    * @param paint
    */
  def drawVertices(verts: SkVertices, mode: BlendMode, paint: SkPaint): Unit = js.native
  
  /**
    * Returns the 4x4 matrix matching the given marker or null if there was none.
    * See also markCTM.
    * @param marker
    */
  def findMarkedCTM(marker: String): Matrix4x4 | Null = js.native
  
  /**
    * Returns the current transform from local coordinates to the 'device', which for most
    * purposes means pixels.
    */
  def getLocalToDevice(): Matrix4x4 = js.native
  
  /**
    * Returns the number of saved states, each containing: SkMatrix and clip.
    * Equals the number of save() calls less the number of restore() calls plus one.
    * The save count of a new canvas is one.
    */
  def getSaveCount(): Double = js.native
  
  /**
    * Legacy version of getLocalToDevice(), which strips away any Z information, and
    * just returns a 3x3 version.
    */
  def getTotalMatrix(): js.Array[Double] = js.native
  
  /**
    * Creates SkSurface matching info and props, and associates it with SkCanvas.
    * Returns null if no match found.
    * @param info
    */
  def makeSurface(info: SkImageInfo): SkSurface | Null = js.native
  
  /**
    * Record a marker (provided by caller) for the current CTM. This does not change anything
    * about the ctm or clip, but does "name" this matrix value, so it can be referenced by
    * custom effects (who access it by specifying the same name).
    * See also findMarkedCTM.
    * @param marker
    */
  def markCTM(marker: String): Unit = js.native
  
  /**
    * Copies the given rectangle of pixels into a new Uint8Array and returns it. If alphaType,
    * colorType, and colorSpace are provided, those will describe the output format.
    * @param x
    * @param y
    * @param w
    * @param h
    * @param alphaType - defaults to Unpremul
    * @param colorType - defaults to RGBA_8888
    * @param colorSpace - defaults to SRGB
    * @param dstRowBytes
    */
  def readPixels(x: Double, y: Double, w: Double, h: Double): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: js.UndefOr[scala.Nothing],
    dstRowBytes: Double
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace,
    dstRowBytes: Double
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType,
    colorSpace: js.UndefOr[scala.Nothing],
    dstRowBytes: Double
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType,
    colorSpace: ColorSpace,
    dstRowBytes: Double
  ): Uint8Array = js.native
  def readPixels(x: Double, y: Double, w: Double, h: Double, alphaType: AlphaType): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: AlphaType,
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: js.UndefOr[scala.Nothing],
    dstRowBytes: Double
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: AlphaType,
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: AlphaType,
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace,
    dstRowBytes: Double
  ): Uint8Array = js.native
  def readPixels(x: Double, y: Double, w: Double, h: Double, alphaType: AlphaType, colorType: ColorType): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: AlphaType,
    colorType: ColorType,
    colorSpace: js.UndefOr[scala.Nothing],
    dstRowBytes: Double
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: AlphaType,
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Uint8Array = js.native
  def readPixels(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alphaType: AlphaType,
    colorType: ColorType,
    colorSpace: ColorSpace,
    dstRowBytes: Double
  ): Uint8Array = js.native
  
  /**
    * Removes changes to the current matrix and clip since SkCanvas state was
    * last saved. The state is removed from the stack.
    * Does nothing if the stack is empty.
    */
  def restore(): Unit = js.native
  
  /**
    * Restores state to a previous stack value.
    * @param saveCount
    */
  def restoreToCount(saveCount: Double): Unit = js.native
  
  /**
    * Rotates the current matrix by the number of degrees.
    * @param rot - angle of rotation in degrees.
    * @param rx
    * @param ry
    */
  def rotate(rot: AngleInDegrees, rx: Double, ry: Double): Unit = js.native
  
  /**
    * Saves the current matrix and clip and returns current height of the stack.
    */
  def save(): Double = js.native
  
  /**
    * Saves SkMatrix and clip, and allocates a SkBitmap for subsequent drawing.
    * Calling restore() discards changes to SkMatrix and clip, and draws the SkBitmap.
    * It returns the height of the stack.
    * See SkCanvas.h for more.
    * @param paint
    * @param bounds
    * @param backdrop
    * @param flags
    */
  def saveLayer(): Double = js.native
  def saveLayer(
    paint: js.UndefOr[scala.Nothing],
    bounds: js.UndefOr[InputRect],
    backdrop: js.UndefOr[scala.Nothing],
    flags: SaveLayerFlag
  ): Double = js.native
  def saveLayer(
    paint: js.UndefOr[scala.Nothing],
    bounds: js.UndefOr[InputRect],
    backdrop: Null,
    flags: SaveLayerFlag
  ): Double = js.native
  def saveLayer(paint: js.UndefOr[scala.Nothing], bounds: js.UndefOr[InputRect], backdrop: SkImageFilter): Double = js.native
  def saveLayer(
    paint: js.UndefOr[scala.Nothing],
    bounds: js.UndefOr[InputRect],
    backdrop: SkImageFilter,
    flags: SaveLayerFlag
  ): Double = js.native
  def saveLayer(
    paint: js.UndefOr[scala.Nothing],
    bounds: Null,
    backdrop: js.UndefOr[scala.Nothing],
    flags: SaveLayerFlag
  ): Double = js.native
  def saveLayer(paint: js.UndefOr[scala.Nothing], bounds: Null, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: js.UndefOr[scala.Nothing], bounds: Null, backdrop: SkImageFilter): Double = js.native
  def saveLayer(paint: js.UndefOr[scala.Nothing], bounds: Null, backdrop: SkImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: js.UndefOr[scala.Nothing], bounds: InputRect): Double = js.native
  def saveLayer(paint: SkPaint): Double = js.native
  def saveLayer(
    paint: SkPaint,
    bounds: js.UndefOr[InputRect],
    backdrop: js.UndefOr[scala.Nothing],
    flags: SaveLayerFlag
  ): Double = js.native
  def saveLayer(paint: SkPaint, bounds: js.UndefOr[InputRect], backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: SkPaint, bounds: js.UndefOr[InputRect], backdrop: SkImageFilter): Double = js.native
  def saveLayer(paint: SkPaint, bounds: js.UndefOr[InputRect], backdrop: SkImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: SkPaint, bounds: Null, backdrop: js.UndefOr[scala.Nothing], flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: SkPaint, bounds: Null, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: SkPaint, bounds: Null, backdrop: SkImageFilter): Double = js.native
  def saveLayer(paint: SkPaint, bounds: Null, backdrop: SkImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: SkPaint, bounds: InputRect): Double = js.native
  
  /**
    * Scales the current matrix by sx on the x-axis and sy on the y-axis.
    * @param sx
    * @param sy
    */
  def scale(sx: Double, sy: Double): Unit = js.native
  
  /**
    *  Skews SkMatrix by sx on the x-axis and sy on the y-axis. A positive value of sx
    *  skews the drawing right as y-axis values increase; a positive value of sy skews
    *  the drawing down as x-axis values increase.
    * @param sx
    * @param sy
    */
  def skew(sx: Double, sy: Double): Unit = js.native
  
  /**
    * Translates SkMatrix by dx along the x-axis and dy along the y-axis.
    * @param dx
    * @param dy
    */
  def translate(dx: Double, dy: Double): Unit = js.native
  
  def writePixels(pixels: js.Array[Double], srcWidth: Double, srcHeight: Double, destX: Double, destY: Double): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: ColorType
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Boolean = js.native
  /**
    * Writes the given rectangle of pixels to the provided coordinates. The source pixels
    * will be converted to the canvas's alphaType and colorType if they do not match.
    * @param pixels
    * @param srcWidth
    * @param srcHeight
    * @param destX
    * @param destY
    * @param alphaType - defaults to Unpremul
    * @param colorType - defaults to RGBA_8888
    * @param colorSpace - defaults to SRGB
    */
  def writePixels(pixels: Uint8Array, srcWidth: Double, srcHeight: Double, destX: Double, destY: Double): Boolean = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType
  ): Boolean = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: js.UndefOr[scala.Nothing],
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType
  ): Boolean = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: js.UndefOr[scala.Nothing],
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: ColorType
  ): Boolean = js.native
  def writePixels(
    pixels: Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Boolean = js.native
}

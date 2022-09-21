package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas
  extends StObject
     with EmbindObject[Canvas] {
  
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
  def clipPath(path: Path, op: ClipOp, doAntiAlias: Boolean): Unit = js.native
  
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
    * Draws arc using clip, Matrix, and Paint paint.
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
    paint: Paint
  ): Unit = js.native
  
  /**
    * Draws a set of sprites from atlas, using clip, Matrix, and optional Paint paint.
    * @param atlas - Image containing sprites
    * @param srcRects - Rect locations of sprites in atlas
    * @param dstXforms - RSXform mappings for sprites in atlas
    * @param paint
    * @param blendMode - BlendMode combining colors and sprites
    * @param colors - If provided, will be blended with sprite using blendMode.
    * @param sampling - Specifies sampling options. If null, bilinear is used.
    */
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Null,
    colors: Null,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Null,
    colors: Null,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Null,
    colors: Unit,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Null,
    colors: Unit,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Null,
    colors: ColorIntArray
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Null,
    colors: ColorIntArray,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Null,
    colors: ColorIntArray,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Unit,
    colors: Null,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Unit,
    colors: Null,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Unit,
    colors: Unit,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Unit,
    colors: Unit,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Unit,
    colors: ColorIntArray
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Unit,
    colors: ColorIntArray,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: Unit,
    colors: ColorIntArray,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode,
    colors: Null,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode,
    colors: Null,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode,
    colors: Unit,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode,
    colors: Unit,
    sampling: FilterOptions
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode,
    colors: ColorIntArray
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode,
    colors: ColorIntArray,
    sampling: CubicResampler
  ): Unit = js.native
  def drawAtlas(
    atlas: Image,
    srcRects: InputFlattenedRectangleArray,
    dstXforms: InputFlattenedRSXFormArray,
    paint: Paint,
    blendMode: BlendMode,
    colors: ColorIntArray,
    sampling: FilterOptions
  ): Unit = js.native
  
  /**
    * Draws a circle at (cx, cy) with the given radius.
    * @param cx
    * @param cy
    * @param radius
    * @param paint
    */
  def drawCircle(cx: Double, cy: Double, radius: Double, paint: Paint): Unit = js.native
  
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
  def drawColorInt(color: ColorInt): Unit = js.native
  def drawColorInt(color: ColorInt, blendMode: BlendMode): Unit = js.native
  
  /**
    * Draws RRect outer and inner using clip, Matrix, and Paint paint.
    * outer must contain inner or the drawing is undefined.
    * @param outer
    * @param inner
    * @param paint
    */
  def drawDRRect(outer: InputRRect, inner: InputRRect, paint: Paint): Unit = js.native
  
  /**
    * Draws a run of glyphs, at corresponding positions, in a given font.
    * @param glyphs the array of glyph IDs (Uint16TypedArray)
    * @param positions the array of x,y floats to position each glyph
    * @param x x-coordinate of the origin of the entire run
    * @param y y-coordinate of the origin of the entire run
    * @param font the font that contains the glyphs
    * @param paint
    */
  def drawGlyphs(
    glyphs: InputGlyphIDArray,
    positions: InputFlattenedPointArray,
    x: Double,
    y: Double,
    font: Font,
    paint: Paint
  ): Unit = js.native
  
  /**
    * Draws the given image with its top-left corner at (left, top) using the current clip,
    * the current matrix, and optionally-provided paint.
    * @param img
    * @param left
    * @param top
    * @param paint
    */
  def drawImage(img: Image, left: Double, top: Double): Unit = js.native
  def drawImage(img: Image, left: Double, top: Double, paint: Paint): Unit = js.native
  
  /**
    * Draws the given image with its top-left corner at (left, top) using the current clip,
    * the current matrix. It will use the cubic sampling options B and C if necessary.
    * @param img
    * @param left
    * @param top
    * @param B - See CubicResampler in SkSamplingOptions.h for more information
    * @param C - See CubicResampler in SkSamplingOptions.h for more information
    * @param paint
    */
  def drawImageCubic(img: Image, left: Double, top: Double, B: Double, C: Double): Unit = js.native
  def drawImageCubic(img: Image, left: Double, top: Double, B: Double, C: Double, paint: Paint): Unit = js.native
  
  /**
    *  Draws the provided image stretched proportionally to fit into dst rectangle.
    *  The center rectangle divides the image into nine sections: four sides, four corners, and
    *  the center.
    * @param img
    * @param center
    * @param dest
    * @param filter - what technique to use when sampling the image
    * @param paint
    */
  def drawImageNine(img: Image, center: InputIRect, dest: InputRect, filter: FilterMode): Unit = js.native
  def drawImageNine(img: Image, center: InputIRect, dest: InputRect, filter: FilterMode, paint: Paint): Unit = js.native
  
  /**
    * Draws the given image with its top-left corner at (left, top) using the current clip,
    * the current matrix. It will use the provided sampling options if necessary.
    * @param img
    * @param left
    * @param top
    * @param fm - The filter mode.
    * @param mm - The mipmap mode. Note: for settings other than None, the image must have mipmaps
    *             calculated with makeCopyWithDefaultMipmaps;
    * @param paint
    */
  def drawImageOptions(img: Image, left: Double, top: Double, fm: FilterMode, mm: MipmapMode): Unit = js.native
  def drawImageOptions(img: Image, left: Double, top: Double, fm: FilterMode, mm: MipmapMode, paint: Paint): Unit = js.native
  
  /**
    * Draws sub-rectangle src from provided image, scaled and translated to fill dst rectangle.
    * @param img
    * @param src
    * @param dest
    * @param paint
    * @param fastSample - if false, will filter strictly within src.
    */
  def drawImageRect(img: Image, src: InputRect, dest: InputRect, paint: Paint): Unit = js.native
  def drawImageRect(img: Image, src: InputRect, dest: InputRect, paint: Paint, fastSample: Boolean): Unit = js.native
  
  /**
    * Draws sub-rectangle src from provided image, scaled and translated to fill dst rectangle.
    * It will use the cubic sampling options B and C if necessary.
    * @param img
    * @param src
    * @param dest
    * @param B - See CubicResampler in SkSamplingOptions.h for more information
    * @param C - See CubicResampler in SkSamplingOptions.h for more information
    * @param paint
    */
  def drawImageRectCubic(img: Image, src: InputRect, dest: InputRect, B: Double, C: Double): Unit = js.native
  def drawImageRectCubic(img: Image, src: InputRect, dest: InputRect, B: Double, C: Double, paint: Paint): Unit = js.native
  
  /**
    * Draws sub-rectangle src from provided image, scaled and translated to fill dst rectangle.
    * It will use the provided sampling options if necessary.
    * @param img
    * @param src
    * @param dest
    * @param fm - The filter mode.
    * @param mm - The mipmap mode. Note: for settings other than None, the image must have mipmaps
    *             calculated with makeCopyWithDefaultMipmaps;
    * @param paint
    */
  def drawImageRectOptions(img: Image, src: InputRect, dest: InputRect, fm: FilterMode, mm: MipmapMode): Unit = js.native
  def drawImageRectOptions(img: Image, src: InputRect, dest: InputRect, fm: FilterMode, mm: MipmapMode, paint: Paint): Unit = js.native
  
  /**
    * Draws line segment from (x0, y0) to (x1, y1) using the current clip, current matrix,
    * and the provided paint.
    * @param x0
    * @param y0
    * @param x1
    * @param y1
    * @param paint
    */
  def drawLine(x0: Double, y0: Double, x1: Double, y1: Double, paint: Paint): Unit = js.native
  
  /**
    * Draws an oval bounded by the given rectangle using the current clip, current matrix,
    * and the provided paint.
    * @param oval
    * @param paint
    */
  def drawOval(oval: InputRect, paint: Paint): Unit = js.native
  
  /**
    * Fills clip with the given paint.
    * @param paint
    */
  def drawPaint(paint: Paint): Unit = js.native
  
  /**
    * Draws the given Paragraph at the provided coordinates.
    * Requires the Paragraph code to be compiled in.
    * @param p
    * @param x
    * @param y
    */
  def drawParagraph(p: Paragraph, x: Double, y: Double): Unit = js.native
  
  /**
    * Draws a cubic patch defined by 12 control points [top, right, bottom, left] with optional
    * colors and shader-coordinates [4] specifed for each corner [top-left, top-right, bottom-right, bottom-left]
    * @param cubics 12 points : 4 connected cubics specifying the boundary of the patch
    * @param colors optional colors interpolated across the patch
    * @param texs optional shader coordinates interpolated across the patch
    * @param mode Specifies how shader and colors blend (if both are specified)
    * @param paint
    */
  def drawPatch(
    cubics: InputFlattenedPointArray,
    colors: js.UndefOr[ColorIntArray | js.Array[js.typedarray.Float32Array] | Null],
    texs: js.UndefOr[InputFlattenedPointArray | Null],
    mode: js.UndefOr[BlendMode | Null],
    paint: js.UndefOr[Paint]
  ): Unit = js.native
  
  /**
    * Draws the given path using the current clip, current matrix, and the provided paint.
    * @param path
    * @param paint
    */
  def drawPath(path: Path, paint: Paint): Unit = js.native
  
  /**
    * Draws the given picture using the current clip, current matrix, and the provided paint.
    * @param skp
    */
  def drawPicture(skp: SkPicture): Unit = js.native
  
  /**
    * Draws the given points using the current clip, current matrix, and the provided paint.
    *
    * See Canvas.h for more on the mode and its interaction with paint.
    * @param mode
    * @param points
    * @param paint
    */
  def drawPoints(mode: PointMode, points: InputFlattenedPointArray, paint: Paint): Unit = js.native
  
  /**
    * Draws the given rectangle with rounded corners using the current clip, current matrix,
    * and the provided paint.
    * @param rrect
    * @param paint
    */
  def drawRRect(rrect: InputRRect, paint: Paint): Unit = js.native
  
  /**
    * Draws the given rectangle using the current clip, current matrix, and the provided paint.
    * @param rect
    * @param paint
    */
  def drawRect(rect: InputRect, paint: Paint): Unit = js.native
  
  /**
    * Draws the given rectangle using the current clip, current matrix, and the provided paint.
    * @param left
    * @param top
    * @param right
    * @param bottom
    * @param paint
    */
  def drawRect4f(left: Double, top: Double, right: Double, bottom: Double, paint: Paint): Unit = js.native
  
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
    path: Path,
    zPlaneParams: InputVector3,
    lightPos: InputVector3,
    lightRadius: Double,
    ambientColor: InputColor,
    spotColor: InputColor,
    flags: Double
  ): Unit = js.native
  
  /**
    * Draw the given text at the location (x, y) using the provided paint and font. The text will
    * be drawn as is; no shaping, left-to-right, etc.
    * @param str
    * @param x
    * @param y
    * @param paint
    * @param font
    */
  def drawText(str: String, x: Double, y: Double, paint: Paint, font: Font): Unit = js.native
  
  /**
    * Draws the given TextBlob at (x, y) using the current clip, current matrix, and the
    * provided paint. Reminder that the fonts used to draw TextBlob are part of the blob.
    * @param blob
    * @param x
    * @param y
    * @param paint
    */
  def drawTextBlob(blob: TextBlob, x: Double, y: Double, paint: Paint): Unit = js.native
  
  /**
    * Draws the given vertices (a triangle mesh) using the current clip, current matrix, and the
    * provided paint.
    *  If paint contains an Shader and vertices does not contain texCoords, the shader
    *  is mapped using the vertices' positions.
    *  If vertices colors are defined in vertices, and Paint paint contains Shader,
    *  BlendMode mode combines vertices colors with Shader.
    * @param verts
    * @param mode
    * @param paint
    */
  def drawVertices(verts: Vertices, mode: BlendMode, paint: Paint): Unit = js.native
  
  /**
    * Returns the bounds of clip, unaffected by the canvas's matrix.
    * If the clip is empty, all four integers in the returned rectangle will equal zero.
    *
    * @param output - if provided, the results will be copied into the given array instead of
    *      allocating a new one.
    */
  def getDeviceClipBounds(): js.typedarray.Int32Array = js.native
  def getDeviceClipBounds(output: js.typedarray.Int32Array): js.typedarray.Int32Array = js.native
  
  /**
    * Returns the current transform from local coordinates to the 'device', which for most
    * purposes means pixels.
    */
  def getLocalToDevice(): js.typedarray.Float32Array = js.native
  
  /**
    * Returns the number of saved states, each containing: Matrix and clip.
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
    * Creates Surface matching info and props, and associates it with Canvas.
    * Returns null if no match found.
    * @param info
    */
  def makeSurface(info: ImageInfo): Surface | Null = js.native
  
  /**
    * Returns a TypedArray containing the pixels reading starting at (srcX, srcY) and does not
    * exceed the size indicated by imageInfo. See SkCanvas.h for more on the caveats.
    *
    * If dest is not provided, we allocate memory equal to the provided height * the provided
    * bytesPerRow to fill the data with.
    *
    * This is generally a very expensive call for the GPU backend.
    *
    * @param srcX
    * @param srcY
    * @param imageInfo - describes the destination format of the pixels.
    * @param dest - If provided, the pixels will be copied into the allocated buffer allowing
    *        access to the pixels without allocating a new TypedArray.
    * @param bytesPerRow - number of bytes per row. Must be provided if dest is set. This
    *        depends on destination ColorType. For example, it must be at least 4 * width for
    *        the 8888 color type.
    * @returns a TypedArray appropriate for the specified ColorType. Note that 16 bit floats are
    *          not supported in JS, so that colorType corresponds to raw bytes Uint8Array.
    */
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo, dest: Unit, bytesPerRow: Double): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo, dest: MallocObj): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  def readPixels(srcX: Double, srcY: Double, imageInfo: ImageInfo, dest: MallocObj, bytesPerRow: Double): js.typedarray.Float32Array | js.typedarray.Uint8Array | Null = js.native
  
  /**
    * Removes changes to the current matrix and clip since Canvas state was
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
    * Saves Matrix and clip, and allocates a SkBitmap for subsequent drawing.
    * Calling restore() discards changes to Matrix and clip, and draws the SkBitmap.
    * It returns the height of the stack.
    * See Canvas.h for more.
    * @param paint
    * @param bounds
    * @param backdrop
    * @param flags
    */
  def saveLayer(): Double = js.native
  def saveLayer(paint: Unit, bounds: Null, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: Null, backdrop: Unit, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: Null, backdrop: ImageFilter): Double = js.native
  def saveLayer(paint: Unit, bounds: Null, backdrop: ImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: Unit, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: Unit, backdrop: Unit, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: Unit, backdrop: ImageFilter): Double = js.native
  def saveLayer(paint: Unit, bounds: Unit, backdrop: ImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: InputRect): Double = js.native
  def saveLayer(paint: Unit, bounds: InputRect, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: InputRect, backdrop: Unit, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Unit, bounds: InputRect, backdrop: ImageFilter): Double = js.native
  def saveLayer(paint: Unit, bounds: InputRect, backdrop: ImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint): Double = js.native
  def saveLayer(paint: Paint, bounds: Null, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: Null, backdrop: Unit, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: Null, backdrop: ImageFilter): Double = js.native
  def saveLayer(paint: Paint, bounds: Null, backdrop: ImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: Unit, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: Unit, backdrop: Unit, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: Unit, backdrop: ImageFilter): Double = js.native
  def saveLayer(paint: Paint, bounds: Unit, backdrop: ImageFilter, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: InputRect): Double = js.native
  def saveLayer(paint: Paint, bounds: InputRect, backdrop: Null, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: InputRect, backdrop: Unit, flags: SaveLayerFlag): Double = js.native
  def saveLayer(paint: Paint, bounds: InputRect, backdrop: ImageFilter): Double = js.native
  def saveLayer(paint: Paint, bounds: InputRect, backdrop: ImageFilter, flags: SaveLayerFlag): Double = js.native
  
  /**
    * Scales the current matrix by sx on the x-axis and sy on the y-axis.
    * @param sx
    * @param sy
    */
  def scale(sx: Double, sy: Double): Unit = js.native
  
  /**
    *  Skews Matrix by sx on the x-axis and sy on the y-axis. A positive value of sx
    *  skews the drawing right as y-axis values increase; a positive value of sy skews
    *  the drawing down as x-axis values increase.
    * @param sx
    * @param sy
    */
  def skew(sx: Double, sy: Double): Unit = js.native
  
  /**
    * Translates Matrix by dx along the x-axis and dy along the y-axis.
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
    alphaType: Unit,
    colorType: Unit,
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: Unit,
    colorType: ColorType
  ): Boolean = js.native
  def writePixels(
    pixels: js.Array[Double],
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: Unit,
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
    colorType: Unit,
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
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double
  ): Boolean = js.native
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: Unit,
    colorType: Unit,
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: Unit,
    colorType: ColorType
  ): Boolean = js.native
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: Unit,
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType
  ): Boolean = js.native
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: Unit,
    colorSpace: ColorSpace
  ): Boolean = js.native
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: ColorType
  ): Boolean = js.native
  def writePixels(
    pixels: js.typedarray.Uint8Array,
    srcWidth: Double,
    srcHeight: Double,
    destX: Double,
    destY: Double,
    alphaType: AlphaType,
    colorType: ColorType,
    colorSpace: ColorSpace
  ): Boolean = js.native
}

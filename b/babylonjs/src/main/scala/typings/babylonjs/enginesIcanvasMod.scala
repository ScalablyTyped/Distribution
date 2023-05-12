package typings.babylonjs

import typings.std.Event
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesIcanvasMod {
  
  @js.native
  trait ICanvas extends StObject {
    
    /**
      * returns a drawing context on the canvas.
      * @param contextType context identifier.
      * @param contextAttributes context attributes.
      * @returns ICanvasRenderingContext object.
      */
    def getContext(contextType: String): ICanvasRenderingContext = js.native
    def getContext(contextType: String, contextAttributes: Any): ICanvasRenderingContext = js.native
    
    /**
      * Canvas height.
      */
    var height: Double = js.native
    
    /**
      * returns a data URI containing a representation of the image in the format specified by the type parameter.
      * @param mime the image format.
      * @returns string containing the requested data URI.
      */
    def toDataURL(mime: String): String = js.native
    
    /**
      * Canvas width.
      */
    var width: Double = js.native
  }
  
  trait ICanvasGradient extends StObject {
    
    /**
      * adds a new color stop, defined by an offset and a color, to a given canvas gradient.
      * @param offset A number between 0 and 1, inclusive, representing the position of the color stop. 0 represents the start of the gradient and 1 represents the end.
      * @param color value representing the color of the stop.
      */
    def addColorStop(offset: Double, color: String): Unit
  }
  object ICanvasGradient {
    
    inline def apply(addColorStop: (Double, String) => Unit): ICanvasGradient = {
      val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
      __obj.asInstanceOf[ICanvasGradient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanvasGradient] (val x: Self) extends AnyVal {
      
      inline def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ICanvasRenderingContext extends StObject {
    
    /**
      * Adds a circular arc to the current path.
      * @param x The horizontal coordinate of the arc's center.
      * @param y The vertical coordinate of the arc's center.
      * @param radius The arc's radius. Must be positive.
      * @param startAngle The angle at which the arc starts in radians, measured from the positive x-axis.
      * @param endAngle The angle at which the arc ends in radians, measured from the positive x-axis.
      * @param anticlockwise An optional Boolean. If true, draws the arc counter-clockwise between the start and end angles. The default is false (clockwise).
      */
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    /**
      * Starts a new path by emptying the list of sub-paths. Call this method when you want to create a new path.
      */
    def beginPath(): Unit = js.native
    
    /**
      * canvas is a read-only reference to ICanvas.
      */
    val canvas: ICanvas = js.native
    
    /**
      * Sets all pixels in the rectangle defined by starting point (x, y) and size (width, height) to transparent black, erasing any previously drawn content.
      * @param x The x-axis coordinate of the rectangle's starting point.
      * @param y The y-axis coordinate of the rectangle's starting point.
      * @param width The rectangle's width. Positive values are to the right, and negative to the left.
      * @param height The rectangle's height. Positive values are down, and negative are up.
      */
    def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Creates a clipping path from the current sub-paths. Everything drawn after clip() is called appears inside the clipping path only.
      */
    def clip(): Unit = js.native
    
    /**
      * Causes the point of the pen to move back to the start of the current sub-path. It tries to draw a straight line from the current point to the start.
      * If the shape has already been closed or has only one point, this function does nothing.
      */
    def closePath(): Unit = js.native
    
    /**
      * Creates a linear gradient along the line given by the coordinates represented by the parameters.
      * @param x0 The x-axis coordinate of the start point.
      * @param y0 The y-axis coordinate of the start point.
      * @param x1 The x-axis coordinate of the end point.
      * @param y1 The y-axis coordinate of the end point.
      * @returns ICanvasGradient A linear ICanvasGradient initialized with the specified line.
      */
    def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): ICanvasGradient = js.native
    
    /**
      * Creates a linear gradient along the line given by the coordinates represented by the parameters.
      * @param x0 The x-axis coordinate of the start circle.
      * @param y0 The y-axis coordinate of the start circle.
      * @param r0 The radius of the start circle. Must be non-negative and finite.
      * @param x1 The x-axis coordinate of the end point.
      * @param y1 The y-axis coordinate of the end point.
      * @param r1 The radius of the end circle. Must be non-negative and finite.
      * @returns ICanvasGradient A linear ICanvasGradient initialized with the two specified circles.
      */
    def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): ICanvasGradient = js.native
    
    /**
      * Draws the specified image. This method is available in multiple formats, providing a great deal of flexibility in its use.
      * @param image An element to draw into the context.
      * @param dx The x-axis coordinate in the destination canvas at which to place the top-left corner of the source image.
      * @param dy The y-axis coordinate in the destination canvas at which to place the top-left corner of the source image.
      */
    def drawImage(image: Any, dx: Double, dy: Double): Unit = js.native
    /**
      * Draws the specified image. This method is available in multiple formats, providing a great deal of flexibility in its use.
      * @param image An element to draw into the context.
      * @param dx The x-axis coordinate in the destination canvas at which to place the top-left corner of the source image.
      * @param dy The y-axis coordinate in the destination canvas at which to place the top-left corner of the source image.
      * @param dWidth The width to draw the image in the destination canvas. This allows scaling of the drawn image. If not specified, the image is not scaled in width when drawn.
      * @param dHeight The height to draw the image in the destination canvas. This allows scaling of the drawn image. If not specified, the image is not scaled in height when drawn.
      */
    def drawImage(image: Any, dx: Double, dy: Double, dWidth: Double, dHeight: Double): Unit = js.native
    /**
      * Draws the specified image. This method is available in multiple formats, providing a great deal of flexibility in its use.
      * @param image An element to draw into the context.
      * @param sx The x-axis coordinate of the top left corner of the sub-rectangle of the source image to draw into the destination context.
      * @param sy The y-axis coordinate of the top left corner of the sub-rectangle of the source image to draw into the destination context.
      * @param sWidth The width of the sub-rectangle of the source image to draw into the destination context. If not specified, the entire rectangle from the coordinates specified by sx and sy to the bottom-right corner of the image is used.
      * @param sHeight The height of the sub-rectangle of the source image to draw into the destination context.
      * @param dx The x-axis coordinate in the destination canvas at which to place the top-left corner of the source image.
      * @param dy The y-axis coordinate in the destination canvas at which to place the top-left corner of the source image.
      * @param dWidth The width to draw the image in the destination canvas. This allows scaling of the drawn image. If not specified, the image is not scaled in width when drawn.
      * @param dHeight The height to draw the image in the destination canvas. This allows scaling of the drawn image. If not specified, the image is not scaled in height when drawn.
      */
    def drawImage(
      image: Any,
      sx: Double,
      sy: Double,
      sWidth: Double,
      sHeight: Double,
      dx: Double,
      dy: Double,
      dWidth: Double,
      dHeight: Double
    ): Unit = js.native
    
    /**
      * Fills the current sub-paths with the current fill style.
      */
    def fill(): Unit = js.native
    
    /**
      * Draws a filled rectangle at (x, y) position whose size is determined by width and height.
      * @param x The x-axis coordinate of the rectangle's starting point.
      * @param y The y-axis coordinate of the rectangle's starting point.
      * @param width The rectangle's width. Positive values are to the right, and negative to the left.
      * @param height The rectangle's height. Positive values are down, and negative are up.
      */
    def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Color or style to use inside shapes. Default #000 (black).
      */
    var fillStyle: String | ICanvasGradient = js.native
    
    /**
      * Draws (fills) a given text at the given (x, y) position.
      * @param text A String specifying the text string to render into the context. The text is rendered using the settings specified by font, textAlign, textBaseline, and direction.
      * @param x The x-axis coordinate of the point at which to begin drawing the text, in pixels.
      * @param y The y-axis coordinate of the baseline on which to begin drawing the text, in pixels.
      * @param maxWidth The maximum number of pixels wide the text may be once rendered. If not specified, there is no limit to the width of the text.
      */
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    /**
      * Font setting. Default value 10px sans-serif.
      */
    var font: String = js.native
    
    /**
      * Returns an ImageData object representing the underlying pixel data for the area of the canvas denoted by the rectangle which starts at (sx, sy) and has an sw width and sh height.
      * @param sx The x-axis coordinate of the top-left corner of the rectangle from which the ImageData will be extracted.
      * @param sy The y-axis coordinate of the top-left corner of the rectangle from which the ImageData will be extracted.
      * @param sw The width of the rectangle from which the ImageData will be extracted. Positive values are to the right, and negative to the left.
      * @param sh The height of the rectangle from which the ImageData will be extracted. Positive values are down, and negative are up.
      * @returns ImageData An ImageData object containing the image data for the rectangle of the canvas specified.
      */
    def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native
    
    /**
      * Alpha value that is applied to shapes and images before they are composited onto the canvas. Default 1.0 (opaque).
      */
    var globalAlpha: Double = js.native
    
    /**
      * Defines the type of corners where two lines meet. Possible values: round, bevel, miter (default).
      */
    var lineJoin: String = js.native
    
    /**
      * Connects the last point in the current sub-path to the specified (x, y) coordinates with a straight line.
      * @param x The x-axis coordinate of the line's end point.
      * @param y The y-axis coordinate of the line's end point.
      */
    def lineTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Width of lines. Default 1.0.
      */
    var lineWidth: Double = js.native
    
    /**
      * Returns a TextMetrics object.
      * @param text The text String to measure.
      * @returns ITextMetrics A ITextMetrics object.
      */
    def measureText(text: String): ITextMetrics = js.native
    
    /**
      * Miter limit ratio. Default 10.
      */
    var miterLimit: Double = js.native
    
    /**
      * Moves the starting point of a new sub-path to the (x, y) coordinates.
      * @param x The x-axis (horizontal) coordinate of the point.
      * @param y The y-axis (vertical) coordinate of the point.
      */
    def moveTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Paints data from the given ImageData object onto the bitmap. If a dirty rectangle is provided, only the pixels from that rectangle are painted.
      * @param imageData An ImageData object containing the array of pixel values.
      * @param dx Horizontal position (x coordinate) at which to place the image data in the destination canvas.
      * @param dy Vertical position (y coordinate) at which to place the image data in the destination canvas.
      */
    def putImageData(imageData: ImageData, dx: Double, dy: Double): Unit = js.native
    
    /**
      * Adds a quadratic Bézier curve to the current path.
      * @param cpx The x-axis coordinate of the control point.
      * @param cpy The y-axis coordinate of the control point.
      * @param x The x-axis coordinate of the end point.
      * @param y The y-axis coordinate of the end point.
      */
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
    
    /**
      * Creates a path for a rectangle at position (x, y) with a size that is determined by width and height.
      * @param x The x-axis coordinate of the rectangle's starting point.
      * @param y The y-axis coordinate of the rectangle's starting point.
      * @param width The rectangle's width. Positive values are to the right, and negative to the left.
      * @param height The rectangle's height. Positive values are down, and negative are up.
      */
    def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Restores the drawing style state to the last element on the 'state stack' saved by save().
      */
    def restore(): Unit = js.native
    
    /**
      * Adds a rotation to the transformation matrix. The angle argument represents a clockwise rotation angle and is expressed in radians.
      * @param angle The rotation angle, clockwise in radians. You can use degree * Math.PI / 180 to calculate a radian from a degree.
      */
    def rotate(angle: Double): Unit = js.native
    
    /**
      * Saves the current drawing style state using a stack so you can revert any change you make to it using restore().
      */
    def save(): Unit = js.native
    
    /**
      * Adds a scaling transformation to the canvas units by x horizontally and by y vertically.
      * @param x Scaling factor in the horizontal direction. A negative value flips pixels across the vertical axis. A value of 1 results in no horizontal scaling.
      * @param y Scaling factor in the vertical direction. A negative value flips pixels across the horizontal axis. A value of 1 results in no vertical scaling.
      */
    def scale(x: Double, y: Double): Unit = js.native
    
    /**
      * Sets the current line dash pattern.
      * @param segments An Array of numbers that specify distances to alternately draw a line and a gap (in coordinate space units).
      */
    def setLineDash(segments: js.Array[Double]): Unit = js.native
    
    /**
      * Resets the current transform to matrix composed with a, b, c, d, e, f.
      * @param a Horizontal scaling. A value of 1 results in no scaling.
      * @param b Vertical skewing.
      * @param c Horizontal skewing.
      * @param d Vertical scaling. A value of 1 results in no scaling.
      * @param e Horizontal translation (moving).
      * @param f Vertical translation (moving).
      */
    def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * Specifies the blurring effect. Default: 0.
      */
    var shadowBlur: Double = js.native
    
    /**
      * Color of the shadow. Default: fully-transparent black.
      */
    var shadowColor: String = js.native
    
    /**
      * Horizontal distance the shadow will be offset. Default: 0.
      */
    var shadowOffsetX: Double = js.native
    
    /**
      * Vertical distance the shadow will be offset. Default: 0.
      */
    var shadowOffsetY: Double = js.native
    
    /**
      * Strokes the current sub-paths with the current stroke style.
      */
    def stroke(): Unit = js.native
    
    /**
      * Paints a rectangle which has a starting point at (x, y) and has a w width and an h height onto the canvas, using the current stroke style.
      * @param x The x-axis coordinate of the rectangle's starting point.
      * @param y The y-axis coordinate of the rectangle's starting point.
      * @param width The rectangle's width. Positive values are to the right, and negative to the left.
      * @param height The rectangle's height. Positive values are down, and negative are up.
      */
    def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Color or style to use for the lines around shapes. Default #000 (black).
      */
    var strokeStyle: String | ICanvasGradient = js.native
    
    /**
      * Draws (strokes) a given text at the given (x, y) position.
      * @param text A String specifying the text string to render into the context. The text is rendered using the settings specified by font, textAlign, textBaseline, and direction.
      * @param x The x-axis coordinate of the point at which to begin drawing the text, in pixels.
      * @param y The y-axis coordinate of the baseline on which to begin drawing the text, in pixels.
      * @param maxWidth The maximum number of pixels wide the text may be once rendered. If not specified, there is no limit to the width of the text.
      */
    def strokeText(text: String, x: Double, y: Double): Unit = js.native
    def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    /**
      * Adds a translation transformation by moving the canvas and its origin x horizontally and y vertically on the grid.
      * @param x Distance to move in the horizontal direction. Positive values are to the right, and negative to the left.
      * @param y Distance to move in the vertical direction. Positive values are down, and negative are up.
      */
    def translate(x: Double, y: Double): Unit = js.native
  }
  
  trait IImage extends StObject {
    
    /**
      * provides support for CORS, defining how the element handles crossorigin requests,
      * thereby enabling the configuration of the CORS requests for the element's fetched data.
      */
    var crossOrigin: String | Null
    
    /**
      * Image height.
      */
    val height: Double
    
    /**
      * The original height of the image resource before sizing.
      */
    val naturalHeight: Double
    
    /**
      * The original width of the image resource before sizing.
      */
    val naturalWidth: Double
    
    /**
      * Error callback.
      */
    var onerror: (js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]) | Null
    
    /**
      * onload callback.
      */
    var onload: (js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]) | Null
    
    /**
      * provides support for referrer policy on xhr load request,
      * it is used to control the request header.
      */
    var referrerPolicy: String
    
    /**
      * Image source.
      */
    var src: String
    
    /**
      * Image width.
      */
    val width: Double
  }
  object IImage {
    
    inline def apply(
      height: Double,
      naturalHeight: Double,
      naturalWidth: Double,
      referrerPolicy: String,
      src: String,
      width: Double
    ): IImage = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], crossOrigin = null, onerror = null, onload = null)
      __obj.asInstanceOf[IImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImage] (val x: Self) extends AnyVal {
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      inline def setOnerror(value: js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnerrorNull: Self = StObject.set(x, "onerror", null)
      
      inline def setOnload(value: js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      inline def setOnloadNull: Self = StObject.set(x, "onload", null)
      
      inline def setReferrerPolicy(value: String): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITextMetrics extends StObject {
    
    /**
      * distance (in pixels) parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign
      * property to the left side of the bounding rectangle of the given text
      */
    val actualBoundingBoxLeft: Double
    
    /**
      * distance (in pixels) parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign
      * property to the right side of the bounding rectangle of the given text
      */
    val actualBoundingBoxRight: Double
    
    /**
      * Text width.
      */
    val width: Double
  }
  object ITextMetrics {
    
    inline def apply(actualBoundingBoxLeft: Double, actualBoundingBoxRight: Double, width: Double): ITextMetrics = {
      val __obj = js.Dynamic.literal(actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextMetrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITextMetrics] (val x: Self) extends AnyVal {
      
      inline def setActualBoundingBoxLeft(value: Double): Self = StObject.set(x, "actualBoundingBoxLeft", value.asInstanceOf[js.Any])
      
      inline def setActualBoundingBoxRight(value: Double): Self = StObject.set(x, "actualBoundingBoxRight", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

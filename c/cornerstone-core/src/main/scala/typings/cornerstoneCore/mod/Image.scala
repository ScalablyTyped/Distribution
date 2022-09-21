package typings.cornerstoneCore.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /** Cached Lookup Table for this image. */
  var cachedLut: LUT
  
  /** true if pixel data is RGB, false if grayscale */
  var color: Boolean
  
  /**
    * @deprecated Use viewport.colormap instead.
    *
    * an optional colormap ID or colormap object (from colors/colormap.js). This will be applied during rendering to convert the image to pseudocolor
    */
  var colormap: js.UndefOr[Any] = js.undefined
  
  /** horizontal distance between the middle of each pixel (or width of each pixel) in mm or undefined if not known */
  var columnPixelSpacing: Double
  
  /** number of columns in the image. This is the same as width but duplicated for convenience */
  var columns: Double
  
  /** Whether or not the image has undergone false color mapping */
  var falseColor: js.UndefOr[Boolean] = js.undefined
  
  /** a function that returns a canvas element with the image loaded into it. This is only needed for color images. */
  def getCanvas(): HTMLCanvasElement
  
  /** a function that returns a JavaScript Image object with the image data. This is optional and typically used for images encoded in standard web JPEG and PNG formats */
  def getImage(): HTMLImageElement
  
  /** a function that returns a canvas imageData object for the image. This is only needed for color images */
  def getImageData(): ImageData
  
  /** a function that returns the underlying pixel data. An array of integers for grayscale and an array of RGBA for color */
  def getPixelData(): js.Array[Double]
  
  /** the height of the image. This is the same as rows but duplicated for convenience */
  var height: Double
  
  /** The imageId associated with this image object */
  var imageId: String
  
  /** the rescale intercept used to convert stored pixel values to modality values or 0 if not specified */
  var intercept: Double
  
  /**
    * true if the the image should initially be displayed be inverted, false if not.
    * This is here mainly to support DICOM images with a photometric interpretation of MONOCHROME1
    */
  var invert: Boolean
  
  /** whether or not to render this image as a label map (i.e. skip modality and VOI LUT pipelines and use only a color lookup table) */
  var labelmap: js.UndefOr[Boolean] = js.undefined
  
  /** The Lookup Table */
  var lut: LUT
  
  /** the maximum stored pixel value in the image */
  var maxPixelValue: Double
  
  /** the minimum stored pixel value in the image */
  var minPixelValue: Double
  
  /** Original pixel data for an image after it has undergone false color mapping */
  var origPixelData: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Is the color pixel data stored in RGBA? */
  var rgba: Boolean
  
  /** vertical distance between the middle of each pixel (or height of each pixel) in mm or undefined if not known */
  var rowPixelSpacing: Double
  
  /** number of rows in the image. This is the same as height but duplicated for convenience */
  var rows: Double
  
  /** the number of bytes used to store the pixels for this image. */
  var sizeInBytes: Double
  
  /** the rescale slope to convert stored pixel values to modality pixel values or 1 if not specified */
  var slope: Double
  
  /** Statistics for the last redraw of the image */
  var stats: js.UndefOr[ImageStats] = js.undefined
  
  /** the width of the image. This is the same as columns but duplicated for convenience */
  var width: Double
  
  /** the default windowCenter to apply to the image */
  var windowCenter: Double
  
  /** the default windowWidth to apply to the image */
  var windowWidth: Double
}
object Image {
  
  inline def apply(
    cachedLut: LUT,
    color: Boolean,
    columnPixelSpacing: Double,
    columns: Double,
    getCanvas: () => HTMLCanvasElement,
    getImage: () => HTMLImageElement,
    getImageData: () => ImageData,
    getPixelData: () => js.Array[Double],
    height: Double,
    imageId: String,
    intercept: Double,
    invert: Boolean,
    lut: LUT,
    maxPixelValue: Double,
    minPixelValue: Double,
    rgba: Boolean,
    rowPixelSpacing: Double,
    rows: Double,
    sizeInBytes: Double,
    slope: Double,
    width: Double,
    windowCenter: Double,
    windowWidth: Double
  ): Image = {
    val __obj = js.Dynamic.literal(cachedLut = cachedLut.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], columnPixelSpacing = columnPixelSpacing.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], getCanvas = js.Any.fromFunction0(getCanvas), getImage = js.Any.fromFunction0(getImage), getImageData = js.Any.fromFunction0(getImageData), getPixelData = js.Any.fromFunction0(getPixelData), height = height.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], intercept = intercept.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], lut = lut.asInstanceOf[js.Any], maxPixelValue = maxPixelValue.asInstanceOf[js.Any], minPixelValue = minPixelValue.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any], rowPixelSpacing = rowPixelSpacing.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any], slope = slope.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], windowCenter = windowCenter.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setCachedLut(value: LUT): Self = StObject.set(x, "cachedLut", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColormap(value: Any): Self = StObject.set(x, "colormap", value.asInstanceOf[js.Any])
    
    inline def setColormapUndefined: Self = StObject.set(x, "colormap", js.undefined)
    
    inline def setColumnPixelSpacing(value: Double): Self = StObject.set(x, "columnPixelSpacing", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setFalseColor(value: Boolean): Self = StObject.set(x, "falseColor", value.asInstanceOf[js.Any])
    
    inline def setFalseColorUndefined: Self = StObject.set(x, "falseColor", js.undefined)
    
    inline def setGetCanvas(value: () => HTMLCanvasElement): Self = StObject.set(x, "getCanvas", js.Any.fromFunction0(value))
    
    inline def setGetImage(value: () => HTMLImageElement): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
    
    inline def setGetImageData(value: () => ImageData): Self = StObject.set(x, "getImageData", js.Any.fromFunction0(value))
    
    inline def setGetPixelData(value: () => js.Array[Double]): Self = StObject.set(x, "getPixelData", js.Any.fromFunction0(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setIntercept(value: Double): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setLabelmap(value: Boolean): Self = StObject.set(x, "labelmap", value.asInstanceOf[js.Any])
    
    inline def setLabelmapUndefined: Self = StObject.set(x, "labelmap", js.undefined)
    
    inline def setLut(value: LUT): Self = StObject.set(x, "lut", value.asInstanceOf[js.Any])
    
    inline def setMaxPixelValue(value: Double): Self = StObject.set(x, "maxPixelValue", value.asInstanceOf[js.Any])
    
    inline def setMinPixelValue(value: Double): Self = StObject.set(x, "minPixelValue", value.asInstanceOf[js.Any])
    
    inline def setOrigPixelData(value: js.Array[Double]): Self = StObject.set(x, "origPixelData", value.asInstanceOf[js.Any])
    
    inline def setOrigPixelDataUndefined: Self = StObject.set(x, "origPixelData", js.undefined)
    
    inline def setOrigPixelDataVarargs(value: Double*): Self = StObject.set(x, "origPixelData", js.Array(value*))
    
    inline def setRgba(value: Boolean): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    
    inline def setRowPixelSpacing(value: Double): Self = StObject.set(x, "rowPixelSpacing", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSlope(value: Double): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    inline def setStats(value: ImageStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWindowCenter(value: Double): Self = StObject.set(x, "windowCenter", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}

package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.Instantiable2
import typings.cornerstoneCore.anon.Opacity
import typings.cornerstoneCore.anon.Renderer
import typings.cornerstoneCore.anon.RequiredViewport
import typings.cornerstoneCore.mod.^
import typings.cornerstoneCore.mod.colors.LookupTable
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addColorLayer(layer: Any, invalidated: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColorLayer")(layer.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEnabledElement(enabledElement: EnabledElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEnabledElement")(enabledElement.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def addGrayscaleLayer(layer: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addGrayscaleLayer")(layer.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addGrayscaleLayer(layer: Any, invalidated: Boolean, useAlphaChannel: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addGrayscaleLayer")(layer.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any], useAlphaChannel.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addLabelMapLayer(layer: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLabelMapLayer")(layer.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addLayer(element: HTMLElement, image: Image): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addLayer")(element.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[String]
inline def addLayer(element: HTMLElement, image: Image, options: Opacity): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addLayer")(element.asInstanceOf[js.Any], image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def addPseudoColorLayer(layer: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPseudoColorLayer")(layer.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def canvasToPixel(element: HTMLElement, pt: CanvasCoordinate): PixelCoordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("canvasToPixel")(element.asInstanceOf[js.Any], pt.asInstanceOf[js.Any])).asInstanceOf[PixelCoordinate]

inline def convertImageToFalseColorImage(
  image: Instantiable2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], HTMLImageElement],
  colormap: Any
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("convertImageToFalseColorImage")(image.asInstanceOf[js.Any], colormap.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def convertToFalseColorImage(element: HTMLElement, colormap: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToFalseColorImage")(element.asInstanceOf[js.Any], colormap.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def disable(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def displayImage(element: HTMLElement, image: Image): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayImage")(element.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def displayImage(element: HTMLElement, image: Image, viewport: Viewport): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayImage")(element.asInstanceOf[js.Any], image.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def draw(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("draw")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def drawImage(enabledElement: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drawImage")(enabledElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def drawImage(enabledElement: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImage")(enabledElement.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def drawInvalidated(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drawInvalidated")().asInstanceOf[Unit]

inline def enable(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def enable(element: HTMLElement, options: Renderer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def events: EventTarget = ^.asInstanceOf[js.Dynamic].selectDynamic("events").asInstanceOf[EventTarget]

inline def fitToWindow(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fitToWindow")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def generateLut(image: Image, windowWidth: Double, windowCenter: Double, invert: Boolean): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLut")(image.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], windowCenter.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
inline def generateLut(
  image: Image,
  windowWidth: Double,
  windowCenter: Double,
  invert: Boolean,
  modalityLUT: js.Array[Any]
): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLut")(image.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], windowCenter.asInstanceOf[js.Any], invert.asInstanceOf[js.Any], modalityLUT.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
inline def generateLut(
  image: Image,
  windowWidth: Double,
  windowCenter: Double,
  invert: Boolean,
  modalityLUT: js.Array[Any],
  voiLUT: js.Array[Any]
): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLut")(image.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], windowCenter.asInstanceOf[js.Any], invert.asInstanceOf[js.Any], modalityLUT.asInstanceOf[js.Any], voiLUT.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
inline def generateLut(
  image: Image,
  windowWidth: Double,
  windowCenter: Double,
  invert: Boolean,
  modalityLUT: Unit,
  voiLUT: js.Array[Any]
): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLut")(image.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], windowCenter.asInstanceOf[js.Any], invert.asInstanceOf[js.Any], modalityLUT.asInstanceOf[js.Any], voiLUT.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]

inline def getActiveLayer(element: HTMLElement): EnabledElementLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveLayer")(element.asInstanceOf[js.Any]).asInstanceOf[EnabledElementLayer]

inline def getDefaultViewport(
  canvas: HTMLElement,
  image: Instantiable2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], HTMLImageElement]
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultViewport")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getDefaultViewportForImage(element: HTMLElement, image: Image): RequiredViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultViewportForImage")(element.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[RequiredViewport]

inline def getElementData(element: HTMLElement, dataType: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementData")(element.asInstanceOf[js.Any], dataType.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getEnabledElement(element: HTMLElement): EnabledElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledElement")(element.asInstanceOf[js.Any]).asInstanceOf[EnabledElement]

inline def getEnabledElements(): js.Array[EnabledElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledElements")().asInstanceOf[js.Array[EnabledElement]]

inline def getEnabledElementsByImageId(imageId: String): js.Array[EnabledElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledElementsByImageId")(imageId.asInstanceOf[js.Any]).asInstanceOf[js.Array[EnabledElement]]

inline def getImage(element: HTMLElement): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("getImage")(element.asInstanceOf[js.Any]).asInstanceOf[Image]

inline def getLayer(element: HTMLElement, layerId: String): EnabledElementLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayer")(element.asInstanceOf[js.Any], layerId.asInstanceOf[js.Any])).asInstanceOf[EnabledElementLayer]

inline def getLayers(element: HTMLElement): js.Array[EnabledElementLayer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayers")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[EnabledElementLayer]]

inline def getPixels(element: HTMLElement, x: Double, y: Double, width: Double, height: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPixels")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

inline def getStoredPixels(element: HTMLElement, x: Double, y: Double, width: Double, height: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStoredPixels")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

inline def getTransform(enabledElement: Any): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")(enabledElement.asInstanceOf[js.Any]).asInstanceOf[Transform]

inline def getViewport(element: HTMLElement): js.UndefOr[RequiredViewport] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewport")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RequiredViewport]]

inline def getVisibleLayers(element: HTMLElement): js.Array[EnabledElementLayer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleLayers")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[EnabledElementLayer]]

inline def invalidate(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def invalidateImageId(imageId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateImageId")(imageId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def loadAndCacheImage(imageId: String): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndCacheImage")(imageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]
inline def loadAndCacheImage(imageId: String, options: ImageLoaderOptions): js.Promise[Image] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndCacheImage")(imageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Image]]

inline def loadImage(imageId: String): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(imageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]
inline def loadImage(imageId: String, options: ImageLoaderOptions): js.Promise[Image] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(imageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Image]]

inline def pageToPixel(element: HTMLElement, pageX: Double, pageY: Double): PixelCoordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("pageToPixel")(element.asInstanceOf[js.Any], pageX.asInstanceOf[js.Any], pageY.asInstanceOf[js.Any])).asInstanceOf[PixelCoordinate]

inline def pixelDataToFalseColorData(image: Image, lookupTable: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelDataToFalseColorData")(image.asInstanceOf[js.Any], lookupTable.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def pixelDataToFalseColorData(image: Image, lookupTable: LookupTable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelDataToFalseColorData")(image.asInstanceOf[js.Any], lookupTable.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def pixelToCanvas(element: HTMLElement, pt: PixelCoordinate): CanvasCoordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelToCanvas")(element.asInstanceOf[js.Any], pt.asInstanceOf[js.Any])).asInstanceOf[CanvasCoordinate]

inline def purgeLayers(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeLayers")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerImageLoader(scheme: String, imageLoader: ImageLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerImageLoader")(scheme.asInstanceOf[js.Any], imageLoader.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerUnknownImageLoader(imageLoader: ImageLoader): js.UndefOr[ImageLoader] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerUnknownImageLoader")(imageLoader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ImageLoader]]

inline def removeElementData(element: HTMLElement, dataType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeElementData")(element.asInstanceOf[js.Any], dataType.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeLayer(element: HTMLElement, layerId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLayer")(element.asInstanceOf[js.Any], layerId.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderColorImage(enabledElement: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderColorImage")(enabledElement.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderGrayscaleImage(enabledElement: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGrayscaleImage")(enabledElement.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderLabelMapImage(enabledElement: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLabelMapImage")(enabledElement.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderPseudoColorImage(enabledElement: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderPseudoColorImage")(enabledElement.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderToCanvas(canvas: Any, image: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToCanvas")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def renderToCanvas(canvas: Any, image: Any, viewport: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToCanvas")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def renderToCanvas(canvas: Any, image: Any, viewport: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToCanvas")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def renderToCanvas(canvas: Any, image: Any, viewport: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToCanvas")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderWebImage(enabledElement: Any, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWebImage")(enabledElement.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def requestAnimationFrame(callback: js.Function1[/* timestamp */ Double, Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def rescaleImage(baseLayer: EnabledElementLayer, targetLayer: EnabledElementLayer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rescaleImage")(baseLayer.asInstanceOf[js.Any], targetLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def reset(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def resize(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def resize(element: HTMLElement, forceFitToWindow: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], forceFitToWindow.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def restoreImage(
  image: Instantiable2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], HTMLImageElement]
): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreImage")(image.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def setActiveLayer(element: HTMLElement, layerId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActiveLayer")(element.asInstanceOf[js.Any], layerId.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setDefaultViewport(viewport: Viewport): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultViewport")(viewport.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setLayerImage(element: HTMLElement, image: Image): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLayerImage")(element.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setLayerImage(element: HTMLElement, image: Image, layerId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLayerImage")(element.asInstanceOf[js.Any], image.asInstanceOf[js.Any], layerId.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setToPixelCoordinateSystem(enabledElement: EnabledElement, context: CanvasRenderingContext2D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setToPixelCoordinateSystem")(enabledElement.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setToPixelCoordinateSystem(enabledElement: EnabledElement, context: CanvasRenderingContext2D, scale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setToPixelCoordinateSystem")(enabledElement.asInstanceOf[js.Any], context.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setViewport(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setViewport")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setViewport(element: HTMLElement, viewport: Viewport): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setViewport")(element.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def storedColorPixelDataToCanvasImageData(
  image: Instantiable2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], HTMLImageElement],
  lut: js.Array[Any],
  canvasImageDataData: js.typedarray.Uint8ClampedArray
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storedColorPixelDataToCanvasImageData")(image.asInstanceOf[js.Any], lut.asInstanceOf[js.Any], canvasImageDataData.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def storedPixelDataToCanvasImageData(
  image: Instantiable2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], HTMLImageElement],
  lut: js.Array[Any],
  canvasImageDataData: js.typedarray.Uint8ClampedArray
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storedPixelDataToCanvasImageData")(image.asInstanceOf[js.Any], lut.asInstanceOf[js.Any], canvasImageDataData.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def storedPixelDataToCanvasImageDataColorLUT(
  image: Instantiable2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], HTMLImageElement],
  colorLut: Any,
  canvasImageDataData: js.typedarray.Uint8ClampedArray
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storedPixelDataToCanvasImageDataColorLUT")(image.asInstanceOf[js.Any], colorLut.asInstanceOf[js.Any], canvasImageDataData.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def storedPixelDataToCanvasImageDataPseudocolorLUT(
  image: Image,
  grayscaleLut: js.Array[Any],
  colorLut: Any,
  canvasImageDataData: js.typedarray.Uint8ClampedArray
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storedPixelDataToCanvasImageDataPseudocolorLUT")(image.asInstanceOf[js.Any], grayscaleLut.asInstanceOf[js.Any], colorLut.asInstanceOf[js.Any], canvasImageDataData.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def triggerEvent(el: EventTarget, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def triggerEvent(el: EventTarget, `type`: String, detail: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def updateImage(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateImage")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def updateImage(element: HTMLElement, invalidated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateImage")(element.asInstanceOf[js.Any], invalidated.asInstanceOf[js.Any])).asInstanceOf[Unit]

type ImageLoader = js.Function2[/* imageId */ String, /* options */ js.UndefOr[ImageLoaderOptions], ImageLoadObject]

type ImageLoaderOptions = Any

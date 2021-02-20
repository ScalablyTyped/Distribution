package typings.cropperjs

import typings.cropperjs.Cropper.CanvasData
import typings.cropperjs.Cropper.ContainerData
import typings.cropperjs.Cropper.CropBoxData
import typings.cropperjs.Cropper.Data
import typings.cropperjs.Cropper.DragMode
import typings.cropperjs.Cropper.GetCroppedCanvasOptions
import typings.cropperjs.Cropper.ImageData
import typings.cropperjs.Cropper.SetCanvasDataOptions
import typings.cropperjs.Cropper.SetCropBoxDataOptions
import typings.cropperjs.Cropper.SetDataOptions
import typings.cropperjs.anon.X
import typings.std.CustomEvent
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.MouseEvent
import typings.std.NodeList
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cropper extends StObject {
  
  def clear(): Cropper = js.native
  
  def crop(): Cropper = js.native
  
  def destroy(): Cropper = js.native
  
  def disable(): Cropper = js.native
  
  def enable(): Cropper = js.native
  
  def getCanvasData(): CanvasData = js.native
  
  def getContainerData(): ContainerData = js.native
  
  def getCropBoxData(): CropBoxData = js.native
  
  def getCroppedCanvas(): HTMLCanvasElement = js.native
  def getCroppedCanvas(options: GetCroppedCanvasOptions): HTMLCanvasElement = js.native
  
  def getData(): Data = js.native
  def getData(rounded: Boolean): Data = js.native
  
  def getImageData(): ImageData = js.native
  
  def move(offsetX: Double): Cropper = js.native
  def move(offsetX: Double, offsetY: Double): Cropper = js.native
  
  def moveTo(x: Double): Cropper = js.native
  def moveTo(x: Double, y: Double): Cropper = js.native
  
  def replace(url: String): Cropper = js.native
  def replace(url: String, onlyColorChanged: Boolean): Cropper = js.native
  
  def reset(): Cropper = js.native
  
  def rotate(degree: Double): Cropper = js.native
  
  def rotateTo(degree: Double): Cropper = js.native
  
  def scale(scaleX: Double): Cropper = js.native
  def scale(scaleX: Double, scaleY: Double): Cropper = js.native
  
  def scaleX(scaleX: Double): Cropper = js.native
  
  def scaleY(scaleY: Double): Cropper = js.native
  
  def setAspectRatio(aspectRatio: Double): Cropper = js.native
  
  def setCanvasData(data: SetCanvasDataOptions): Cropper = js.native
  
  def setCropBoxData(data: SetCropBoxDataOptions): Cropper = js.native
  
  def setData(data: SetDataOptions): Cropper = js.native
  
  def setDragMode(dragMode: DragMode): Cropper = js.native
  
  def zoom(ratio: Double): Cropper = js.native
  
  def zoomTo(ratio: Double): Cropper = js.native
  def zoomTo(ratio: Double, pivot: X): Cropper = js.native
}
object Cropper {
  
  /* Rewritten from type alias, can be one of: 
    - typings.cropperjs.cropperjsStrings.crop
    - typings.cropperjs.cropperjsStrings.move
    - typings.cropperjs.cropperjsStrings.zoom
    - typings.cropperjs.cropperjsStrings.e
    - typings.cropperjs.cropperjsStrings.s
    - typings.cropperjs.cropperjsStrings.w
    - typings.cropperjs.cropperjsStrings.n
    - typings.cropperjs.cropperjsStrings.ne
    - typings.cropperjs.cropperjsStrings.nw
    - typings.cropperjs.cropperjsStrings.se
    - typings.cropperjs.cropperjsStrings.sw
    - typings.cropperjs.cropperjsStrings.all
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def all: typings.cropperjs.cropperjsStrings.all = "all".asInstanceOf[typings.cropperjs.cropperjsStrings.all]
    
    @scala.inline
    def crop: typings.cropperjs.cropperjsStrings.crop = "crop".asInstanceOf[typings.cropperjs.cropperjsStrings.crop]
    
    @scala.inline
    def e: typings.cropperjs.cropperjsStrings.e = "e".asInstanceOf[typings.cropperjs.cropperjsStrings.e]
    
    @scala.inline
    def move: typings.cropperjs.cropperjsStrings.move = "move".asInstanceOf[typings.cropperjs.cropperjsStrings.move]
    
    @scala.inline
    def n: typings.cropperjs.cropperjsStrings.n = "n".asInstanceOf[typings.cropperjs.cropperjsStrings.n]
    
    @scala.inline
    def ne: typings.cropperjs.cropperjsStrings.ne = "ne".asInstanceOf[typings.cropperjs.cropperjsStrings.ne]
    
    @scala.inline
    def nw: typings.cropperjs.cropperjsStrings.nw = "nw".asInstanceOf[typings.cropperjs.cropperjsStrings.nw]
    
    @scala.inline
    def s: typings.cropperjs.cropperjsStrings.s = "s".asInstanceOf[typings.cropperjs.cropperjsStrings.s]
    
    @scala.inline
    def se: typings.cropperjs.cropperjsStrings.se = "se".asInstanceOf[typings.cropperjs.cropperjsStrings.se]
    
    @scala.inline
    def sw: typings.cropperjs.cropperjsStrings.sw = "sw".asInstanceOf[typings.cropperjs.cropperjsStrings.sw]
    
    @scala.inline
    def w: typings.cropperjs.cropperjsStrings.w = "w".asInstanceOf[typings.cropperjs.cropperjsStrings.w]
    
    @scala.inline
    def zoom: typings.cropperjs.cropperjsStrings.zoom = "zoom".asInstanceOf[typings.cropperjs.cropperjsStrings.zoom]
  }
  
  @js.native
  trait CanvasData extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var naturalHeight: Double = js.native
    
    var naturalWidth: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object CanvasData {
    
    @scala.inline
    def apply(
      height: Double,
      left: Double,
      naturalHeight: Double,
      naturalWidth: Double,
      top: Double,
      width: Double
    ): CanvasData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasData]
    }
    
    @scala.inline
    implicit class CanvasDataMutableBuilder[Self <: CanvasData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContainerData extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object ContainerData {
    
    @scala.inline
    def apply(height: Double, width: Double): ContainerData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerData]
    }
    
    @scala.inline
    implicit class ContainerDataMutableBuilder[Self <: ContainerData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropBoxData extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object CropBoxData {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): CropBoxData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropBoxData]
    }
    
    @scala.inline
    implicit class CropBoxDataMutableBuilder[Self <: CropBoxData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropEndEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_CropEndEvent: CropEventData = js.native
  }
  
  @js.native
  trait CropEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_CropEvent: Data = js.native
  }
  
  @js.native
  trait CropEventData extends StObject {
    
    var action: Action = js.native
    
    var originalEvent: PointerEvent | MouseEvent | TouchEvent = js.native
  }
  object CropEventData {
    
    @scala.inline
    def apply(action: Action, originalEvent: PointerEvent | MouseEvent | TouchEvent): CropEventData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropEventData]
    }
    
    @scala.inline
    implicit class CropEventDataMutableBuilder[Self <: CropEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEvent(value: PointerEvent | MouseEvent | TouchEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropMoveEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_CropMoveEvent: CropEventData = js.native
  }
  
  @js.native
  trait CropStartEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_CropStartEvent: CropEventData = js.native
  }
  
  @js.native
  trait Data extends StObject {
    
    var height: Double = js.native
    
    var rotate: Double = js.native
    
    var scaleX: Double = js.native
    
    var scaleY: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Data {
    
    @scala.inline
    def apply(
      height: Double,
      rotate: Double,
      scaleX: Double,
      scaleY: Double,
      width: Double,
      x: Double,
      y: Double
    ): Data = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cropperjs.cropperjsStrings.crop
    - typings.cropperjs.cropperjsStrings.move
    - typings.cropperjs.cropperjsStrings.none
  */
  trait DragMode extends StObject
  object DragMode {
    
    @scala.inline
    def crop: typings.cropperjs.cropperjsStrings.crop = "crop".asInstanceOf[typings.cropperjs.cropperjsStrings.crop]
    
    @scala.inline
    def move: typings.cropperjs.cropperjsStrings.move = "move".asInstanceOf[typings.cropperjs.cropperjsStrings.move]
    
    @scala.inline
    def none: typings.cropperjs.cropperjsStrings.none = "none".asInstanceOf[typings.cropperjs.cropperjsStrings.none]
  }
  
  @js.native
  trait GetCroppedCanvasOptions extends StObject {
    
    var fillColor: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
    
    var imageSmoothingQuality: js.UndefOr[ImageSmoothingQuality] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object GetCroppedCanvasOptions {
    
    @scala.inline
    def apply(): GetCroppedCanvasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCroppedCanvasOptions]
    }
    
    @scala.inline
    implicit class GetCroppedCanvasOptionsMutableBuilder[Self <: GetCroppedCanvasOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
      
      @scala.inline
      def setImageSmoothingQuality(value: ImageSmoothingQuality): Self = StObject.set(x, "imageSmoothingQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingQualityUndefined: Self = StObject.set(x, "imageSmoothingQuality", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ImageData extends StObject {
    
    var aspectRatio: Double = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var naturalHeight: Double = js.native
    
    var naturalWidth: Double = js.native
    
    var rotate: Double = js.native
    
    var scaleX: Double = js.native
    
    var scaleY: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object ImageData {
    
    @scala.inline
    def apply(
      aspectRatio: Double,
      height: Double,
      left: Double,
      naturalHeight: Double,
      naturalWidth: Double,
      rotate: Double,
      scaleX: Double,
      scaleY: Double,
      top: Double,
      width: Double
    ): ImageData = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageData]
    }
    
    @scala.inline
    implicit class ImageDataMutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cropperjs.cropperjsStrings.low
    - typings.cropperjs.cropperjsStrings.medium
    - typings.cropperjs.cropperjsStrings.high
  */
  trait ImageSmoothingQuality extends StObject
  object ImageSmoothingQuality {
    
    @scala.inline
    def high: typings.cropperjs.cropperjsStrings.high = "high".asInstanceOf[typings.cropperjs.cropperjsStrings.high]
    
    @scala.inline
    def low: typings.cropperjs.cropperjsStrings.low = "low".asInstanceOf[typings.cropperjs.cropperjsStrings.low]
    
    @scala.inline
    def medium: typings.cropperjs.cropperjsStrings.medium = "medium".asInstanceOf[typings.cropperjs.cropperjsStrings.medium]
  }
  
  @js.native
  trait Options extends StObject {
    
    var aspectRatio: js.UndefOr[Double] = js.native
    
    var autoCrop: js.UndefOr[Boolean] = js.native
    
    var autoCropArea: js.UndefOr[Double] = js.native
    
    var background: js.UndefOr[Boolean] = js.native
    
    var center: js.UndefOr[Boolean] = js.native
    
    var checkCrossOrigin: js.UndefOr[Boolean] = js.native
    
    var checkOrientation: js.UndefOr[Boolean] = js.native
    
    var crop: js.UndefOr[js.Function1[/* event */ CropEvent, Unit]] = js.native
    
    var cropBoxMovable: js.UndefOr[Boolean] = js.native
    
    var cropBoxResizable: js.UndefOr[Boolean] = js.native
    
    var cropend: js.UndefOr[js.Function1[/* event */ CropEndEvent, Unit]] = js.native
    
    var cropmove: js.UndefOr[js.Function1[/* event */ CropMoveEvent, Unit]] = js.native
    
    var cropstart: js.UndefOr[js.Function1[/* event */ CropStartEvent, Unit]] = js.native
    
    var data: js.UndefOr[Data] = js.native
    
    var dragMode: js.UndefOr[DragMode] = js.native
    
    var guides: js.UndefOr[Boolean] = js.native
    
    var highlight: js.UndefOr[Boolean] = js.native
    
    var initialAspectRatio: js.UndefOr[Double] = js.native
    
    var minCanvasHeight: js.UndefOr[Double] = js.native
    
    var minCanvasWidth: js.UndefOr[Double] = js.native
    
    var minContainerHeight: js.UndefOr[Double] = js.native
    
    var minContainerWidth: js.UndefOr[Double] = js.native
    
    var minCropBoxHeight: js.UndefOr[Double] = js.native
    
    var minCropBoxWidth: js.UndefOr[Double] = js.native
    
    var modal: js.UndefOr[Boolean] = js.native
    
    var movable: js.UndefOr[Boolean] = js.native
    
    var preview: js.UndefOr[Element | js.Array[Element] | NodeList | String] = js.native
    
    var ready: js.UndefOr[js.Function1[/* event */ ReadyEvent, Unit]] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var restore: js.UndefOr[Boolean] = js.native
    
    var rotatable: js.UndefOr[Boolean] = js.native
    
    var scalable: js.UndefOr[Boolean] = js.native
    
    var toggleDragModeOnDblclick: js.UndefOr[Boolean] = js.native
    
    var viewMode: js.UndefOr[ViewMode] = js.native
    
    var wheelZoomRatio: js.UndefOr[Double] = js.native
    
    var zoom: js.UndefOr[js.Function1[/* event */ ZoomEvent, Unit]] = js.native
    
    var zoomOnTouch: js.UndefOr[Boolean] = js.native
    
    var zoomOnWheel: js.UndefOr[Boolean] = js.native
    
    var zoomable: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setAutoCrop(value: Boolean): Self = StObject.set(x, "autoCrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCropArea(value: Double): Self = StObject.set(x, "autoCropArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCropAreaUndefined: Self = StObject.set(x, "autoCropArea", js.undefined)
      
      @scala.inline
      def setAutoCropUndefined: Self = StObject.set(x, "autoCrop", js.undefined)
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCheckCrossOrigin(value: Boolean): Self = StObject.set(x, "checkCrossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCrossOriginUndefined: Self = StObject.set(x, "checkCrossOrigin", js.undefined)
      
      @scala.inline
      def setCheckOrientation(value: Boolean): Self = StObject.set(x, "checkOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckOrientationUndefined: Self = StObject.set(x, "checkOrientation", js.undefined)
      
      @scala.inline
      def setCrop(value: /* event */ CropEvent => Unit): Self = StObject.set(x, "crop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCropBoxMovable(value: Boolean): Self = StObject.set(x, "cropBoxMovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropBoxMovableUndefined: Self = StObject.set(x, "cropBoxMovable", js.undefined)
      
      @scala.inline
      def setCropBoxResizable(value: Boolean): Self = StObject.set(x, "cropBoxResizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropBoxResizableUndefined: Self = StObject.set(x, "cropBoxResizable", js.undefined)
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setCropend(value: /* event */ CropEndEvent => Unit): Self = StObject.set(x, "cropend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCropendUndefined: Self = StObject.set(x, "cropend", js.undefined)
      
      @scala.inline
      def setCropmove(value: /* event */ CropMoveEvent => Unit): Self = StObject.set(x, "cropmove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCropmoveUndefined: Self = StObject.set(x, "cropmove", js.undefined)
      
      @scala.inline
      def setCropstart(value: /* event */ CropStartEvent => Unit): Self = StObject.set(x, "cropstart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCropstartUndefined: Self = StObject.set(x, "cropstart", js.undefined)
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDragMode(value: DragMode): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
      
      @scala.inline
      def setGuides(value: Boolean): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidesUndefined: Self = StObject.set(x, "guides", js.undefined)
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setInitialAspectRatio(value: Double): Self = StObject.set(x, "initialAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialAspectRatioUndefined: Self = StObject.set(x, "initialAspectRatio", js.undefined)
      
      @scala.inline
      def setMinCanvasHeight(value: Double): Self = StObject.set(x, "minCanvasHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCanvasHeightUndefined: Self = StObject.set(x, "minCanvasHeight", js.undefined)
      
      @scala.inline
      def setMinCanvasWidth(value: Double): Self = StObject.set(x, "minCanvasWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCanvasWidthUndefined: Self = StObject.set(x, "minCanvasWidth", js.undefined)
      
      @scala.inline
      def setMinContainerHeight(value: Double): Self = StObject.set(x, "minContainerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinContainerHeightUndefined: Self = StObject.set(x, "minContainerHeight", js.undefined)
      
      @scala.inline
      def setMinContainerWidth(value: Double): Self = StObject.set(x, "minContainerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinContainerWidthUndefined: Self = StObject.set(x, "minContainerWidth", js.undefined)
      
      @scala.inline
      def setMinCropBoxHeight(value: Double): Self = StObject.set(x, "minCropBoxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCropBoxHeightUndefined: Self = StObject.set(x, "minCropBoxHeight", js.undefined)
      
      @scala.inline
      def setMinCropBoxWidth(value: Double): Self = StObject.set(x, "minCropBoxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCropBoxWidthUndefined: Self = StObject.set(x, "minCropBoxWidth", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
      
      @scala.inline
      def setPreview(value: Element | js.Array[Element] | NodeList | String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setPreviewVarargs(value: Element*): Self = StObject.set(x, "preview", js.Array(value :_*))
      
      @scala.inline
      def setReady(value: /* event */ ReadyEvent => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      
      @scala.inline
      def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
      
      @scala.inline
      def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
      
      @scala.inline
      def setToggleDragModeOnDblclick(value: Boolean): Self = StObject.set(x, "toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleDragModeOnDblclickUndefined: Self = StObject.set(x, "toggleDragModeOnDblclick", js.undefined)
      
      @scala.inline
      def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
      
      @scala.inline
      def setWheelZoomRatio(value: Double): Self = StObject.set(x, "wheelZoomRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelZoomRatioUndefined: Self = StObject.set(x, "wheelZoomRatio", js.undefined)
      
      @scala.inline
      def setZoom(value: /* event */ ZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomOnTouch(value: Boolean): Self = StObject.set(x, "zoomOnTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOnTouchUndefined: Self = StObject.set(x, "zoomOnTouch", js.undefined)
      
      @scala.inline
      def setZoomOnWheel(value: Boolean): Self = StObject.set(x, "zoomOnWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOnWheelUndefined: Self = StObject.set(x, "zoomOnWheel", js.undefined)
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      @scala.inline
      def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
    }
  }
  
  type ReadyEvent = CustomEvent[js.Any]
  
  @js.native
  trait SetCanvasDataOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object SetCanvasDataOptions {
    
    @scala.inline
    def apply(): SetCanvasDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetCanvasDataOptions]
    }
    
    @scala.inline
    implicit class SetCanvasDataOptionsMutableBuilder[Self <: SetCanvasDataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SetCropBoxDataOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object SetCropBoxDataOptions {
    
    @scala.inline
    def apply(): SetCropBoxDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetCropBoxDataOptions]
    }
    
    @scala.inline
    implicit class SetCropBoxDataOptionsMutableBuilder[Self <: SetCropBoxDataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SetDataOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var rotate: js.UndefOr[Double] = js.native
    
    var scaleX: js.UndefOr[Double] = js.native
    
    var scaleY: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object SetDataOptions {
    
    @scala.inline
    def apply(): SetDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetDataOptions]
    }
    
    @scala.inline
    implicit class SetDataOptionsMutableBuilder[Self <: SetDataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cropperjs.cropperjsNumbers.`0`
    - typings.cropperjs.cropperjsNumbers.`1`
    - typings.cropperjs.cropperjsNumbers.`2`
    - typings.cropperjs.cropperjsNumbers.`3`
  */
  trait ViewMode extends StObject
  object ViewMode {
    
    @scala.inline
    def `0`: typings.cropperjs.cropperjsNumbers.`0` = 0.asInstanceOf[typings.cropperjs.cropperjsNumbers.`0`]
    
    @scala.inline
    def `1`: typings.cropperjs.cropperjsNumbers.`1` = 1.asInstanceOf[typings.cropperjs.cropperjsNumbers.`1`]
    
    @scala.inline
    def `2`: typings.cropperjs.cropperjsNumbers.`2` = 2.asInstanceOf[typings.cropperjs.cropperjsNumbers.`2`]
    
    @scala.inline
    def `3`: typings.cropperjs.cropperjsNumbers.`3` = 3.asInstanceOf[typings.cropperjs.cropperjsNumbers.`3`]
  }
  
  @js.native
  trait ZoomEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_ZoomEvent: ZoomEventData = js.native
  }
  
  @js.native
  trait ZoomEventData extends StObject {
    
    var oldRatio: Double = js.native
    
    var originalEvent: WheelEvent | PointerEvent | TouchEvent = js.native
    
    var ratio: Double = js.native
  }
  object ZoomEventData {
    
    @scala.inline
    def apply(oldRatio: Double, originalEvent: WheelEvent | PointerEvent | TouchEvent, ratio: Double): ZoomEventData = {
      val __obj = js.Dynamic.literal(oldRatio = oldRatio.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomEventData]
    }
    
    @scala.inline
    implicit class ZoomEventDataMutableBuilder[Self <: ZoomEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldRatio(value: Double): Self = StObject.set(x, "oldRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEvent(value: WheelEvent | PointerEvent | TouchEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    }
  }
}

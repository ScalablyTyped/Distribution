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
import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.NodeListOf
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    inline def all: typings.cropperjs.cropperjsStrings.all = "all".asInstanceOf[typings.cropperjs.cropperjsStrings.all]
    
    inline def crop: typings.cropperjs.cropperjsStrings.crop = "crop".asInstanceOf[typings.cropperjs.cropperjsStrings.crop]
    
    inline def e: typings.cropperjs.cropperjsStrings.e = "e".asInstanceOf[typings.cropperjs.cropperjsStrings.e]
    
    inline def move: typings.cropperjs.cropperjsStrings.move = "move".asInstanceOf[typings.cropperjs.cropperjsStrings.move]
    
    inline def n: typings.cropperjs.cropperjsStrings.n = "n".asInstanceOf[typings.cropperjs.cropperjsStrings.n]
    
    inline def ne: typings.cropperjs.cropperjsStrings.ne = "ne".asInstanceOf[typings.cropperjs.cropperjsStrings.ne]
    
    inline def nw: typings.cropperjs.cropperjsStrings.nw = "nw".asInstanceOf[typings.cropperjs.cropperjsStrings.nw]
    
    inline def s: typings.cropperjs.cropperjsStrings.s = "s".asInstanceOf[typings.cropperjs.cropperjsStrings.s]
    
    inline def se: typings.cropperjs.cropperjsStrings.se = "se".asInstanceOf[typings.cropperjs.cropperjsStrings.se]
    
    inline def sw: typings.cropperjs.cropperjsStrings.sw = "sw".asInstanceOf[typings.cropperjs.cropperjsStrings.sw]
    
    inline def w: typings.cropperjs.cropperjsStrings.w = "w".asInstanceOf[typings.cropperjs.cropperjsStrings.w]
    
    inline def zoom: typings.cropperjs.cropperjsStrings.zoom = "zoom".asInstanceOf[typings.cropperjs.cropperjsStrings.zoom]
  }
  
  trait CanvasData extends StObject {
    
    var height: Double
    
    var left: Double
    
    var naturalHeight: Double
    
    var naturalWidth: Double
    
    var top: Double
    
    var width: Double
  }
  object CanvasData {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: CanvasData] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContainerData extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ContainerData {
    
    inline def apply(height: Double, width: Double): ContainerData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerData] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait CropBoxData extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object CropBoxData {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): CropBoxData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropBoxData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropBoxData] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropEndEvent[T /* <: EventTarget */]
    extends StObject
       with CropperEvent[T] {
    
    @JSName("detail")
    var detail_CropEndEvent: CropEventData = js.native
  }
  
  @js.native
  trait CropEvent[T /* <: EventTarget */]
    extends StObject
       with CropperEvent[T] {
    
    @JSName("detail")
    var detail_CropEvent: Data = js.native
  }
  
  trait CropEventData extends StObject {
    
    var action: Action
    
    var originalEvent: PointerEvent | TouchEvent | MouseEvent
  }
  object CropEventData {
    
    inline def apply(action: Action, originalEvent: PointerEvent | TouchEvent | MouseEvent): CropEventData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropEventData] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: PointerEvent | TouchEvent | MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropMoveEvent[T /* <: EventTarget */]
    extends StObject
       with CropperEvent[T] {
    
    @JSName("detail")
    var detail_CropMoveEvent: CropEventData = js.native
  }
  
  @js.native
  trait CropStartEvent[T /* <: EventTarget */]
    extends StObject
       with CropperEvent[T] {
    
    @JSName("detail")
    var detail_CropStartEvent: CropEventData = js.native
  }
  
  @js.native
  trait CropperEvent[T /* <: EventTarget */]
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("currentTarget")
    var currentTarget_CropperEvent: T & typings.cropperjs.anon.Cropper = js.native
  }
  
  trait Data extends StObject {
    
    var height: Double
    
    var rotate: Double
    
    var scaleX: Double
    
    var scaleY: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Data {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cropperjs.cropperjsStrings.crop
    - typings.cropperjs.cropperjsStrings.move
    - typings.cropperjs.cropperjsStrings.none
  */
  trait DragMode extends StObject
  object DragMode {
    
    inline def crop: typings.cropperjs.cropperjsStrings.crop = "crop".asInstanceOf[typings.cropperjs.cropperjsStrings.crop]
    
    inline def move: typings.cropperjs.cropperjsStrings.move = "move".asInstanceOf[typings.cropperjs.cropperjsStrings.move]
    
    inline def none: typings.cropperjs.cropperjsStrings.none = "none".asInstanceOf[typings.cropperjs.cropperjsStrings.none]
  }
  
  trait GetCroppedCanvasOptions extends StObject {
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var imageSmoothingQuality: js.UndefOr[ImageSmoothingQuality] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object GetCroppedCanvasOptions {
    
    inline def apply(): GetCroppedCanvasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCroppedCanvasOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCroppedCanvasOptions] (val x: Self) extends AnyVal {
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
      
      inline def setImageSmoothingQuality(value: ImageSmoothingQuality): Self = StObject.set(x, "imageSmoothingQuality", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingQualityUndefined: Self = StObject.set(x, "imageSmoothingQuality", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ImageData extends StObject {
    
    var aspectRatio: Double
    
    var height: Double
    
    var left: Double
    
    var naturalHeight: Double
    
    var naturalWidth: Double
    
    var rotate: Double
    
    var scaleX: Double
    
    var scaleY: Double
    
    var top: Double
    
    var width: Double
  }
  object ImageData {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cropperjs.cropperjsStrings.low
    - typings.cropperjs.cropperjsStrings.medium
    - typings.cropperjs.cropperjsStrings.high
  */
  trait ImageSmoothingQuality extends StObject
  object ImageSmoothingQuality {
    
    inline def high: typings.cropperjs.cropperjsStrings.high = "high".asInstanceOf[typings.cropperjs.cropperjsStrings.high]
    
    inline def low: typings.cropperjs.cropperjsStrings.low = "low".asInstanceOf[typings.cropperjs.cropperjsStrings.low]
    
    inline def medium: typings.cropperjs.cropperjsStrings.medium = "medium".asInstanceOf[typings.cropperjs.cropperjsStrings.medium]
  }
  
  trait Options[T /* <: EventTarget */] extends StObject {
    
    var aspectRatio: js.UndefOr[Double] = js.undefined
    
    var autoCrop: js.UndefOr[Boolean] = js.undefined
    
    var autoCropArea: js.UndefOr[Double] = js.undefined
    
    var background: js.UndefOr[Boolean] = js.undefined
    
    var center: js.UndefOr[Boolean] = js.undefined
    
    var checkCrossOrigin: js.UndefOr[Boolean] = js.undefined
    
    var checkOrientation: js.UndefOr[Boolean] = js.undefined
    
    var crop: js.UndefOr[js.Function1[/* event */ CropEvent[T], Unit]] = js.undefined
    
    var cropBoxMovable: js.UndefOr[Boolean] = js.undefined
    
    var cropBoxResizable: js.UndefOr[Boolean] = js.undefined
    
    var cropend: js.UndefOr[js.Function1[/* event */ CropEndEvent[T], Unit]] = js.undefined
    
    var cropmove: js.UndefOr[js.Function1[/* event */ CropMoveEvent[T], Unit]] = js.undefined
    
    var cropstart: js.UndefOr[js.Function1[/* event */ CropStartEvent[T], Unit]] = js.undefined
    
    var data: js.UndefOr[SetDataOptions] = js.undefined
    
    var dragMode: js.UndefOr[DragMode] = js.undefined
    
    var guides: js.UndefOr[Boolean] = js.undefined
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var initialAspectRatio: js.UndefOr[Double] = js.undefined
    
    var minCanvasHeight: js.UndefOr[Double] = js.undefined
    
    var minCanvasWidth: js.UndefOr[Double] = js.undefined
    
    var minContainerHeight: js.UndefOr[Double] = js.undefined
    
    var minContainerWidth: js.UndefOr[Double] = js.undefined
    
    var minCropBoxHeight: js.UndefOr[Double] = js.undefined
    
    var minCropBoxWidth: js.UndefOr[Double] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var movable: js.UndefOr[Boolean] = js.undefined
    
    var preview: js.UndefOr[HTMLElement | js.Array[HTMLElement] | NodeListOf[HTMLElement] | String] = js.undefined
    
    var ready: js.UndefOr[js.Function1[/* event */ ReadyEvent[T], Unit]] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var restore: js.UndefOr[Boolean] = js.undefined
    
    var rotatable: js.UndefOr[Boolean] = js.undefined
    
    var scalable: js.UndefOr[Boolean] = js.undefined
    
    var toggleDragModeOnDblclick: js.UndefOr[Boolean] = js.undefined
    
    var viewMode: js.UndefOr[ViewMode] = js.undefined
    
    var wheelZoomRatio: js.UndefOr[Double] = js.undefined
    
    var zoom: js.UndefOr[js.Function1[/* event */ ZoomEvent[T], Unit]] = js.undefined
    
    var zoomOnTouch: js.UndefOr[Boolean] = js.undefined
    
    var zoomOnWheel: js.UndefOr[Boolean] = js.undefined
    
    var zoomable: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[T /* <: EventTarget */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T /* <: EventTarget */] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAutoCrop(value: Boolean): Self = StObject.set(x, "autoCrop", value.asInstanceOf[js.Any])
      
      inline def setAutoCropArea(value: Double): Self = StObject.set(x, "autoCropArea", value.asInstanceOf[js.Any])
      
      inline def setAutoCropAreaUndefined: Self = StObject.set(x, "autoCropArea", js.undefined)
      
      inline def setAutoCropUndefined: Self = StObject.set(x, "autoCrop", js.undefined)
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCheckCrossOrigin(value: Boolean): Self = StObject.set(x, "checkCrossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCheckCrossOriginUndefined: Self = StObject.set(x, "checkCrossOrigin", js.undefined)
      
      inline def setCheckOrientation(value: Boolean): Self = StObject.set(x, "checkOrientation", value.asInstanceOf[js.Any])
      
      inline def setCheckOrientationUndefined: Self = StObject.set(x, "checkOrientation", js.undefined)
      
      inline def setCrop(value: /* event */ CropEvent[T] => Unit): Self = StObject.set(x, "crop", js.Any.fromFunction1(value))
      
      inline def setCropBoxMovable(value: Boolean): Self = StObject.set(x, "cropBoxMovable", value.asInstanceOf[js.Any])
      
      inline def setCropBoxMovableUndefined: Self = StObject.set(x, "cropBoxMovable", js.undefined)
      
      inline def setCropBoxResizable(value: Boolean): Self = StObject.set(x, "cropBoxResizable", value.asInstanceOf[js.Any])
      
      inline def setCropBoxResizableUndefined: Self = StObject.set(x, "cropBoxResizable", js.undefined)
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setCropend(value: /* event */ CropEndEvent[T] => Unit): Self = StObject.set(x, "cropend", js.Any.fromFunction1(value))
      
      inline def setCropendUndefined: Self = StObject.set(x, "cropend", js.undefined)
      
      inline def setCropmove(value: /* event */ CropMoveEvent[T] => Unit): Self = StObject.set(x, "cropmove", js.Any.fromFunction1(value))
      
      inline def setCropmoveUndefined: Self = StObject.set(x, "cropmove", js.undefined)
      
      inline def setCropstart(value: /* event */ CropStartEvent[T] => Unit): Self = StObject.set(x, "cropstart", js.Any.fromFunction1(value))
      
      inline def setCropstartUndefined: Self = StObject.set(x, "cropstart", js.undefined)
      
      inline def setData(value: SetDataOptions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDragMode(value: DragMode): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
      
      inline def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
      
      inline def setGuides(value: Boolean): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
      
      inline def setGuidesUndefined: Self = StObject.set(x, "guides", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setInitialAspectRatio(value: Double): Self = StObject.set(x, "initialAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setInitialAspectRatioUndefined: Self = StObject.set(x, "initialAspectRatio", js.undefined)
      
      inline def setMinCanvasHeight(value: Double): Self = StObject.set(x, "minCanvasHeight", value.asInstanceOf[js.Any])
      
      inline def setMinCanvasHeightUndefined: Self = StObject.set(x, "minCanvasHeight", js.undefined)
      
      inline def setMinCanvasWidth(value: Double): Self = StObject.set(x, "minCanvasWidth", value.asInstanceOf[js.Any])
      
      inline def setMinCanvasWidthUndefined: Self = StObject.set(x, "minCanvasWidth", js.undefined)
      
      inline def setMinContainerHeight(value: Double): Self = StObject.set(x, "minContainerHeight", value.asInstanceOf[js.Any])
      
      inline def setMinContainerHeightUndefined: Self = StObject.set(x, "minContainerHeight", js.undefined)
      
      inline def setMinContainerWidth(value: Double): Self = StObject.set(x, "minContainerWidth", value.asInstanceOf[js.Any])
      
      inline def setMinContainerWidthUndefined: Self = StObject.set(x, "minContainerWidth", js.undefined)
      
      inline def setMinCropBoxHeight(value: Double): Self = StObject.set(x, "minCropBoxHeight", value.asInstanceOf[js.Any])
      
      inline def setMinCropBoxHeightUndefined: Self = StObject.set(x, "minCropBoxHeight", js.undefined)
      
      inline def setMinCropBoxWidth(value: Double): Self = StObject.set(x, "minCropBoxWidth", value.asInstanceOf[js.Any])
      
      inline def setMinCropBoxWidthUndefined: Self = StObject.set(x, "minCropBoxWidth", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
      
      inline def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
      
      inline def setPreview(value: HTMLElement | js.Array[HTMLElement] | NodeListOf[HTMLElement] | String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setPreviewVarargs(value: HTMLElement*): Self = StObject.set(x, "preview", js.Array(value*))
      
      inline def setReady(value: /* event */ ReadyEvent[T] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      
      inline def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
      
      inline def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
      
      inline def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
      
      inline def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
      
      inline def setToggleDragModeOnDblclick(value: Boolean): Self = StObject.set(x, "toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
      
      inline def setToggleDragModeOnDblclickUndefined: Self = StObject.set(x, "toggleDragModeOnDblclick", js.undefined)
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
      
      inline def setWheelZoomRatio(value: Double): Self = StObject.set(x, "wheelZoomRatio", value.asInstanceOf[js.Any])
      
      inline def setWheelZoomRatioUndefined: Self = StObject.set(x, "wheelZoomRatio", js.undefined)
      
      inline def setZoom(value: /* event */ ZoomEvent[T] => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      inline def setZoomOnTouch(value: Boolean): Self = StObject.set(x, "zoomOnTouch", value.asInstanceOf[js.Any])
      
      inline def setZoomOnTouchUndefined: Self = StObject.set(x, "zoomOnTouch", js.undefined)
      
      inline def setZoomOnWheel(value: Boolean): Self = StObject.set(x, "zoomOnWheel", value.asInstanceOf[js.Any])
      
      inline def setZoomOnWheelUndefined: Self = StObject.set(x, "zoomOnWheel", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      inline def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
      
      inline def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
    }
  }
  
  type ReadyEvent[T /* <: EventTarget */] = CropperEvent[T]
  
  trait SetCanvasDataOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SetCanvasDataOptions {
    
    inline def apply(): SetCanvasDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetCanvasDataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetCanvasDataOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SetCropBoxDataOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SetCropBoxDataOptions {
    
    inline def apply(): SetCropBoxDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetCropBoxDataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetCropBoxDataOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SetDataOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var scaleX: js.UndefOr[Double] = js.undefined
    
    var scaleY: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object SetDataOptions {
    
    inline def apply(): SetDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetDataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetDataOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cropperjs.cropperjsInts.`0`
    - typings.cropperjs.cropperjsInts.`1`
    - typings.cropperjs.cropperjsInts.`2`
    - typings.cropperjs.cropperjsInts.`3`
  */
  trait ViewMode extends StObject
  object ViewMode {
    
    inline def `0`: typings.cropperjs.cropperjsInts.`0` = 0.asInstanceOf[typings.cropperjs.cropperjsInts.`0`]
    
    inline def `1`: typings.cropperjs.cropperjsInts.`1` = 1.asInstanceOf[typings.cropperjs.cropperjsInts.`1`]
    
    inline def `2`: typings.cropperjs.cropperjsInts.`2` = 2.asInstanceOf[typings.cropperjs.cropperjsInts.`2`]
    
    inline def `3`: typings.cropperjs.cropperjsInts.`3` = 3.asInstanceOf[typings.cropperjs.cropperjsInts.`3`]
  }
  
  @js.native
  trait ZoomEvent[T /* <: EventTarget */]
    extends StObject
       with CropperEvent[T] {
    
    @JSName("detail")
    var detail_ZoomEvent: ZoomEventData = js.native
  }
  
  trait ZoomEventData extends StObject {
    
    var oldRatio: Double
    
    var originalEvent: WheelEvent | PointerEvent | TouchEvent | MouseEvent
    
    var ratio: Double
  }
  object ZoomEventData {
    
    inline def apply(
      oldRatio: Double,
      originalEvent: WheelEvent | PointerEvent | TouchEvent | MouseEvent,
      ratio: Double
    ): ZoomEventData = {
      val __obj = js.Dynamic.literal(oldRatio = oldRatio.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomEventData] (val x: Self) extends AnyVal {
      
      inline def setOldRatio(value: Double): Self = StObject.set(x, "oldRatio", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: WheelEvent | PointerEvent | TouchEvent | MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    }
  }
}

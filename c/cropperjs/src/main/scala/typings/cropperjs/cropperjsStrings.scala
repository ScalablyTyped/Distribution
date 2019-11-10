package typings.cropperjs

import typings.cropperjs.Cropper.DragMode
import typings.cropperjs.Cropper.ImageSmoothingQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cropperjsStrings {
  @js.native
  sealed trait crop extends DragMode
  
  @js.native
  sealed trait high extends ImageSmoothingQuality
  
  @js.native
  sealed trait low extends ImageSmoothingQuality
  
  @js.native
  sealed trait medium extends ImageSmoothingQuality
  
  @js.native
  sealed trait move extends DragMode
  
  @js.native
  sealed trait none extends DragMode
  
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
}


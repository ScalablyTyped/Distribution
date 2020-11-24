package typings.cropperjs

import typings.cropperjs.Cropper.Action
import typings.cropperjs.Cropper.DragMode
import typings.cropperjs.Cropper.ImageSmoothingQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropperjsStrings {
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  
  @scala.inline
  def e: e = "e".asInstanceOf[e]
  
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @scala.inline
  def n: n = "n".asInstanceOf[n]
  
  @scala.inline
  def ne: ne = "ne".asInstanceOf[ne]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def nw: nw = "nw".asInstanceOf[nw]
  
  @scala.inline
  def s: s = "s".asInstanceOf[s]
  
  @scala.inline
  def se: se = "se".asInstanceOf[se]
  
  @scala.inline
  def sw: sw = "sw".asInstanceOf[sw]
  
  @scala.inline
  def w: w = "w".asInstanceOf[w]
  
  @scala.inline
  def zoom: zoom = "zoom".asInstanceOf[zoom]
  
  @js.native
  sealed trait all extends Action
  
  @js.native
  sealed trait crop
    extends Action
       with DragMode
  
  @js.native
  sealed trait e extends Action
  
  @js.native
  sealed trait high extends ImageSmoothingQuality
  
  @js.native
  sealed trait low extends ImageSmoothingQuality
  
  @js.native
  sealed trait medium extends ImageSmoothingQuality
  
  @js.native
  sealed trait move
    extends Action
       with DragMode
  
  @js.native
  sealed trait n extends Action
  
  @js.native
  sealed trait ne extends Action
  
  @js.native
  sealed trait none extends DragMode
  
  @js.native
  sealed trait nw extends Action
  
  @js.native
  sealed trait s extends Action
  
  @js.native
  sealed trait se extends Action
  
  @js.native
  sealed trait sw extends Action
  
  @js.native
  sealed trait w extends Action
  
  @js.native
  sealed trait zoom extends Action
}

package typings.cropperjs

import typings.cropperjs.Cropper.Action
import typings.cropperjs.Cropper.DragMode
import typings.cropperjs.Cropper.ImageSmoothingQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropperjsStrings {
  
  @js.native
  sealed trait all extends Action
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait crop
    extends Action
       with DragMode
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait e extends Action
  @scala.inline
  def e: e = "e".asInstanceOf[e]
  
  @js.native
  sealed trait high extends ImageSmoothingQuality
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait low extends ImageSmoothingQuality
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait medium extends ImageSmoothingQuality
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait move
    extends Action
       with DragMode
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait n extends Action
  @scala.inline
  def n: n = "n".asInstanceOf[n]
  
  @js.native
  sealed trait ne extends Action
  @scala.inline
  def ne: ne = "ne".asInstanceOf[ne]
  
  @js.native
  sealed trait none extends DragMode
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait nw extends Action
  @scala.inline
  def nw: nw = "nw".asInstanceOf[nw]
  
  @js.native
  sealed trait s extends Action
  @scala.inline
  def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait se extends Action
  @scala.inline
  def se: se = "se".asInstanceOf[se]
  
  @js.native
  sealed trait sw extends Action
  @scala.inline
  def sw: sw = "sw".asInstanceOf[sw]
  
  @js.native
  sealed trait w extends Action
  @scala.inline
  def w: w = "w".asInstanceOf[w]
  
  @js.native
  sealed trait zoom extends Action
  @scala.inline
  def zoom: zoom = "zoom".asInstanceOf[zoom]
}

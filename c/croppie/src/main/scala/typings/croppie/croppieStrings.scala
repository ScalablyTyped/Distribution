package typings.croppie

import typings.croppie.croppieMod.CropType
import typings.croppie.croppieMod.Format
import typings.croppie.croppieMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object croppieStrings {
  @js.native
  sealed trait base64 extends Type
  
  @js.native
  sealed trait blob extends Type
  
  @js.native
  sealed trait canvas extends Type
  
  @js.native
  sealed trait circle extends CropType
  
  @js.native
  sealed trait html extends Type
  
  @js.native
  sealed trait jpeg extends Format
  
  @js.native
  sealed trait original extends js.Object
  
  @js.native
  sealed trait png extends Format
  
  @js.native
  sealed trait rawcanvas extends Type
  
  @js.native
  sealed trait square extends CropType
  
  @js.native
  sealed trait viewport extends js.Object
  
  @js.native
  sealed trait webp extends Format
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def canvas: canvas = "canvas".asInstanceOf[canvas]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  @scala.inline
  def original: original = "original".asInstanceOf[original]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def rawcanvas: rawcanvas = "rawcanvas".asInstanceOf[rawcanvas]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def viewport: viewport = "viewport".asInstanceOf[viewport]
  @scala.inline
  def webp: webp = "webp".asInstanceOf[webp]
}


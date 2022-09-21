package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.ImageDataSettings
import typings.typescriptNn5FuAjk.PredefinedColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ImageData")
@js.native
open class ImageData protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.ImageData {
  def this(data: typings.typescriptNn5FuAjk.Uint8ClampedArray, sw: Double) = this()
  def this(sw: Double, sh: Double) = this()
  def this(data: typings.typescriptNn5FuAjk.Uint8ClampedArray, sw: Double, sh: Double) = this()
  def this(sw: Double, sh: Double, settings: ImageDataSettings) = this()
  def this(
    data: typings.typescriptNn5FuAjk.Uint8ClampedArray,
    sw: Double,
    sh: Double,
    settings: ImageDataSettings
  ) = this()
  def this(
    data: typings.typescriptNn5FuAjk.Uint8ClampedArray,
    sw: Double,
    sh: Unit,
    settings: ImageDataSettings
  ) = this()
  
  /* CompleteClass */
  override val colorSpace: PredefinedColorSpace = js.native
  
  /** Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255. */
  /* CompleteClass */
  override val data: typings.typescriptNn5FuAjk.Uint8ClampedArray = js.native
  
  /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
  /* CompleteClass */
  override val height: Double = js.native
  
  /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
  /* CompleteClass */
  override val width: Double = js.native
}

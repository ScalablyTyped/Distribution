package typings.cropperjs

import typings.cropperjs.Cropper.Options
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Cropper protected ()
    extends typings.cropperjs.Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options) = this()
    def this(element: HTMLImageElement, options: Options) = this()
  }
  
  /* static members */
  @js.native
  object Cropper extends js.Object {
    def noConflict(): typings.cropperjs.Cropper = js.native
    def setDefaults(options: Options): Unit = js.native
  }
  
}


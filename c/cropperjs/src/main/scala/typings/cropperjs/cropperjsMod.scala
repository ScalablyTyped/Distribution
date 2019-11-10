package typings.cropperjs

import typings.cropperjs.Cropper.Options
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cropperjs", JSImport.Namespace)
@js.native
object cropperjsMod extends js.Object {
  @js.native
  class default protected () extends Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options) = this()
    def this(element: HTMLImageElement, options: Options) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def noConflict(): Cropper = js.native
    def setDefaults(options: Options): Unit = js.native
  }
  
}


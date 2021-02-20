package typings.cropperjs

import typings.cropperjs.Cropper.Options
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Cropper")
  @js.native
  class Cropper protected ()
    extends typings.cropperjs.Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options) = this()
    def this(element: HTMLImageElement, options: Options) = this()
  }
  object Cropper {
    
    /* static member */
    @JSGlobal("Cropper.noConflict")
    @js.native
    def noConflict(): typings.cropperjs.Cropper = js.native
    
    /* static member */
    @JSGlobal("Cropper.setDefaults")
    @js.native
    def setDefaults(options: Options): Unit = js.native
  }
}

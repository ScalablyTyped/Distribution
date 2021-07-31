package typings.cropperjs

import typings.cropperjs.Cropper.Options
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Cropper")
  @js.native
  class Cropper protected ()
    extends StObject
       with typings.cropperjs.Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options) = this()
    def this(element: HTMLImageElement, options: Options) = this()
  }
  object Cropper {
    
    @JSGlobal("Cropper")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def noConflict(): typings.cropperjs.Cropper = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typings.cropperjs.Cropper]
    
    /* static member */
    @scala.inline
    def setDefaults(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

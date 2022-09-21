package typings.cropperjs

import typings.cropperjs.Cropper.Options
import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Cropper")
  @js.native
  open class Cropper protected ()
    extends StObject
       with typings.cropperjs.Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options[HTMLCanvasElement]) = this()
    def this(element: HTMLImageElement, options: Options[HTMLImageElement]) = this()
  }
  object Cropper {
    
    @JSGlobal("Cropper")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def noConflict(): typings.cropperjs.Cropper = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typings.cropperjs.Cropper]
    
    /* static member */
    inline def setDefaults(options: Options[EventTarget]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

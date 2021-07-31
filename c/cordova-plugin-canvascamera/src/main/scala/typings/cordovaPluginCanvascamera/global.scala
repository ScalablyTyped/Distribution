package typings.cordovaPluginCanvascamera

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("CanvasCamera")
  @js.native
  class CanvasCamera ()
    extends StObject
       with typings.cordovaPluginCanvascamera.CanvasCamera
  
  @JSGlobal("Frame")
  @js.native
  class Frame protected ()
    extends StObject
       with typings.cordovaPluginCanvascamera.Frame {
    
    /* CompleteClass */
    var dHeight: Double = js.native
    
    /* CompleteClass */
    var dWidth: Double = js.native
    
    /* CompleteClass */
    var dx: Double = js.native
    
    /* CompleteClass */
    var dy: Double = js.native
    
    /* CompleteClass */
    var element: HTMLCanvasElement = js.native
    
    /* CompleteClass */
    var image: HTMLImageElement = js.native
    
    /* CompleteClass */
    override def initialize(): typings.cordovaPluginCanvascamera.Frame = js.native
    
    /* CompleteClass */
    override def recycle(): Unit = js.native
    
    /* CompleteClass */
    var sHeight: Double = js.native
    
    /* CompleteClass */
    var sWidth: Double = js.native
    
    /* CompleteClass */
    var sx: Double = js.native
    
    /* CompleteClass */
    var sy: Double = js.native
  }
  
  @JSGlobal("Renderer")
  @js.native
  class Renderer protected ()
    extends StObject
       with typings.cordovaPluginCanvascamera.Renderer
}

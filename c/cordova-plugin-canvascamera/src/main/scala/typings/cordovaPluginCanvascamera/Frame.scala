package typings.cordovaPluginCanvascamera

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  var dHeight: Double
  
  var dWidth: Double
  
  var dx: Double
  
  var dy: Double
  
  var element: HTMLCanvasElement
  
  var image: HTMLImageElement
  
  def initialize(): Frame
  
  def recycle(): Unit
  
  var sHeight: Double
  
  var sWidth: Double
  
  var sx: Double
  
  var sy: Double
}
object Frame {
  
  @scala.inline
  def apply(
    dHeight: Double,
    dWidth: Double,
    dx: Double,
    dy: Double,
    element: HTMLCanvasElement,
    image: HTMLImageElement,
    initialize: () => Frame,
    recycle: () => Unit,
    sHeight: Double,
    sWidth: Double,
    sx: Double,
    sy: Double
  ): Frame = {
    val __obj = js.Dynamic.literal(dHeight = dHeight.asInstanceOf[js.Any], dWidth = dWidth.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], initialize = js.Any.fromFunction0(initialize), recycle = js.Any.fromFunction0(recycle), sHeight = sHeight.asInstanceOf[js.Any], sWidth = sWidth.asInstanceOf[js.Any], sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDHeight(value: Double): Self = StObject.set(x, "dHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDWidth(value: Double): Self = StObject.set(x, "dWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLCanvasElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialize(value: () => Frame): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecycle(value: () => Unit): Self = StObject.set(x, "recycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSHeight(value: Double): Self = StObject.set(x, "sHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSWidth(value: Double): Self = StObject.set(x, "sWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSx(value: Double): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSy(value: Double): Self = StObject.set(x, "sy", value.asInstanceOf[js.Any])
  }
}

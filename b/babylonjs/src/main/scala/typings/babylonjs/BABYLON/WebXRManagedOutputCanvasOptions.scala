package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.XRWebGLLayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRManagedOutputCanvasOptions extends StObject {
  
  /**
    * An optional canvas in case you wish to create it yourself and provide it here.
    * If not provided, a new canvas will be created
    */
  var canvasElement: js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * Options for this XR Layer output
    */
  var canvasOptions: js.UndefOr[XRWebGLLayerInit] = js.native
  
  /**
    * CSS styling for a newly created canvas (if not provided)
    */
  var newCanvasCssStyle: js.UndefOr[String] = js.native
}
object WebXRManagedOutputCanvasOptions {
  
  @scala.inline
  def apply(): WebXRManagedOutputCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXRManagedOutputCanvasOptions]
  }
  
  @scala.inline
  implicit class WebXRManagedOutputCanvasOptionsMutableBuilder[Self <: WebXRManagedOutputCanvasOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "canvasElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasElementUndefined: Self = StObject.set(x, "canvasElement", js.undefined)
    
    @scala.inline
    def setCanvasOptions(value: XRWebGLLayerInit): Self = StObject.set(x, "canvasOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasOptionsUndefined: Self = StObject.set(x, "canvasOptions", js.undefined)
    
    @scala.inline
    def setNewCanvasCssStyle(value: String): Self = StObject.set(x, "newCanvasCssStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewCanvasCssStyleUndefined: Self = StObject.set(x, "newCanvasCssStyle", js.undefined)
  }
}

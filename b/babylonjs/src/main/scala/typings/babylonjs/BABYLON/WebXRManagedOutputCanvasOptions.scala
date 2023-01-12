package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.XRWebGLLayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRManagedOutputCanvasOptions extends StObject {
  
  /**
    * An optional canvas in case you wish to create it yourself and provide it here.
    * If not provided, a new canvas will be created
    */
  var canvasElement: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  /**
    * Options for this XR Layer output
    */
  var canvasOptions: js.UndefOr[XRWebGLLayerInit] = js.undefined
  
  /**
    * CSS styling for a newly created canvas (if not provided)
    */
  var newCanvasCssStyle: js.UndefOr[String] = js.undefined
}
object WebXRManagedOutputCanvasOptions {
  
  inline def apply(): WebXRManagedOutputCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXRManagedOutputCanvasOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebXRManagedOutputCanvasOptions] (val x: Self) extends AnyVal {
    
    inline def setCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "canvasElement", value.asInstanceOf[js.Any])
    
    inline def setCanvasElementUndefined: Self = StObject.set(x, "canvasElement", js.undefined)
    
    inline def setCanvasOptions(value: XRWebGLLayerInit): Self = StObject.set(x, "canvasOptions", value.asInstanceOf[js.Any])
    
    inline def setCanvasOptionsUndefined: Self = StObject.set(x, "canvasOptions", js.undefined)
    
    inline def setNewCanvasCssStyle(value: String): Self = StObject.set(x, "newCanvasCssStyle", value.asInstanceOf[js.Any])
    
    inline def setNewCanvasCssStyleUndefined: Self = StObject.set(x, "newCanvasCssStyle", js.undefined)
  }
}

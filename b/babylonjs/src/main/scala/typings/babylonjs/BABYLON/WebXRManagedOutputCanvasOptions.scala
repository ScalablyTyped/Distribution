package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.XRWebGLLayerInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRManagedOutputCanvasOptions extends js.Object {
  
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
  implicit class WebXRManagedOutputCanvasOptionsOps[Self <: WebXRManagedOutputCanvasOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanvasElement(value: HTMLCanvasElement): Self = this.set("canvasElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasElement: Self = this.set("canvasElement", js.undefined)
    
    @scala.inline
    def setCanvasOptions(value: XRWebGLLayerInit): Self = this.set("canvasOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasOptions: Self = this.set("canvasOptions", js.undefined)
    
    @scala.inline
    def setNewCanvasCssStyle(value: String): Self = this.set("newCanvasCssStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewCanvasCssStyle: Self = this.set("newCanvasCssStyle", js.undefined)
  }
}

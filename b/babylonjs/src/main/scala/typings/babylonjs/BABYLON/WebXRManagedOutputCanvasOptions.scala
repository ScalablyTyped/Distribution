package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.XRWebGLLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRManagedOutputCanvasOptions")
@js.native
class WebXRManagedOutputCanvasOptions () extends js.Object {
  /**
    * An optional canvas in case you wish to create it yourself and provide it here.
    * If not provided, a new canvas will be created
    */
  var canvasElement: js.UndefOr[HTMLCanvasElement] = js.native
  /**
    * Options for this XR Layer output
    */
  var canvasOptions: js.UndefOr[XRWebGLLayerOptions] = js.native
  /**
    * CSS styling for a newly created canvas (if not provided)
    */
  var newCanvasCssStyle: js.UndefOr[String] = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXRManagedOutputCanvasOptions")
@js.native
object WebXRManagedOutputCanvasOptions extends js.Object {
  /**
    * Get the default values of the configuration object
    * @returns default values of this configuration object
    */
  def GetDefaults(): WebXRManagedOutputCanvasOptions = js.native
}


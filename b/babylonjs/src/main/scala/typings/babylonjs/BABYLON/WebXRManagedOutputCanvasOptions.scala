package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.XRWebGLLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXRManagedOutputCanvasOptions extends js.Object {
  /**
    * An optional canvas in case you wish to create it yourself and provide it here.
    * If not provided, a new canvas will be created
    */
  var canvasElement: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * Options for this XR Layer output
    */
  var canvasOptions: js.UndefOr[XRWebGLLayerOptions] = js.undefined
  /**
    * CSS styling for a newly created canvas (if not provided)
    */
  var newCanvasCssStyle: js.UndefOr[String] = js.undefined
}

object WebXRManagedOutputCanvasOptions {
  @scala.inline
  def apply(
    canvasElement: HTMLCanvasElement = null,
    canvasOptions: XRWebGLLayerOptions = null,
    newCanvasCssStyle: String = null
  ): WebXRManagedOutputCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (canvasElement != null) __obj.updateDynamic("canvasElement")(canvasElement.asInstanceOf[js.Any])
    if (canvasOptions != null) __obj.updateDynamic("canvasOptions")(canvasOptions.asInstanceOf[js.Any])
    if (newCanvasCssStyle != null) __obj.updateDynamic("newCanvasCssStyle")(newCanvasCssStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRManagedOutputCanvasOptions]
  }
}


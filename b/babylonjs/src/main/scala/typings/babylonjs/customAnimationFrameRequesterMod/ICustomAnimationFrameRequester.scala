package typings.babylonjs.customAnimationFrameRequesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomAnimationFrameRequester extends js.Object {
  
  /**
    * This function will be called when the render loop is ready. If this is not populated, the engine's renderloop function will be called
    */
  var renderFunction: js.UndefOr[js.Function] = js.native
  
  /**
    * Called to request the next frame to render to
    * @see https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame
    */
  var requestAnimationFrame: js.Function = js.native
  
  /**
    * You can pass this value to cancelAnimationFrame() to cancel the refresh callback request
    * @see https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame#Return_value
    */
  var requestID: js.UndefOr[Double] = js.native
}
object ICustomAnimationFrameRequester {
  
  @scala.inline
  def apply(requestAnimationFrame: js.Function): ICustomAnimationFrameRequester = {
    val __obj = js.Dynamic.literal(requestAnimationFrame = requestAnimationFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomAnimationFrameRequester]
  }
  
  @scala.inline
  implicit class ICustomAnimationFrameRequesterOps[Self <: ICustomAnimationFrameRequester] (val x: Self) extends AnyVal {
    
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
    def setRequestAnimationFrame(value: js.Function): Self = this.set("requestAnimationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFunction(value: js.Function): Self = this.set("renderFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderFunction: Self = this.set("renderFunction", js.undefined)
    
    @scala.inline
    def setRequestID(value: Double): Self = this.set("requestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestID: Self = this.set("requestID", js.undefined)
  }
}

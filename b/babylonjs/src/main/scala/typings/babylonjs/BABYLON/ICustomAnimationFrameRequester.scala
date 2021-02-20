package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomAnimationFrameRequester extends StObject {
  
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
  implicit class ICustomAnimationFrameRequesterMutableBuilder[Self <: ICustomAnimationFrameRequester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderFunction(value: js.Function): Self = StObject.set(x, "renderFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFunctionUndefined: Self = StObject.set(x, "renderFunction", js.undefined)
    
    @scala.inline
    def setRequestAnimationFrame(value: js.Function): Self = StObject.set(x, "requestAnimationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestID(value: Double): Self = StObject.set(x, "requestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIDUndefined: Self = StObject.set(x, "requestID", js.undefined)
  }
}

package typings.baiduApp.swan

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFrameRecordedOptions extends StObject {
  
  /**  录音分片结果数据 */
  var frameBuffer: ArrayBuffer = js.native
  
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean = js.native
}
object OnFrameRecordedOptions {
  
  @scala.inline
  def apply(frameBuffer: ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedOptions = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFrameRecordedOptions]
  }
  
  @scala.inline
  implicit class OnFrameRecordedOptionsMutableBuilder[Self <: OnFrameRecordedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameBuffer(value: ArrayBuffer): Self = StObject.set(x, "frameBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastFrame(value: Boolean): Self = StObject.set(x, "isLastFrame", value.asInstanceOf[js.Any])
  }
}

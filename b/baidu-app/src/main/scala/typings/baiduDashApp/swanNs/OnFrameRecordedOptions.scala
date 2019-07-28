package typings.baiduDashApp.swanNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFrameRecordedOptions extends js.Object {
  /**  录音分片结果数据 */
  var frameBuffer: ArrayBuffer
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean
}

object OnFrameRecordedOptions {
  @scala.inline
  def apply(frameBuffer: ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedOptions = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer, isLastFrame = isLastFrame)
  
    __obj.asInstanceOf[OnFrameRecordedOptions]
  }
}


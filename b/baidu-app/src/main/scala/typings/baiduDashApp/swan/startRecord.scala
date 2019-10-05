package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.startRecord")
@js.native
object startRecord extends js.Object {
  /**
  	 * 开始录音。当主动调用swan.stopRecord，
  	 * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
  	 * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
  	 * 如需持久保存，需在主动调用swan.saveFile，在小程序下次启动时才能访问得到。
  	 * @deprecated 1.6.0
  	 */
  def apply(options: StartRecordAudioOptions): Unit = js.native
}


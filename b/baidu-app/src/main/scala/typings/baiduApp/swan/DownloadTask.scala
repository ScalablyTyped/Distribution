package typings.baiduApp.swan

import typings.baiduApp.anon.TotalBytesExpectedToWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadTask extends js.Object {
  
  /**
    * 中断下载任务
    * @version 1.4.0
    */
  def abort(): Unit = js.native
  
  /**
    * 监听下载进度变化
    * @version 1.4.0
    */
  def onProgressUpdate(): Unit = js.native
  def onProgressUpdate(callback: js.Function1[/* res */ TotalBytesExpectedToWrite, Unit]): Unit = js.native
}

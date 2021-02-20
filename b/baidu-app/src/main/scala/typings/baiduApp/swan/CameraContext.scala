package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraContext extends StObject {
  
  /** 开始录像 */
  def startRecord(options: StartRecordOptions): Unit = js.native
  
  /** 结束录像，成功则返回封面与视频 */
  def stopRecord(options: StopRecordOptions): Unit = js.native
  
  /** 拍照，可指定质量，成功则返回图片 */
  def takePhoto(options: TakePhotoOptions): Unit = js.native
}
object CameraContext {
  
  @scala.inline
  def apply(
    startRecord: StartRecordOptions => Unit,
    stopRecord: StopRecordOptions => Unit,
    takePhoto: TakePhotoOptions => Unit
  ): CameraContext = {
    val __obj = js.Dynamic.literal(startRecord = js.Any.fromFunction1(startRecord), stopRecord = js.Any.fromFunction1(stopRecord), takePhoto = js.Any.fromFunction1(takePhoto))
    __obj.asInstanceOf[CameraContext]
  }
  
  @scala.inline
  implicit class CameraContextMutableBuilder[Self <: CameraContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartRecord(value: StartRecordOptions => Unit): Self = StObject.set(x, "startRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopRecord(value: StopRecordOptions => Unit): Self = StObject.set(x, "stopRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTakePhoto(value: TakePhotoOptions => Unit): Self = StObject.set(x, "takePhoto", js.Any.fromFunction1(value))
  }
}

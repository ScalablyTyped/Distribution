package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContext extends StObject {
  
  /** 开始录像 */
  def startRecord(options: StartRecordOptions): Unit
  
  /** 结束录像，成功则返回封面与视频 */
  def stopRecord(options: StopRecordOptions): Unit
  
  /** 拍照，可指定质量，成功则返回图片 */
  def takePhoto(options: TakePhotoOptions): Unit
}
object CameraContext {
  
  inline def apply(
    startRecord: StartRecordOptions => Unit,
    stopRecord: StopRecordOptions => Unit,
    takePhoto: TakePhotoOptions => Unit
  ): CameraContext = {
    val __obj = js.Dynamic.literal(startRecord = js.Any.fromFunction1(startRecord), stopRecord = js.Any.fromFunction1(stopRecord), takePhoto = js.Any.fromFunction1(takePhoto))
    __obj.asInstanceOf[CameraContext]
  }
  
  extension [Self <: CameraContext](x: Self) {
    
    inline def setStartRecord(value: StartRecordOptions => Unit): Self = StObject.set(x, "startRecord", js.Any.fromFunction1(value))
    
    inline def setStopRecord(value: StopRecordOptions => Unit): Self = StObject.set(x, "stopRecord", js.Any.fromFunction1(value))
    
    inline def setTakePhoto(value: TakePhotoOptions => Unit): Self = StObject.set(x, "takePhoto", js.Any.fromFunction1(value))
  }
}

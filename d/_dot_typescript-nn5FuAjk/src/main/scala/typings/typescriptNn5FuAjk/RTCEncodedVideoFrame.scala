package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCEncodedVideoFrame extends StObject {
  
  var data: ArrayBuffer
  
  def getMetadata(): RTCEncodedVideoFrameMetadata
  
  val timestamp: Double
  
  val `type`: RTCEncodedVideoFrameType
}
object RTCEncodedVideoFrame {
  
  inline def apply(
    data: ArrayBuffer,
    getMetadata: () => RTCEncodedVideoFrameMetadata,
    timestamp: Double,
    `type`: RTCEncodedVideoFrameType
  ): RTCEncodedVideoFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getMetadata = js.Any.fromFunction0(getMetadata), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCEncodedVideoFrame]
  }
  
  extension [Self <: RTCEncodedVideoFrame](x: Self) {
    
    inline def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetMetadata(value: () => RTCEncodedVideoFrameMetadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: RTCEncodedVideoFrameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

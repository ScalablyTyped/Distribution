package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDTMFSenderEventMap extends StObject {
  
  var tonechange: RTCDTMFToneChangeEvent
}
object RTCDTMFSenderEventMap {
  
  inline def apply(tonechange: RTCDTMFToneChangeEvent): RTCDTMFSenderEventMap = {
    val __obj = js.Dynamic.literal(tonechange = tonechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDTMFSenderEventMap]
  }
  
  extension [Self <: RTCDTMFSenderEventMap](x: Self) {
    
    inline def setTonechange(value: RTCDTMFToneChangeEvent): Self = StObject.set(x, "tonechange", value.asInstanceOf[js.Any])
  }
}

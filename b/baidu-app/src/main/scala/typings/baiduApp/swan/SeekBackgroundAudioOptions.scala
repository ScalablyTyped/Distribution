package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeekBackgroundAudioOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 音乐位置，单位：秒 */
  var position: Double
}
object SeekBackgroundAudioOptions {
  
  inline def apply(position: Double): SeekBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekBackgroundAudioOptions]
  }
  
  extension [Self <: SeekBackgroundAudioOptions](x: Self) {
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

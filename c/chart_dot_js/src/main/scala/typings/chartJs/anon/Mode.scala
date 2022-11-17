package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var cancelable: true
  
  var mode: UpdateMode
}
object Mode {
  
  inline def apply(mode: UpdateMode): Mode = {
    val __obj = js.Dynamic.literal(cancelable = true, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setCancelable(value: true): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}

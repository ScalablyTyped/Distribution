package typings.babylonjs

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRInputSourceEventInit
  extends StObject
     with EventInit {
  
  var frame: js.UndefOr[XRFrame] = js.undefined
  
  var inputSource: js.UndefOr[XRInputSource] = js.undefined
}
object XRInputSourceEventInit {
  
  inline def apply(): XRInputSourceEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRInputSourceEventInit]
  }
  
  extension [Self <: XRInputSourceEventInit](x: Self) {
    
    inline def setFrame(value: XRFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setInputSource(value: XRInputSource): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
    
    inline def setInputSourceUndefined: Self = StObject.set(x, "inputSource", js.undefined)
  }
}

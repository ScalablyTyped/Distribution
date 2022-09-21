package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMod {
  
  @JSImport("black-engine/system/Device", "Device")
  @js.native
  open class Device () extends StObject {
    
    def getDevicePixelRatio(): Double = js.native
    
    def isMobile: Boolean = js.native
    
    def isTouch: Boolean = js.native
    
    /* private */ var mPixelRatioCache: Any = js.native
    
    def os: String = js.native
    
    def pixelRatio: Double = js.native
    
    def webAudioSupported: Boolean = js.native
  }
}

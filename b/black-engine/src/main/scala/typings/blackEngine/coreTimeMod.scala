package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreTimeMod {
  
  @JSImport("black-engine/core/Time", "Time")
  @js.native
  open class Time () extends StObject {
    
    def alpha: Double = js.native
    
    def delta: Double = js.native
    
    def dt: Double = js.native
    
    /* private */ var mActualTime: Any = js.native
    
    /* private */ var mAlphaTime: Any = js.native
    
    /* private */ var mDeltaTime: Any = js.native
    
    /* private */ var mDeltaTimeMs: Any = js.native
    
    /* private */ var mRenderOffset: Any = js.native
    
    /* private */ var mScale: Any = js.native
    
    /* private */ var mTime: Any = js.native
    
    def now: Double = js.native
    
    def scale: Double = js.native
    def scale_=(arg: Double): Unit = js.native
  }
}

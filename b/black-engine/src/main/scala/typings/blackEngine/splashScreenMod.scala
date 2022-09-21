package typings.blackEngine

import typings.blackEngine.anon.Height
import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splashScreenMod {
  
  @JSImport("black-engine/core/SplashScreen", "SplashScreen")
  @js.native
  open class SplashScreen () extends MessageDispatcher {
    def this(duration: Double) = this()
    
    def calculateAspectRatioFit(srcWidth: Any, srcHeight: Any, maxWidth: Any, maxHeight: Any): Height = js.native
    
    /* private */ var mDuration: Any = js.native
    
    /* private */ var mSvgLogo: Any = js.native
    
    /* private */ var mSvgText: Any = js.native
    
    def show(): Unit = js.native
  }
}

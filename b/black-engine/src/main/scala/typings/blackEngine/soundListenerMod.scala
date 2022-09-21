package typings.blackEngine

import typings.blackEngine.componentMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundListenerMod {
  
  @JSImport("black-engine/audio/SoundListener", "SoundListener")
  @js.native
  open class SoundListener () extends Component {
    
    def listen(): Unit = js.native
    
    def loose(): Unit = js.native
    
    def onRemoved(gameObject: Any): Unit = js.native
  }
}

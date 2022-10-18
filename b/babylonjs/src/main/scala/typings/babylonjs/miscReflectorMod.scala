package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscReflectorMod {
  
  @JSImport("babylonjs/Misc/reflector", "Reflector")
  @js.native
  open class Reflector protected () extends StObject {
    /**
      * Constructs a reflector object.
      * @param scene The scene to use
      * @param hostname The hostname of the reflector bridge
      * @param port The port of the reflector bridge
      */
    def this(scene: Scene, hostname: String, port: Double) = this()
    
    /* private */ var _handleClientMessage: Any = js.native
    
    /* private */ var _handleServerMessage: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _webSocket: Any = js.native
    
    /**
      * Closes the reflector connection
      */
    def close(): Unit = js.native
  }
  /* static members */
  object Reflector {
    
    @JSImport("babylonjs/Misc/reflector", "Reflector._SERVER_PREFIX")
    @js.native
    val _SERVER_PREFIX: Any = js.native
  }
}

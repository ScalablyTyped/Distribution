package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Reflector")
@js.native
open class Reflector protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Reflector {
  /**
    * Constructs a reflector object.
    * @param scene The scene to use
    * @param hostname The hostname of the reflector bridge
    * @param port The port of the reflector bridge
    */
  def this(scene: typings.babylonjs.BABYLON.Scene, hostname: String, port: Double) = this()
  
  /* private */ /* CompleteClass */
  var _handleClientMessage: Any = js.native
  
  /* private */ /* CompleteClass */
  var _handleServerMessage: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: Any = js.native
  
  /* private */ /* CompleteClass */
  var _webSocket: Any = js.native
  
  /**
    * Closes the reflector connection
    */
  /* CompleteClass */
  override def close(): Unit = js.native
}
/* static members */
object Reflector {
  
  @JSGlobal("BABYLON.Reflector._SERVER_PREFIX")
  @js.native
  val _SERVER_PREFIX: Any = js.native
}

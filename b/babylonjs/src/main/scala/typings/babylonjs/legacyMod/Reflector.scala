package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Reflector")
@js.native
open class Reflector protected ()
  extends typings.babylonjs.indexMod.Reflector {
  /**
    * Constructs a reflector object.
    * @param scene The scene to use
    * @param hostname The hostname of the reflector bridge
    * @param port The port of the reflector bridge
    */
  def this(scene: typings.babylonjs.sceneMod.Scene, hostname: String, port: Double) = this()
}
/* static members */
object Reflector {
  
  @JSImport("babylonjs/Legacy/legacy", "Reflector._SERVER_PREFIX")
  @js.native
  val _SERVER_PREFIX: Any = js.native
}

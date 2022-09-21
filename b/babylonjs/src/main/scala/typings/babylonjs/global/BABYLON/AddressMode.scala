package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AddressMode")
@js.native
object AddressMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.babylonjs.BABYLON.AddressMode & String] = js.native
  
  /* "clamp-to-edge" */ val ClampToEdge: typings.babylonjs.BABYLON.AddressMode.ClampToEdge & String = js.native
  
  /* "mirror-repeat" */ val MirrorRepeat: typings.babylonjs.BABYLON.AddressMode.MirrorRepeat & String = js.native
  
  /* "repeat" */ val Repeat: typings.babylonjs.BABYLON.AddressMode.Repeat & String = js.native
}

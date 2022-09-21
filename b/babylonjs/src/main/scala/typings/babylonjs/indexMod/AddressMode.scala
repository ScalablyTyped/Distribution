package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AddressMode")
@js.native
object AddressMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.babylonjs.webgpuConstantsMod.AddressMode & String] = js.native
  
  /* "clamp-to-edge" */ val ClampToEdge: typings.babylonjs.webgpuConstantsMod.AddressMode.ClampToEdge & String = js.native
  
  /* "mirror-repeat" */ val MirrorRepeat: typings.babylonjs.webgpuConstantsMod.AddressMode.MirrorRepeat & String = js.native
  
  /* "repeat" */ val Repeat: typings.babylonjs.webgpuConstantsMod.AddressMode.Repeat & String = js.native
}

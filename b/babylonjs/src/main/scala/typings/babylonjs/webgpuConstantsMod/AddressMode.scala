package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddressMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "AddressMode")
@js.native
object AddressMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AddressMode & String] = js.native
  
  @js.native
  sealed trait ClampToEdge
    extends StObject
       with AddressMode
  /* "clamp-to-edge" */ val ClampToEdge: typings.babylonjs.webgpuConstantsMod.AddressMode.ClampToEdge & String = js.native
  
  @js.native
  sealed trait MirrorRepeat
    extends StObject
       with AddressMode
  /* "mirror-repeat" */ val MirrorRepeat: typings.babylonjs.webgpuConstantsMod.AddressMode.MirrorRepeat & String = js.native
  
  @js.native
  sealed trait Repeat
    extends StObject
       with AddressMode
  /* "repeat" */ val Repeat: typings.babylonjs.webgpuConstantsMod.AddressMode.Repeat & String = js.native
}

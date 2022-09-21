package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CullMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "CullMode")
@js.native
object CullMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CullMode & String] = js.native
  
  @js.native
  sealed trait Back
    extends StObject
       with CullMode
  /* "back" */ val Back: typings.babylonjs.webgpuConstantsMod.CullMode.Back & String = js.native
  
  @js.native
  sealed trait Front
    extends StObject
       with CullMode
  /* "front" */ val Front: typings.babylonjs.webgpuConstantsMod.CullMode.Front & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CullMode
  /* "none" */ val None: typings.babylonjs.webgpuConstantsMod.CullMode.None & String = js.native
}

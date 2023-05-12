package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MipmapFilterMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "MipmapFilterMode")
@js.native
object MipmapFilterMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MipmapFilterMode & String] = js.native
  
  @js.native
  sealed trait Linear
    extends StObject
       with MipmapFilterMode
  /* "linear" */ val Linear: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.MipmapFilterMode.Linear & String = js.native
  
  @js.native
  sealed trait Nearest
    extends StObject
       with MipmapFilterMode
  /* "nearest" */ val Nearest: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.MipmapFilterMode.Nearest & String = js.native
}

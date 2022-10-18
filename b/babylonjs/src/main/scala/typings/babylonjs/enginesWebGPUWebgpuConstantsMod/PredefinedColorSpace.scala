package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PredefinedColorSpace extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "PredefinedColorSpace")
@js.native
object PredefinedColorSpace extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PredefinedColorSpace & String] = js.native
  
  @js.native
  sealed trait SRGB
    extends StObject
       with PredefinedColorSpace
  /* "srgb" */ val SRGB: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PredefinedColorSpace.SRGB & String = js.native
}

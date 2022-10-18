package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PowerPreference extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "PowerPreference")
@js.native
object PowerPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PowerPreference & String] = js.native
  
  @js.native
  sealed trait HighPerformance
    extends StObject
       with PowerPreference
  /* "high-performance" */ val HighPerformance: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PowerPreference.HighPerformance & String = js.native
  
  @js.native
  sealed trait LowPower
    extends StObject
       with PowerPreference
  /* "low-power" */ val LowPower: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PowerPreference.LowPower & String = js.native
}

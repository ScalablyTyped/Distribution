package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceLostReason extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "DeviceLostReason")
@js.native
object DeviceLostReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeviceLostReason & String] = js.native
  
  @js.native
  sealed trait Destroyed
    extends StObject
       with DeviceLostReason
  /* "destroyed" */ val Destroyed: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.DeviceLostReason.Destroyed & String = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with DeviceLostReason
  /* "unknown" */ val Unknown: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.DeviceLostReason.Unknown & String = js.native
}

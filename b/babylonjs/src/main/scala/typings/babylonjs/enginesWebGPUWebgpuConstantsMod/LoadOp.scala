package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoadOp extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "LoadOp")
@js.native
object LoadOp extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LoadOp & String] = js.native
  
  @js.native
  sealed trait Clear
    extends StObject
       with LoadOp
  /* "clear" */ val Clear: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.LoadOp.Clear & String = js.native
  
  @js.native
  sealed trait Load
    extends StObject
       with LoadOp
  /* "load" */ val Load: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.LoadOp.Load & String = js.native
}

package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputStepMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "InputStepMode")
@js.native
object InputStepMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InputStepMode & String] = js.native
  
  @js.native
  sealed trait Instance
    extends StObject
       with InputStepMode
  /* "instance" */ val Instance: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.InputStepMode.Instance & String = js.native
  
  @js.native
  sealed trait Vertex
    extends StObject
       with InputStepMode
  /* "vertex" */ val Vertex: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.InputStepMode.Vertex & String = js.native
}

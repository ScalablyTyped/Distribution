package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipelineErrorReason extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "PipelineErrorReason")
@js.native
object PipelineErrorReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PipelineErrorReason & String] = js.native
  
  @js.native
  sealed trait Internal
    extends StObject
       with PipelineErrorReason
  /* "internal" */ val Internal: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PipelineErrorReason.Internal & String = js.native
  
  @js.native
  sealed trait Validation
    extends StObject
       with PipelineErrorReason
  /* "validation" */ val Validation: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PipelineErrorReason.Validation & String = js.native
}

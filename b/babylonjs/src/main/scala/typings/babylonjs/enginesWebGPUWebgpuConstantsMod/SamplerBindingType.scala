package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SamplerBindingType extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "SamplerBindingType")
@js.native
object SamplerBindingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SamplerBindingType & String] = js.native
  
  @js.native
  sealed trait Comparison
    extends StObject
       with SamplerBindingType
  /* "comparison" */ val Comparison: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.SamplerBindingType.Comparison & String = js.native
  
  @js.native
  sealed trait Filtering
    extends StObject
       with SamplerBindingType
  /* "filtering" */ val Filtering: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.SamplerBindingType.Filtering & String = js.native
  
  @js.native
  sealed trait NonFiltering
    extends StObject
       with SamplerBindingType
  /* "non-filtering" */ val NonFiltering: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.SamplerBindingType.NonFiltering & String = js.native
}

package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorFilter extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "ErrorFilter")
@js.native
object ErrorFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorFilter & String] = js.native
  
  @js.native
  sealed trait OutOfMemory
    extends StObject
       with ErrorFilter
  /* "out-of-memory" */ val OutOfMemory: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.ErrorFilter.OutOfMemory & String = js.native
  
  @js.native
  sealed trait Validation
    extends StObject
       with ErrorFilter
  /* "validation" */ val Validation: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.ErrorFilter.Validation & String = js.native
}

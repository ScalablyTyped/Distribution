package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompilationMessageType extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "CompilationMessageType")
@js.native
object CompilationMessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CompilationMessageType & String] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with CompilationMessageType
  /* "error" */ val Error: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.CompilationMessageType.Error & String = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with CompilationMessageType
  /* "info" */ val Info: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.CompilationMessageType.Info & String = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with CompilationMessageType
  /* "warning" */ val Warning: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.CompilationMessageType.Warning & String = js.native
}

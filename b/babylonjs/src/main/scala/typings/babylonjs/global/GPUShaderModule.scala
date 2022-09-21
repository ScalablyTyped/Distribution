package typings.babylonjs.global

import typings.babylonjs.GPUCompilationInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GPUShaderModule")
@js.native
open class GPUShaderModule ()
  extends StObject
     with typings.babylonjs.GPUShaderModule {
  
  /* CompleteClass */
  override def compilationInfo(): js.Promise[GPUCompilationInfo] = js.native
}

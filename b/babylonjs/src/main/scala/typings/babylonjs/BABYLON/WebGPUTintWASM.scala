package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUTintWASM extends StObject {
  
  def convertSpirV2WGSL(code: js.typedarray.Uint32Array): String = js.native
  def convertSpirV2WGSL(code: js.typedarray.Uint32Array, disableUniformityAnalysis: Boolean): String = js.native
  
  def initTwgsl(): js.Promise[Unit] = js.native
  def initTwgsl(twgslOptions: TwgslOptions): js.Promise[Unit] = js.native
}

package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderPassTimestampLocation extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "RenderPassTimestampLocation")
@js.native
object RenderPassTimestampLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RenderPassTimestampLocation & String] = js.native
  
  @js.native
  sealed trait Beginning
    extends StObject
       with RenderPassTimestampLocation
  /* "beginning" */ val Beginning: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.RenderPassTimestampLocation.Beginning & String = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with RenderPassTimestampLocation
  /* "end" */ val End: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.RenderPassTimestampLocation.End & String = js.native
}

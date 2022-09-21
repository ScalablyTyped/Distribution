package typings.babylonjs.webgpuConstantsMod

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
  /* "beginning" */ val Beginning: typings.babylonjs.webgpuConstantsMod.RenderPassTimestampLocation.Beginning & String = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with RenderPassTimestampLocation
  /* "end" */ val End: typings.babylonjs.webgpuConstantsMod.RenderPassTimestampLocation.End & String = js.native
}

package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComputePassTimestampLocation extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "ComputePassTimestampLocation")
@js.native
object ComputePassTimestampLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ComputePassTimestampLocation & String] = js.native
  
  @js.native
  sealed trait Beginning
    extends StObject
       with ComputePassTimestampLocation
  /* "beginning" */ val Beginning: typings.babylonjs.webgpuConstantsMod.ComputePassTimestampLocation.Beginning & String = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with ComputePassTimestampLocation
  /* "end" */ val End: typings.babylonjs.webgpuConstantsMod.ComputePassTimestampLocation.End & String = js.native
}

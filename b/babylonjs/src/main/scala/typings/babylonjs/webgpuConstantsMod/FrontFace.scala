package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrontFace extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "FrontFace")
@js.native
object FrontFace extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FrontFace & String] = js.native
  
  @js.native
  sealed trait CCW
    extends StObject
       with FrontFace
  /* "ccw" */ val CCW: typings.babylonjs.webgpuConstantsMod.FrontFace.CCW & String = js.native
  
  @js.native
  sealed trait CW
    extends StObject
       with FrontFace
  /* "cw" */ val CW: typings.babylonjs.webgpuConstantsMod.FrontFace.CW & String = js.native
}

package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoLayoutMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "AutoLayoutMode")
@js.native
object AutoLayoutMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoLayoutMode & String] = js.native
  
  @js.native
  sealed trait Auto
    extends StObject
       with AutoLayoutMode
  /* "auto" */ val Auto: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.AutoLayoutMode.Auto & String = js.native
}

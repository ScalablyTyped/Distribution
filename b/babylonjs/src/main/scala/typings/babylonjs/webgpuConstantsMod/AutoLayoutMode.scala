package typings.babylonjs.webgpuConstantsMod

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
  /* "auto" */ val Auto: typings.babylonjs.webgpuConstantsMod.AutoLayoutMode.Auto & String = js.native
}

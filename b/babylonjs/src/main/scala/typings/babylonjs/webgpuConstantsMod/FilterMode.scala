package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "FilterMode")
@js.native
object FilterMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterMode & String] = js.native
  
  @js.native
  sealed trait Linear
    extends StObject
       with FilterMode
  /* "linear" */ val Linear: typings.babylonjs.webgpuConstantsMod.FilterMode.Linear & String = js.native
  
  @js.native
  sealed trait Nearest
    extends StObject
       with FilterMode
  /* "nearest" */ val Nearest: typings.babylonjs.webgpuConstantsMod.FilterMode.Nearest & String = js.native
}

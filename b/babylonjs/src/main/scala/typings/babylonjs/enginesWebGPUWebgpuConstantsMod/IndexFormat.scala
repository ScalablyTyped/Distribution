package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexFormat extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "IndexFormat")
@js.native
object IndexFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IndexFormat & String] = js.native
  
  @js.native
  sealed trait Uint16
    extends StObject
       with IndexFormat
  /* "uint16" */ val Uint16: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.IndexFormat.Uint16 & String = js.native
  
  @js.native
  sealed trait Uint32
    extends StObject
       with IndexFormat
  /* "uint32" */ val Uint32: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.IndexFormat.Uint32 & String = js.native
}

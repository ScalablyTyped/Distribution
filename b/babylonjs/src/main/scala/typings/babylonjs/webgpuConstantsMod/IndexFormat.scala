package typings.babylonjs.webgpuConstantsMod

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
  /* "uint16" */ val Uint16: typings.babylonjs.webgpuConstantsMod.IndexFormat.Uint16 & String = js.native
  
  @js.native
  sealed trait Uint32
    extends StObject
       with IndexFormat
  /* "uint32" */ val Uint32: typings.babylonjs.webgpuConstantsMod.IndexFormat.Uint32 & String = js.native
}

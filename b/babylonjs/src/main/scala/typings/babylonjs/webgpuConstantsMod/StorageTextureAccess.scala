package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageTextureAccess extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "StorageTextureAccess")
@js.native
object StorageTextureAccess extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StorageTextureAccess & String] = js.native
  
  @js.native
  sealed trait WriteOnly
    extends StObject
       with StorageTextureAccess
  /* "write-only" */ val WriteOnly: typings.babylonjs.webgpuConstantsMod.StorageTextureAccess.WriteOnly & String = js.native
}

package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StoreOp extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "StoreOp")
@js.native
object StoreOp extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StoreOp & String] = js.native
  
  @js.native
  sealed trait Discard
    extends StObject
       with StoreOp
  /* "discard" */ val Discard: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.StoreOp.Discard & String = js.native
  
  @js.native
  sealed trait Store
    extends StObject
       with StoreOp
  /* "store" */ val Store: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.StoreOp.Store & String = js.native
}

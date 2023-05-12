package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BufferMapState extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "BufferMapState")
@js.native
object BufferMapState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BufferMapState & String] = js.native
  
  @js.native
  sealed trait Mapped
    extends StObject
       with BufferMapState
  /* "mapped" */ val Mapped: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.BufferMapState.Mapped & String = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with BufferMapState
  /* "pending" */ val Pending: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.BufferMapState.Pending & String = js.native
  
  @js.native
  sealed trait Unmapped
    extends StObject
       with BufferMapState
  /* "unmapped" */ val Unmapped: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.BufferMapState.Unmapped & String = js.native
}

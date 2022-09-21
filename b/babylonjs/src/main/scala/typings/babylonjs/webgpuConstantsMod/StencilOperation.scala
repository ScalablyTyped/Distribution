package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilOperation extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "StencilOperation")
@js.native
object StencilOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StencilOperation & String] = js.native
  
  @js.native
  sealed trait DecrementClamp
    extends StObject
       with StencilOperation
  /* "decrement-clamp" */ val DecrementClamp: typings.babylonjs.webgpuConstantsMod.StencilOperation.DecrementClamp & String = js.native
  
  @js.native
  sealed trait DecrementWrap
    extends StObject
       with StencilOperation
  /* "decrement-wrap" */ val DecrementWrap: typings.babylonjs.webgpuConstantsMod.StencilOperation.DecrementWrap & String = js.native
  
  @js.native
  sealed trait IncrementClamp
    extends StObject
       with StencilOperation
  /* "increment-clamp" */ val IncrementClamp: typings.babylonjs.webgpuConstantsMod.StencilOperation.IncrementClamp & String = js.native
  
  @js.native
  sealed trait IncrementWrap
    extends StObject
       with StencilOperation
  /* "increment-wrap" */ val IncrementWrap: typings.babylonjs.webgpuConstantsMod.StencilOperation.IncrementWrap & String = js.native
  
  @js.native
  sealed trait Invert
    extends StObject
       with StencilOperation
  /* "invert" */ val Invert: typings.babylonjs.webgpuConstantsMod.StencilOperation.Invert & String = js.native
  
  @js.native
  sealed trait Keep
    extends StObject
       with StencilOperation
  /* "keep" */ val Keep: typings.babylonjs.webgpuConstantsMod.StencilOperation.Keep & String = js.native
  
  @js.native
  sealed trait Replace
    extends StObject
       with StencilOperation
  /* "replace" */ val Replace: typings.babylonjs.webgpuConstantsMod.StencilOperation.Replace & String = js.native
  
  @js.native
  sealed trait Zero
    extends StObject
       with StencilOperation
  /* "zero" */ val Zero: typings.babylonjs.webgpuConstantsMod.StencilOperation.Zero & String = js.native
}

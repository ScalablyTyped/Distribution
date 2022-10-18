package typings.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrimitiveTopology extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "PrimitiveTopology")
@js.native
object PrimitiveTopology extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrimitiveTopology & String] = js.native
  
  @js.native
  sealed trait LineList
    extends StObject
       with PrimitiveTopology
  /* "line-list" */ val LineList: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PrimitiveTopology.LineList & String = js.native
  
  @js.native
  sealed trait LineStrip
    extends StObject
       with PrimitiveTopology
  /* "line-strip" */ val LineStrip: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PrimitiveTopology.LineStrip & String = js.native
  
  @js.native
  sealed trait PointList
    extends StObject
       with PrimitiveTopology
  /* "point-list" */ val PointList: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PrimitiveTopology.PointList & String = js.native
  
  @js.native
  sealed trait TriangleList
    extends StObject
       with PrimitiveTopology
  /* "triangle-list" */ val TriangleList: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PrimitiveTopology.TriangleList & String = js.native
  
  @js.native
  sealed trait TriangleStrip
    extends StObject
       with PrimitiveTopology
  /* "triangle-strip" */ val TriangleStrip: typings.babylonjs.enginesWebGPUWebgpuConstantsMod.PrimitiveTopology.TriangleStrip & String = js.native
}

package typings.babylonjs.webgpuConstantsMod

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
  /* "line-list" */ val LineList: typings.babylonjs.webgpuConstantsMod.PrimitiveTopology.LineList & String = js.native
  
  @js.native
  sealed trait LineStrip
    extends StObject
       with PrimitiveTopology
  /* "line-strip" */ val LineStrip: typings.babylonjs.webgpuConstantsMod.PrimitiveTopology.LineStrip & String = js.native
  
  @js.native
  sealed trait PointList
    extends StObject
       with PrimitiveTopology
  /* "point-list" */ val PointList: typings.babylonjs.webgpuConstantsMod.PrimitiveTopology.PointList & String = js.native
  
  @js.native
  sealed trait TriangleList
    extends StObject
       with PrimitiveTopology
  /* "triangle-list" */ val TriangleList: typings.babylonjs.webgpuConstantsMod.PrimitiveTopology.TriangleList & String = js.native
  
  @js.native
  sealed trait TriangleStrip
    extends StObject
       with PrimitiveTopology
  /* "triangle-strip" */ val TriangleStrip: typings.babylonjs.webgpuConstantsMod.PrimitiveTopology.TriangleStrip & String = js.native
}

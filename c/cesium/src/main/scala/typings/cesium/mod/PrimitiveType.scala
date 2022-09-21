package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrimitiveType extends StObject
@JSImport("cesium", "PrimitiveType")
@js.native
object PrimitiveType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[PrimitiveType & scala.Nothing] = js.native
  
  /**
    * Lines primitive where each two vertices (or indices) is a line segment.  Line segments are not necessarily connected.
    */
  @js.native
  sealed trait LINES
    extends StObject
       with PrimitiveType
  /* WebGLConstants.LINES */ val LINES: typings.cesium.mod.PrimitiveType.LINES & scala.Nothing = js.native
  
  /**
    * Line loop primitive where each vertex (or index) after the first connects a line to
    * the previous vertex, and the last vertex implicitly connects to the first.
    */
  @js.native
  sealed trait LINE_LOOP
    extends StObject
       with PrimitiveType
  /* WebGLConstants.LINE_LOOP */ val LINE_LOOP: typings.cesium.mod.PrimitiveType.LINE_LOOP & scala.Nothing = js.native
  
  /**
    * Line strip primitive where each vertex (or index) after the first connects a line to the previous vertex.
    */
  @js.native
  sealed trait LINE_STRIP
    extends StObject
       with PrimitiveType
  /* WebGLConstants.LINE_STRIP */ val LINE_STRIP: typings.cesium.mod.PrimitiveType.LINE_STRIP & scala.Nothing = js.native
  
  /**
    * Points primitive where each vertex (or index) is a separate point.
    */
  @js.native
  sealed trait POINTS
    extends StObject
       with PrimitiveType
  /* WebGLConstants.POINTS */ val POINTS: typings.cesium.mod.PrimitiveType.POINTS & scala.Nothing = js.native
  
  /**
    * Triangles primitive where each three vertices (or indices) is a triangle.  Triangles do not necessarily share edges.
    */
  @js.native
  sealed trait TRIANGLES
    extends StObject
       with PrimitiveType
  /* WebGLConstants.TRIANGLES */ val TRIANGLES: typings.cesium.mod.PrimitiveType.TRIANGLES & scala.Nothing = js.native
  
  /**
    * Triangle fan primitive where each vertex (or index) after the first two connect to
    * the previous vertex and the first vertex forming a triangle.  For example, this can be used
    * to model a cone or circle.
    */
  @js.native
  sealed trait TRIANGLE_FAN
    extends StObject
       with PrimitiveType
  /* WebGLConstants.TRIANGLE_FAN */ val TRIANGLE_FAN: typings.cesium.mod.PrimitiveType.TRIANGLE_FAN & scala.Nothing = js.native
  
  /**
    * Triangle strip primitive where each vertex (or index) after the first two connect to
    * the previous two vertices forming a triangle.  For example, this can be used to model a wall.
    */
  @js.native
  sealed trait TRIANGLE_STRIP
    extends StObject
       with PrimitiveType
  /* WebGLConstants.TRIANGLE_STRIP */ val TRIANGLE_STRIP: typings.cesium.mod.PrimitiveType.TRIANGLE_STRIP & scala.Nothing = js.native
}

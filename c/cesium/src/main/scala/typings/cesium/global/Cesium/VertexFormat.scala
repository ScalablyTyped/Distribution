package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.VertexFormat")
@js.native
class VertexFormat ()
  extends typings.cesium.mod.VertexFormat {
  def this(options: js.Any) = this()
}
object VertexFormat {
  
  @JSGlobal("Cesium.VertexFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.VertexFormat.ALL")
  @js.native
  def ALL: typings.cesium.mod.VertexFormat = js.native
  inline def ALL_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.VertexFormat.DEFAULT")
  @js.native
  def DEFAULT: typings.cesium.mod.VertexFormat = js.native
  inline def DEFAULT_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.VertexFormat.POSITION_AND_COLOR")
  @js.native
  def POSITION_AND_COLOR: typings.cesium.mod.VertexFormat = js.native
  inline def POSITION_AND_COLOR_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_AND_COLOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.VertexFormat.POSITION_AND_NORMAL")
  @js.native
  def POSITION_AND_NORMAL: typings.cesium.mod.VertexFormat = js.native
  inline def POSITION_AND_NORMAL_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_AND_NORMAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.VertexFormat.POSITION_AND_ST")
  @js.native
  def POSITION_AND_ST: typings.cesium.mod.VertexFormat = js.native
  inline def POSITION_AND_ST_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_AND_ST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.VertexFormat.POSITION_NORMAL_AND_ST")
  @js.native
  def POSITION_NORMAL_AND_ST: typings.cesium.mod.VertexFormat = js.native
  inline def POSITION_NORMAL_AND_ST_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_NORMAL_AND_ST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.VertexFormat.POSITION_ONLY")
  @js.native
  def POSITION_ONLY: typings.cesium.mod.VertexFormat = js.native
  inline def POSITION_ONLY_=(x: typings.cesium.mod.VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_ONLY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def clone_(cartesian: typings.cesium.mod.VertexFormat): typings.cesium.mod.VertexFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.VertexFormat]
  inline def clone_(cartesian: typings.cesium.mod.VertexFormat, result: typings.cesium.mod.VertexFormat): typings.cesium.mod.VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.VertexFormat]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.VertexFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.VertexFormat]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.VertexFormat]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.VertexFormat): typings.cesium.mod.VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.VertexFormat]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.VertexFormat): typings.cesium.mod.VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.VertexFormat]
}

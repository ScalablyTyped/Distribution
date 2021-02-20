package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VertexFormat")
@js.native
class VertexFormat () extends Packable {
  def this(options: js.Any) = this()
  
  var binormal: Boolean = js.native
  
  var color: Boolean = js.native
  
  var normal: Boolean = js.native
  
  var position: Boolean = js.native
  
  var st: Boolean = js.native
  
  var tangent: Boolean = js.native
}
object VertexFormat {
  
  @JSImport("cesium", "VertexFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "VertexFormat.ALL")
  @js.native
  def ALL: VertexFormat = js.native
  @scala.inline
  def ALL_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "VertexFormat.DEFAULT")
  @js.native
  def DEFAULT: VertexFormat = js.native
  @scala.inline
  def DEFAULT_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "VertexFormat.POSITION_AND_COLOR")
  @js.native
  def POSITION_AND_COLOR: VertexFormat = js.native
  @scala.inline
  def POSITION_AND_COLOR_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_AND_COLOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "VertexFormat.POSITION_AND_NORMAL")
  @js.native
  def POSITION_AND_NORMAL: VertexFormat = js.native
  @scala.inline
  def POSITION_AND_NORMAL_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_AND_NORMAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "VertexFormat.POSITION_AND_ST")
  @js.native
  def POSITION_AND_ST: VertexFormat = js.native
  @scala.inline
  def POSITION_AND_ST_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_AND_ST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "VertexFormat.POSITION_NORMAL_AND_ST")
  @js.native
  def POSITION_NORMAL_AND_ST: VertexFormat = js.native
  @scala.inline
  def POSITION_NORMAL_AND_ST_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_NORMAL_AND_ST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "VertexFormat.POSITION_ONLY")
  @js.native
  def POSITION_ONLY: VertexFormat = js.native
  @scala.inline
  def POSITION_ONLY_=(x: VertexFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_ONLY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "VertexFormat.clone")
  @js.native
  def clone_(cartesian: VertexFormat): VertexFormat = js.native
  @JSImport("cesium", "VertexFormat.clone")
  @js.native
  def clone_(cartesian: VertexFormat, result: VertexFormat): VertexFormat = js.native
  
  /* static member */
  @JSImport("cesium", "VertexFormat.unpack")
  @js.native
  def unpack(array: js.Array[Double]): VertexFormat = js.native
  @JSImport("cesium", "VertexFormat.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: VertexFormat): VertexFormat = js.native
  @JSImport("cesium", "VertexFormat.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): VertexFormat = js.native
  @JSImport("cesium", "VertexFormat.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: VertexFormat): VertexFormat = js.native
}

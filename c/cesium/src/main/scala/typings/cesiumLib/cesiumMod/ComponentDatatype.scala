package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentDatatype extends js.Object

@JSImport("cesium", "ComponentDatatype")
@js.native
object ComponentDatatype extends js.Object {
  @js.native
  sealed trait BYTE
    extends cesiumLib.cesiumMod.ComponentDatatype
  
  @js.native
  sealed trait DOUBLE
    extends cesiumLib.cesiumMod.ComponentDatatype
  
  @js.native
  sealed trait FLOAT
    extends cesiumLib.cesiumMod.ComponentDatatype
  
  @js.native
  sealed trait SHORT
    extends cesiumLib.cesiumMod.ComponentDatatype
  
  @js.native
  sealed trait UNSIGNED_BYTE
    extends cesiumLib.cesiumMod.ComponentDatatype
  
  @js.native
  sealed trait UNSIGNED_SHORT
    extends cesiumLib.cesiumMod.ComponentDatatype
  
  val BYTE: BYTE with java.lang.String = js.native
  val DOUBLE: DOUBLE with java.lang.String = js.native
  val FLOAT: FLOAT with java.lang.String = js.native
  val SHORT: SHORT with java.lang.String = js.native
  val UNSIGNED_BYTE: UNSIGNED_BYTE with java.lang.String = js.native
  val UNSIGNED_SHORT: UNSIGNED_SHORT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ComponentDatatype with java.lang.String] = js.native
}


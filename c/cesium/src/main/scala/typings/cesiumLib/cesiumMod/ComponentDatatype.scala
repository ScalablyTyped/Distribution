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
  
  /* 0 */ val BYTE: BYTE with scala.Double = js.native
  /* 5 */ val DOUBLE: DOUBLE with scala.Double = js.native
  /* 4 */ val FLOAT: FLOAT with scala.Double = js.native
  /* 2 */ val SHORT: SHORT with scala.Double = js.native
  /* 1 */ val UNSIGNED_BYTE: UNSIGNED_BYTE with scala.Double = js.native
  /* 3 */ val UNSIGNED_SHORT: UNSIGNED_SHORT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.ComponentDatatype with scala.Double] = js.native
}


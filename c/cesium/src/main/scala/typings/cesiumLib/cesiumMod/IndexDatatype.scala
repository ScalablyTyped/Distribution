package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexDatatype extends js.Object

@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatype extends js.Object {
  @js.native
  sealed trait UNSIGNED_BYTE
    extends cesiumLib.cesiumMod.IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_INT
    extends cesiumLib.cesiumMod.IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_SHORT
    extends cesiumLib.cesiumMod.IndexDatatype
  
  /* 0 */ val UNSIGNED_BYTE: UNSIGNED_BYTE with scala.Double = js.native
  /* 2 */ val UNSIGNED_INT: UNSIGNED_INT with scala.Double = js.native
  /* 1 */ val UNSIGNED_SHORT: UNSIGNED_SHORT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.IndexDatatype with scala.Double] = js.native
}


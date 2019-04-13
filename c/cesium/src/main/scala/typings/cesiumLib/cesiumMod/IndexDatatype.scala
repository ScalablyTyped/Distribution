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
  
  val UNSIGNED_BYTE: UNSIGNED_BYTE with java.lang.String = js.native
  val UNSIGNED_INT: UNSIGNED_INT with java.lang.String = js.native
  val UNSIGNED_SHORT: UNSIGNED_SHORT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.IndexDatatype with java.lang.String] = js.native
}


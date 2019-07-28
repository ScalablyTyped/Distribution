package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexDatatype extends js.Object

@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatype extends js.Object {
  @js.native
  sealed trait UNSIGNED_BYTE extends IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_INT extends IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_SHORT extends IndexDatatype
  
  /* 0 */ val UNSIGNED_BYTE: typings.cesium.cesiumMod.IndexDatatype.UNSIGNED_BYTE with Double = js.native
  /* 2 */ val UNSIGNED_INT: typings.cesium.cesiumMod.IndexDatatype.UNSIGNED_INT with Double = js.native
  /* 1 */ val UNSIGNED_SHORT: typings.cesium.cesiumMod.IndexDatatype.UNSIGNED_SHORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexDatatype with Double] = js.native
}


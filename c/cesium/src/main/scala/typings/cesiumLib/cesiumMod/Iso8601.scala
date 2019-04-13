package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Iso8601 extends js.Object

@JSImport("cesium", "Iso8601")
@js.native
object Iso8601 extends js.Object {
  @js.native
  sealed trait MAXIMUM_INTERVAL
    extends cesiumLib.cesiumMod.Iso8601
  
  @js.native
  sealed trait MAXIMUM_VALUE
    extends cesiumLib.cesiumMod.Iso8601
  
  @js.native
  sealed trait MINIMUM_VALUE
    extends cesiumLib.cesiumMod.Iso8601
  
  val MAXIMUM_INTERVAL: MAXIMUM_INTERVAL with java.lang.String = js.native
  val MAXIMUM_VALUE: MAXIMUM_VALUE with java.lang.String = js.native
  val MINIMUM_VALUE: MINIMUM_VALUE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.Iso8601 with java.lang.String] = js.native
}


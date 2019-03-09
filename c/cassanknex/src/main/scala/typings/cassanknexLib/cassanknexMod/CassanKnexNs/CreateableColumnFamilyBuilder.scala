package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateableColumnFamilyBuilder[T] extends js.Object {
  def withCaching(): this.type = js.native
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_asc[K /* <: java.lang.String */](value: K, direction: cassanknexLib.cassanknexLibStrings.asc): this.type = js.native
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_desc[K /* <: java.lang.String */](value: K, direction: cassanknexLib.cassanknexLibStrings.desc): this.type = js.native
  def withCompaction(): this.type = js.native
  def withCompression(): this.type = js.native
}


package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CassanKnex
  extends nodeLib.eventsMod.EventEmitter {
  def apply(): QueryBuilderRoot = js.native
  def apply(keyspace: java.lang.String): QueryBuilderRoot = js.native
}


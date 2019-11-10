package typings.cassandraDashDriver.libTypesMod.types

import typings.cassandraDashDriver.Anon_AchievedConsistency
import typings.cassandraDashDriver.Anon_NameType
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet
  extends Iterator[Row, js.Any, js.UndefOr[scala.Nothing]] {
  var columns: js.Array[Anon_NameType] = js.native
  var info: Anon_AchievedConsistency = js.native
  var nextPage: js.Function0[Unit] | Null = js.native
  var pageState: String = js.native
  var rowLength: Double = js.native
  var rows: js.Array[Row] = js.native
  def first(): Row = js.native
  def wasApplied(): Boolean = js.native
}


package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.Anon_AchievedConsistency
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet extends js.Object {
  var columns: js.Array[StringDictionary[String]] = js.native
  var info: Anon_AchievedConsistency = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Row, _, js.UndefOr[scala.Nothing]]] = js.native
  var pageState: String = js.native
  var rowLength: Double = js.native
  var rows: js.Array[Row] = js.native
  def first(): Row | Null = js.native
  def getColumns(): js.Array[StringDictionary[String]] = js.native
  def getPageState(): String = js.native
  def nextPage(): Unit = js.native
  def wasApplied(): Boolean = js.native
}

@JSImport("cassandra-driver", "types.ResultSet")
@js.native
object ResultSet extends TopLevel[ResultSetStatic]


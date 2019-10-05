package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.cassandraDashDriverMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row
  extends /* key */ StringDictionary[js.Any] {
  def forEach(callback: Callback): Unit = js.native
  def get(columnName: String): StringDictionary[js.Any] = js.native
  def get(columnName: Double): StringDictionary[js.Any] = js.native
  def keys(): js.Array[String] = js.native
  def values(): js.Array[StringDictionary[_]] = js.native
}

// let ResultStream: ResultStreamStatic;
@JSImport("cassandra-driver", "types.Row")
@js.native
object Row extends TopLevel[RowStatic]


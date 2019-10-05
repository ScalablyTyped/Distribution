package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[StringDictionary[_], _, js.UndefOr[scala.Nothing]]] = js.native
  def first(): StringDictionary[js.Any] = js.native
  def forEach(callback: js.Function2[/* currentValue */ StringDictionary[js.Any], /* index */ Double, Unit]): Unit = js.native
  def forEach(
    callback: js.Function2[/* currentValue */ StringDictionary[js.Any], /* index */ Double, Unit],
    thisArg: js.Any
  ): Unit = js.native
  def toArray(): js.Array[StringDictionary[_]] = js.native
  def wasApplied(): Boolean = js.native
}

@JSImport("cassandra-driver", "mapping.Result")
@js.native
object Result extends TopLevel[ResultStatic]


package typings.cassandraDashDriver.libTypesMod.types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row
  extends /* key */ StringDictionary[js.Any] {
  def forEach(callback: js.Function1[/* row */ this.type, Unit]): Unit = js.native
  def get(columnName: String): js.Any = js.native
  def get(columnName: Double): js.Any = js.native
  def keys(): js.Array[String] = js.native
  def values(): js.Array[_] = js.native
}


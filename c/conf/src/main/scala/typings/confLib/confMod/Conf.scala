package typings
package confLib.confMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conf[T]
  extends nodeLib.Iterable[js.Tuple2[java.lang.String, T]] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[nodeLib.Iterator[js.Tuple2[java.lang.String, T]]] = js.native
  val path: java.lang.String = js.native
  val size: scala.Double = js.native
  var store: org.scalablytyped.runtime.StringDictionary[T] = js.native
  def clear(): scala.Unit = js.native
  def delete(key: java.lang.String): scala.Unit = js.native
  def get(key: java.lang.String): T = js.native
  def get(key: java.lang.String, defaultValue: T): T = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def onDidChange(
    key: java.lang.String,
    callback: js.Function2[/* oldVal */ js.UndefOr[T], /* newVal */ js.UndefOr[T], scala.Unit]
  ): scala.Unit = js.native
  def set(key: java.lang.String, `val`: T): scala.Unit = js.native
  def set(`object`: org.scalablytyped.runtime.StringDictionary[T]): scala.Unit = js.native
}


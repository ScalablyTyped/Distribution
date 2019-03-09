package typings
package collectionsjsLib.collectionsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("collectionsjs", JSImport.Default)
@js.native
class default[T] () extends Collection[T] {
  def this(items: js.Array[T]) = this()
}

/* static members */
@JSImport("collectionsjs", JSImport.Default)
@js.native
object default extends js.Object {
  def `macro`(
    name: java.lang.String,
    callback: js.Function2[/* coll */ collectionsjsLib.collectionsjsMod.Collection[_], /* repeated */ js.Any, _]
  ): scala.Unit = js.native
}


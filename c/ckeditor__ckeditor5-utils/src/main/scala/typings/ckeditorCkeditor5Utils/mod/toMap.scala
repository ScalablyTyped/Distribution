package typings.ckeditorCkeditor5Utils.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "toMap")
@js.native
object toMap extends js.Object {
  def apply[T /* <: js.Object */](data: T): Map[
    /* keyof T */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[K /* <: String */, V](data: js.Array[js.Tuple2[K, V]]): Map[K, V] = js.native
  def apply[K, V](data: Map[K, V]): Map[K, V] = js.native
}

